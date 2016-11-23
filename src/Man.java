import java.util.Scanner;

/**
 * Created by schooler on 21.11.16.
 */
public class Man {
    public static Scanner sc=new Scanner(System.in);

    private int age;
    private String name;
    private String second_name;
    Man(String name, String secName, int age){
        this.name=name;
        this.second_name=secName;
        this.age=age;
    }


    public String toString() {
        return this.name+" "+this.second_name+":"+age;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(){
        this.age=sc.nextInt();
    }
    public void getName(){
        this.name=sc.next();
    }
    public void setName(){
        this.name=sc.nextLine();
    }
    public String getFullName(){
        return this.name+" "+this.second_name;
    }
    public void setFullName(){
        this.name=sc.next();
        this.second_name=sc.next();
    }

}
