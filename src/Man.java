/**
 * Created by schooler on 21.11.16.
 */
public class Man {
    private int age;
    private String name;
    private String second_name;

    public String toString() {
        return this.name+" "+this.second_name+":"+age;
    }
    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
    Man(String name, String second_name, int age){
        this.name=name;
        this.second_name=second_name;
        this.age=age;
    }
    Man(){
        this.name="";
        this.second_name="";
        this.age=0;
    }
}
