package comTwo.objectorientedjava.inheritance.vehicle;

public class TATA extends Truck {
    private int milage;
    private String loadCapacity;

    public int getMilage() {
        return milage;
    }

    public void setMilage(int milage) {
        this.milage = milage;
    }

    public String getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(String loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
