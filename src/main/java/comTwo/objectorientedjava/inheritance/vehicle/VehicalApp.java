package comTwo.objectorientedjava.inheritance.vehicle;

public class VehicalApp {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.setVehicletype("Motor Vehicle, Car , Truck");
        vehicle.setCompanyName("TATA Motors, Maruti Suzuki, Mahindra");

        Bike bike = new Bike();
        bike.setVehicletype("Motor Vehicle");
        bike.setCompanyName("Hero Honda");
        bike.setBike_type("Withgear and Withoutgear");


        Withgear withgear = new Withgear();
        withgear.setVehicletype("Motor Vehicle");
        withgear.setBike_type("Withgear");
        withgear.setBike_name("CB Shine");
        withgear.setColor("Gray");
        withgear.setCompanyName("Hero Honda");
        withgear.setPrice(90000.50f);
        withgear.setCustomerId(1001);

        Withoutgear withoutgear = new Withoutgear();
        withoutgear.setVehicletype("Motor Vehicle");
        withoutgear.setBike_type("Withoutgear");
        withoutgear.setBike_name("OLA EV");
        withoutgear.setColor("Maroon");
        withoutgear.setCompanyName("OLA");
        withoutgear.setPrice(100000.30f);
        withoutgear.setCustomerId(101);

        Car car = new Car();
        car.setVehicletype("Car Vehicle");
        car.setCar_type("Disel and Petrol");
        car.setCompanyName("TATA, Maruti Suzuki, Mahindra");


        Petrol petrol = new Petrol();
        petrol.setVehicletype("Car Vehicle");
        petrol.setCar_type("Petrol");
        petrol.setCar_name("Suzuki Desire");
        petrol.setCompanyName("Maruti Suzuki");
        petrol.setMilage(25);
        petrol.setCustomerIdCar(124);


        Disel disel = new Disel();
        disel.setVehicletype("Car Vehicle");
        disel.setCar_type("Disel");
        disel.setCar_name("Mahindra XUV");
        disel.setCompanyName("Mahindra");
        disel.setMilage(18);
        disel.setCustomerIdCar(123);

        Truck truck = new Truck();
        truck.setVehicletype("Truck");
        truck.setTrucktype("Transport");
        truck.setCompanyName("TATA and AshokLayland");


        TATA tata = new TATA();
        tata.setVehicletype("Truck");
        tata.setTrucktype("Transport");
        tata.setCompanyName("TATA");
        tata.setLoadCapacity("6 Tone");
        tata.setMilage(9);


        AshokLayland ashokLayland = new AshokLayland();
        ashokLayland.setVehicletype("Truck");
        ashokLayland.setTrucktype("Transport within State");
        ashokLayland.setCompanyName("Ashok Layland");
        ashokLayland.setLoadCapacity("4 Tone");
        ashokLayland.setMilage(19);


        System.out.println("=================== Vehicles =================");

        /*Vehicel Data*/
        System.out.println(vehicle.getVehicletype() + " " + vehicle.getCompanyName());

        System.out.println("=================== Bikes =================");

        /*Bikes */
        System.out.println(bike.getVehicletype() + " " + bike.getBike_type() + " " + bike.getCompanyName());

        System.out.println("=================== WithGear =================");
        /*Withgear */
        System.out.println(withgear.getCustomerId() + " " + withgear.getVehicletype() + " " + withgear.getBike_name() + " " + withgear.getBike_type() + " " + withgear.getBike_name() + " " + withgear.getColor() + " " + withgear.getCompanyName() + " " + withgear.getPrice());


        System.out.println("=================== Without Gear =================");
        /*Withoutgear */

        System.out.println(withoutgear.getCustomerId() + " " + withoutgear.getVehicletype() + " " + withoutgear.getBike_name() + " " + withoutgear.getBike_type() + " " + withoutgear.getBike_name() + " " + withoutgear.getColor() + " " + withoutgear.getCompanyName() + " " + withoutgear.getPrice());

        System.out.println("=================== Cars =================");
        /*Cars*/
        System.out.println(car.getVehicletype() + " " + car.getCar_type() + " " + car.getCompanyName());

        System.out.println("=================== Disel Cars =================");
        /*Disel*/
        System.out.println(disel.getCustomerIdCar() + " " + disel.getVehicletype() + " " + disel.getCar_type() + " " + disel.getCompanyName() + " " + disel.getCar_name() + " " + disel.getMilage());

        System.out.println("=================== Petrol Cars =================");
        /*Petrol*/
        System.out.println(petrol.getCustomerIdCar() + " " + petrol.getVehicletype() + " " + petrol.getCar_type() + " " + petrol.getCompanyName() + " " + petrol.getCar_name() + " " + petrol.getMilage());

        System.out.println("=================== Trucks =================");
        /*Trucks*/
        System.out.println(truck.getVehicletype() + " " + truck.getTrucktype() + " " + truck.getCompanyName());
        System.out.println("=================== TATA Trucks =================");
        /*TATA*/
        System.out.println(tata.getVehicletype() + " " + tata.getTrucktype() + " " + tata.getCompanyName() + " " + tata.getLoadCapacity() + " " + tata.getMilage());
        System.out.println("=================== Ashok Layland Trucks =================");
        /*Ashok Layland*/
        System.out.println(ashokLayland.getVehicletype() + " " + ashokLayland.getTrucktype() + " " + ashokLayland.getCompanyName() + " " + ashokLayland.getLoadCapacity() + " " + ashokLayland.getMilage());

    }
}
