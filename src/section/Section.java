package section;

import java.util.HashMap;
import ticket.Ticket;

public abstract class Section {

    private int lowerLimit;
    private int upperLimit;
    private double modifier;
    private HashMap<Integer, Ticket> ticketsList;

    public Section() {
        this.ticketsList = new HashMap<Integer, Ticket>();
    }

    public int getLowerLimit() {
        return lowerLimit;
    }

    public void setLowerLimit(int lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    public int getUpperLimit() {
        return upperLimit;
    }

    public void setUpperLimit(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public void setModifier(double modifier) {
        this.modifier = modifier;
    }

    public HashMap<Integer, Ticket> getTicketsList() {
        return ticketsList;
    }

    public void addSection(Integer seat, Ticket ticket) {
        ticket.setModifier(this.modifier);
        this.ticketsList.put(seat, ticket);
    }

    public void setTicketsList(HashMap<Integer, Ticket> ticketsList) {
        this.ticketsList = ticketsList;
    }

}
