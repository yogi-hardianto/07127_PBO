package View;

import Entity.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;



public class detailAnggotaGUI {
    JFrame detail = new JFrame();
    JButton back;
    JTextArea area = new JTextArea();
    JLabel datadiri;
    JComboBox pil = new JComboBox(Yogi07127_KategoriEntity.kategoripilkend);
    
    public detailAnggotaGUI(){
        detail.setSize(720, 600);
        detail.setLayout(null);
        detail.getContentPane().setBackground(Color.PINK);
        
        datadiri = new JLabel("Detail data");
        datadiri.setFont(new Font("Times New Roman", Font.BOLD,30));
        datadiri.setBounds(90, 30, 200, 30);
        detail.add(datadiri);
        area.setBounds(30, 90, 400, 300);
        detail.add(area);
        
        
        back = new JButton("back");
        back.setBounds(30, 500, 100, 30);
        back.setBackground(Color.red);
        detail.add(back);
        
        detail.setVisible(true);
        detail.setLocationRelativeTo(null);
        detail.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        area.setText(data());

        back.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                detail.dispose();
                AdminGUI men = new AdminGUI();
            }
        });
    }
    
    String data(){

        String text = "Nama = "+allobjctrl.anggota.siswaEntity().getNama()+"\n"
                +"NPM = "+allobjctrl.anggota.siswaEntity().getPassword()+"\n"
                +"No Telepon = "+allobjctrl.anggota.siswaEntity().getNoTelp()+"\n"
                +"Alamat = "+allobjctrl.anggota.siswaEntity().getNPM()+"\n"
                +"Password = "+allobjctrl.anggota.siswaEntity().getAlamat();
        return text;
    }
}
