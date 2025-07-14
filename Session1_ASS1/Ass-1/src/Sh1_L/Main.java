package Sh1_L;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      String F1 = sc.next();
      String S1 = sc.next();
      String F2 = sc.next();
      String S2 = sc.next();

        System.out.println(S1.equals(S2) ? "ARE Brothers" : "NOT");


    }
}