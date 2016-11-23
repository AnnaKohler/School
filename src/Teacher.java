/**
 * Created by schooler on 21.11.16.
 */
public class Teacher extends Man{
    Lesson Lessons[];

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
        s.Marks[s.markCnt]=new Mark(l, val);
        s.markCnt+=1;
    }
}
