import java.awt.*;
import java.applet.*;
import java.awt.event.*;
class LoginForm implements ActionListener{
	Frame f;Label l1,l2,l3;TextField t1,t2;Button b1,b2;
	LoginForm(){
		f= new Frame("login form");
		l1=new Label("Username");
		l2=new Label("password");
		l1.setBounds(50,50,100,50);
		l2.setBounds(50,150,100,50);
		t1=new TextField();
		t2=new TextField();
		t1.setBounds(150,50,200,50);
		t2.setBounds(150,150,200,50);
		b1=new Button("submit");
		b2=new Button("cancel");
		b1.setBounds(100,250,100,50);
		b2.setBounds(400,250,100,50);
		f.add(l1);
		f.add(l2);
		f.add(t1);
		f.add(t2);
		f.add(b1);
		f.add(b2);
		
          b1.addActionListener(this);
		b2.addActionListener(this);
		f.setBackground(Color.red);
		f.setSize(1000,1000);
		f.setLayout(null);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent  e){
		if(e.getSource()==b1){
		String s1=t1.getText();
		String s2=t2.getText();
		if(s1.equals("Chandrika") &&  s2.equals("jaya@123")){
				l3=new Label("valid");
				l3.setBounds(200,400,50,30);
				f.add(l3);
		}
		else{
			l3=new Label(" not valid");
				l3.setBounds(200,400,50,30);
				f.add(l3);
		}
	}else if(e.getSource()==b2){
		t1.setText(" ");
		t2.setText(" ");
		l3.setText(" ");
	}
	}
	public static void main(String[] args){
		new LoginForm();
	}
}
				
			