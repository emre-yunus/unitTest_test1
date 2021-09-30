package Exercise02;

public class DiscountCalculator {
    private boolean isHappyHour;
    private boolean isVIPCustomer;
    private boolean isGoldenVIPCustomer;

    class Discount {
        int minAmount;
        double discountFactor;

        Discount(int minAmount, double discountFactor) {
            this.minAmount = minAmount;
            this.discountFactor = discountFactor;
        }
    }

    Discount[] getDiscounts() {
        if (isGoldenVIPCustomer)
            return new Discount[]{
                    new Discount(49, 0.5),
                    new Discount(19, 0.7),
                    new Discount(0, 0.8),
            };
        if (isVIPCustomer)
            return new Discount[]{
                    new Discount(19, 0.8),
                    new Discount(0, 0.9),
            };
        return new Discount[]{
                new Discount(19, 0.8),
                new Discount(9, 0.9),
                new Discount(0, 1),
        };
    }

    public int calculatePrice(int price, int amount) {
        if (price<=0 || amount<=0) return 0;
        final int normalPrice = calculateNormalPrice(price, amount);
        return isHappyHour ? normalPrice / 2 : normalPrice;
    }

    private int calculateNormalPrice(int price, int amount) {
        int remainingAmount = amount;
        int totalPrice = 0;
        for (Discount discount : getDiscounts()) {
            int amountInThisRange = remainingAmount - discount.minAmount;
            if (amountInThisRange > 0) {
                totalPrice += price * amountInThisRange * (discount.discountFactor);
                remainingAmount -= amountInThisRange;
            }
        }
        return totalPrice;
    }

    public void setHappyHour(boolean isHappyHour) {
        this.isHappyHour = isHappyHour;
    }

    public void setVIPCustomer(boolean isVIPCustomer) {
        this.isVIPCustomer = isVIPCustomer;
    }

    public void setGoldenVIPCustomer(boolean isGoldenVIPCustomer) {
        this.isGoldenVIPCustomer = isGoldenVIPCustomer;
    }
}
