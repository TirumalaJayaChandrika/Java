import javax.swing.*;
public class TabbedPaneExample {
JFrame f;
TabbedPaneExample(){
f=new JFrame();
JTextArea ta=new JTextArea(50,50);
ta.setBounds(50,50,200,200);
JPanel p1=new JPanel();


JPanel p2=new JPanel();
JPanel p3=new JPanel();
JPanel p4=new JPanel();
JTabbedPane tp=new JTabbedPane();
tp.setBounds(50,50,500,500);
p1.add(ta);
tp.add("main",p1);
tp.add("visit",p2);
tp.add("help",p3);
tp.add("information",p4);
f.add(tp);
f.setSize(800,800);
f.setLayout(null);
f.setVisible(true);
}
public static void main(String[] args) {
new TabbedPaneExample();
}
}