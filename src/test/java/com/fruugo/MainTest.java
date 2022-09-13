package com.fruugo;

import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void ping() throws IOException, URISyntaxException {
        Main main = new Main();

        String args[] = {"/workspace/Fruugo-Test-Master/input1.txt", "output1.txt", "2", "3", "1", "2","4"};
        Main.main(args);

        String args1[] = {"/workspace/Fruugo-Test-Master/input2.txt", "output1.txt", "1", "2", "3", "4"};
        Main.main(args1);

        assertEquals("ping", main.ping());
    }
}