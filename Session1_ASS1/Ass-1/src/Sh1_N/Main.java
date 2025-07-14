package Sh1_N;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    char X = sc.next().charAt(0);

    if(X>='A' && X<='Z') {
        X = (char) (X + 32);
        System.out.println(X);
    }
    else if(X>='a' && X<='z') {
        X = (char) (X - 32);
        System.out.println(X);

    }
    }
}