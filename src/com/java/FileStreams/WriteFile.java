package com.java.FileStreams;

import java.io.FileWriter;
import java.util.Scanner;

public class WriteFile {

    public static void main(String[] args) throws Exception {

        //When you keep executing the code it will not create a duplicate file instead it will delete the existing file and create new file with no data.
        /* this block of code is to write data to a file in form of byte
        FileOutputStream output= new FileOutputStream("src/com/java/FileStreams/SampleTextWrite");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the data that you want to save it in a text file: ");
        String str= scanner.nextLine();
        byte[] b= str.getBytes();

        output.write(b);
        output.close();*/

        FileWriter writer= new FileWriter("src/com/java/FileStreams/SampleTextWrite1.txt",true);//true is to append data to the file since if we keep executing the same code it will delete the existing file and create new one without any data so we use true to say to append data to the created file
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the data that you want to save it in a text file: ");
        String str= scanner.nextLine();
        writer.write(str+"\n");

        writer.close();
    }
}
