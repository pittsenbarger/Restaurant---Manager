package restaurant.manager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChangeWaitStaff extends JDialog 
{
    //Create components
    GridBagConstraints c = new GridBagConstraints();
    
    private final int width = 680;
    private final int height = 300;
    
    JPanel logoPanel = new JPanel();
    JPanel mainPanel = new JPanel(new GridBagLayout());

    JLabel logoLbl = new JLabel();
    JLabel waiterLbl = new JLabel("Input the Wait Staff's Username:");
    JTextField waiterFld = new JTextField(15);
    
    JButton addBtn = new JButton("Add Wait Staff"); 
    JButton removeBtn = new JButton("Remove Wait Staff");
    
    public ChangeWaitStaff ()
    {
        format();
        addLogo();
    }
    
    private void format()
    {
        setTitle("Add/Remove Wait Staff");
        setSize(width, height);
        setResizable(false);
        setModal(true);
        setModalityType(ModalityType.APPLICATION_MODAL);
        
        c.insets = new Insets(5, 5, 5, 5);
        c.gridx = 0; c.gridy = 0;
        mainPanel.add(waiterLbl, c);
        
        c.gridx = 1; c.gridy = 0;
        mainPanel.add(waiterFld, c);
        
        c.gridx = 0; c.gridy = 1;
        mainPanel.add(addBtn, c);

        c.gridx = 1; c.gridy = 1;
        mainPanel.add(removeBtn, c);
        
        add(mainPanel, BorderLayout.CENTER);
    }
    
    private void addLogo()
    {
        logoLbl.setIcon(new ImageIcon("content\\logo.png"));
        logoPanel.add(logoLbl);
        
        add(logoPanel, BorderLayout.NORTH);
    }
}
