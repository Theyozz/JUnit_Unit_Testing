package com.mycompany.blueraystore.Interface;

import com.mycompany.blueraystore.Enum.CurrencyEnum;

public interface BankInterface {
    int addMoney(int amount);
    int withdrawMoney(double amount);
    void convertMoney(CurrencyEnum currency, int value);
}
