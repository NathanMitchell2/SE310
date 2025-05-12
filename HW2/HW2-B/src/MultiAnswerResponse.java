import java.util.ArrayList;

public class MultiAnswerResponse extends Response{
    private ArrayList<String> response;

    public ArrayList<String> getResponse(){
        return response;
    }

    public void setResponse(ArrayList<String> response) {
        this.response = response;
    }
}
