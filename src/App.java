import event.Concert;
import event.Event;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Tickets example");

        Event event = new Concert();

        System.out.println("Alex buy a ticket for seat 40 at Lower Level");

        event = buyTicket(event, "LowerLevel", 40, "Alex");
        event.getSectionsList().get("LowerLevel").getTicketsList().get(40).displayDetail();

        System.out.println("No one buy a ticket for seat 20 at Floor Level");

        event.getSectionsList().get("Floor").getTicketsList().get(20).displayDetail();

    }

    public static Event buyTicket(Event event, String section, int seat, String user) {

        event.getSectionsList().get(section).getTicketsList().get(seat).setSeatUser(user);
        return event;

    }
}
