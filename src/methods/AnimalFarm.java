package methods;

//Copyright (c) The League of Amazing Programmers 2013-2018

//Level 0

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
		for (int i = 0; i == 0; i++) {
			/*
			 * 1. Ask the user which animal they want, then play the sound of that animal.
			 */
			String anml = JOptionPane.showInputDialog("Who is your spiritual farm animal?\n\n\n\n\nheck");
			/* 2. Make it so that the user can keep entering new animals. */
			if (anml.equals("cow")) {
				playMoo();
			} else if (anml.equals("duck")) {
				playQuack();
			} else if (anml.equals("dog")) {
				playWoof();
			} else if (anml.equals("cat")) {
				playMeow();
			} else if (anml.equals("llama")) {
				playSpit();
				JOptionPane.showMessageDialog(null, "*spits*");
			} else {
				JOptionPane.showInputDialog("We couldn't hire a voice actor for that one. Sorry!");
			}
			String cont = JOptionPane.showInputDialog("Want to be asked the same question?");
			if (cont.equals("yes")) {
				i = i - 1;
			} else {
				JOptionPane.showMessageDialog(null, "That was fun. See ya later!");
			}
		}
	}

	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}

	void playMeow() {
		playNoise(meowFile);
	}

	void playSpit() {
		playNoise(llamaFile);
	}

	String quackFile = "quack.wav";
	String mooFile = "moo.wav";
	String woofFile = "woof.wav";
	String meowFile = "meow.wav";
	String llamaFile = "llama.wav";

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(getClass().getResource(soundFile)));
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}
