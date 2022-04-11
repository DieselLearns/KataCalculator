package main.exceptions;

public class DifferentNumberSystemException extends Exception{
    {
        System.err.println("используются одновременно разные системы счисления!\nили неверно введены римские числа!");
    }
}
