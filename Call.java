package CallCenter;

public class Call {

    private Rank rank;
    private Caller caller;
    private Employee handler;

    public Call(Caller c) {
        rank = Rank.Responder;
        caller = c;
    }

    /* Set employee who is handling call. */
    public void setHandler(Employee e) {
        handler = e;
    }

    /* Play recorded message to the customer. */
    public void reply(String message) {
        System.out.println(message);
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank r) {
        rank = r;
    }

    public Rank incrementRank() {
        if (rank == Rank.Responder) {
            rank = Rank.Manager;
        } else if (rank == Rank.Manager) {
            rank = Rank.Director;
        }
        return rank;
    }


    public void disconnect() {
        reply("Thank you for calling");
    }
}