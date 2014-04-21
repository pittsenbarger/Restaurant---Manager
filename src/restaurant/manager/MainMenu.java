/*****************************************************
 * The "MainMenu" class generates a frame that gives *
 *  the user all of their necessary options as       *
 *  manager. If this frame is closed, the manager is *
 *  logged out and taken back to the "Home" frame.   *
 *****************************************************/
package restaurant.manager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainMenu extends JDialog
{
    //Create components
    private final int width = 680;
    private final int height = 400;
 
    JPanel logoPanel = new JPanel();
    JPanel mainPanel = new JPanel();

    JLabel logoLbl = new JLabel();
    JButton hostStaff = new JButton("Add/Remove Host Staff");
    JButton waitStaff = new JButton("Add/Remove Wait Staff");
    JButton changeUsername = new JButton("Change Username/Password");
    JButton query = new JButton("Query the Database");
    
    ActionListener hostStaffLsnr = new ClickListenerHostStaff();
    ActionListener waitStaffLsnr = new ClickListenerWaitStaff();
    ActionListener usrPwLsnr = new ClickListenerChngUsrPw();

    public MainMenu ()
    {
        format();
        addLogo();
    }
    
    void format()
    {
        setTitle("Manager - Main Menu");
        setSize(width, height);
        setResizable(false);
        setModal(true);
        setModalityType(ModalityType.APPLICATION_MODAL);
        
        hostStaff.setFont(new Font("Arial", Font.BOLD, 22));        
        waitStaff.setFont(new Font("Arial", Font.BOLD, 22));
        changeUsername.setFont(new Font("Arial", Font.BOLD, 22));
        query.setFont(new Font("Arial", Font.BOLD, 22));
        
        mainPanel.setLayout(new GridLayout(2,2));
        mainPanel.setSize(500, 200);
        mainPanel.add(hostStaff);        
        mainPanel.add(waitStaff);
        mainPanel.add(changeUsername);
        mainPanel.add(query);
        
        hostStaff.addActionListener(hostStaffLsnr);
        waitStaff.addActionListener(waitStaffLsnr);
        changeUsername.addActionListener(usrPwLsnr);
        
        add(mainPanel, BorderLayout.CENTER);
    }
    
    //Adds the logo to the top of the frame
    private void addLogo()
    {
        logoLbl.setIcon(new ImageIcon("content\\logo.png"));
        logoPanel.add(logoLbl);
        
        add(logoPanel, BorderLayout.NORTH);
    }

    public class ClickListenerHostStaff implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            ChangeHostStaff chngHostStaff = new ChangeHostStaff();
            chngHostStaff.setVisible(true);
        }
    }
    
    public class ClickListenerWaitStaff implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            ChangeWaitStaff chngWaitStaff = new ChangeWaitStaff();
            chngWaitStaff.setVisible(true);
        }
    }
    
    public class ClickListenerChngUsrPw implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            ChangeUsernamePassword chngUsrPw = new ChangeUsernamePassword();
            chngUsrPw.setVisible(true);
        }
    }
}
