package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //Get first number:
        Scanner first = new Scanner(System.in);
        System.out.println("What is the first number?");
        String First = first.nextLine();
        int a = Integer.parseInt(First);
        System.out.println(a);

        //Get second number:
        Scanner num2 = new Scanner(System.in);
        System.out.println("What is the second number?");
        String NUM2 = num2.nextLine();
        int b = Integer.parseInt(NUM2);
        System.out.println(b);
        //Operations on a&b
        int add = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;

        //output in ONE line
        System.out.println(a +"+"+ b + "="+add+"\n" + a +"-"+ b +"="+sub+"\n" + a +"*"+ b +"="+mul+"\n" + a +"/"+ b +"="+div+"\n");
    }
}
