import java.util.*;

class Team implements Comparable<Team> {
    String name;
    int points;

    Team(String n, int p) {
        name = n;
        points = p;
    }

    public int compareTo(Team t) {
        return t.points - this.points;
    }

    public boolean equals(Object o) {
        return o instanceof Team && name.equals(((Team)o).name);
    }

    public int hashCode() {
        return name.hashCode();
    }

    public String toString() {
        return name + " " + points;
    }
}

class Match {
    String name;
    Match(String n){ name=n; }
}

class Result {
    String r;
    Result(String r){ this.r=r; }
}

public class TournamentSystem {
    public static void main(String[] args) {

        Set<Team> teams = new HashSet<>();
        teams.add(new Team("A", 10));
        teams.add(new Team("B", 20));

        Queue<Match> matches = new LinkedList<>();
        matches.add(new Match("M1"));

        List<Result> results = new ArrayList<>();
        TreeSet<Team> leaderboard = new TreeSet<>();

        while (!matches.isEmpty()) {
            matches.poll();
            results.add(new Result("Win"));
        }

        leaderboard.addAll(teams);

        System.out.println("Leaderboard:");
        System.out.println(leaderboard);
    }
}