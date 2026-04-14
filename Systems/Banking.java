import java.util.*;

class Transaction {
    int id;
    Transaction(int id){ this.id=id; }
}

class Account {
    int id;
    Account(int id){ this.id=id; }

    public boolean equals(Object o){
        return o instanceof Account && id==((Account)o).id;
    }
    public int hashCode(){ return id; }
}

public class Banking {
    public static void main(String[] args) {

        Set<Account> accounts = new HashSet<>();
        accounts.add(new Account(1));

        Queue<Transaction> queue = new LinkedList<>();
        queue.add(new Transaction(1));

        List<Transaction> list = new ArrayList<>();
        Stack<Transaction> stack = new Stack<>();

        while(!queue.isEmpty()) {
            Transaction t = queue.poll();
            list.add(t);
            stack.push(t);
            System.out.println("Processed: " + t.id);
        }

        System.out.println("Rollback: " + stack.pop().id);
    }
}