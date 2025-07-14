package Sh1_J;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long A = input.nextLong();
        long B = input.nextLong();

        System.out.println(A%B == 0 || B%A == 0 ? "Multiples" : "No Multiples");
    }
}