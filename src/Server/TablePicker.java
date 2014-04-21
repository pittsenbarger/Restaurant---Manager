package Server;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TablePicker extends JFrame {
    //Create components
    GridBagConstraints c = new GridBagConstraints(); 
    
    private final int width = 650;
    private final int height = 320;
   
    
    JPanel panel = new JPanel(new GridBagLayout());
    JPanel logoPanel = new JPanel(new GridBagLayout()); //The logo has its own panel

    JLabel logoLbl = new JLabel();  
    JLabel titleLbl = new JLabel("Table Selector");
    JLabel usernameLbl = new JLabel("Table Number ");
    JTextField usernameFld = new JTextField(15);
    JLabel passwordLbl = new JLabel("");
    //JTextField passwordFld = new JTextField(15);
    JButton loginBtn = new JButton("Login"); 
    
    ActionListener loginLsnr = new ClickListenerLogin();

    //Constructor
    public TablePicker()
    {
        format();
        addLogo();
    }
    
    //Adds the logo to the top of the frame
    private void addLogo()
    {
        c.gridx = 1; c.gridy = 0;
        
        logoLbl.setIcon(new ImageIcon("content\\logo.png"));
        logoPanel.add(logoLbl, c);
        
        add(logoPanel, BorderLayout.NORTH);
    }

    //Formats the components on the panel, except for the logo
    private void format()
    {
        setTitle("Select Table");
        setSize(width, height);
        setResizable(false);
        
        c.insets = new Insets(5, 0, 30, 0);
        
        c.gridx = 1; c.gridy = 0;
        panel.add(titleLbl, c);
        
        c.insets = new Insets(5, 5, 5, 5);
        c.gridx = 0; c.gridy = 1;
        panel.add(usernameLbl, c);
        
        c.gridx = 1; c.gridy = 1;
        panel.add(usernameFld, c);
        
        c.gridx = 0; c.gridy = 2;
        panel.add(passwordLbl, c);
        
       /* c.gridx = 1; c.gridy = 2;
        panel.add(passwordFld, c); */
        
        c.gridx = 1; c.gridy = 3;
        panel.add(loginBtn, c);
        loginBtn.addActionListener(loginLsnr);
        
        add(panel, BorderLayout.SOUTH);
    }
    
    //Listener for the Login button
    public class ClickListenerLogin implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        
                passwordLbl.setText("Bill Printed");
        
        }
    }
}
