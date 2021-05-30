package com.company;

import java.io.PrintStream;

public class MyException extends Exception {
    // Наследуем либо от Exception, либо от survavel


    @Override
    public void printStackTrace(PrintStream s) { // выбираем PrintStream
        System.err.println("My Exception"); // вместо out - err. будет подсвеченно красным
    }
}
