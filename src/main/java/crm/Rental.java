package crm;

import lombok.Getter;

import java.math.BigDecimal;
import java.util.Objects;


@Getter
public class Rental {
    private final Rented rented;
    private final Integer period;

    public Rental(Rented rented, Integer period) {
        this.rented = rented;
        this.period = period;
    }

    public BigDecimal calculateAmount() {

        return rented.getRentalCalculator().calculateAmount(period);
    }

    public int calculateLoyaltyPoint() {
        return  rented.getRentalCalculator().calculateLoyaltyPoints(period);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rental rental = (Rental) o;

        return Objects.equals(rented, rental.rented);
    }

    @Override
    public int hashCode() {

        return rented != null ? rented.hashCode() : 0;
    }

    @Override
    public String toString() {
        return rented.toString() +'\t' +  calculateAmount().toString() + "$\n";
    }
}
