import java.awt.*;
import java.awt.event.*;
class MyCal implements ActionListener{
	Label l1,l2,l3;Frame f;TextField t1,t2,t3;Button b1,b2;
	MyCal(){
		f = new Frame();
		l1=new Label("enter a");
		l2=new Label("enter b");
		l3=new Label(" value");
		l1.setBounds(50,50,100,100);
		l2.setBounds(50,150,100,100);
		l3.setBounds(50,250,100,100);
		t1=new TextField();
		t2=new TextField();
		t3=new TextField();
		t3.setBounds(200,250,50,50);
		t1.setBounds(200,150,50,50);
		t2.setBounds(200,50,50,50);
		b1=new Button("+");
		b2=new Button("-");
		
		b1.setBounds(100,500,50,50);
		b2.setBounds(500,500,50,50);
		b1.addActionListener(this);
		b2.addActionListener(this);
		f.add(l3);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(b1);
		f.add(b2);
		f.add(l1);
		f.add(l2);
		f.setSize(800,800);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		String s1=t1.getText();
		String s2=t2.getText();
		int a=Integer.parseInt(s1);
		int b= Integer.parseInt(s2);
		int c=0;
		if(e.getSource()==b1){
			c=a+b;
		}
		else if(e.getSource()==b2){
			c=a-b;
		}
		String r = String.valueOf(c);
		t3.setText(r);
	}
	public static void main(String[] args){
		new MyCal();
	}
}