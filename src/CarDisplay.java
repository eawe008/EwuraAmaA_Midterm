/**
 * Inheritance Lab - Midterm Exam
 * Spring 2024 ITEC 2150
 *
 */
public class CarDisplay {
    public static void main(String[] args) {
        Car car = new Car("Father", "Large" , "ABC123");
        System.out.println(car);

        Truck truck  = new Truck("Company", " Extra Large", "TRK999", 5000 );
        System.out.println(truck);

        Sedan sedan = new Sedan("Mother", "Medium", "8235YYA", 4, 2000);
        System.out.println(sedan);

        SportsCar sportsCar = new SportsCar("I", "Small", "TH78994", 2,  3000, "Red");
        System.out.println(sportsCar);

    }
}
class Car {
    private String name; //owner name e.g. mother, father, son, daughter
    private String size;
    private String licensePlate;

    public Car(String name, String size, String licensePlate) {
        this.name = name;
        this.size = size;
        this.licensePlate = licensePlate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public String toString() {
        return "My " + name + " has/have a most luxurious car in my family and the license plate is " + getLicensePlate();
    }
}
class Sedan extends Car{
    private int doors;
    private int engineCapacity;

    public Sedan(String name, String size, String licensePlate, int doors, int engineCapacity) {
        super(name, size, licensePlate);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString(){
        return super.getName() + " has/have a Sedan with " + doors + " doors and " + engineCapacity + " engine capacity";
    }


}
class SportsCar extends Sedan{

    private String color;


    public SportsCar(String name, String size, String licensePlate, int doors, int engineCapacity, String color) {
        super(name, size, licensePlate, doors, engineCapacity);
        this.color = color;
    }

    @Override
    public String toString(){
        return super.getName() + " has/have a Sports Car with " + super.getDoors() + " doors and "  + super.getEngineCapacity() + " engine capacity and " + color + " color";
    }
}
class Truck extends Car {

    private int cargoCapacity;

    public Truck(String name, String size, String licensePlate, int cargoCapacity){
        super(name, size, licensePlate);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public String toString(){
        return "This Truck belongs to " + super.getName() + " and it is " + super.getSize() +
                " size" +
                "\nand the cargo capacity is " + getCargoCapacity() + "kg and license plate is " + super.getLicensePlate();
    }
}


