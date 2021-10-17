package com.company;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int e = in.nextInt();
        int ma = e;
        int mi = e;
        int s = e;
        for (int i = 0; i < n - 1; i++){
            e = in.nextInt();
            if (e > ma){
                ma = e;
            }if (e < mi){
                mi = e;
            }
            s+= e;
        }
        System.out.println(ma);
        System.out.println(mi);
        System.out.println((double) s / n);
    }
}
