package com.torysem.iterator;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        String [] strings = new String[5];
        strings [0] = "one";
        strings [1] = "two";
        strings [2] = "three";
        strings [3] = "four";
        strings [4] = "five";

        ArrayStringIterable arrayStringIterable = new ArrayStringIterable(strings);
        for (String s: arrayStringIterable){
            System.out.println(s);
        }
    }

    private static class ArrayStringIterable implements Iterable<String> {
        private final String [] strings;

        public ArrayStringIterable(String[] strings) {
            this.strings = strings;
        }

        @Override
        public Iterator<String> iterator() {
            return new ArrayStringIterator(strings);
        }
    }

    private static class ArrayStringIterator implements Iterator<String> {

        int index = 0;
        private final String [] strings;

        public ArrayStringIterator(String[] strings) {
            this.strings = strings;
        }

        @Override
        public boolean hasNext() {
            return index != strings.length;
        }

        @Override
        public String next() {
            return strings[index++];
        }



    }


}
