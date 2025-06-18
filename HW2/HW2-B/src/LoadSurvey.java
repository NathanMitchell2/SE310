import java.io.*;

public class LoadSurvey {
    public Survey driverDoLoad() throws IOException, ClassNotFoundException {
        
        FileInputStream fileInputStream = new FileInputStream("yourfile.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Survey mySurvey = (Survey) objectInputStream.readObject();
        objectInputStream.close();
        return mySurvey;
    }
}
