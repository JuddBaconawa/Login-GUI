//packages


//imports
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

//main class
public class App implements ActionListener {

    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText; //JPasswordField to ensure password is private
    private static JButton button;
    private static JLabel success;

    //main method
    public static void main(String[] args) throws Exception {

        //sets the windows
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(350, 200); //frame size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.add(panel);

        panel.setLayout(null);

        //username label
        userLabel = new JLabel("Username");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        //username input box
        userText = new JTextField();
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        //password label
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        //password input box
        passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        button = new JButton("Login");
        button.setBounds(125, 80, 80, 25);
        button.addActionListener(new App());
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);
        success.setText("");


        frame.setVisible(true);


    }

    //acction event for when the "Login" button is clicked
    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();
        System.out.println(user + ", " + password);

        //if statement to check the hardcoded credentials
        if(user.equals("admin") && password.equals("password01")) {
            success.setText("Login successful!");
        } else {
            success.setText("Invalid credentials!");
            //System.out.println("Invalid Credentials!");
            userText.setText("/*Invalid username*/");
            passwordText.setText("Invalid password");
        }
    }
}
