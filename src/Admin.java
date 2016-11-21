/**
 * Created by schooler on 21.11.16.
 */
public class Admin extends Man{

    @Override
    public String toString() {
        return "admin "+super.toString();
    }
    public void addLesson(Teacher t, Lesson l){
        t.Lessons[t.lcnt]=l;
    }
}
