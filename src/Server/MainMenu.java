/*****************************************************
 * The "MainMenu" class generates a frame that gives *
 *  the user all of their necessary options as       *
 *  manager.
 */

package Server;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainMenu extends JFrame 
{
    //Create components
    GridBagConstraints c = new GridBagConstraints();
    
    private final int width = 700;
    private final int height = 500;
    
    JPanel panel = new JPanel(new GridBagLayout());

    JLabel messageLbl = new JLabel("This is the manager's main menu");
    JLabel info = new JLabel("");
    JButton TakeOrder = new JButton("Input Order");
    JButton ManagerOverride = new JButton("Manager Override");
    JButton PrintBill = new JButton("Print a Bill");
    ActionListener manageroverridebutton = new ClickListenerMO();
    ActionListener billprinter = new ClickListenerPB();
    
    public MainMenu ()
    {
        format();
    }
    
    void format()
    {
        setTitle("Manager - Main Menu");
        setSize(width, height);
        setResizable(false);
        
        c.insets = new Insets(5, 5, 5, 5);
        c.gridx = 0; c.gridy = 0;
        panel.add(TakeOrder, c);
        panel.add(ManagerOverride);
        panel.add(PrintBill);
        PrintBill.addActionListener(billprinter);
        ManagerOverride.addActionListener(manageroverridebutton);
        
        add(panel, BorderLayout.CENTER);
    }
    public class ClickListenerMO implements ActionListener{
    	public void actionPerformed(ActionEvent event)
    	{
    		restaurant.manager.Home login = new restaurant.manager.Home();
    		login.setVisible(true);
    	}
    }
    public class ClickListenerPB implements ActionListener{
    	public void actionPerformed(ActionEvent event)
    	{
    		TablePicker tablepicker = new TablePicker();
    		tablepicker.setVisible(true);
    	}
    }
}
