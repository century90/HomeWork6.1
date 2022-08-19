package ru.netology.sqr;

public class SQRService {

    public int calcSqr (int bottomLine, int upperBound) {

        int sumOfNumbers = 0;

        for (int i = 10; i <= 99; i++) {

            if (i * i >= bottomLine && i * i <= upperBound) {

                sumOfNumbers++;
            }
        }

        return sumOfNumbers;

    }
}