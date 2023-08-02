package crm;

public class RentalCalculatorFactory {
    public RentalCalculator createRentalCalculator(CarType carType) {
        switch(carType) {
            case SPORT -> {
                return new RentalCalculatorForSportCar();
            }
            case REGULAR -> {
                return new RentalCalculatorForRegularCar();
            }
            case ELECTRICAL -> {
                return new RentalCalculatorForElectricalCar();
            }
            default -> {
                throw new IllegalArgumentException("Invalid carType: " + carType);
            }
        }
    }
}
