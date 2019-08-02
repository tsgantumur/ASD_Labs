package lab10.observer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Client extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Client();
	}

	private JButton addBut, removeBut, displayBut;
	private JTextArea taDisplay = new JTextArea(40, 60);
	private JLabel labelAddName = new JLabel();
	private JTextField tfAddName = new JTextField(10);
	private JLabel labelRemoveName = new JLabel();
	private JTextField tfRemoveName = new JTextField(10);
	
	int saveFiles = 0, currentArticle = 0;
	
	public Client() {
		

		this.setSize(650, 780);
		this.setTitle("Observer Pattern");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel1 = new JPanel();
		
		ButtonListener btnListener = new ButtonListener();
		
		addBut = new JButton("Add");
		addBut.addActionListener(btnListener);
		
		removeBut = new JButton("Remove");
		removeBut.addActionListener(btnListener);
		
		displayBut = new JButton("Display");
		displayBut.addActionListener(btnListener);
		
		panel1.add(labelAddName);
		panel1.add(tfAddName);
		panel1.add(addBut);
		panel1.add(labelRemoveName);
		panel1.add(tfRemoveName);
		panel1.add(removeBut);
		panel1.add(displayBut);
		

		panel1.add(taDisplay);
		
		this.add(panel1);
		this.setVisible(true);
	}
	
	
	class ButtonListener implements ActionListener {
		Subject subj = new SubjectImpl();
		
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == addBut)
			{
				String name = tfAddName.getText();
				Person person = new Person(name);
				subj.add(person);
				
				String s = subj.displayPeople();
				taDisplay.setText(s);
				
				System.out.println(name + " added!");
			} 
			else if(e.getSource() == removeBut) {
				String name = tfRemoveName.getText();
				subj.remove(name);
				
				String s = subj.displayPeople();
				taDisplay.setText(s);
				
				System.out.println(name + " removed!");
			}
			else if(e.getSource() == displayBut)
			{
				String s = subj.displayPeople();
				taDisplay.setText(s);
				
				System.out.println(s + " display!");
			}
		}
	}
}
