package Notepad;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class About  extends JFrame implements ActionListener {
    JButton b1;
    About(){
           setBounds(600,200,700,600);
           setLayout(null);

           try {
               ImageIcon i1 = new ImageIcon((Image) ClassLoader.getSystemResources("Notepad\\1.png"));
               Image i2 = i1.getImage().getScaledInstance(50, 30, Image.SCALE_DEFAULT);
               ImageIcon i3 = new ImageIcon(i2);
               JLabel l1 = new JLabel(i3);
               l1.setBounds(50, 60, 100,100);

               add(l1);
           }catch(Exception e){

           }

           JLabel  info = new JLabel("<html>This is Notepad Developed by ASI Groups of Companies <br> Copyright All Reserved ASI.</html>");
           info.setBounds(100, 150, 600, 100);
           info.setFont(new Font("SAN SERIF", Font.PLAIN, 18));
           add(info);

           b1 = new JButton("Ok");
           b1.setBounds(580, 500, 80, 25);
           b1.addActionListener(this);
           add(b1);

    }

    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
    }

    public static void main(String[] args) {
        new About().setVisible(true);
    }
}
