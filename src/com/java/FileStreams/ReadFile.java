package com.java.FileStreams;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReadFile {

    public static void main(String[] args) throws Exception {
        FileInputStream fin= new FileInputStream("src/com/java/FileStreams/SampleText.txt");
//        System.out.print(fin.available()+"\n"); // to get the total number of bytes in a file
//        System.out.print(fin.read()+"\n"); //to read the character in a file in form of byte
//        System.out.print("No of character to read: "+fin.available()+"\n");

        /*-----read file contents character by character------
        int n= fin.read();
        while(n!=-1){
            System.out.print((char)n);
            n=fin.read();
        }*/



        //---read file contents completely----
//        byte[] b= new byte[fin.available()];// length of byte array is length of bytes available in a file.
//        fin.read(b);// this will read all the bytes in the file no need of loop.
//        String str= new String(b);// converting bytes[] b to String.
//        System.out.print(str);

        //---read file contents line-by-line---
        Reader fileSource= new InputStreamReader(fin);// used to convert byte stream to character stream.
        BufferedReader br= new BufferedReader(fileSource);// to create a buffered reader object we need reader object to be passed as an argument.
        String line=br.readLine();
        while( line!=null){
            System.out.print(line+"\n");
            Thread.sleep(1000);
            line =br.readLine();
//
        }
        fin.close();
        br.close();

    }


}
