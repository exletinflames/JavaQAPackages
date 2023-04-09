package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class CalcServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/RestMonth.csv")
    public void shouldCalculateRestMonths(int income, int expenses, int threshold) {
        CalcService service = new CalcService();
        int months = service.calculateRestMonths(income, expenses, threshold);
        Assertions.assertEquals(2, months);

    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/RestMonth1.csv")
    public void shouldCalculateRestMonths1(int income, int expenses, int threshold) {
        CalcService service = new CalcService();
        int months = service.calculateRestMonths(income, expenses, threshold);
        Assertions.assertEquals(3, months);

    }
}

