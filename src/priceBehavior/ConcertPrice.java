package priceBehavior;

public class ConcertPrice implements CalculatePriceBehavior {

    double defaultPrice = 25.00;
    int stadiumCapacityReward = 2;

    @Override
    public double getPrice(double modifier) {
        return (modifier * defaultPrice * stadiumCapacityReward);
    }

}
