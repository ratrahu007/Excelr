class Car {
    int speed;
    String brand;

    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{brand='" + brand + "', speed=" + speed + " km/h}";
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Tata", 120);
        System.out.println(myCar.toString());  // Calls overridden toString()
        System.out.println(myCar);  // `toString()` is automatically called
    }
}
