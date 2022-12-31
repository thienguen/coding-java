import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

// T is a bounded type
// if T coming from the user is not from classes that derived
// from Player, then there will be errors
// Technically, no Int, no String, no Long okay>
// multiple bounds, you could use &
// Comparable<Team<T>> --> specify the type of T
// Team is a type, and T could be any type that extends from Player
public class Team<T extends Player> implements Comparable<Team<T>> {
    private int played = 0;
    private int won    = 0;
    private int lost   = 0;
    private int tied   = 0;
    private final String name;
    private final ArrayList<T> members = new ArrayList<>();

    public boolean addPlayer(T player) {
        AtomicBoolean answer = new AtomicBoolean(false);

        if (members.contains(player)) {
            System.out.println(player.getName() + " is already on this team");
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            answer.set(true);
        }
        return answer.get();
    }

    public int numPlayers() {
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {

        String message;

        if (ourScore > theirScore) {
            won++;
            message = " beat ";
        } else if (ourScore == theirScore) {
            tied++;
            message = " drew with ";

        } else {
            lost++;
            message = " lost to ";
        }
        played++;
        if (opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        return Integer.compare(team.ranking(), this.ranking());
    }

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}























