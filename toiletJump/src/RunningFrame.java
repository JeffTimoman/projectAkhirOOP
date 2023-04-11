import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RunningFrame extends JFrame {

    private ArrayList<Pipe> pipes = new ArrayList<Pipe>();
    private int counter = 10;

    public RunningFrame() {
        createPipe();
        Timer timer = new Timer(1000/30, new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                movePipes();
                removePipes();

                if (counter == 0) {
                    createPipe();
                    counter = 10;
                }
                counter--;
            }
        });
        timer.start();
        System.out.println(pipes.get(0).getX());
        System.out.println(pipes.get(0).getY());
        
        this.setLayout(null);
        this.setSize(Settings.getWidth(), Settings.getHeight());
        this.setTitle("Running Frame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }

    public void createPipe(){
        int width = 50;
        int height = (int) (Math.random() * 200 + 150);
        int distance = Settings.getPipeDistance();
        int y = 0;
        int x = 400;
        Pipe top = new Pipe(x, y, width, height);
        Pipe bottom = new Pipe(x, y + height + distance, width, Settings.getHeight() - y - height - distance);
        pipes.add(top);
        pipes.add(bottom);
    }

    public void movePipes(){
        for (Pipe pipe : pipes) {
            pipe.move();
        }
    }

    public void removePipes(){
        for (int i = 0; i < pipes.size(); i++) {
            if (pipes.get(i).outOfBond()) {
                pipes.remove(i);
            }
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.decode(Settings.getPipeColor()));
        for (Pipe pipe : pipes) {
            g2d.fillRect(pipe.getX(), pipe.getY(), pipe.getWidth(), pipe.getHeight());
        }
        repaint();
    }
    
    public static void main(String[] args) {
        new RunningFrame();
    }
}

/*
 * 
 * super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.decode(Settings.getPipeColor()));
        for (Pipe pipe : pipes) {
            g2d.fillRect(pipe.getX(), pipe.getY(), pipe.getWidth(), pipe.getHeight());
        }
 */
    