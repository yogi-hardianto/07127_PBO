package View;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author yogi
 */

public class Yogi07127_GUILogin {
    JFrame LogReg = new JFrame();
    JLabel login,daftar,top;
    JRadioButton radiopetugas,radioanggota;
    JTextField textnologin,textnama,textnotelp,textnodaftar,textalamat,textnpm;
    JLabel labelnologin,labelnama,labelpasswordlogin,labelnotelp,labelnodaftar,labelpassworddaftar,alamatlabel,labelnpm;
    JButton check,reg;
    JPasswordField passwordlogin,passworddaftar;
    private boolean ceklogin = false;
    
    public Yogi07127_GUILogin(){
        LogReg.setSize(700,630);
        LogReg.setLayout(null);
        LogReg.getContentPane().setBackground(Color.GREEN);
        top = new JLabel("Sistem Manajemen Parkir");
        top.setBounds(100, 10, 600, 50);
        top.setFont(new Font("Times New Roman",Font.BOLD,40));
        LogReg.add(top);
        
        login = new JLabel("Login");
        login.setBounds(100, 50, 100, 100);
        login.setFont(new Font("Times New Roman",Font.BOLD,30));
        LogReg.add(login);
        
        radiopetugas = new JRadioButton("Petugas");
        radiopetugas.setBounds(30, 150, 100, 30);
        radiopetugas.setBackground(Color.RED);
        LogReg.add(radiopetugas);
        
        radioanggota = new JRadioButton("Anggota");
        radioanggota.setBounds(140, 150, 100, 30);
        radioanggota.setBackground(Color.RED);
        LogReg.add(radioanggota);
        
        labelnologin = new JLabel("NO");
        labelnologin.setBounds(30, 180, 30, 30);
        LogReg.add(labelnologin);
        
        textnologin = new JTextField();
        textnologin.setBounds(30, 210, 200, 30);
        LogReg.add(textnologin);
        
        labelpasswordlogin = new JLabel("PASSWORD");
        labelpasswordlogin.setBounds(30, 240, 100, 30);
        LogReg.add(labelpasswordlogin);
        
        passwordlogin = new JPasswordField();
        passwordlogin.setBounds(30, 270, 200, 30);
        LogReg.add(passwordlogin);
        
        check = new JButton("Login");
        check.setBounds(90, 320, 100, 40);
        check.setBackground(Color.RED);
        LogReg.add(check);
        
        daftar = new JLabel("Create");
        daftar.setFont(new Font("Times New Roman",Font.BOLD,30));
        daftar.setBounds(440, 50, 150, 100);
        LogReg.add(daftar);
        
        labelnodaftar = new JLabel("No");
        labelnodaftar.setBounds(400, 150, 30, 30);
        LogReg.add(labelnodaftar);
        
        textnodaftar = new JTextField();
        textnodaftar.setBounds(400, 180, 200, 30);
        LogReg.add(textnodaftar);
        
        labelnama = new JLabel("Nama");
        labelnama.setBounds(400, 210, 100, 30);
        LogReg.add(labelnama);
        
        textnama = new JTextField();
        textnama.setBounds(400, 240, 200, 30);
        LogReg.add(textnama);
        
        labelpassworddaftar = new JLabel("Password");
        labelpassworddaftar.setBounds(400, 270, 100, 30);
        LogReg.add(labelpassworddaftar);
        
        passworddaftar  = new JPasswordField();
        passworddaftar.setBounds(400, 300, 200, 30);
        LogReg.add(passworddaftar);
        
        labelnotelp = new JLabel("No Telepon");
        labelnotelp.setBounds(400, 330, 100, 30);
        LogReg.add(labelnotelp);
        
        textnotelp = new JTextField();
        textnotelp.setBounds(400, 360, 200, 30);
        LogReg.add(textnotelp);
        
        labelnpm = new JLabel("Npm");
        labelnpm.setBounds(400, 390, 200, 30);
        LogReg.add(labelnpm);
        
        textnpm = new JTextField();
        textnpm.setBounds(400, 420, 200, 30);
        LogReg.add(textnpm);
        
        alamatlabel = new JLabel("Alamat");
        alamatlabel.setBounds(400, 450, 200, 30);
        LogReg.add(alamatlabel);
        
        textalamat=  new JTextField();
        textalamat.setBounds(400, 480, 200, 30);
        LogReg.add(textalamat);
        
        reg = new JButton("Daftar");
        reg.setBounds(460, 520, 100, 40);
        reg.setBackground(Color.RED);
        LogReg.add(reg);
        
        LogReg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LogReg.setVisible(true);
        LogReg.setLocationRelativeTo(null);
        radiopetugas.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (radiopetugas.isSelected()){
                    radioanggota.setSelected(false);
                    ceklogin = true;
                }
            }
        });
        radioanggota.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (radioanggota.isSelected()){
                    radiopetugas.setSelected(false);
                    ceklogin = false;
                }
            }
        });
        check.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ceklogin == true){
                    try{
                        allobjctrl.admin.DataAdmin();
                        allobjctrl.admin.login(textnologin.getText(), passwordlogin.getText());
                        String nama = allobjctrl.admin.adminEntity().getNama();
                        JOptionPane.showMessageDialog(null,"selamat datang "+nama,"information", JOptionPane.INFORMATION_MESSAGE);
                        AdminGUI admin = new AdminGUI();
                        LogReg.dispose();
                    }catch (Exception exception){
                        JOptionPane.showMessageDialog(null,"NPM atau password salah","information",JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                    }
                }else{
                    try {
                        allobjctrl.anggota.login(textnologin.getText(), passwordlogin.getText());
                        String nama = allobjctrl.anggota.siswaEntity().getNama();
                        JOptionPane.showMessageDialog(null,"Selamat Datang "+nama,"information",JOptionPane.INFORMATION_MESSAGE);
                        AnggotaGUI prak = new AnggotaGUI();
                        LogReg.dispose();
                    }catch(Exception exception){
                        JOptionPane.showMessageDialog(null,"NPM atau password salah","information", JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                    }
                }
            }
        });
        reg.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                try{
                    String no = textnodaftar.getText();
                    String nama = textnama.getText();
                    String pass = passworddaftar.getText();
                    String notelp = textnotelp.getText();
                    String npm = textnpm.getText();
                    String alamat = textalamat.getText();
                    allobjctrl.anggota.insertSiswa(no, nama, pass, notelp, npm, alamat);
                    JOptionPane.showMessageDialog(null,"Register Sukses","information", JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null,"Format Penulisan Salah", "Register Gagal", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
   }
    void kosong(){
        textnodaftar.setText(null);
        textnologin.setText(null);
        passworddaftar.setText(null);
        passwordlogin.setText(null);
        textnama.setText(null);
        textnotelp.setText(null);
        textnpm.setText(null);
        textalamat.setText(null);
        
    }
    
}