package ru.alisa.calcapp.service;


public class ResultWriterService {
    public static void writeResult(int num1, int num2, int res, String operation) {
        System.out.println(operation + " " + num1 + " " + num2 + "=" + res);
    }
}
  