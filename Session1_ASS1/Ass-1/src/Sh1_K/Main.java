package Sh1_K;


import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        long A = input.nextLong();
        long B = input.nextLong();
        long C = input.nextLong();

        System.out.print(Math.min(A, Math.min(B, C))+ " ");
        System.out.print(Math.max(A, Math.max(B, C)));




    }
}