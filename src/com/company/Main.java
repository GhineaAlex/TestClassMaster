package com.company;
import java.util.*;
public class Main {
    static Boolean isEven(Integer no){
        if (no%2==0){
            return true;
        }
        else return false;
    }
    static String verify(Integer no, Integer no2){
        if(no >= 99 && no <= 9999 && no2 >= 99 && no2 <= 9999) {
            Integer s, s2;
            for (s = 0; no != 0; no = no / 10) {
                s = s + no % 10;
            }
            for (s2 = 0; no2 != 0; no2 = no2 / 10) {
                s2 = s2 + no2 % 10;
            }
            if (isEven(s + s2)) {
                return "Este";
            } else return "Nu este";
        }
        else return "Eroare";
    }
    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int n2 = scanner.nextInt();
        scanner.close();
        System.out.println("Verify if sum of the digits of the 2 numbers is an even number");
        System.out.println(verify(n,n2));
    }
}
