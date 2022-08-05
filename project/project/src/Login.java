
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login implements ActionListener {
    JFrame login;
    JLabel user ;
    JLabel pass;
    static JTextField username ;
    static JPasswordField password ;
    JButton logIn;
    JButton reset;
    JButton close;
    JCheckBox showPassword ;

JLabel background;

    public Login() {
        login= new JFrame("Log Into System");


        user = new JLabel("USERNAME");
        pass = new JLabel("PASSWORD");
       // ImageIcon exiT= new ImageIcon("src\\log.png");

        logIn = new JButton("LOGIN");
        reset = new JButton("RESET");
        username= new JTextField(5);
        password= new JPasswordField(5);
        showPassword = new JCheckBox("Show Password");
        close= new JButton("CLOSE");



        username.setBackground(Color.CYAN);
        password.setBackground(Color.CYAN);
        logIn.setForeground(Color.BLACK);
        reset.setForeground(Color.BLACK);
        showPassword.setForeground(Color.BLACK);
        close.setForeground(Color.BLACK);
        logIn.setBackground(Color.orange);
        reset.setBackground(Color.orange);
        showPassword.setBackground(Color.orange);
        close.setBackground(Color.red);




        ImageIcon bgImage= new ImageIcon("src\\log.png");

         background= new JLabel(bgImage);
        background.setBounds(-90, -280, 650, 1000);




        user.setBounds(50, 150, 100, 30);
        pass.setBounds(50, 220, 100, 30);
        username.setBounds(150, 150, 150, 30);
        password.setBounds(150, 220, 150, 30);
        showPassword.setBounds(150, 250, 150, 30);
        logIn.setBounds(50, 300, 100, 30);
        reset.setBounds(200, 300, 100, 30);
        close.setBounds(125, 350, 100, 30);





        login.add(user);
        login.add(username);
        login.add(pass);
        login.add(password);
        login.add(showPassword);
        login.add(logIn);
        login.add(reset);
        login.add(close);
        login.add(background);
        logIn.addActionListener(this);
        showPassword.addActionListener(this);
        reset.addActionListener(this);
        close.addActionListener(this);

        login.setResizable(false);
    login.setLocation(400,100);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.setSize(500,500);
        login.setLayout(null);
        login.setVisible(true);

    }










    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==logIn){
           String user = username.getText();
           String pass = String.valueOf(password.getPassword());
           if (user.equals("admin") && pass.equals("12345")) {
               login.setVisible(false);
               new Home();
           } else {
               JOptionPane.showMessageDialog(null, "Wrong Credentials");
           }}
           else if (e.getSource()==showPassword){
           if (showPassword.isSelected()) {
               password.setEchoChar((char)0);
           } else {
               password.setEchoChar('*');
           }

       }
           else if(e.getSource()==close){

           System.exit(0);
       }
           else if (e.getSource()==reset){
           username.setText("");
           password.setText("");

       }
       }

}



