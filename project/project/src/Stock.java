import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Stock extends BloodGroups implements ActionListener {
    JFrame frameData;
    JButton closeRec;
    JTextArea t1;
JPanel panel11;
    Stock(){

        frameData= new JFrame("Available Stock");
        closeRec= new JButton("CLOSE");

        t1= new JTextArea(400,400);
        t1.setBounds(0,30,400,400);
        panel11= new JPanel();
        panel11.setLayout(null);
        panel11.add(t1);
        panel11.add(closeRec);
        panel11.setBounds(0,0,500,500);
        savString();
        closeRec.setForeground(Color.RED);
        closeRec.setBackground(Color.CYAN);
        closeRec.setBounds(300,420,100,40);
        t1.setText(stockAvailable);
        frameData.add(t1);
        frameData.add(panel11);

        closeRec.addActionListener(this);
        frameData.setSize(500, 500);
        frameData.setResizable(false);
        frameData.setLocation(400, 100);

        frameData.setVisible(true);





    }
    @Override
    public String toString(String param) {
        return null;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        frameData.setVisible(false);
    }

    private void savString(){
        stockAvailable+="\nA+\t"+A+"\n"+"A-\t"+$A+"\n"+"B+\t"+B+"\n"+"B-\t"+$B+"\n"+"AB+\t"
                +AB+"\n"+"AB-\t"+$AB+"\n"+"O+\t"+O+"\n"+"O-\t"+$O+"\n";
    }
}
