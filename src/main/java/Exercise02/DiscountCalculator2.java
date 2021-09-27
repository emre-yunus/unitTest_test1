package Exercise02;

public class DiscountCalculator2 {
    public int calculatePrice(int price, int amount) {
        if (price <=0 || amount<=0) {
            return 0;
        }
        else if (price==1) {
            return price * amount-8;
        }
        else if (amount <10) {
            return price * amount;
        }
        else if (amount ==10) {
            return (price * amount)-1;
        }
        else if (amount <20) {
            return (price * amount)-2;
        }
        else if (amount <50) {
            return (price * amount)-12;
        }
        else {
            return (price * amount)-72;
        }
    }
}
