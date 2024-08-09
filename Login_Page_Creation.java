package User_Login_Pages;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Exception;

class LoginPageCreation extends JFrame implements ActionListener
{
    JButton b1;
    JPanel newPanel;
    JLabel userLabel, passLabel;
    final JTextField  textField1, textField2;

    LoginPageCreation()
    {
        userLabel = new JLabel();
        userLabel.setText("Username");

        textField1 = new JTextField(15);

        passLabel = new JLabel();
        passLabel.setText("Password");
        textField2 = new JPasswordField(15);

        b1 = new JButton("SUBMIT");

        newPanel = new JPanel(new GridLayout(3, 1));
        newPanel.add(userLabel);
        newPanel.add(textField1);
        newPanel.add(passLabel);
        newPanel.add(textField2);
        newPanel.add(b1);

        add(newPanel, BorderLayout.CENTER);

        b1.addActionListener(this);
        setTitle("LOGIN FORM");
    }

    public void actionPerformed(ActionEvent ae)
    {
        String userValue = textField1.getText();
        String passValue = textField2.getText();

        if (userValue.equals("test1@gmail.com") && passValue.equals("test"))
        {
            Login_Home_Page page = new Login_Home_Page();
            page.setVisible(true);
            JLabel wel_label = new JLabel("Welcome: "+userValue);
            page.getContentPane().add(wel_label);
        }
        else
            System.out.println("Please enter valid username and password");
    }
}
class Login_Page_Creation
{
    public static void main(String arg[])
    {
        try
        {
            LoginPageCreation form = new LoginPageCreation();
            form.setSize(300,100);
            form.setVisible(true);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
