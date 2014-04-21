package restaurant.manager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChangeUsernamePassword extends JDialog 
{
    //Create components
    GridBagConstraints c = new GridBagConstraints();
    
    private final int width = 680;
    private final int height = 450;
    
    JPanel mainPanel = new JPanel(new GridBagLayout());
    JPanel logoPanel = new JPanel();

    JLabel logoLbl = new JLabel();
    JLabel spaceLbl = new JLabel();
    JLabel space2Lbl = new JLabel();
    JLabel oldUsernameLbl = new JLabel("Old Username:");
    JLabel newUsernameLbl = new JLabel("New Username:");
    JLabel oldPasswordLbl = new JLabel("Old Password:");
    JLabel newPasswordLbl = new JLabel("New Password:");    
    JLabel cfmUsernameLbl = new JLabel("Confirm Username:");
    JLabel cfmPasswordLbl = new JLabel("Confirm Password:");

    JTextField oldUsernameFld = new JTextField(15);
    JTextField newUsernameFld = new JTextField(15);
    JTextField cfmUsernameFld = new JTextField(15);
    JPasswordField oldPasswordFld = new JPasswordField(15);
    JPasswordField newPasswordFld = new JPasswordField(15);
    JPasswordField cfmPasswordFld = new JPasswordField(15);

    JButton applyBtn = new JButton("Apply"); 
    ActionListener applyLsnr = new ClickListenerApply();
    
    public ChangeUsernamePassword ()
    {
        format();
        addLogo();
    }
    
    private void format()
    {
        setTitle("Change Username/Password");
        setSize(width, height);
        setResizable(false);
        setModal(true);
        setModalityType(ModalityType.APPLICATION_MODAL);
        
        c.insets = new Insets(5, 5, 5, 5);
        
        c.gridx = 0; c.gridy = 0;
        mainPanel.add(oldUsernameLbl, c);
        
        c.gridx = 1; c.gridy = 0;
        mainPanel.add(oldUsernameFld, c);
        
        c.gridx = 0; c.gridy = 1;
        mainPanel.add(oldPasswordLbl, c);
        
        c.gridx = 1; c.gridy = 1;
        mainPanel.add(oldPasswordFld, c);
        
        c.gridx = 0; c.gridy = 2;
        mainPanel.add(spaceLbl, c);
        
        c.gridx = 0; c.gridy = 3;
        mainPanel.add(space2Lbl, c);
        
        c.gridx = 0; c.gridy = 4;
        mainPanel.add(newUsernameLbl, c);
        
        c.gridx = 1; c.gridy = 4;
        mainPanel.add(newUsernameFld, c);
        
        c.gridx = 0; c.gridy = 5;
        mainPanel.add(newPasswordLbl, c);
        
        c.gridx = 1; c.gridy = 5;
        mainPanel.add(newPasswordFld, c);
        
        c.gridx = 0; c.gridy = 6;
        mainPanel.add(cfmUsernameLbl, c);
        
        c.gridx = 1; c.gridy = 6;
        mainPanel.add(cfmUsernameFld, c);
        
        c.gridx = 0; c.gridy = 7;
        mainPanel.add(cfmPasswordLbl, c);
        
        c.gridx = 1; c.gridy = 7;
        mainPanel.add(cfmPasswordFld, c);
        
        c.gridx = 1; c.gridy = 8;
        mainPanel.add(applyBtn, c);
        
        add(mainPanel, BorderLayout.CENTER);
    }
    
    private void addLogo()
    {
        logoLbl.setIcon(new ImageIcon("content\\logo.png"));
        logoPanel.add(logoLbl);
        
        add(logoPanel, BorderLayout.NORTH);
    }
    
    public class ClickListenerApply implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            //if (oldUsernameFld.getText().equals(home.username));
        }
    }
}