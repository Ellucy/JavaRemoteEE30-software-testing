package junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderCalculatorV2Test {

    @Test
    public void testCalculateTotal() {

        //given assumptions
        OrderCalculatorV2 testObj = new OrderCalculatorV2();
        double itemPrice = 100;
        int itemCount = 3;
        double taxRate = 0.1;
        double discount = 50;
        double discountThereshold = 200;
        double expectedTotal = (itemPrice * itemCount * (1+taxRate)) - discount;

        //when
        double actualTotal = testObj.calculateTotal(itemPrice, itemCount, taxRate, discount, discountThereshold);

        //then
        assertEquals(expectedTotal, actualTotal);
    }
}
