package main;

import main.exceptions.UnsupportedOperationException;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Calculator {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] userString = reader.readLine().split(" ");
        reader.close();

        if (userString.length != 3) throw new UnsupportedOperationException();

        int v1, v2;
        String operator = userString[1];

        try {

            v1 = Integer.parseInt(userString[0]);
            v2 = Integer.parseInt(userString[2]);
            Helper helper = new Helper(v1,v2,operator);
            helper.printAnswer(true);

        } catch (NumberFormatException e){
            try{

                v1 = RomanNums.getArabianNum(userString[0].toUpperCase());
                v2 = RomanNums.getArabianNum(userString[2].toUpperCase());
                Helper helper = new Helper(v1,v2,operator);
                helper.printAnswer(false);

            } catch (Exception d){

                d.printStackTrace();
            }
        }
    }
}
