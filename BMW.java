public class BMW extends Car{
    //"IS-A" relationship
        public BMW() {
                super();
        }

        public BMW(int capacity) {
                super(capacity);
        }

    //6. At least one method must be rewritten for each new machine model. (overriding)
    @Override
    public void soundofmotor() {
        System.out.println("BBBDROOM");
    }
}
