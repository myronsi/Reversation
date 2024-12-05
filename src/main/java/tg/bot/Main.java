package tg.bot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введете желаемый набор символов:");
        String text = sc.nextLine();
        String reversed = reverseString(text);
        System.out.println(reversed);
    }

    public static String reverseString(String string) {
        //TODO: сделать метод который будет переворачивать набор исимволов без реверса
        StringBuilder reversedStr = new StringBuilder(string).reverse();
        return reversedStr.toString();
    }
}