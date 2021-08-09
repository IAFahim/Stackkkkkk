package Stackk;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String expr;
        DelimiterMaching dm = new DelimiterMaching();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the expression");
        expr = sc.nextLine();
        System.out.println(expr + "==> "+dm.isDelimiterMatching(expr));
    }
}
