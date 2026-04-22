import java.util.*;
import java.util.stream.Collectors;

class Invoice {
    int id;

    Invoice(int id) {
        this.id = id;
    }
}

public class InvoiceGenerator {
    public static void main(String[] args) {

        List<Integer> ids = Arrays.asList(1, 2, 3, 4);

        List<Invoice> invoices = ids.stream()
                .map(Invoice::new) // constructor reference
                .collect(Collectors.toList());

        invoices.forEach(inv -> System.out.println("Invoice ID: " + inv.id));
    }
}