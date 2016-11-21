/**
 * Created by schooler on 21.11.16.
 */
public class Teacher extends Man{
    Lesson Lessons[];
    public int lcnt=0;
    @Override
    public String toString(){
        return "teacher "+super.toString();
    }
    public void addMark(Schooler s, Lesson l, int val){
        if(s.mcnt==5){
            System.out.println("Уже есть 5 оценок");
            return;
        }
        s.Marks[s.mcnt]=new Mark(l, val);
        s.mcnt+=1;
    }
}
