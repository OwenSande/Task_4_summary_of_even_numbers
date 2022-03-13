package com.company;

public class Main {

    public static void main(String[] args) {

        int i, n, sum=0;
        for(i=2; i<=100; i+=2)
        {
            sum += i;
        }
        System.out.println("The sum of even numbers from 1 to 100 is " + sum);
    }
}
