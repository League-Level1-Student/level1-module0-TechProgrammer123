package _09_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectMachine implements ActionListener {
 void setup () {
	 JFrame frame = new JFrame();
	 frame.setVisible(true);
	 JPanel panel = new JPanel();
	 JButton button1 = new JButton();
	 JButton button2 = new JButton();
	 JButton button3 = new JButton();
	    frame.add(panel);
	    panel.add(button1);
	    panel.add(button2);
	    panel.add(button3);
	    frame.pack();
	    button1.addActionListener(this);
 }

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (buttonPressed == button1) {
		
	}
}
}
