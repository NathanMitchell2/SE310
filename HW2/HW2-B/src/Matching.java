public class Matching extends Question{

    @Override
    void setPrompt() {
        System.out.println("Enter the prompt for your Matching question:");
        questionPrompt = promptGetter.nextLine();
    }

    @Override
    void setResponse() {
        MultiAnswerResponse myResponse = new MultiAnswerResponse();
        questionResponse = myResponse;
    }

}
