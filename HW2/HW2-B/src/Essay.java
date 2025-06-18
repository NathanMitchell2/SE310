public class Essay extends Question{

    @Override
    void setPrompt() {
        System.out.println("Enter the prompt for your Essay question:");
        questionPrompt = promptGetter.nextLine();
    }

    @Override
    void setResponse() {
        MultiAnswerResponse myResponse = new MultiAnswerResponse();
        myResponse.setResponse();
        questionResponse = myResponse;
    }

}
