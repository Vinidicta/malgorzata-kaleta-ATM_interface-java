package com.kodilla.kodillacourse;

public interface ATM {
    void payment();

    void withdrawal();

    default void connectionWithBank() {
        System.out.println("Welcom to Euro Bank");
    }

    static String endOfOperation() {
        return "Operation has been completed. See you soon!";
    }
}
