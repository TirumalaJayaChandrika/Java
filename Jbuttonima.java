import javax.swing.*;
public class Jbuttonima{
	Jbuttonima(){
	JFrame f = new JFrame();
		JButton b = new JButton(new ImageIcon("C:\pic4.jpg"));
		b.setBounds(100,100,100,100);
		add(b);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		new Jbuttonima();
	}
}