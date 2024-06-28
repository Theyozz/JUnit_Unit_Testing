package com.mycompany.blueraystore.Business;

import com.mycompany.blueraystore.Enum.CurrencyEnum;
import com.mycompany.blueraystore.Interface.BankInterface;

public class Client{

    private String name;
    private double wallet;

    public Client(String name){
        this.name = name;
        wallet = 1000;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }
}
