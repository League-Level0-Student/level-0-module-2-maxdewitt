package methods;

//Copyright (c) The League of Amazing Programmers 2013-2017
//Level 0

import javax.swing.JOptionPane;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm {

AnimalFarm() {
	/*
	 * 1. Ask the user which animal they want, then play the sound of that
	 * animal.
	 */
   //String animal = JOptionPane.showMessageDialog(null, "Pick an animal");
	int animal = JOptionPane.showOptionDialog(null, "Choose an animal", "Animal Farm", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] {"Dog", "Duck", "Cow" , "Cat"}, null);
	System.out.println(animal);
	if (animal == 0){
		playWoof();
	}
	else if (animal == 1){
		playQuack();
	}
	else if (animal == 2){
		playMoo();
	}
	else if (animal == 3){
		playMeow();
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

