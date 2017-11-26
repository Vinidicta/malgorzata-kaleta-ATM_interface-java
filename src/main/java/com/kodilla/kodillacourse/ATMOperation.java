package com.kodilla.kodillacourse;

public class ATMOperation {

    private ATM atm;

    public ATMOperation(ATM atm) {
        this.atm = atm;
    }

    public void process() {
        this.atm.connectionWithBank();
        this.atm.payment();
        this.atm.withdrawal();
    }
}
