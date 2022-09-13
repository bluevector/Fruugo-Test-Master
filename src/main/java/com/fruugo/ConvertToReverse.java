package com.fruugo;

public class ConvertToReverse implements Converter{
    @Override
    public String convert(String input) {
        StringBuffer charBuffer = new StringBuffer();
        char[] inputChars = input.toCharArray();

        for (int i = inputChars.length - 1; i >= 0; i--) {
            char c = inputChars[i];
            if(c != 32){
                charBuffer.append(c + " ");
            }
        }

        charBuffer.append("\n");

        return charBuffer.toString();
    }
}
