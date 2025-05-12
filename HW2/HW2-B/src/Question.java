import java.util.Scanner;
abstract class Question {
    protected String questionPrompt;
    protected Response questionResponse;
    protected Scanner promptGetter = new Scanner(System.in);

    public String getPrompt(){
        return questionPrompt;
    }

    abstract void setPrompt();

    public Response getResponse(){
        return questionResponse;
    }

    abstract void setResponse();

    public void displayQuestion(){
        System.out.println(questionPrompt);
    }

    public void modifyPrompt(){
        System.out.println("Enter a new Prompt:");
        questionPrompt = promptGetter.nextLine();
    }
}

