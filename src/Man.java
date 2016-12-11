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
    Man(){
        this.name="";
        this.second_name="";
        this.age=0;
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
    public static float getAverageAge(Man Men[]){
        int sum=0;
        int cnt=0;
        for (Man m: Men
             ) {
            sum+=m.getAge();
            cnt++;
        }
        return (float)sum/cnt;
    }
    public static void displayUsers(Man Men[]){
        for (Man m: Men
                ) {
            System.out.println(m.toString());
        }
    }

}
