import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //10 a) In the main method, create 4 objects in which Car is the parent class.
        //10 b) Assign 2 objects of the class to the variable of the parent class, the other two to the class of the object itself.
        //10 c) Give each of the objects the required characteristics.
        BMW dianasbmw = new BMW(2);
        BMW mybmw = new BMW(2);
        BMW jeneasbmw = new BMW(5);
        Mercedes_Benz igormerc = new Mercedes_Benz(3);
        dianasbmw.speed();
        mybmw.speed(5);
        jeneasbmw.soundofmotor();
        igormerc.soundofmotor();

        Man margo = new Man("Margo", 24);
        System.out.println(margo.toString());
        Man margo2 = new Man("Margo", 24);
        Man diana = new Man("Diana", 22);
        Man igor = new Man("Igor", 30);
        Driver jenea = new Driver();
        jenea.name = "Jenea";
        jenea.driver(true);

        Woman blondymary = new Woman();
        blondymary.name = "Mary";
        blondymary.falsestart(5);
        Man mary = blondymary;

        //10 g) Create two people with the same characteristics. Compare if they are equal with == and with equals.
        System.out.println(margo.equals(margo2));
        if (margo == margo2){
            System.out.println("Equals!");
        } else {
            System.out.println("margo and magro2 are not equals!");
        }
        //10 g) Compare if two different machines are equal using == and using equals.
        System.out.println(mybmw.equals(dianasbmw));
        if(mybmw == dianasbmw) {
            System.out.println("These are very similar cars!");
        } else {
            System.out.println("These cars are not similar!");
        }
        //10. d) Try to put in one of the Cars, more people than its capacity. If an Exception is thrown, handle it (try / catch).
        mybmw.addpassengers(margo);
        mybmw.addpassengers(diana);
        mybmw.addpassengers(igor);
        mybmw.addpassengers(blondymary);
        mybmw.addpassengers(jenea);

        mybmw.showpassengers();

    }
}
