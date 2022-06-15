package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class WriteUsingJava {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("hello.txt");
        fileWriter.write("This line of statment is added from java1");
        fileWriter.close();
        System.out.println("Successfully written");
    }
}
