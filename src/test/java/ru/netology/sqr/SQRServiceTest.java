package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/borders.csv")
    public void examinationCalc(int expected, int border_min, int border_max) {

        SQRService service = new SQRService();

        int actual = service.calcResult(border_min, border_max);
        Assertions.assertEquals(expected, actual);
    }

}