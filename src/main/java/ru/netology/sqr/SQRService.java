package ru.netology.sqr;
        
public class SQRService {
    public int calculate(int firstNumber, int secondNumber) {
        int downBorder = 10;
        int upBorder = 99;
        int counter = 0;
        if (firstNumber > secondNumber) {
            int tmp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = tmp;
        }
        for (int i = downBorder; i <= upBorder; i++) {
            if ((i * i >= firstNumber) && (i * i <= secondNumber)) {
                counter = counter + 1;
            }
        }
    return counter;
    }

}
