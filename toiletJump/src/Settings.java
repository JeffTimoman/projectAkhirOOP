public class Settings {
    private static final int WIDTH = 500;
    private static final int HEIGHT = 800;
    private static final int FLOOR = 500;

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