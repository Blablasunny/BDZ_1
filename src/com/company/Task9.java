package com.company;
import java.util.Scanner;
public class Task9 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        double l = 0;
        double p = n;
        while (p != 0){
            l *= 10;
            l += p % 10;
            p /= 10;
        }
        System.out.println(n == l ? "YES" : "NO");
    }
}
