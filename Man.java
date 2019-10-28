import java.util.ArrayList;

public class Man {
    //1. Create classes Man
    //Characterize a Man by name and age, and also a Man should walk and eat.
    protected String name;
    protected int age;

    //8. Access to class fields should be provided only through getters and setters.
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Man(){
    }

    public Man (int age){
        this.age = age;
    }

    public Man (String  name){
        this.name = name;
    }

    public Man (String  name, int age){
        this.age = age;
        this.name = name;
    }

    public void walk(int step){
             if(step == 0){
                 System.out.println("Stop");
             }else{
                 for(int i = 0; i<step; i++){
                     System.out.println("Step");
              }
         }
    }

    public void eat(String food){
        System.out.println("Eat " + food);
    }

    //2. Implement toString, equals and hashcode. In toString, use the StringBulder for the Car class, and the StringBuffer for the Man class.

    @Override
    public String toString(){
        return name + ", " + age;
    }

    @Override
    public boolean equals(Object obj){
        Man otherMan = (Man) obj;
        return this.getName() == otherMan.getName() && this.age == otherMan.age;
    }

}
