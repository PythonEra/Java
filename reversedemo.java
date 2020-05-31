import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class reversedemo extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
JTextField t1,t2;
public reversedemo()
{
setTitle("Reverse no");
l1=new JLabel("Enter No");
t1=new JTextField(20);
l2=new JLabel("Reverse No");
t2=new JTextField(20);
b1=new JButton("Click");
setSize(400,400);
setLayout(new FlowLayout());
add(l1);
add(t1);
add(l2);
add(t2);
add(b1);
setVisible(true);
b1.addActionListener(this);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
int num=Integer.parseInt(t1.getText());
int rev=0,rnum;
while(num>0)
{
rnum=num%10;
rev=(rev*10)+rnum;
num=num/10;
}
t2.setText(String.valueOf(rev));
}
}
public static void main(String args[])
{
reversedemo rd=new reversedemo();
}
}
 
