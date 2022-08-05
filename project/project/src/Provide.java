
import javax.swing.*;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Provide extends BloodGroups implements ActionListener {
    Date d= new Date();
    JFrame provideE;
    JLabel name, bloodGroup, cNic;
    JTextField n, cn;
    JButton proVIDE_BUTTON;

    final JComboBox<String> cb;
    JPanel panel;
    Provide() {
        provideE = new JFrame("Donate");

        name = new JLabel(" Name: ");
        cNic = new JLabel(" CNIC: ");
        bloodGroup = new JLabel("Blood Group");
        bloodGroup.setAlignmentX(Component.CENTER_ALIGNMENT);
        ImageIcon i1= new ImageIcon("src\\prod.png");
        n = new JTextField(17);
        cn = new JTextField(11);
        proVIDE_BUTTON = new JButton("GIVE",i1);
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
        JLabel donLabel = new JLabel("BLOOD RECEIVING FORM:");
        donLabel.setFont(new Font("Arial", Font.BOLD, 25));

        p2.add(bloodGroup);
        p2.add(cb);
        p2.add(proVIDE_BUTTON);
        p2.setLayout(new FlowLayout());
        panel.add(donLabel,BorderLayout.NORTH);
        panel.add(p1,BorderLayout.CENTER);
        panel.add(p2,BorderLayout.SOUTH);
        provideE.add(panel);


        proVIDE_BUTTON.addActionListener(this);


        provideE.setSize(300, 300);
        provideE.setResizable(false);
        provideE.setLocation(100, 300);
        provideE.setVisible(true);}


    @Override
        public void actionPerformed(ActionEvent e) {

        if(n.getText().isEmpty()||cn.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Fill all the Fields");
        } else {
       if(toStrings().equals("A+")){
         if(A>0){
             A=A-1;
         message();
             saveString(n.getText()+ "\t" +cn.getText()+"\t"+toStrings()+"\t"+d);
         }
             else{
                 Shortage();
             }
         }

            if(toStrings().equals("A-")){
                if($A>0){
                    $A=$A-1;
                    message();
                    saveString(n.getText()+ "\t" +cn.getText()+"\t"+toStrings()+"\t"+d);
                }
                else{
                    Shortage();
                }
            }
            if(toStrings().equals("AB+")){
                if(AB>0){
                    AB=AB-1;
                    message();
                    saveString(n.getText()+ "\t" +cn.getText()+"\t"+toStrings()+"\t"+d);
                }
                else{
                    Shortage();
                }
            }
            if(toStrings().equals("AB-")){
                if($AB>0){
                    $AB=$AB-1;
                    message();
                    saveString(n.getText()+ "\t" +cn.getText()+"\t"+toStrings()+"\t"+d);
                }
                else{
                    Shortage();
                }
            }
            if(toStrings().equals("B+")){
                if(B>0){
                    B=B-1;
                    message();
                    saveString(n.getText()+ "\t" +cn.getText()+"\t"+toStrings()+"\t"+d);
                }
                else{
                    Shortage();
                }
            }
            if(toStrings().equals("B-")){
                if($B>0){
                    $B=$B-1;
                    message();
                    saveString(n.getText()+ "\t" +cn.getText()+"\t"+toStrings()+"\t"+d);
                }
                else{
                    Shortage();
                }
            }
            if(toStrings().equals("O+")){
                if(O>0){
                    O=O-1;
                    message();
                    saveString(n.getText()+ "\t" +cn.getText()+"\t"+toStrings()+"\t"+d);
                }
                else{
                    Shortage();
                }
            }
            if(toStrings().equals("O-")){
                if($O>0){
                    $O=$O-1;
                    message();
                    saveString(n.getText()+ "\t" +cn.getText()+"\t"+toStrings()+"\t"+d);
                }
                else{
                    Shortage();
                }
            }


        provideE.setVisible(false);
        }
        }
    public void saveString(String s){
        provided+=s+"\n";
    }
    public String toStrings() {
        return (String) cb.getSelectedItem();
    }



    public void message(){
        JOptionPane.showMessageDialog(null,"Blood Provided to: "+n.getText()+"\n"+ d);
    }

    @Override
    public String toString(String param) {
        return null;
    }
    public void Shortage(){
        JOptionPane.showMessageDialog(null,"SORRY BLOOD NOT AVAILABLE");
    }

}