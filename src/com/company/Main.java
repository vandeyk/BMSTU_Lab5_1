package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // write your code here
        Scanner scan = new Scanner(System.in);
        Calendar cal = new Calendar();
        cal.Show();
        System.out.println("Adding new holiday:");
        String s = scan.nextLine();
        int d1 = 0, d2 = 0;
        try {
            d1 = scan.nextInt();
            d2 = scan.nextInt();
        } catch (InputMismatchException e1) {
            System.out.println("O-la-la! You've put something somewhere where it doesn't belong!");
        }
        cal.AddHoliday(s, d1, d2);
        cal.Show();
        int k = 0;
        try {
            k = scan.nextInt();
        } catch (InputMismatchException e1) {
            System.out.println("O-la-la! You've put something somewhere where it doesn't belong!");
        }
        cal.IsHol(k); //Этот метод показывает, выходной ли день k, в методе обрабатывается выход за границы

    }
}
