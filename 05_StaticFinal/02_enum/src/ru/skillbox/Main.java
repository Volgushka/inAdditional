package ru.skillbox;

public class Main {


    public static void main(String[] args) {

        ArithmeticCalculator i_add = new ArithmeticCalculator(5,12);
        System.out.println(i_add.calculate(Operation.ADD));

    }
}
