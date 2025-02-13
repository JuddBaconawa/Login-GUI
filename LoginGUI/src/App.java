//packages


//imports
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//main class
public class App {

    //main method
    public static void main(String[] args) throws Exception {

        JFrame frame = new JFrame();
        frame.setSize(100, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JPanel panel = new JPanel();
        frame.add(panel);

        panel.setLayout(null);

        JLabel label = new JLabel();
        label.setBounds(10, 20, 80, 25);
        panel.add(label);

        JTextField userText = new JTextField();


    }
}
