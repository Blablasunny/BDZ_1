package com.company;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int s = 0, i = 1, ma = 0;
        int e = in.nextInt();
        int a[] = new int[20];
        a[0] = e;
        while (e != 0){
            s += e;
            e = in.nextInt();
            a[i] = e;
            i++;
        }
        for (int j = 0; j < i; j++){
            if (a[j] > ma && a[j] * a[j] <= s) ma = a[j];
        }
        System.out.println(ma);
    }
}
