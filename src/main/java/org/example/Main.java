package org.example;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Person man = new Person();
        System.out.println("Результат сложения: " + calc.addition(2, 3));
        System.out.println("Результат вычетания: " + calc.subtraction(5, 2));
        System.out.println("Человеку можно в бар - " + man.isAdult(18));
    }
}