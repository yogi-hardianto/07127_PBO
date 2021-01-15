package View;

import Controller.*;
import Entity.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;



public class AnggotaGUI {
   private static Yogi07127_KendaraanController kendaraan = new Yogi07127_KendaraanController();
   JFrame Anggota = new JFrame();
   JTable tabel =new JTable();
   JScrollPane scroll = new JScrollPane(tabel);
   JButton back,daftar,kembali;
   JTextArea area = new JTextArea();
   JTextField textkode,textjudul;
   JLabel datadiri,top,status,labelkode,labeljudul;
   int index;
    
    public AnggotaGUI(){
        Anggota.setSize(700, 450);
        Anggota.setLayout(null);
        Anggota.getContentPane().setBackground(Color.PINK);
        
            top =new JLabel("Kendaraan");
            top.setBounds(200, 10, 600, 50);
            top.setFont(new Font("Times New Roman",Font.BOLD,40));
            Anggota.add(top);
            
            scroll.setBounds(30, 100, 570, 200);
            tabel.setModel(kendaraan.());
            Anggota.add(scroll);
            
            back = new JButton("back");
            back.setBounds(50, 350, 100, 30);
            back.setBackground(Color.red);
            Anggota.add(back);
            
            Anggota.setLocationRelativeTo(null);
            Anggota.setVisible(true);
            Anggota.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Anggota.dispose();
                Yogi07127_GUILogin man = new Yogi07127_GUILogin();
            }
        });
        
    }
    
}
