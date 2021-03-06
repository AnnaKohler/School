/**
 * Created by schooler on 21.11.16.
 */
public class Schooler extends Man {
    static  final int MARK_CNT=10;
    Mark Marks[];
    public int markCnt=0;

    @Override
    public String toString(){
        return "schooler "+super.toString();

    }
    Schooler(){
        super();
        this.Marks= new Mark[MARK_CNT];
    }
    public void addMark(String lessonName, int val){
        if(this.markCnt==MARK_CNT){
            System.out.println("Уже есть"+MARK_CNT+" оценок");
            return;
        }
        this.Marks[this.markCnt]=new Mark(lessonName, val);
        this.markCnt+=1;
    }
    public float getAverageMark(){
        int cnt=0;
        int sum=0;
        for(Mark m:Marks){
            cnt+=1;
            sum+=m.value;
        }
        return (float)sum/cnt;
    }
    public float getAverageMarkByLesson(String lName){
        int cnt=0;
        int sum=0;
        for(Mark m:Marks){
            if(m.lessonName==lName){
                cnt+=1;
                sum+=m.value;
            }
        }
        return (float)sum/cnt;
    }


}

