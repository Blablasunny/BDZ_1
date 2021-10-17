package com.company;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = 0;
        for (int i = 0; i < n; i++){
            int e = in.nextInt();
            while (e > 9){
                e /= 10;
            }
            s *= 10;
            s += e;
        }
        System.out.println(s);
    }
}
