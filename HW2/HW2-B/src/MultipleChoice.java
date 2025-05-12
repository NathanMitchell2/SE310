import java.util.ArrayList;

public class MultipleChoice extends Question{
    private ArrayList<String> questionChoices = new ArrayList<>();
    @Override
    void setPrompt() {
        System.out.println("Enter the prompt for your Multiple Choice question:");
        String myPrompt = promptGetter.nextLine();
        System.out.println("Enter the number of choices for your multiple-choice question.");
        int choices = promptGetter.nextInt();
        for (int i = 1; i <= choices; i++){
            System.out.println("Enter choice #"+i);
            String newLine = promptGetter.next();
            questionChoices.add(newLine);
        }
        questionPrompt = myPrompt;
    }

    @Override
    void setResponse() {
        MultiAnswerResponse myResponse = new MultiAnswerResponse();
        questionResponse = myResponse;
    }

    public ArrayList<String> getQuestionChoices() {
        return questionChoices;
    }
    private void displayChoices(){
        int i = 1;
        for(String choice: questionChoices){
            System.out.print(" "+i+") "+choice);
            i++;
        }
        System.out.println();
    }
    @Override
    public void displayQuestion(){
        System.out.println(questionPrompt);
        displayChoices();
    }

    @Override
    public void modifyPrompt(){
        System.out.println("Enter a new Prompt:");
        questionPrompt = promptGetter.next();
        System.out.println("Do you wish to modify the choices?");
        String choice = promptGetter.next();
        choice = choice.toLowerCase();
        if(choice.equals("yes")){
            System.out.println("Which one?");
            displayChoices();
            int option = promptGetter.nextInt()-1;
            System.out.println("Enter new choice");
            choice = promptGetter.next();
            questionChoices.set(option, choice);

        }
    }
}
