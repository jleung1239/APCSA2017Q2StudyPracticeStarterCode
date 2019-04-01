/**
 * Created by Teacher on 4/1/2019.
 */
public class MultPractice implements StudyPractice{
    private int first;
    private int initial;
    public MultPractice(int first, int initial)
    {
        this.first=first;
        this.initial=initial;
    }
    public String getProblem(){
        String problem = first + " TIMES " +initial;
        return problem;
    }
    public void nextProblem(){
        initial++;
    }
}
