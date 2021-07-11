package event;

import java.util.HashMap;
import section.Section;
import ticket.Ticket;

public abstract class Event {

    private HashMap<String, Section> sectionsList;
    private Ticket ticketType;

    public Event() {
        this.sectionsList = new HashMap<String, Section>();
    }

    public Ticket getTicketType() {
        return ticketType;
    }

    public void setTicketType(Ticket ticketType) {
        this.ticketType = ticketType;
    }

    public HashMap<String, Section> getSectionsList() {
        return sectionsList;
    }

    public void addSection(String sectionName, Section section) {
        this.sectionsList.put(sectionName, section);
    }

}
