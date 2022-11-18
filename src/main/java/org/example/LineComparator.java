package org.example;

import java.util.Scanner;

public class LineComparator {
    public static void main(String[] args) {
        int x1;
        int y1;
        int x2;
        int y2;
        System.out.println("Welcome to line Comparison Computation Program");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter co-ordinate first line point 1 : ");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.println("Enter co-ordinate first line point 2 : ");
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        Line line1Obj = new Line(x1, y1, x2, y2);
        System.out.println("Length of Line 1 = " + line1Obj.getLength());

        System.out.println("Enter co-ordinate second line point 1 : ");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.println("Enter co-ordinate second line point 2 : ");
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        Line line2Obj = new Line(x1, y1, x2, y2);
        System.out.println("Length of Line 2 = " + line2Obj.getLength());

        int compareOutput = line1Obj.compareTo(line2Obj);
        switch (compareOutput) {
            case 1:
                System.out.println("First Line is greater than second line");
                break;
            case -1:
                System.out.println("First Line is less than second line");
                break;
            default:
                System.out.println("Both Lines are equals");
                break;
        }
    }
}