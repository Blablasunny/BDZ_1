package com.company;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 0;
        while (i * i <= n){
            i++;
        }
        System.out.println(i - 1);
    }
}
