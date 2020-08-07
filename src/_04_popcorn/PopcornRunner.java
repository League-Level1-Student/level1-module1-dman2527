package _04_popcorn;

import javax.swing.JOptionPane;

import jdk.nashorn.internal.scripts.JO;

public class PopcornRunner {
public static void main(String[] args) {
	String flavor = JOptionPane.showInputDialog("What is the flavor of the page?");
	String minutes  = JOptionPane.showInputDialog("How many minutes to cook it?");
int minutes1 = 	Integer.parseInt(minutes);
Popcorn popcorn = new Popcorn(flavor);
popcorn.applyHeat();
}
}
