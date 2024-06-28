package com.mycompany.blueraystore.Business;

import com.mycompany.blueraystore.Enum.CurrencyEnum;
import com.mycompany.blueraystore.Interface.BankInterface;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BanquePostaleTest {

    private BanquePostale banquePostale;
    private BankInterface fakeBank;

    @BeforeEach
    public void setUp() {
        Client client = new Client("Jean");
        banquePostale = new BanquePostale(client);
        fakeBank = mock(BankInterface.class);
    }

    @Test
    public void testConvert(){
        banquePostale.convertMoney(CurrencyEnum.YEN, 10);
        Assertions.assertEquals(1000.058, banquePostale.getClient().getWallet());
        System.out.println("(test ConvertMoney) "+banquePostale.getClient().getWallet()+"$");
    }

    @Nested
    class AddOrWithdrawMoney {
        @Test
        public void testWithdrawMoney(){
            when(fakeBank.withdrawMoney(50)).thenReturn(950);
            int newAmount = fakeBank.withdrawMoney(50);
            System.out.println("(test withdrawMoney) Your new wallet amount is : "+newAmount+"$");
            Assertions.assertEquals(950, newAmount);
        }

        @ParameterizedTest
        @ValueSource(ints = { 10 , 20 , 30 })
        void testValuesForAddMoney(int value) {
            when(fakeBank.addMoney(value)).thenReturn(1000+value);
            int newAmount = fakeBank.addMoney(value);
            System.out.println("(test ValuesForAddMoney) Your new wallet amount is : "+newAmount+"$");
            Assertions.assertEquals(1000 + value, newAmount);
        }
    }

    @AfterAll
    static void endAll(){
        System.out.println("@AfterAll executed");
    }

}