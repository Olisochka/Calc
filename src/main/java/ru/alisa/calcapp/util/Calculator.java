package ru.alisa.calcapp.util;

import static ru.alisa.calcapp.service.ResultWriterService.WriteResult;

public class Calculator {

    public static int added (int a, int b) {
    int summ = a + b;
        return summ;
    }
    public static int deduct (int a, int b) {
    int diff = a - b;
        return diff;

    }
    public static int multiply (int a, int b) {
    int multy = a * b;
        return multy;

    }


}
