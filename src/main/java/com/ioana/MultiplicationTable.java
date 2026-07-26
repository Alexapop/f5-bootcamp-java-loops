package com.ioana;

public class MultiplicationTable {
    public Integer givenNumber;

    public MultiplicationTable(Integer givenNumber) {
        this.givenNumber = givenNumber;
    };

    public int multiply(int i) {
        return givenNumber * i;
    }

    public void createTable() {
        for (int i = 1; i <= 10; i++) {
            int result = multiply(i);

            System.out.println(givenNumber + " x " + i + " = " + result);
        }
        ;
    }

}
