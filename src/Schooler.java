/**
 * Created by schooler on 21.11.16.
 */
public class Schooler extends Man {
    static  final int MCNT=5;
    Mark Marks[];
    public int mcnt=0;
    @Override
    public String toString(){
        return "schooler "+super.toString();

    }
    Schooler(){
        super();
        this.Marks= new Mark[MCNT];
    }


}

