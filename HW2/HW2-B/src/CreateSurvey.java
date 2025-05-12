import java.util.Scanner;

public class CreateSurvey {
    private Survey mySurvey = new Survey();
    public Survey driverDoCreate(){
        Scanner lineReader = new Scanner(System.in);
        boolean loop = true;
        Question myQuestion;
        while(loop){
            displayOptions();
            int menuOption = lineReader.nextInt();
            switch (menuOption){
                case 1:
                    myQuestion = new TrueFalse();
                    myQuestion.setPrompt();
                    mySurvey.addQuestion(myQuestion);
                    break;
                case 2:
                    myQuestion = new MultipleChoice();
                    myQuestion.setPrompt();
                    mySurvey.addQuestion(myQuestion);
                    break;
                case 3:
                    myQuestion = new ShortAnswer();
                    myQuestion.setPrompt();
                    mySurvey.addQuestion(myQuestion);
                    break;
                case 4:
                    myQuestion = new Essay();
                    myQuestion.setPrompt();
                    mySurvey.addQuestion(myQuestion);
                    break;
                case 5:
                    myQuestion = new ValidDate();
                    myQuestion.setPrompt();
                    mySurvey.addQuestion(myQuestion);
                    break;
                case 6:
                    myQuestion = new Matching();
                    myQuestion.setPrompt();
                    mySurvey.addQuestion(myQuestion);
                    break;
                case 7:
                    loop = false;
                    break;
                default:
                    System.out.println("Invalid option, select valid menu option");
            }
        }
        return mySurvey;
    }

    private void displayOptions(){
        System.out.println("1. Add a new T/F question");
        System.out.println("2. Add a new multiple-choice question");
        System.out.println("3. Add a new short answer question");
        System.out.println("4. Add a new essay question");
        System.out.println("5. Add a new date question");
        System.out.println("6. Add a new matching question");
        System.out.println("7. Return to previous menu");
    }
}
