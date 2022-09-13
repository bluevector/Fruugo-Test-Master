package com.fruugo;

public class ConvertToPlusOne implements Converter{
    @Override
    public String convert(String input) {
        StringBuffer charBuffer = new StringBuffer();
        for (int c: input.toCharArray()) {
            if(c >= 32 && c <= 63) {
                charBuffer.append( (c + 1) + " ");
            } else {
                charBuffer.append((char)c + " ");
            }
        }

        charBuffer.append("\n");

        return charBuffer.toString();
    }
}
