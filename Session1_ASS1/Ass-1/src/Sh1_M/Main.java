package Sh1_M;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    char X = sc.next().charAt(0);

    if(X>='0' && X<='9'){
        System.out.println("IS DIGIT");
    }
    else{
        System.out.println("ALPHA");
        if(X>='a' && X<='z'){
            System.out.println("IS SMALL");
        } else if (X>='A' && X<='Z') {
            System.out.println("IS CAPITAL");
        }


    }

    }
}