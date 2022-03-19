package domain;

public class Bag {
    public Bag(long amount) {
        this(amount, null);
    }

    public Bag(Long amount, Invitation invitation) {
        this.amount = amount;
        this.invitation = invitation;
    }

    private Long amount;
    private final Invitation invitation;
    private Ticket ticket;

    public boolean hasInvitaiton() {
        return invitation != null;
    }

    public boolean hasTicket() {
        return ticket != null;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

}
