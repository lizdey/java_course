public class Mercedes_Benz extends Car {
    //"IS-A" relationship
    public Mercedes_Benz() {
        super();
    }

    public Mercedes_Benz(int capacity) {
        super(capacity);
    }

    public Mercedes_Benz(String model, String typeofbox, int capacity) {
        super(model, typeofbox, capacity);
    }
    //6. At least one method must be rewritten for each new machine model. (overriding)
    @Override
    public void soundofmotor() {
        System.out.println("BRRRRR");
    }

    @Override
    public void addpassengers(Man man) {
        super.addpassengers(man);
    }
}
