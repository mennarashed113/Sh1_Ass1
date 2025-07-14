package Sh1_H;


import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();

        double result = (double) A / B;

        System.out.println("floor "+A+" / "+B+ " = " +((long)(Math.floor(result))));
        System.out.println("ceil "+A+" / "+B+ " = " + ((long)(Math.ceil(result))));
        System.out.println("round "+A+" / "+B+ " = " + (Math.round(result)));
    }





}