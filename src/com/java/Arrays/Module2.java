package com.java.Arrays;

import java.util.Scanner;

public class Module2 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int num=scanner.nextInt();
        String[] empName=  new String[num];
        int[] empId= new int[num];
        float[] empSalary=new float[num];

        for(int i=0;i<num;i++){
            System.out.print("enter the employee ID: ");
            empId[i]=scanner.nextInt();
            scanner.nextLine();
            System.out.print("enter the employee Name for "+empId[i]+": ");
            empName[i]=scanner.nextLine();
            System.out.print("enter the employee Salary for "+empId[i]+": ");
            empSalary[i]=scanner.nextFloat();


        }
//        display(empId,empSalary,empName);
//        display(empId,empName);
        scanner.nextLine();
        System.out.print("Enter the employee name: ");
        String name=scanner.nextLine();
        display(name,empId,empSalary,empName);





    }
    static void display(int[] empId,float[] empSalary, String[] empName){
        System.out.println("ID "+"\tName"+"\tSalary");
        for(int i=0;i<empId.length;i++){
            System.out.println(empId[i]+"\t"+empName[i]+"\t"+empSalary[i]);
        }
    }

    static void display(int[] empId, String[] empName){
        System.out.println("ID "+"\tName");
        for(int i=0;i<empId.length;i++){
            System.out.println(empId[i]+"\t"+empName[i]);
        }
    }

    static void display(String name,int[] empId,float[] empSalary, String[] empName){
        System.out.println("ID "+"\tName"+"\tSalary");
        for(int i=0;i<empId.length;i++){
            if(empName[i].equalsIgnoreCase(name)){
                System.out.print(empId[i]+"\t"+empName[i]+"\t"+empSalary[i]);
            }

        }

    }
}
