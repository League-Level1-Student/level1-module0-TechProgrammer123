package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CookieThatHasAFortune implements ActionListener {



public void showButton() {
	// TODO Auto-generated method stub
	
	JFrame frame = new JFrame();
	 frame.setVisible(true);
	 JButton button = new JButton();
	    frame.add(button);
	    frame.pack();
	    button.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	JOptionPane.showMessageDialog(null, "Woohoo");
	int rand = new Random().nextInt(5);
	if (rand == 0) {
		JOptionPane.showMessageDialog(null, "A cookie will show up at your door in approximitley 45.972840020705302 seconds");
	}
	if (rand == 1) {
		JOptionPane.showMessageDialog(null, "You will have a fortune");
	 	
	}
	 if (rand == 2) {
		JOptionPane.showMessageDialog(null, "If you read this you must go step in water with socks on or else you will go 'bye bye'" );
	}
	if (rand == 3) {
		JOptionPane.showMessageDialog(null, "You will go get french fry or draw 25");
	}
	if (rand == 4) {
		JOptionPane.showMessageDialog(null, "Die or draw 25");
	}
}







}
