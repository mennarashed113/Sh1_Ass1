package Sh1_E;


import java.util.Scanner;
import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {

       final double pi=3.141592653;
       Scanner input = new Scanner(System.in);

       double R = input.nextDouble();
        System.out.printf("%.9f\n" ,pi*(pow(R,2))); // or (pi*R*R)
    }





}