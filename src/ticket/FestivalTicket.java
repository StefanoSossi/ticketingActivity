package ticket;

import priceBehavior.ConcertPrice;

public class FestivalTicket extends Ticket {

    public FestivalTicket() {
        setCalculatePriceBehavior(new ConcertPrice());
    }

    public void displayDetail() {

        String displayMessage = "";

        displayMessage += "\n Seat: " + getSeat() + "\n User: " + getSeatUser() + "\n Price: " + getPrice();
        System.out.println(displayMessage);

    }
}
