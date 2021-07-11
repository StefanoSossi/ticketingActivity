package priceBehavior;

public class MatchPrice implements CalculatePriceBehavior {

    double defaultPrice = 20.50;

    @Override
    public double getPrice(double modifier) {
        return (modifier * defaultPrice);
    }

}
