package com.tw;

public class MultiplicationTableBuilder {

    public static void main(String[] args) {
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 4;
        String multiplicationTable = builder.buildMultiplicationTable(start, end);

        System.out.println(multiplicationTable);
    }

    public String buildMultiplicationTable(int start, int end) {
        return "";
    }
}