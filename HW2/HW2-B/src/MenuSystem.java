import java.util.Scanner;
public class MenuSystem {
    public static void main(String[] args) {
        Scanner lineReader = new Scanner(System.in);
        boolean loop = true;
        Survey loadedSurvey = null;
        System.out.println("Welcome to the survey maker");
        System.out.println("select an option bellow to begin");
        while(loop){
            displayMenu();
            int menuOption = lineReader.nextInt();
            switch (menuOption){
                case 1:
                    loadedSurvey = doCreate();
                    break;
                case 2:
                    if (loadedSurvey == null){
                        System.out.println("You must have a survey loaded in order to display it.");
                    }
                    else{
                        doDisplay(loadedSurvey);
                    }
                    break;
                case 3:
                    loadedSurvey = doLoad();
                    break;
                case 4:
                    if (loadedSurvey == null){
                        System.out.println("You must have a survey loaded in order to save it.");
                    }
                    else{
                        doStore(loadedSurvey);
                    }
                    break;
                case 5:
                    if (loadedSurvey == null){
                        System.out.println("You must have a survey loaded in order to take it.");
                    }
                    else{
                        doTake(loadedSurvey);
                    }
                    break;
                case 6:
                    if (loadedSurvey == null){
                        System.out.println("You must have a survey loaded in order to modify it.");
                    }
                    else {
                        doModify(loadedSurvey);
                    }
                    break;
                case 7:
                    loop = false;
                    break;
                default:
                    System.out.println("Invalid option, select valid menu option");
            }
        }
    }

    public static void displayMenu(){
        System.out.println("1. Create a new Survey");
        System.out.println("2. Display an existing Survey");
        System.out.println("3. Load an existing Survey");
        System.out.println("4. Save the current Survey");
        System.out.println("5. Take the current Survey");
        System.out.println("6. Modifying the current Survey");
        System.out.println("7. Quit");
    }

    public static Survey doCreate(){
        CreateSurvey createSurvey = new CreateSurvey();
        return createSurvey.driverDoCreate();
    }

    public static void doModify(Survey mySurvey){
        ModifySurvey modifySurvey = new ModifySurvey();
        modifySurvey.driverDoModify(mySurvey);
    }

    public static void doStore(Survey mySurvey){

    }

    public static Survey doLoad(){
        return new Survey();
    }

    public static void doTake(Survey mySurvey){
        TakeSurvey takeSurvey = new TakeSurvey();
        takeSurvey.driverDoTake(mySurvey);
    }

    public static void doDisplay(Survey mySurvey){
        DisplaySurvey displaySurvey = new DisplaySurvey();
        displaySurvey.driverDoDisplay(mySurvey);
    }
}