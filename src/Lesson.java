import java.util.Date;

/**
 * Created by schooler on 21.11.16.
 */
public class Lesson {
    String name;
    Date date;
    Lesson(String n, Date d){
        this.name=n;
        this.date=d;
    }
    Lesson(String n){
        this.name=n;
        this.date=new Date();
    }
}
