package com.company;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int m1 = 0;
        int m2 = 0;
        int m3 = 0;
        int m4 = 0;
        int m5 = 0;
        int e = in.nextInt();
        m1 = e;
        while (e != 0){
            e = in.nextInt();
            if (e > m1){
                m5 = m4;
                m4 = m3;
                m3 = m2;
                m2 = m1;
                m1 = e;
            }else if (e > m2){
                m5 = m4;
                m4 = m3;
                m3 = m2;
                m2 = e;
            }else if (e > m3){
                m5 = m4;
                m4 = m3;
                m3 = e;
            }else if (e > m4){
                m5 = m4;
                m4 = e;
            }else if (e > m5){
                m5 = e;
            }
        }
        System.out.println(m1 + " " + m2 + " " + m3 + " " + m4 + " " + m5);
    }
}
