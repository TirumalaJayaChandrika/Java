import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
public class TreeEx{
	JFrame f;
	TreeEx(){
		f=new JFrame();
		DefaultMutableTreeNode style=new DefaultMutableTreeNode("style");
		DefaultMutableTreeNode color = new DefaultMutableTreeNode("color");
		DefaultMutableTreeNode font = new DefaultMutableTreeNode("font");
		
		DefaultMutableTreeNode red=new DefaultMutableTreeNode("red");
		DefaultMutableTreeNode blue =new DefaultMutableTreeNode("blue");
		DefaultMutableTreeNode green = new DefaultMutableTreeNode("green");
		color.add(red);
		color.add(blue);
		color.add(green);
		style.add(color);
		style.add(font);
		JTree t = new JTree(style);

		f.add(t);
		f.setSize(500,300);
		f.setVisible(true);
	}
	public static void main(String[] args){
	new TreeEx();
	}
}
