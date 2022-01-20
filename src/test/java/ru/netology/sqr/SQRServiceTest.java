package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource (resources = "/data.csv")
    void shouldCalculate(String testName, int lowerLimit, int upperLimit, int expected) {
        SQRService service = new SQRService();
        int actual = service.calculate(lowerLimit, upperLimit);
        assertEquals(expected, actual);

    }
}