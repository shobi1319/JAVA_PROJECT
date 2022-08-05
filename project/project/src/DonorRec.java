import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DonorRec extends BloodGroups implements ActionListener {
 JFrame frameData;
JButton closeRec;
JTextArea t1;
JLabel l1;

    DonorRec(){
        frameData= new JFrame("DONOR RECORDS");
        closeRec= new JButton("CLOSE");
        l1=new JLabel("DONOR RECORD: ");
        t1= new JTextArea(400,400);
        t1.setText(donated);


        frameData.add(t1);
        frameData.setSize(500, 500);
        frameData.setResizable(false);
        frameData.setLocation(400, 100);

        frameData.setVisible(true);





    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public String toString(String param) {
        return null;
    }
}
