package com.mycompany.blueraystore.Business;

import com.mycompany.blueraystore.Enum.CurrencyEnum;
import com.mycompany.blueraystore.Interface.BankInterface;

public class BanquePostale implements BankInterface {

    public Client client;
    private BankInterface bank;

    public BanquePostale(Client clients) {
        this.client = clients;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int addMoney(int amount){
        return bank.addMoney(amount);
    }

    public int withdrawMoney(double amount){
        return bank.withdrawMoney(amount);
    }

    public void convertMoney(CurrencyEnum unite, int value){
        double walletClient = client.getWallet();
        if (unite.equals(CurrencyEnum.CHF)){
            walletClient += value * 1.04;
        } else if (unite.equals(CurrencyEnum.USD)){
            walletClient += value * 0.93;
        } else if (unite.equals(CurrencyEnum.YEN)){
            walletClient += value * 0.0058;
        } else if (unite.equals(CurrencyEnum.EUR)){
            walletClient += value;
        }
        client.setWallet(walletClient);
    }

}
