/**************************************************
 * The "Home" class creates the frame for         *
 *  logging into the terminal as the manager      *
 *  of the restaurant. The username and password  * 
 *  are hard-coded as "admin" and "password" by   *
 *  default, but can be changed once logged in.   *
 *  If this panel is closed, the program ends.    *
 *  If an incorrect username/password combination *
 *  combination is entered, the "IncorrectLogin"  *
 *  class is generated. If the user logs in       *
 *  correctly, the "MainMenu" class is generated. *
 **************************************************/
package restaurant.manager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame 
{
    
    //Create components
    GridBagConstraints c = new GridBagConstraints(); 
    
    private final int width = 640;
    private final int height = 320;
    public String username = "admin";        //Hardcoded default manager username
    public String password = "password";     //Hardcoded default manager password (Very secure)
    
    JPanel mainPanel = new JPanel(new GridBagLayout());
    JPanel logoPanel = new JPanel(); //The logo has its own panel

    JLabel logoLbl = new JLabel();  
    JLabel titleLbl = new JLabel("Manager Login Terminal");
    JLabel usernameLbl = new JLabel("Username: ");
    JTextField usernameFld = new JTextField(15);
    JLabel passwordLbl = new JLabel("Password: ");
    JPasswordField passwordFld = new JPasswordField(15);
    JButton loginBtn = new JButton("Login"); 
    
    ActionListener loginLsnr = new ClickListenerLogin();

    //Constructor
    public Home()
    {
        format();
        addLogo();
    }
    
    //Adds the logo to the top of the frame
    private void addLogo()
    {
        logoLbl.setIcon(new ImageIcon("content\\logo.png"));
        logoPanel.add(logoLbl);
        
        add(logoPanel, BorderLayout.NORTH);
    }

    //Formats the components on the panel, except for the logo
    private void format()
    {
        setTitle("Manager Login");
        setSize(width, height);
        setResizable(false);
                
        c.insets = new Insets(5, 0, 30, 0);
        
        c.gridx = 1; c.gridy = 0;
        mainPanel.add(titleLbl, c);
        
        c.insets = new Insets(5, 5, 5, 5);
        c.gridx = 0; c.gridy = 1;
        mainPanel.add(usernameLbl, c);
        
        c.gridx = 1; c.gridy = 1;
        mainPanel.add(usernameFld, c);
        
        c.gridx = 0; c.gridy = 2;
        mainPanel.add(passwordLbl, c);
        
        c.gridx = 1; c.gridy = 2;
        mainPanel.add(passwordFld, c);
        
        c.gridx = 1; c.gridy = 3;
        mainPanel.add(loginBtn, c);
        loginBtn.addActionListener(loginLsnr);
        
        add(mainPanel, BorderLayout.SOUTH);
    }
    
    //Listener for the Login button
    public class ClickListenerLogin implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if ((usernameFld.getText().equals(username)) && 
               (passwordFld.getText().equals(password)))
            {
                //You logged in as the manager
                MainMenu menu = new MainMenu();
                menu.setVisible(true);
            }
            else
            {
                //Your username or password was wrong
                IncorrectLogin badLogin = new IncorrectLogin();
                badLogin.setVisible(true);
            }
            usernameFld.setText("");
            passwordFld.setText("");
        }
    }
}