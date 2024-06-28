package com.mycompany.blueraystore.Business;

import com.mycompany.blueraystore.Interface.BankInterface;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ClientTest {

    private Client client;


    @BeforeEach
    public void setUp() {
        client = new Client("Jean");

    }

//    @Test
//    public void testGetAllMoney(){
//        when(fakeBank.getAllMoney()).thenReturn(1000);
//        System.out.println("You have "+fakeBank.getAllMoney()+"$ on your bank account");
//    }
//
//    @Test
//    public void testAddMoney(){
//        when(fakeBank.getAllMoney()).thenReturn(1000);
//        when(fakeBank.addMoney(10)).thenReturn(10);
//        when(fakeBank.getAllMoney()).thenReturn(1010);
//        System.out.println("You just add 10$, now you have "+fakeBank.getAllMoney()+"$");
//    }

}