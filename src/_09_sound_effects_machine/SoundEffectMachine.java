package _09_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectMachine implements ActionListener {
 JButton button1 = new JButton("Wood");
	JButton button2 = new JButton("Woohoo");
	JButton button3 = new JButton("Cymbal");
	void setup () {
	 JFrame frame = new JFrame();
	 frame.setVisible(true);
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 JPanel panel = new JPanel();
	 
	 
	 
	    frame.add(panel);
	    panel.add(button1);
	    panel.add(button2);
	    panel.add(button3);
	    frame.pack();
	    button1.addActionListener(this);
	    button2.addActionListener(this);
	    button3.addActionListener(this);
 }

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub

	if (e.getSource() == button1) {
		playSound("sawing-wood-daniel_simon.wav");
	}
	if (e.getSource() == button2) {
		playSound("homer-woohoo.wav");
	}
	if (e.getSource() == button3) {
		playSound("cymbal.wav");
	}
}
private void playSound(String soundFile) {
	String path = "src/_09_sound_effects_machine/";
		File sound = new File(path+soundFile);
		if (sound.exists()) {
			new Thread(() -> {
			try {
				Clip clip = AudioSystem.getClip();
				clip.open(AudioSystem.getAudioInputStream(sound));
				clip.start();
				Thread.sleep(clip.getMicrosecondLength()/1000);
			}
			catch (Exception e) {
				System.out.println("Could not play this sound");
			}}).start();
 		}
		else {
			System.out.println("File does not exist");
		}
	
}
}
