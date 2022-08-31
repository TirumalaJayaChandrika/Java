import javax.swing.*;
import java.awt.event.*;
class Calcu implements ActionListener{
	JFrame f;JButton b1,b2;JTextField t1,t2,t3;
	Calcu(){
		f= new JFrame();
		b1=new JButton("+");
		b2=new JButton("-");
		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();
		b1.setBounds(100,300,100,100);
		b2.setBounds(300,300,100,100);
		t1.setBounds(50,50,100,20);

		t2.setBounds(50,100,100,20);

		t3.setBounds(50,150,100,20);
		b1.addActionListener(this);
		
		b2.addActionListener(this);
		

		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(b1);
		f.add(b2);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		}
	public void actionPerformed(ActionEvent e){
		String s1=t1.getText();
		String s2=t2.getText();
		int a=Integer.parseInt(s1);
		int b=Integer.parseInt(s2);
		int c=0;
		if(e.getSource()==b1){
			c=a+b;
		}
		else if(e.getSource()==b2){
			c=a-b;
		}
		String r=String.valueOf(c);
		t3.setText(r);
		}
		public static void main(String[] args){
			new Calcu();
		}
}
		
		