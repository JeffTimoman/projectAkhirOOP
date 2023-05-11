import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class htp extends JFrame implements ActionListener {
    JButton backbutton;
    JLabel story;
    ImageIcon imageStory;

    htp(){
        backbutton = new JButton("Back");
        backbutton.addActionListener(this);
        backbutton.setBounds(0,438,439,25);

        imageStory = new ImageIcon(getClass().getResource("Story.png"));


        story = new JLabel(imageStory);
        story.setSize(439,512);

        this.add(story);
        this.add(backbutton);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setTitle("Toilet Jump");
        this.setSize(439,500);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==backbutton){
            dispose();
            new MyFrame();
        }
    }
}
