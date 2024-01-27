package com.java.reportcard;

import java.util.Scanner;

public class ReportCard {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter student name: ");
        String studentName= scanner.nextLine();
        System.out.print("enter number of subjects: ");
        int numberOfSubjects= scanner.nextInt();

        int[] marks=getMarks(numberOfSubjects);
        System.out.println("-------------------------------------------------------");
        System.out.printf("\t\t\t\t\t"+"REPORT CARD"+"\t\t\t"+"\n"+"NAME: %s", studentName+"\n" );
        System.out.println("-------------------------------------------------------");
        System.out.printf("  SUBJECT"+"\t\t\t\t\t"+"MARKS"+"\t\t\t\t"+"RESULT"+"\n" );
        System.out.println("-------------------------------------------------------");

        for(int i=0;i<marks.length; i++){
            String result= "PASS";
            if(marks[i]<40){
                result="FAIL";
            }
            System.out.print("Subject-"+(i+1)+"\t\t\t\t\t"+marks[i]+"\t\t\t\t\t"+result+"\n");



        }
        System.out.println("-------------------------------------------------------");
        int sum=0;
        for(int total: marks){
            sum+=total;
        }
        float average=sum/marks.length;
        System.out.print("TOTAL: "+sum+ "\t\t\t\t\t" +"AVERAGE: "+average+"\n" );
        System.out.println("-------------------------------------------------------");
        scanner.close();
    }

    private static int[] getMarks(int numberOfSubjects) {
        Scanner scanner=new Scanner(System.in);
        int[] marks= new int[numberOfSubjects];

        for(int i=0;i<numberOfSubjects;i++){
            System.out.print("enter marks for subject-"+(i+1)+": ");
            marks[i]= scanner.nextInt();
        }
        return marks;



    }
}
