package ticket;

public class Bag {
    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    public boolean hasInvitaiton() {
        return invitation != null;
    }

    public boolean hasTicket() {
        return ticket != null;
    }
}
