package Exercise02;

public class DiscountCalculator {
    private boolean isHappyHour;
    private boolean isVIP;
    private boolean isGoldenVIP;

    public int calculatePrice(int price, int amount) {
        if (price<=0) return 0;
        double total;
        total = price * (amount<10 ? amount : 9);
        if (isGoldenVIP) {
            total *= 0.8;
        } else if (isVIP) {
            total *= 0.9;
        }
        amount -= 9;
        if (amount>0) {
            double extra;
            if (isGoldenVIP) {
                extra = price * 0.8 * (amount<11 ? amount : 10);
            } else {
                extra = price * 0.9 * (amount<11 ? amount : 10);
            }
            total += extra;
            amount -= 10;
        }
        if (amount>0) {
            double extra;
            if (isGoldenVIP) {
                extra = price * 0.7 * (amount<31 ? amount : 30);
            } else {
                extra = price * 0.8 * amount;
            }
            amount -= 30;
            total += extra;
        }
        if (amount>0 && isGoldenVIP) {
            total += price * 0.5 * amount;
        }
        if (isHappyHour) total = total/2;
        return (int) Math.floor(total);
    }

    public void setHappyHour(boolean happyHour) {
        this.isHappyHour = happyHour;
    }

    public void setVIPCustomer(boolean isVIP) {
        this.isVIP = isVIP;
    }

    public void setGoldenVIPCustomer(boolean isGolden) {
        this.isGoldenVIP = isGolden;
        if (this.isGoldenVIP) this.isVIP = true;
    }
}
