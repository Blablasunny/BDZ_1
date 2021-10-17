package com.company;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        for (int i = 1; i <= m; i++){
            for (int j = 1; j <= n; j++){
                System.out.print(i * j + " ");
            }
            System.out.print("\n");
        }
    }
}
