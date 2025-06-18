import java.io.Serializable;
import java.util.Scanner;

abstract class Response implements Serializable {
    protected Scanner promptGetter = new Scanner(System.in);
}
