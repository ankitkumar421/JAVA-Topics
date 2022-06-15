package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFileUsingScanner {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\PHYNO ZEUS\\IdeaProjects\\JAVA-LabCodes\\src\\hello.txt");
        Scanner sc;
        sc = new Scanner(file);

        while (sc.hasNextLine())
            System.out.println(sc.nextLine());
    }
}
