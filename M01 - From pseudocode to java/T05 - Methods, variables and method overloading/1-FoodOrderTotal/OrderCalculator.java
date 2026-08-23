
class OrderCalculator {

    int calculateSubtotal(int price, int quantity) {
        // Return price multiplied by quantity
        return price * quantity;
    }

    int calculateFinalTotal(int subtotal, int deliveryCharge) {
        // Return subtotal plus delivery charge
        return subtotal + deliveryCharge;
    }
}
