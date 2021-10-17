package com.company;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ma = 0;
        for (int i = 0; i < n; i++){
            int e = in.nextInt();
            if (e % 100 == 11 && e > ma){
                ma = e;
            }
        }
        System.out.println(ma);
    }
}
