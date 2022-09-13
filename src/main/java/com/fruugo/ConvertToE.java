package com.fruugo;

public class ConvertToE implements Converter{
    @Override
    public String convert(String input) {
        StringBuffer charBuffer = new StringBuffer();
        for (int c: input.toCharArray()) {
            if(c == 55) {
                charBuffer.append("e" + " ");
            } else if(c != 32){
                charBuffer.append((char)c + " ");
            }
        }

        charBuffer.append("\n");

        return charBuffer.toString();
    }
}
