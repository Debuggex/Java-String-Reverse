package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int mid = A.length() / 2;
        String B = "";
        String C = "";
        StringBuilder D = new StringBuilder("");
        if (A.length() % 2 == 0) {

            B=A.substring(0,mid);
            C=A.substring(mid,A.length());

        } else {
            B = A.substring(0, mid);
            C = A.substring(mid + 1, A.length());
        }
        D = new StringBuilder(C);
        D.reverse();

        if (B.compareTo(D.toString()) == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}








