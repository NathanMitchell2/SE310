import java.util.ArrayList;

public class TakeSurvey extends LoadSurvey{
    public void driverDoTake(Survey mySurvey) {
        ArrayList<Question> contents;
        contents = mySurvey.getSurveyContents();
        for(int i = 0; i < contents.size(); i++){
            int question = i+1;
            System.out.print(question+") ");
            contents.get(i).setResponse();

        }
    }
}
