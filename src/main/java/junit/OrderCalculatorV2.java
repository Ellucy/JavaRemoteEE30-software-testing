package junit;

/*
 * Now, let's say a new requirement is added to apply the discount
 * only if the order's total price (before tax) is greater than a certain threshold.
 * */
public class OrderCalculatorV2 {
    public double calculateTotal(double itemPrice, int itemCount, double taxRate, double discount, double discountThreshold) {
        double totalPrice = itemPrice * itemCount;  // total price before tax

        // Apply the discount only if the order's total price (before tax) is greater than a threshold
        totalPrice *= (1+taxRate);

        if (totalPrice > discountThreshold) {
            totalPrice -= discount;
        }

        // Above change in code will introduce a bug, because the discount is applied before adding the tax,
        // which could lead to incorrect calculations.
        // Without a test, this bug might go unnoticed
        return totalPrice;
    }


    public static void main(String[] args) {
        OrderCalculatorV2 calculatorV2 = new OrderCalculatorV2();
        double total = calculatorV2.calculateTotal(100, 3, 0.1, 50, 200);
        System.out.println("Total price: " + total);
    }
}