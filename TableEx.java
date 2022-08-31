import javax.swing.*;
public class TableEx{
	JFrame f;
	TableEx(){
		f=new JFrame();
String data[][]={{"101","Amit","670000"},{"102","Jai","780000"},{"101","Sachin","700000"}};

	String column[]={"ID","NAME","SALARY"};

	JTable t=new JTable(data,column);
	t.setBounds(30,30,300,300);	
	JScrollPane p = new JScrollPane(t);

	f.add(p);
	f.setSize(300,50);
	f.setVisible(true);
	}
	public static void main(String[] args){
	new TableEx();
	}
}
	
		