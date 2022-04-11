package main;

import main.exceptions.UnsupportedNumbersException;
import main.exceptions.UnsupportedOperationException;

public class Helper {
    String operator;
    int v1,v2;
    int result;

    public Helper(int v1,int v2, String operator) throws UnsupportedNumbersException {
        this.operator = operator;
        this.v1 = v1;
        this.v2 = v2;
        if ((v1 <= 0 || v1 > 10) || (v2 <= 0 || v2 > 10)) {

            throw new UnsupportedNumbersException();
        }
    }
    public void printAnswer(boolean flag) throws Exception {
        if (flag) System.out.println(calculate());
        if(!flag) System.out.println(RomanNums.getRomanNum(calculate()));
    }


    public int calculate() throws Exception {

        int result;

        switch (operator) {
            case "-": {
                result = v1 - v2;
                break;
            }

            case "+": {
                result = v1 + v2;
                break;
            }
            case "*": {
                result = v1 * v2;
                break;
            }
            case "/": {
                result = v1 / v2;
                break;
            }
            default: {

                throw new UnsupportedOperationException();
            }

        }
        return result;
    }

}