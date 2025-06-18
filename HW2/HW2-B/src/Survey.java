import java.io.Serializable;
import java.util.ArrayList;

public class Survey implements Serializable {
    private ArrayList<Question> surveyContents = new ArrayList<>();

    public void addQuestion(Question myQuestion){
        surveyContents.add(myQuestion);
    }

    public ArrayList<Question> getSurveyContents() {
        return surveyContents;
    }
}
