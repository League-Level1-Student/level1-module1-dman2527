package _07_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class binaryConverter implements ActionListener {
	JLabel label = new JLabel();
	JTextField answer = new JTextField(20);
	JFrame frame = new JFrame();
public static void main(String[] args) {
new binaryConverter().createUI();
}

String convert(String input) {
    if(input.length() != 8){
        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
        return "-";
    }
    String binary = "[0-1]+";//must contain numbers in the given range
    if (!input.matches(binary)) {
        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
        return "-";   
    }
    try {
        int asciiValue = Integer.parseInt(input, 2);
        char theLetter = (char) asciiValue;
        return "" + theLetter;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
        return "-";
    }
}
public void createUI() {
	JPanel panel = new JPanel();
	JButton button = new JButton();
	frame.setVisible(true);
	frame.setTitle("Binary Converter!");
	frame.add(panel);
	panel.add(answer);
	panel.add(button);
	panel.add(label);
	button.setText("Submit!");
	button.addActionListener(this);
	label.setText("ANSWER");
	frame.pack();
}

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	String binarySubmission = answer.getText();
	String answerBinary = convert(binarySubmission);
	label.setText(answerBinary);
	frame.pack();
}
}
