import java.util.ArrayList;
import java.util.Scanner;

public class ModifySurvey extends CreateSurvey{
    public void driverDoModify(Survey mySurvey) {
        Scanner myScanner = new Scanner(System.in);
        ArrayList<Question> contents = new ArrayList<>();
        contents = mySurvey.getSurveyContents();
        while(true){
            System.out.println("What question do you want to modify?");
            String response = myScanner.nextLine();
            response = response.toLowerCase();
            if (response.equals("none")){
                break;
            }
            response = response.replace("\n", "");
            int question = Integer.parseInt(response) - 1;
            System.out.println(contents.get(question).getPrompt());
            System.out.println("Do you want to modify the prompt?");
            String choice = myScanner.nextLine();
            choice = choice.toLowerCase();
            if(choice.equals("yes")){
                contents.get(question).modifyPrompt();
            }

        }

    }
}
