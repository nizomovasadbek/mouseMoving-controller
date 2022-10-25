import java.awt.*;

public class Main {
    public static void main(String[] args) {
        try {
            Robot mouseController = new Robot();
            mouseController.mouseMove(100, 100);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}
