package com.fruugo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, URISyntaxException {


        String fileName = args[0];
        String outputFileName = args[1];


        System.out.println("FileName: " + fileName);

        List<Converter> converters = new ArrayList<>();

        for(int i=2; i< args.length; i++){
            if(args[i].equals("1")){
                converters.add(new ConvertToE());
            } else if(args[i].equals("2")){
                converters.add(new ConvertToReverse());
            } else if(args[i].equals("3")){
                converters.add(new CovertToRemoveWhitespace());
            } else if(args[i].equals("4")){
                converters.add(new ConvertToPlusOne());
            }
        }

        FileReader fileReader = new FileReader();
        List<String> input1 = fileReader.readFile(fileName);


        StringBuffer outputBuffer = new StringBuffer();
        outputBuffer.append("==========================================");

        /**
         * For each converters that was selected
         *  convert function is called for each input line
         */
        for(Converter converter : converters){
            for(String line: input1) {
                outputBuffer.append(converter.convert(line));
            }
        }

        System.out.println(outputBuffer);


        File file = new File("/Fruugo-Test-Master/output/" + outputFileName);
        FileWriter fileWriter;
        if (file.exists()){
            fileWriter = new FileWriter(file,true);//if file exists append to file. Works fine.
        } else {
            file.createNewFile();
            fileWriter = new FileWriter(file);
        }

        fileWriter.append(outputBuffer.toString());
        fileWriter.flush();
        fileWriter.close();


    }

    public String ping() {
        return "ping";
    }


}
