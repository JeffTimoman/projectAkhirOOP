import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton playbutton;
    JButton htpbutton;
    JButton exitbutton;
    MyFrame(){

        playbutton = new JButton("Play");
        playbutton.addActionListener(this);

        htpbutton = new JButton("How to Play");
        htpbutton.addActionListener(this);

        exitbutton = new JButton("Exit");
        exitbutton.addActionListener(this);

        playbutton.setBounds(170, 100, 150, 50);
        htpbutton.setBounds(170,200,150,50);
        exitbutton.setBounds(170,300,150,50);

        this.add(playbutton);
        this.add(htpbutton);
        this.add(exitbutton);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==playbutton){
            dispose();
            new Game();
        }
        else if (e.getSource()==htpbutton){
            dispose();
            new htp();
        }
        else if (e.getSource()==exitbutton){
            dispose();
        }
    }
}
