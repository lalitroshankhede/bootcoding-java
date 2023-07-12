package comTwo.objectorientedjava.inheritance.vehicle;

public class Petrol extends Car {

    private int customerIdCar;
    private int milage;
    private String car_name;


    public int getCustomerIdCar() {
        return customerIdCar;
    }

    public void setCustomerIdCar(int customerIdCar) {
        this.customerIdCar = customerIdCar;
    }

    public int getMilage() {
        return milage;
    }

    public void setMilage(int milage) {
        this.milage = milage;
    }

    public String getCar_name() {
        return car_name;
    }

    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }
}
