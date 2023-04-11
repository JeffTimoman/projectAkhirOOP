public class Pipe extends GameObject{

    private boolean isPassed = false;

    public Pipe(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    public void move(){
        this.x -= Settings.getPipeSpeed();
    }

    public boolean outOfBond(){
        return this.x + this.width < 0;
    }

    public boolean isPassed() {
        return isPassed;
    }
}
