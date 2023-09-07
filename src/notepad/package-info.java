package notepad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class About extends JFrame implements ActionListener {


    About(){

        setBounds(400,100,600,500);

        String url1="C://Users//91989//Desktop//NotepadClone//Notepad//icons//windows.jpg";
        ImageIcon i1 = new ImageIcon(url1);
        Image i2 = i1.getImage().getScaledInstance(300,60,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel headerIcon = new JLabel(i3);
        headerIcon.setBounds(70,40,400,80);
        add(headerIcon);

        String url2="C://Users//91989//Desktop//NotepadClone//Notepad//icons//notepadicon1.jpg";
        ImageIcon i4 = new ImageIcon(url2);
        Image i5 = i4.getImage().getScaledInstance(70,60,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);

        JLabel icon = new JLabel(i6);
        icon.setBounds(50,180,70,70);
        add(icon);

        JLabel text = new JLabel("<html>Code For Interview<br>Version 0.1.0 (Os build Java)<br>");
        text.setBounds(150,100,500,300);
        text.setFont(new Font("SAN_SERIF", Font.PLAIN,16));
        add(text);

        JButton bi = new JButton("Ok");
        bi.setBounds(150,150,120,25);
        bi.addActionListener(this);
        add(bi);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
    }

    public static void main(String[] args){
        new About();
    }
}