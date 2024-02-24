package OOP;

public class Car {
    private int numberOfWheels;  // encapsulated data 
    private int seats;

    Car(int numberOfWheels, int seats){
        this.numberOfWheels= numberOfWheels;
        this.seats = seats;
    }

    public void getNumberOfWheels(){
        System.out.println(numberOfWheels);
    }

    public void getSeats(){
        System.out.println(numberOfWheels);
    }
    public static void main(String[] args) {
        Car obj = new Car(4, 4);
        obj.getNumberOfWheels();
        obj.getSeats();
    }
}
