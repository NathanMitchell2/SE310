public class SingleAnswerResponse extends Response{
    private String response;

    public String getResponse(){
        return response;
    }

    public void setResponse() {
        this.response = promptGetter.nextLine();
    }
}
