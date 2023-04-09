package ru.netology.javaqa.javaqamvn.services;
public class CalcService {

    public int calculateRestMonths(int income, int expenses, int threshold) {
        int currentAmount = 0;
        int restMonths = 0;

        for (int month = 1; month <= 12; month++) {
            if (currentAmount >= threshold) {
                restMonths++;
                currentAmount -= expenses;
                currentAmount /= 3;
            } else {
                currentAmount += income - expenses;
            }
        }

        return restMonths;
    }
}