public interface AbilityToAccelerate {
    //7. The speed switching method should have 2 implementations, without parameters, if the automatic gearbox. With the parameter,
    //which characterizes the number of speeds if the box is manual. (overloading)

    //12. Take the method to accelerate to the interface, make the Car implement the interface. (interfaces)
    public void speed ();
    public void speed (int gear);

}
