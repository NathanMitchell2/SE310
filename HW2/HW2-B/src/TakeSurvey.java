import java.util.ArrayList;

public class TakeSurvey extends DisplaySurvey{
    public void driverDoTake(Survey mySurvey) {
        ArrayList<Question> contents;
        contents = mySurvey.getSurveyContents();
        for(int i = 0; i < contents.size(); i++){
            displayQuestion(contents, i);
            contents.get(i).setResponse();

        }
    }
}
