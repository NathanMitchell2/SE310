public class ShortAnswer extends Essay{
    @Override
    public void setPrompt(){
        System.out.println("Enter the prompt for your Short Answer question:");
        questionPrompt = promptGetter.nextLine();
    }
}
