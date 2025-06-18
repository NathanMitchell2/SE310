import java.util.ArrayList;

public class MultiAnswerResponse extends Response{
    private ArrayList<String> response;

    public ArrayList<String> getResponse(){
        return response;
    }

    public void setResponse() {
        System.out.println("Enter the number of choices for your multiple-choice question.");
        int choices = promptGetter.nextInt();
        for (int i = 1; i <= choices; i++){
            System.out.println("Enter choice #"+i);
            String newLine = promptGetter.next();
            response.add(newLine);
        }
    }
}
