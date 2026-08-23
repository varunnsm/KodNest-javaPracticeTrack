
class DeliveryCalculator {

    int calculateCharge(int distance) {
        // Return the standard charge
        return distance * 5;
    }

    int calculateCharge(int distance, int expressFee) {
        // Return the express charge
        return distance + expressFee;
    }
}
