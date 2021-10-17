package com.company;
import java.util.Scanner;
public class Task10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int s = Summa(a, b);
        System.out.println(s);
    }
    public static int Summa(int a, int b){
         if (a < b){int c = a; a = b; b = c;}
         int p0 = 0, s = 0, p = 0, i = 0, s0;
         while (a != 0 && b != 0){
             int a0 = a % 2;
             int b0 = b % 2;
             s0 = (~p0 & ~b0 & a0) | (~p0 & b0 & ~a0) | (p0 & ~b0 & ~a0) | (b0 & a0 & p0);
             p = (~p0 & b0 & a0) | (p0 & ~b0 & a0) | (p0 & b0 & ~a0) | (p0 & b0 & a0);
             p0 = p;
             a = a >> 1;
             b = b >> 1;
             s0 = s0 << i;
             s += s0;
             if (a == 0 && b == 0){
                 p = p << (i + 1);
                 s += p;
             }
             i++;
         }
        return s;
    }
}
