package ru.alisa.calcapp.main;

import ru.alisa.calcapp.util.Calculator;

import java.util.Scanner;

import static ru.alisa.calcapp.service.ResultWriterService.WriteResult;
import static ru.alisa.calcapp.util.Calculator.*;

public class _Main {
    public static void main(String[] args) {

		System.out.println("Введите первое число");
    Scanner firstNumber = new Scanner(System.in);
    int a = firstNumber.nextInt();
        System.out.println("Введите второе число");
    Scanner secondNumber = new Scanner(System.in);
    int b = secondNumber.nextInt();
        System.out.println("Введите операцию");
        Scanner operation = new Scanner(System.in);
        String o = operation.nextLine();
        switch(o) {
            case "+" :
                added(a, b);
                int res = Calculator.added(a, b);
                WriteResult(a, b, res, "Сумма");
            case "-" :
                deduct(a, b);
                int resd = Calculator.deduct(a, b);
                WriteResult(a, b, resd, "Разность");
             case "*" :
                multiply(a, b);
                int resm = Calculator.multiply(a, b);
                WriteResult(a, b, resm, "Произведение");
                break;
            default:
                System.out.println("Ошибка");
        }




}
}
