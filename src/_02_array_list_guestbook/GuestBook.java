package _02_array_list_guestbook;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	int guestNum = 1;
	ArrayList<String> strings = new ArrayList<String>();
	
	public void run() {
		b1.setText("Add Name");
		b2.setText("View Names");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		p.add(b1);
		p.add(b2);
		f.add(p);
		f.setVisible(true);
		f.setPreferredSize(new Dimension(100, 100));
		f.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			String newName = JOptionPane.showInputDialog("Enter a name: ");
			strings.add("Guest #" + guestNum + ": " + newName);
			guestNum += 1;
		} else {
			if (strings.size() >= 0) {
				for (String guest : strings) {
					JOptionPane.showMessageDialog(null, guest);
				}
			} else {
				JOptionPane.showMessageDialog(null, "There are no guests in the guest book.");
			}

		}
		
	}
}
