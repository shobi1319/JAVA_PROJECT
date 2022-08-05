
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Home implements ActionListener {
    JFrame frame1;
    JLabel imageIcon1;
    JButton donate ;
    JButton getBlood ;
    JButton available_blood ;
    JButton search_blood;

    JButton close ;
    Home() {
        frame1 = new JFrame("MS BMS");
        ImageIcon ic1 = new ImageIcon("src\\background.png");
        ImageIcon ic2 = new ImageIcon("src\\stock.png");
        ImageIcon ic3 = new ImageIcon("src\\prod.png");
        ImageIcon ic4 = new ImageIcon("src\\Donor.png");
        ImageIcon ic5 = new ImageIcon("src\\search1.png");
        ImageIcon ic6 = new ImageIcon("src\\Exit application.png");
        imageIcon1 = new JLabel(ic1);
        imageIcon1.setBounds(0, 0, 800, 800);


        donate = new JButton("Donate",ic4);
        getBlood = new JButton("GetBlood",ic3);
        available_blood = new JButton("Total Records",ic2);
        search_blood = new JButton("Search Blood",ic5);
        close = new JButton("Log out",ic6);


        search_blood.setBounds(250,270,170,60);
        getBlood.setBounds(250,190,170,60);
        available_blood.setBounds(70,270,170,60);
        donate.setBounds(70,190,170,60);
        close.setBounds	(180,340,100,50);


        search_blood.setForeground(Color.white);
        getBlood.setForeground(Color.white);
        available_blood.setForeground(Color.white);
        donate.setForeground(Color.white);
        close.setForeground(Color.white);
        search_blood.setBackground(Color.orange);
        getBlood.setBackground(Color.orange);
        donate.setBackground(Color.orange);
        available_blood.setBackground(Color.orange);
        close.setBackground(Color.red);



        frame1.add(donate);
        frame1.add(getBlood);
        frame1.add(search_blood);
        frame1.add(available_blood);
        frame1.add(close);
        frame1.add(imageIcon1);


        donate.addActionListener(this);
        getBlood.addActionListener(this);
        search_blood.addActionListener(this);
        available_blood.addActionListener(this);
        close.addActionListener(this);

        frame1.setSize(520, 520);
        frame1.setVisible(true);
        frame1.setLayout(null);
        frame1.setResizable(false);
        frame1.setLocationRelativeTo(null);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == donate) {
            new Donate();
        } else if (e.getSource() == search_blood) {
            new Search_blood();
        } else if (e.getSource() == available_blood) {
            new Record();
        } else if (e.getSource() == close) {
            Login.username.setText("");
            Login.password.setText("");
            frame1.setVisible(false);
            new Login();
        } else if (e.getSource() == getBlood) {
            new Provide();
        }
    }
}