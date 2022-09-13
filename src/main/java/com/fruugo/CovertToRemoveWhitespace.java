package com.fruugo;

public class CovertToRemoveWhitespace implements Converter{
    @Override
    public String convert(String input) {
        StringBuffer charBuffer = new StringBuffer();
        for (int c: input.toCharArray()) {
            if(c != 32){
                charBuffer.append((char)c);
            }
        }

        charBuffer.append("\n");

        return charBuffer.toString();
    }
}
