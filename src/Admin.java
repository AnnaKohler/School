/**
 * Created by schooler on 21.11.16.
 */
public class Admin extends Man{
    Teacher Teachers[];
    Schooler Schoolers[];
    int schoolersCnt;
    int teachersCnt;

    public void addLessonToTeacher(Teacher t, Lesson l){

    }
    @Override
    public String toString() {
        return "admin "+super.toString();
    }


}
