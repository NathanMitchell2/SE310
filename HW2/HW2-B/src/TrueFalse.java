public class TrueFalse extends Question{
    @Override
    void setPrompt() {
        System.out.println("Enter the prompt for your True/False question:");
        questionPrompt = promptGetter.nextLine();
    }

    @Override
    void setResponse() {
        BooleanResponse myResponse = new BooleanResponse();
        questionResponse = myResponse;
    }
}
