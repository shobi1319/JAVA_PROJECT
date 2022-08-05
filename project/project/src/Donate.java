
import javax.swing.*;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;


public class Donate extends  BloodGroups implements ActionListener {
    Date d= new Date();
    JFrame donat;
    JLabel name, bloodGroup, cNic;
    JTextField n, cn;
    JButton DOnate;
    final JComboBox<String> cb;
    JPanel panel;
    Donate() {
        donat = new JFrame("Donate");
        name = new JLabel(" Name: ");
        cNic = new JLabel(" CNIC: ");
        bloodGroup = new JLabel("Blood Group");
        bloodGroup.setAlignmentX(Component.CENTER_ALIGNMENT);
      ImageIcon i1= new ImageIcon("src\\Donor.png");
        n = new JTextField(17);
        cn = new JTextField(11);
        DOnate = new JButton("DONATE",i1);
        String[] blood_group = { "A+", "A-", "B+", "B-", "O+", "O-","AB+","AB-" };
         cb = new JComboBox<>(blood_group);
        cb.setMaximumSize(cb.getPreferredSize());
        cb.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel = new JPanel();
        panel.setLayout(new BorderLayout());

    JPanel p1=new JPanel();
        JPanel p2=new JPanel();
          p1.add(name);
          p1.add(n);
          p1.add(cNic);
          p1.add(cn);
          p1.setSize(15,10);
          p1.setLayout(new GridLayout(4,1));
          JLabel donLabel = new JLabel("    DONATION FORM:");
          donLabel.setFont(new Font("Arial", Font.BOLD, 25));

        p2.add(bloodGroup);
        p2.add(cb);
        p2.add(DOnate);
        p2.setLayout(new FlowLayout());
        panel.add(donLabel,BorderLayout.NORTH);
        panel.add(p1,BorderLayout.CENTER);
        panel.add(p2,BorderLayout.SOUTH);
        donat.add(panel);


        DOnate.addActionListener(this);


        donat.setSize(300, 300);
        donat.setResizable(false);
        donat.setLocation(400, 100);
        donat.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

       if(n.getText().isEmpty()||cn.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "Fill all the Fields");
        } else {
            if (toStrings().equals("A+")) {
                    A = A + 1;
                    message();

            } else if (toStrings().equals("A-")) {
                    $A = $A + 1;
                    message();
            } else if (toStrings().equals("AB+")) {
                AB = AB + 1;
                message();
            } else if (toStrings().equals("AB-")){
            $AB = $AB + 1;
            message();
        }
               else if(toStrings().equals("B+")){
                        B=B+1;
                        message();
                }
                if(toStrings().equals("B-")){
                        $B=$B+1;
                        message();
                }
                if(toStrings().equals("O+")){
                        O=O+1;
                        message();
                }
                if(toStrings().equals("O-")){
                        $O=$O+1;
                        message();
                }
        donat.setVisible(false);
       saveString(n.getText()+ "\t" +cn.getText()+"\t"+toStrings()+"\t"+d);

        }}
     public String toStrings() {
       return (String) cb.getSelectedItem();
    }
    public void saveString(String s){
        donated+=s+"\n";
    }
    public void message(){

        JOptionPane.showMessageDialog(null,"Blood Donated by: "+n.getText()+"\n"+d);


    }

    @Override
    public String toString(String param) {
        return null;
    }
}