import java.awt.Color;

public class Settings {
    private static final int WIDTH = 500;
    private static final int HEIGHT = 800;
    private static final int FLOOR = 500;
    private static final int PIPE_DISTANCE = 200;
    private static final int PIPE_SPEED = 30;
    private static final String PIPE_COLOR = "#00FF00";

    public static String getPipeColor() {
        return PIPE_COLOR;
    }

    public static int getPipeDistance() {
        return PIPE_DISTANCE;
    }

    public static int getPipeSpeed() {
        return PIPE_SPEED;
    }
    
    public static int getWidth() {
        return WIDTH;
    }

    public static int getHeight() {
        return HEIGHT;
    }

    public static int getFloor() {
        return FLOOR;
    }

    public static Settings getInstance() {
        return new Settings();
    }
}