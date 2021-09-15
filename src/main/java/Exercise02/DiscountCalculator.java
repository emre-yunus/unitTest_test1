package Exercise02;

public class DiscountCalculator {
    private boolean isHappyHour;
    private boolean isVIP;

    public int calculatePrice(int price, int amount) {
        if (price<=0) return 0;
        double total;
        if (amount<10) {
            total = price * amount;
            if (isVIP) total *= 0.9;
        } else if (amount<20) {
            total = 9 * price;
            if (isVIP) total *= 0.9;
            total = total + (amount - 9) * 0.9 * price;
        } else {
            total = 9 * price;
            if (isVIP) total *= 0.9;
            total = total + (amount - 19) * 0.8 * price + 10 * 0.9 * price;
        }
        if (isHappyHour) total = total/2;
        isHappyHour = false;
        isVIP = false;
        return (int) Math.floor(total);
    }

    public void setHappyHour(boolean happyHour) {
        this.isHappyHour = happyHour;
    }

    public void setVIPCustomer(boolean isVIP) {
        this.isVIP = isVIP;
    }
}
