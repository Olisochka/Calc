package ru.alisa.calcapp.main;


import ru.alisa.calcapp.service.ResultWriterService;
import ru.alisa.calcapp.util.Calculator;

import java.util.Scanner;


public class _Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Введите первое число");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Введите второе число");
        int num2 = sc.nextInt();
        System.out.println("Введите операцию");
        String operation = sc.nextLine();
        int res;
        switch (operation) {
            case "+":
                res = Calculator.summ(num1, num2);
                ResultWriterService.writeResult(num1, num2, res, "Сумма");
            case "-":
                res = Calculator.deduct(num1, num2);
                ResultWriterService.writeResult(num1, num2, res, "Разность");
            case "*":
                res = Calculator.multiply(num1, num2);
                ResultWriterService.writeResult(num1, num2, res, "Произведение");
                break;
            default:
                System.out.println("Ошибка");
        }
    }
}
