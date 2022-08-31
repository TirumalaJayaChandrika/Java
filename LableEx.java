import javax.swing.*;
import java.awt.event.*;
public class LableEx{
	JFrame f;JLabel l;JTextField b;JButton j;
	LableEx(){
		 f = new JFrame();
		 l = new JLabel("");
		b=new JTextField("hi");
		j= new JButton("click for ip");
		j.setBounds(150,150,100,20);
		l.setBounds(100,100,100,200);
		b.setBounds(50,50,100,200);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
		f.add(l);
	f.add(b);
		f.add(j);
		j.addActoinListener (new ActionListener(){
public void actionPerformed(ActionEvent e){
try{
String host =b.getText();
String ip=java.net.InetAddress.getByName(host).getHostAddress();
b.setText("Ip of host"+host+"is:"+ip);
}catch(Exception en){
System.out.println(en);
}
	}
		});
	}
	public static void main(String[] args){
		new LableEx();
	}
}