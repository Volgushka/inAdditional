package ru.skillbox;

public class ArithmeticCalculator {

    public int numb1;
    public int numb2;

    public ArithmeticCalculator(int numb1, int numb2) {
        this.numb1 = numb1;
        this.numb2 = numb2;
        }

    public int calculate(Operation type) {
        int res = 0;
        if (type == Operation.ADD) {
            res = numb1 + numb2;
        }
        else if (type == Operation.SUBTRACT) {
            res = numb1 - numb2;
        }
        else if (type == Operation.MULTIPLY) {
            res = numb1 * numb2;
        }
    return res;
    }

}
