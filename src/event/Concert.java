package event;

import section.*;
import ticket.*;

public class Concert extends Event {

    public Concert() {

        setTicketType(new FestivalTicket());
        addSection("Floor", generateNewSection(new Floor()));
        addSection("LowerLevel", generateNewSection(new LowerLevel()));

    }

    public Section generateNewSection(Section sectionType) {

        Section newSection = sectionType;
        int counter = newSection.getLowerLimit();

        while (counter <= newSection.getUpperLimit()) {

            Ticket newTicket = new FestivalTicket();

            newTicket.setSeat(counter);
            newSection.addSection(counter, newTicket);
            counter++;
        }

        return newSection;
    }

}
