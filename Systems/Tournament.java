import java.util.*;

class Player {
    String name;
    Player(String n){ name=n; }

    public boolean equals(Object o){
        return o instanceof Player && name.equals(((Player)o).name);
    }
    public int hashCode(){ return name.hashCode(); }
}

class Match { String m; Match(String m){this.m=m;} }
class Result { String r; Result(String r){this.r=r;} }

class Score implements Comparable<Score>{
    String name; int score;
    Score(String n,int s){name=n;score=s;}

    public int compareTo(Score o){ return o.score - this.score; }

    public String toString(){ return name+" "+score; }
}

public class Tournament {
    public static void main(String[] args) {

        Set<Player> players = new HashSet<>();
        players.add(new Player("A"));

        Queue<Match> matches = new LinkedList<>();
        matches.add(new Match("M1"));

        List<Result> results = new ArrayList<>();
        TreeSet<Score> board = new TreeSet<>();

        while(!matches.isEmpty()) {
            matches.poll();
            results.add(new Result("Win"));
            board.add(new Score("A",100));
        }

        System.out.println(board);
    }
}