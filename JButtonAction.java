import javax.swing.*;
import java.awt.event.*;
public class JButtonAction {
	JFrame f;
	JTextField t;
	JButtonAction(){
		 f = new JFrame("frame with actionlistener");
		JButton b = new JButton("click here");
		 t = new JTextField();
		b.setBounds(100,100,100,20);
		t.setBounds(50,50,200,20);
		b.addActionListener(new ActionListener(){public void        actionPerformed(ActionEvent e){
	t.setText("welcome my ladies and gentleman");
	}
		});
		f.add(b);
		f.add(t);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	}
	
public static void main(String[] args){
	new JButtonAction();
	}
}