import java.io.*;
import java.util.Scanner;

public class StoreSurvey implements Serializable {
    public void driverDoStore(Survey mySurvey) throws IOException {
        Scanner promptGetter = new Scanner(System.in);
        System.out.println("Enter name desired name of file:");
        String fileName = promptGetter.nextLine();
        fileName = fileName.concat(".txt");
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(mySurvey);
        objectOutputStream.flush();
        objectOutputStream.close();

    }
}
