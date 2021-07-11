package ticket;

import priceBehavior.MatchPrice;

public class FootballTicket extends Ticket {

    public FootballTicket() {
        setCalculatePriceBehavior(new MatchPrice());
    }

    public void displayDetail() {
        System.out.println("This ticket is for football with price: " + getPrice());
    }

}
