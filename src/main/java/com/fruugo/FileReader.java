package com.fruugo;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {
    public List<String> readFile(String fileName) throws URISyntaxException, IOException {

        return Files.readAllLines(Paths.get(fileName));


    }
}
