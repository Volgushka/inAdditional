public class Cargo {

    private final Dimensions dimensions;
    private final int massa;
    private final String deliveryAddress;
    private final String regNumber;
    private final boolean cargoTurn;
    private final boolean cargoBrittleness;

    public Cargo(Dimensions dimensions, int massa, String deliveryAddress, String regNumber, boolean cargoTurn, boolean cargoBrittleness) {
        this.dimensions = dimensions;
        this.massa = massa;
        this.deliveryAddress = deliveryAddress;
        this.regNumber = regNumber;
        this.cargoTurn = cargoTurn;
        this.cargoBrittleness = cargoBrittleness;
    }

    public Cargo setDimensions(Dimensions dimensions) {
        return new Cargo(dimensions, massa, deliveryAddress, regNumber, cargoTurn, cargoBrittleness);
    }

    public Cargo setMassa(int massa) {
        return new Cargo(dimensions, massa, deliveryAddress, regNumber, cargoTurn, cargoBrittleness);
    }

    public Cargo setDeliveryAddress(String deliveryAddress) {
        return new Cargo(dimensions, massa, deliveryAddress, regNumber, cargoTurn, cargoBrittleness);
    }

    public Cargo setRegNumber(String regNumber) {
        return new Cargo(dimensions, massa, deliveryAddress, regNumber, cargoTurn, cargoBrittleness);
    }

    public Cargo setCargoTurn(boolean cargoTurn) {
        return new Cargo(dimensions, massa, deliveryAddress, regNumber, cargoTurn, cargoBrittleness);
    }

    public Cargo setCargoBrittleness(boolean cargoBrittleness) {
        return new Cargo(dimensions, massa, deliveryAddress, regNumber, cargoTurn, cargoBrittleness);
    }

    public String getDimensions() {
        return dimensions;
    }

    public int getMassa() {
        return massa;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public boolean isCargoTurn() {
        return cargoTurn;
    }

    public boolean isCargoBrittleness() {
        return cargoBrittleness;
    }
}
