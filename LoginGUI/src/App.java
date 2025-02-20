//packages


//imports
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
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

        //sets the GUI window
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

        //login button with its label coded on - set in the middle bellow 50
        button = new JButton("Login");
        button.setBounds(125, 80, 80, 25);
        button.addActionListener(new App());
        panel.add(button);

        //success label 
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
        char[] password = passwordText.getPassword(); //use .getPassword() for security - its was .getText() previously (pre 02,19,2025)
        System.out.println(user + ", " + password);//displays within the command line

        //if statement to check the hardcoded credentials
        if(UserService.login(user, password)) {
            success.setText("Login successful!");
        } else {
            success.setText("Invalid credentials!");

            //userText.setText("/*Invalid username*/"); - outputs the text into the username input box
            //passwordText.setText("Invalid password"); - outputs the text into the username input box
        }

        //clear password for security - previously used:            
        //userText.setText("/*Invalid username*/");
        //passwordText.setText("Invalid password");
        
        Arrays.fill(password, '\0'); //clears password from memory
    }
}
