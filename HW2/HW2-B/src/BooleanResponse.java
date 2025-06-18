public class BooleanResponse extends Response{
    private boolean response;

    public boolean getResponse(){
        return response;
    }

    public void setResponse() {
        this.response = promptGetter.nextBoolean();
    }
}
