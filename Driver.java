public class Driver extends Man {
    //"IS-A" relationship
    private boolean drive;

    public void driver(boolean drive){
        this.drive = drive;
        if(drive = true) {
            System.out.println("Let's go!");
        }else{
            System.out.println("No driver license!");
        }
    }

}
