package Exercise02;

public class DiscountCalculator {
    private boolean isHappyHour = false;
    private boolean isVIPCustomer = false;
    private boolean isSilverVIPCustomer = false;
    private boolean isGoldenVIPCustomer = false;

    public int calculatePrice(int price, int amount) {
        if (price<=0 || amount<=0) return 0;
        if (isVIPCustomer) return calculatePriceVIPCustomer(price, amount);
        if (isGoldenVIPCustomer) return calculatePriceGoldenVIPCustomer(price, amount);
        return calculatePriceNormalCustomer(price, amount);
    }

    private int calculatePriceNormalCustomer(int price, int amount) {
        int total;
        if (amount<10) {
            total = price * amount;
        } else if (amount<20) {
            total = (int) (price * 9 + (amount - 9) * price * 0.9);
        } else {
            total = (int) (price * 9 + 0.9 * price * 10 + (amount - 19) * price * 0.8);
        }
        if (isHappyHour) total = total / 2;
        return total;
    }

    private int calculatePriceVIPCustomer(int price, int amount) {
        int total;
        if (amount<20) {
            total = (int) (price * amount * 0.9);
        } else {
            total = (int) (price * 19 * 0.9 + (amount - 19) * price * 0.8);
        }
        if (isHappyHour) total = total / 2;
        return total;
    }

    private int calculatePriceGoldenVIPCustomer(int price, int amount) {
        int total;
        if (amount<20) {
            total = (int) (price * amount * 0.8);
        } else if (amount<50) {
            total = (int) (price * 19 * 0.8 + (amount - 19) * price * 0.7);
        } else {
            total = (int) (price * 19 * 0.8 + price * 30 * 0.7 + (amount - 49) * price * 0.5);
        }
        if (isHappyHour) total = total / 2;
        return total;
    }

    public void setHappyHour(boolean happyHour) {
        isHappyHour = happyHour;
    }

    public void setVIPCustomer(boolean isVIPCustomer) {
        this.isVIPCustomer = isVIPCustomer;
    }

    public void setGoldenVIPCustomer(boolean isGoldenVIPCustomer) {
        this.isGoldenVIPCustomer = isGoldenVIPCustomer;
    }

    public void setSilverVIPCustomer(boolean isSilverVIPCustomer) {
        this.isSilverVIPCustomer = isSilverVIPCustomer;
    }
}
