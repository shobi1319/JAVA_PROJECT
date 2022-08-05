import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Search_blood extends BloodGroups implements ActionListener {
    JFrame frame;
    JLabel heading;
    JButton search, close;
    JTextField blood_group;
    JTextArea searchResult;
    Search_blood(){
        frame= new JFrame("Search Blood");
        heading= new JLabel("Enter Blood Group");

        blood_group= new JTextField(3);
        searchResult= new JTextArea(400,400);
        close= new JButton("Close");
        search= new JButton("Search");
        blood_group.setBounds(250,190,50,50);
        search.setBounds(250,270,170,60);
        heading.setBounds(70,190,170,60);
        close.setBounds(180,340,100,50);
        frame.add(heading);
        frame.add(search);
        frame.add(blood_group);
        frame.add(close);
        frame.setSize(500,500);


        frame.setResizable(false);
        frame.setLayout(null);
        close.addActionListener(this);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==search){
           if( donated.contains(blood_group.getText())){
               provided+=donated;
           }
        } else if (e.getSource()==close) {
           frame.setVisible(false);
           new Home();

        }
    }

    @Override
    public String toString(String param) {
        return null;
    }
}
