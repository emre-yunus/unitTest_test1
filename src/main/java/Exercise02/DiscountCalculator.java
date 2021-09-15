package Exercise02;

public class DiscountCalculator {
    private boolean happyHour;

    public int calculatePrice(int price, int amount) {
        if (price<=0) return 0;
        double total;
        if (amount<10) {
            total = price * amount;
        } else if (amount<20) {
            total = (int) Math.round((amount - 9) * 0.9 * price + 9 * price);
        } else {
            total = (amount - 19) * 0.8 * price + 10 * 0.9 * price + 9 * price;
        }
        if (happyHour) total = total/2;
        happyHour = false;
        return (int) Math.floor(total);
    }

    public void setHappyHour(boolean happyHour) {
        this.happyHour = happyHour;
    }
}
