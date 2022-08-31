import javax.swing.*;  
public class TextAreaExample  
{  
     TextAreaExample(){  
        JFrame f= new JFrame();  
        JTextArea area=new JTextArea(200,200);  
        area.setBounds(10,30, 200,200);  
		JScrollPane s = new JScrollPane(area);
		area.add(s);
        f.add(area);  
        f.setSize(300,300);  
        f.setLayout(null);  
        f.setVisible(true);  
     }  
public static void main(String args[])  
    {  
   new TextAreaExample();  
    }}  