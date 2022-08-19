package ru.netology.sqr.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {

    @Test

    public void shouldCalcExactInTreRange() {

        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calcSqr(200, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldCalcExactAllNumbers() {

        SQRService service = new SQRService();

        int expected = 90;
        int actual = service.calcSqr(100, 9801);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldCalcExactInTheSmallRange() {

        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calcSqr(101, 102);

        Assertions.assertEquals(expected, actual);
    }
}
