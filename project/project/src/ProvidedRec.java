import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProvidedRec extends BloodGroups implements ActionListener {
    JFrame frameData;
    JButton closeRec;
    JTextArea t1;
    JLabel l1;

    ProvidedRec(){
        frameData= new JFrame("Supply RECORDS");
        closeRec= new JButton("CLOSE");
        l1=new JLabel("SUPPLY RECORD: ");
        t1= new JTextArea(400,400);
        t1.setText(provided);


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
