package ticket;

import priceBehavior.CalculatePriceBehavior;

public abstract class Ticket {

    private int seat;
    private String seatUser;
    private double modifier;
    CalculatePriceBehavior calculatePrice;

    public void displayDetail() {
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getSeatUser() {
        return seatUser;
    }

    public void setSeatUser(String seatUser) {
        this.seatUser = seatUser;
    }

    public void setModifier(double modifier) {
        this.modifier = modifier;
    }

    public double getModifier() {
        return modifier;
    }

    public double getPrice() {
        return calculatePrice.getPrice(modifier);
    }

    public void setCalculatePriceBehavior(CalculatePriceBehavior calculatePrice) {
        this.calculatePrice = calculatePrice;
    }

}
