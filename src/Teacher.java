/**
 * Created by schooler on 21.11.16.
 */
public class Teacher extends Man{
    Lesson Lessons[];
    static final int MAX_LESSON_CNT=10;
    public int lessonCnt=0;
    @Override
    public String toString(){
        return "teacher "+super.toString();
    }
    public void addMarkToStudent(Schooler s, Lesson l, int val){
        if(s.markCnt==s.MARK_CNT){
            System.out.println("Уже есть"+s.MARK_CNT+" оценок");
            return;
        }
        s.Marks[s.markCnt]=new Mark(l.name, val);
        s.markCnt+=1;
    }
    public void addLesson(Lesson l){
        if(lessonCnt<MAX_LESSON_CNT-1) {
            Lessons[lessonCnt] = l;
            lessonCnt++;
        }
    }
}
