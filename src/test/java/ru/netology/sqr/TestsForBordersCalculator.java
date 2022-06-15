package ru.netology.sqr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class TestsForBordersCalculator {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/TestBelongToInterval.csv")
    public void testBelongToInterval(int expected, int firstNumber, int secondNumber){
            SQRService service = new SQRService();
            int actual = service.calculate(firstNumber, secondNumber);

            Assertions.assertEquals(expected, actual);

    }
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/TestBelongToInvertedInterval.csv")
    public void testBelongToInvertedInterval(int expected, int firstNumber, int secondNumber){
        SQRService service = new SQRService();
        int actual = service.calculate(firstNumber, secondNumber);

        Assertions.assertEquals(expected, actual);

    }

}
