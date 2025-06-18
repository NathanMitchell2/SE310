public class ValidDate extends Question{

    @Override
    void setPrompt() {
        System.out.println("Enter the prompt for your Date question:");
        questionPrompt = promptGetter.nextLine();
    }

    @Override
    void setResponse() {
        SingleAnswerResponse myResponse = new SingleAnswerResponse();
        myResponse.setResponse();
        questionResponse = myResponse;
    }
}
