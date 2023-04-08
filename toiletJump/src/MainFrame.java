import javax.swing.*;
import java.awt.*;
public class MainFrame extends JFrame{

    private JPanel mainPanel = new JPanel();
    public MainFrame(){
        this.setSize(Settings.getWidth(), Settings.getHeight());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Set the frame to be not resizable and in the center of the screen
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        
        JButton playButton = new JButton("Play");
        JButton howButton = new JButton("How to Play");
        JButton colButton = new JButton("Collection");
        JButton quiButton = new JButton("Quit");
        
        mainPanel.setLayout(new GridLayout(8, 1));
        
        //add buttons to mainPanel center
        mainPanel.add(new JLabel());
        mainPanel.add(playButton);
        mainPanel.add(howButton);
        mainPanel.add(colButton);
        mainPanel.add(quiButton);
        
        // mainPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        // mainPanel.setAlignmentY(Component.CENTER_ALIGNMENT);
        // this.add(new JLabel(new ImageIcon("img/logo2.jpeg")), BorderLayout.NORTH);

        ImageIcon icon = new ImageIcon("img/logo3.png");
        Image image = icon.getImage();

        // Get the original width and height of the image
        int width = image.getWidth(null);
        int height = image.getHeight(null);

        // Calculate the new width and height based on a scale factor of 0.8
        int newWidth = (int) (width * 0.7);
        int newHeight = (int) (height * 0.7);

        // Create a new scaled instance of the image with the new dimensions
        Image scaledImage = image.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

        // Create a new ImageIcon with the scaled image
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        // Add the scaled image to a JLabel and add the label to the frame
        JLabel imageLabel = new JLabel(scaledIcon);
        this.add(imageLabel, BorderLayout.NORTH);

        this.add(new JLabel("                         "), BorderLayout.EAST);
        this.add(new JLabel("                         "), BorderLayout.WEST);
        this.add(mainPanel, BorderLayout.CENTER);
        this.setTitle("Toilet Jump");
        this.setVisible(true);
    }

    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
    }
}
