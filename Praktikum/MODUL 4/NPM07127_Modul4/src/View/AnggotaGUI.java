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
   private static Yogi07127_SiswaController siswa = new Yogi07127_SiswaController();
   JFrame Anggota = new JFrame();
   JTable tabel =new JTable();
   JScrollPane scroll = new JScrollPane(tabel);
   JButton back,daftar;
   JTextArea area = new JTextArea();
   JTextField textmerk,textjenis,textthn,textnopol;
   JLabel anggota,merk,jenis,labelthn,labelnopol;
   JComboBox pil = new JComboBox(Yogi07127_KategoriEntity.kategoripilkend);
   int index;
    
    public AnggotaGUI(){
        Anggota.setSize(900, 630);
        Anggota.setLayout(null);
        Anggota.getContentPane().setBackground(Color.PINK);
        
            anggota =new JLabel("MENU SISWA");
            anggota.setBounds(250, 30, 200, 30);
            anggota.setFont(new Font("Times New Roman",Font.BOLD,20));
            Anggota.add(anggota);
            //////////////////////////////////////////////////////////////////
            scroll.setBounds(30, 100, 570, 200);
            tabel.setModel(siswa.listkendaraan());
            Anggota.add(scroll);
            
            pil.setBounds(660, 90, 200, 30);
            Anggota.add(pil);
            //////////////////////////////////////////////////////////////////
                merk =new JLabel("Merk Kendaraan");
                merk.setBounds(660, 120, 100, 30);
                Anggota.add(merk);
        
                textmerk =new JTextField();
                textmerk.setBounds(660, 150, 200, 30);
                Anggota.add(textmerk);
            //////////////////////////////////////////////////////////////////
                jenis =new JLabel("Jenis");
                jenis.setBounds(660, 180, 100, 30);
                Anggota.add(jenis);
        
                textjenis =new JTextField();
                textjenis.setBounds(660, 210, 200, 30);
                Anggota.add(textjenis);
            /////////////////////////////////////////////////////////////////
                labelthn =new JLabel("Tahun Kendaraan");
                labelthn.setBounds(660, 240, 100, 30);
                Anggota.add(labelthn);
                
                textthn =new JTextField();
                textthn.setBounds(660, 270, 200, 30);
                Anggota.add(textthn);
            /////////////////////////////////////////////////////////////////
                labelnopol = new JLabel("Nopol");
                labelnopol.setBounds(660, 300, 100, 30);
                Anggota.add(labelnopol);
        
                textnopol = new JTextField();
                textnopol.setBounds(660, 330, 200, 30);
                Anggota.add(textnopol);
            /////////////////////////////////////////////////////////////////
                daftar =new JButton("Daftar");
                daftar.setBounds(690, 450, 100, 30);
                daftar.setBackground(Color.GREEN);
                Anggota.add(daftar);
                
                back = new JButton("Keluar");
                back.setBounds(50, 450, 100, 30);
                back.setBackground(Color.red);
                Anggota.add(back);
                
                Anggota.setLocationRelativeTo(null);
                Anggota.setVisible(true);
                Anggota.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Anggota.dispose();
                Yogi07127_GUILogin yo = new Yogi07127_GUILogin();
            }
            });
                
                daftar.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    try{
                        String merk = textmerk.getText();
                        String jenis = textjenis.getText();
                        String tahunkendaraan = textthn.getText();
                        String nopol = textnopol.getText();
                        allobjctrl.kendaraan.insertData(merk,jenis,tahunkendaraan,nopol, pil.getSelectedIndex());
                        JOptionPane.showMessageDialog(null,"Data berhasil disimpan","Information", JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                        tabel.setModel(allobjctrl.anggota.listkendaraan());
                    }catch (Exception exception){
                    JOptionPane.showMessageDialog(null,"Format Salah", "Data tidak disimpan", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            });
                tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = tabel.getSelectedRow();
                index=i;
                pil.setSelectedItem(allobjctrl.anggota.listkendaraan().getValueAt(i, 0).toString());
                textmerk.setText(allobjctrl.anggota.listkendaraan().getValueAt(i, 1).toString());
                textjenis.setText(allobjctrl.anggota.listkendaraan().getValueAt(i, 2).toString());
                textthn.setText(allobjctrl.anggota.listkendaraan().getValueAt(i, 3).toString());
                textnopol.setText(allobjctrl.anggota.listkendaraan().getValueAt(i, 4).toString()); 
            }            
        });
    }
    
    public void kosong(){
        textmerk.setText(null);
        textjenis.setText(null);
        textthn.setText(null);
        textnopol.setText(null);
    }
    
}
