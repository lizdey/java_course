import java.util.ArrayList;
import java.util.Objects;
    //"HAS-A" relationship
    //11. Replace the Car class with an abstract class. (abstract classes)
public abstract class Car implements AbilityToAccelerate {
    //1. Create classes Car.
    //Describe the Car with color, model, type of box and capacity. The Car must accelerate, and speed must also be switched.
    protected String model;
    protected String typeofbox;
    protected int capacity;

    public Car() {
    }
    //8. Access to class fields should be provided only through getters and setters.
    public Car(int capacity) {
        this.capacity = capacity;
    }

    public Car(String model, String typeofbox, int capacity) {
        this.model = model;
        this.typeofbox = typeofbox;
        this.capacity = capacity;
    }

    //изменить тип коробки и модель невозможно, поэтому на них есть только геттеры
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getModel() {
        return model;
    }

    public String getTypeofbox() {
        return typeofbox;
    }

    //реализуем метод интерфейса AbilityToAccelerate
    public void speed() {
        int j = 6;
        for (int i = 0; i < j; i++) {
            System.out.println("Switch to higher gear!");
        }
    }

    public void speed(int gear) {
        if (gear >= 0) {
            switch (gear) {
                case 0:
                    System.out.println("Stop");
                    break;
                case 1:
                    System.out.println("Low gear. Speed: 1 - 20 km/h ");
                    break;
                case 2:
                    System.out.println("Low gear. Speed: 20 - 40 km/h ");
                    break;
                case 3:
                    System.out.println("Speed: 40 - 60 km/h ");
                    break;
                case 4:
                    System.out.println("High gear. Speed: 60 - 90 km/h ");
                    break;
                case 5:
                    System.out.println("High gear. Speed: 90 - 220 km/h ");
                    break;
                default:
                    System.out.println("Impossible or illegal");
                    break;
            }
        } else {
            System.out.println("Please enter a positive number");
        }
    }

    //2. Implement toString, equals and hashcode. In toString, use the StringBulder for the Car class, and the StringBuffer for the Man class.

    @Override
    public String toString() {
        return "The model is " + model + ", the type of box is " + typeofbox + ", it's capacity is " + capacity;
    }

    @Override
    public boolean equals(Object obj) {
        Car otherCar = (Car) obj;
        return this.typeofbox == otherCar.typeofbox && this.model == otherCar.model && this.capacity == capacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, typeofbox, capacity);
    }

    public abstract void soundofmotor();


    //There should be no more passengers than the capacity of the Car.
    //You can’t put more people in the car. Create a condition that matches this restriction.
    //If the condition is violated, the corresponding Exception shall be thrown.
    ArrayList<Man> arrayofpassengers = new ArrayList<>();
    private int size = 0;

    public void addpassengers(Man man) {
        if (arrayofpassengers.size() < getCapacity() && getCapacity() > 0) {
            arrayofpassengers.add(man);
        } else if (getCapacity() < 0) {
            System.out.println("Something wrong with the car capacity!");
        } else{
        System.out.println("The car is not rubber! Please get out of the car!");
    }
}

    public void showpassengers (){
        for (int i = 0; i < getCapacity(); i++){
            System.out.println(arrayofpassengers.get(i));
        }
    }
}
