import java.util.Date;

/**
 * Created by schooler on 21.11.16.
 */
public class Admin extends Man{
    Teacher Teachers[];
    Schooler Schoolers[];
    int schoolersCnt;
    int teachersCnt;
    static final int MAX_SCHOOLER_CNT=10;
    static final int MAX_TEACHER_CNT=10;

    Admin(){
        Teacher Teachers[];
        Schooler Schoolers[];
        int schoolersCnt=0;
        int teachersCnt=0;
    }

    public void addLessonToTeacher(Teacher t, Lesson l){

    }
    @Override
    public String toString() {
        return "admin "+super.toString();
    }
    public void addTeacher(Teacher t){
        if(teachersCnt<MAX_TEACHER_CNT-1){
            Teachers[teachersCnt]=t;
            teachersCnt++;
        }
    }
    public void addSchooler(Schooler s){
        if(schoolersCnt<MAX_SCHOOLER_CNT-1){
            Schoolers[schoolersCnt]=s;
            schoolersCnt++;
        }
    }
    public void addLessonToAllTeachers(String lName, Date d){
        for(Teacher t:Teachers){
            addLessonToTeacher(t, new Lesson(lName, d) );
        }
    }


}
