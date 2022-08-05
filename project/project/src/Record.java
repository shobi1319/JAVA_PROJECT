import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Record implements ActionListener {
    JFrame frameRecords;
    JLabel recordBackground;
    JButton DonorRecords ;
    JButton bloodSuppliedRecord ;
    JButton stock, close;
Record(){
    frameRecords= new JFrame("RECORDS");

    ImageIcon rcBg = new ImageIcon("src\\background R.png");
    ImageIcon exitApp= new ImageIcon("src\\Exit application.png");
    DonorRecords = new JButton("DONORS RECORD");
    bloodSuppliedRecord=new JButton("SUPPLIED RECORD");
    stock = new JButton("STOCK");
    recordBackground= new JLabel( rcBg );
    recordBackground.setBounds(0, 0, 800, 800);
    close= new JButton("CLOSE",exitApp);
    bloodSuppliedRecord.setBounds(250,270,150,40);
    DonorRecords.setBounds(80,270,150,40);
    stock.setBounds(160,350,150,40);
    close.setBounds(160,420,150,40);

    DonorRecords.setForeground(Color.white);
    stock.setForeground(Color.white);
    bloodSuppliedRecord.setForeground(Color.white);
    close.setForeground(Color.RED);
    bloodSuppliedRecord.setBackground(Color.orange);
    DonorRecords.setBackground(Color.orange);
    stock.setBackground(Color.orange);
    close.setBackground(Color.CYAN);




    frameRecords.add(DonorRecords);
    frameRecords.add(bloodSuppliedRecord);
    frameRecords.add(stock);
    frameRecords.add(close);
    frameRecords.add(recordBackground);

    DonorRecords.addActionListener(this);
    stock.addActionListener(this);
   bloodSuppliedRecord.addActionListener(this);
    close.addActionListener(this);

    frameRecords.setSize(520, 520);
    frameRecords.setVisible(true);
    frameRecords.setLayout(null);
    frameRecords.setResizable(false);
    frameRecords.setLocationRelativeTo(null);
}

    @Override
    public void actionPerformed(ActionEvent e) {
   if(e.getSource()==close){
    frameRecords.setVisible(false);
}
   else if(e.getSource()==DonorRecords){
     new DonorRec();
   }
   else if(e.getSource()==bloodSuppliedRecord){
       new ProvidedRec();
   }
   else if(e.getSource()==stock){
       new Stock();
   }
    }
}
