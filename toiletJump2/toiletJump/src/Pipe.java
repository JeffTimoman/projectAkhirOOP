
public class Pipe extends GameObject{

    public boolean isPassed = false;
    public Pipe(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    public void moveLeft(){
        x -= Settings.pipeSpeed;
    }
}
