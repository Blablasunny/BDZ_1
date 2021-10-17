package com.company;
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 2; i <= n && n != 1; i++){
            while (n % i == 0){
                System.out.print(i);
                n /= i;
                if (n != 1){
                    System.out.print("*");
                }
            }
        }
    }
}
