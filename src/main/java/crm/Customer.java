package crm;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Customer {
    private final String name;
    private Set<Rental> rentals;

    public Customer(String name) {
        this.name = name;
        rentals = new HashSet<>();
    }

    public BigDecimal calculateTotalAmount() {

        return rentals.stream().map(el -> el.calculateAmount()).reduce(BigDecimal::add).get();
    }

    public int calculateLoyaltyPoints () {
        return rentals.stream().map(el -> el.calculateLoyaltyPoint()).reduce((res, el) -> res + el).get();

    }

    public boolean toRent(Rental item) {
        return rentals.add(item);
    }

    public boolean refuse(Rental item) {
        return rentals.remove(item);
    }

    public String statement(){
        StringBuilder res = new StringBuilder("Rental Record for " + name + "\n");

        rentals.stream().forEach(el -> res.append(el.toString()));
        
        res.append("Amount price is " + calculateTotalAmount() + " $\nYou earned " + calculateLoyaltyPoints() + " loyalty points");

        return res.toString();
    }
}
