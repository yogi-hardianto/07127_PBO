package View;

import Controller.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import Entity.Yogi07127_KategoriEntity;

public class AdminGUI {
    private static Yogi07127_SiswaController siswa = new Yogi07127_SiswaController();
    JFrame Admin = new JFrame();
    JTable tabel = new JTable();
    JScrollPane scroll = new JScrollPane(tabel);
    JButton back,update,delete,detail;
    JLabel top,admin,npmlabel,passlabel,merk,jenis,labelthn,labelnopol;
    JTextField npmtext,passtext,textmerk,textjenis,textthn,textnopol,textdetail;
    JComboBox pilkategori = new JComboBox(Yogi07127_KategoriEntity.kategoripilkend);
    int index;
    public AdminGUI(){
        Admin.setSize(900, 630);
        Admin.setLayout(null);
        Admin.getContentPane().setBackground(Color.YELLOW);
        
            top =new JLabel("Menu Admin");
            top.setBounds(200, 10, 600, 50);
            top.setFont(new Font("Times New Roman",Font.BOLD,40));
            Admin.add(top);
            
            scroll.setBounds(30, 100, 570, 200);
            tabel.setModel(siswa.listkendaraan());
            Admin.add(scroll);
            
             pilkategori.setBounds(660, 90, 200, 30);
             Admin.add(pilkategori);
            
        merk =new JLabel("Merk Kendaraan");
        merk.setBounds(660, 120, 100, 30);
        Admin.add(merk);
        
        textmerk =new JTextField();
        textmerk.setBounds(660, 150, 200, 30);
        Admin.add(textmerk);
        
        jenis =new JLabel("Jenis");
        jenis.setBounds(660, 180, 100, 30);
        Admin.add(jenis);
        
        textjenis =new JTextField();
        textjenis.setBounds(660, 210, 200, 30);
        Admin.add(textjenis);
        
        labelthn =new JLabel("Tahun Kendaraan");
        labelthn.setBounds(660, 240, 100, 30);
        Admin.add(labelthn);
                
        textthn =new JTextField();
        textthn.setBounds(660, 270, 200, 30);
        Admin.add(textthn);
        
        labelnopol = new JLabel("Nopol");
        labelnopol.setBounds(660, 300, 100, 30);
        Admin.add(labelnopol);
        
        textnopol = new JTextField();
        textnopol.setBounds(660, 330, 200, 30);
        Admin.add(textnopol);
               
        //
            
            update =new JButton("Ubah Data");
            update.setBounds(660, 450, 100, 30);
            update.setBackground(Color.GREEN);
            Admin.add(update);
            
            delete =new JButton("Hapus Data");
            delete.setBounds(760, 450, 100, 30);
            delete.setBackground(Color.GREEN);
            Admin.add(delete);
            
            detail = new JButton("Detail Data");
            detail.setBounds(560, 450, 100, 30);
            detail.setBackground(Color.GREEN);
            Admin.add(detail);
            
            back = new JButton("back");
            back.setBounds(50, 450, 100, 30);
            back.setBackground(Color.red);
            Admin.add(back);
            
            Admin.setLocationRelativeTo(null);
            Admin.setVisible(true);
            Admin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Yogi07127_GUILogin lo = new Yogi07127_GUILogin();
                Admin.dispose();
            }
        });
        tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = tabel.getSelectedRow();
                index =i;
                pilkategori.setSelectedItem(allobjctrl.anggota.listkendaraan().getValueAt(i, 0).toString());
                textmerk.setText(allobjctrl.anggota.listkendaraan().getValueAt(i, 1).toString());
                textjenis.setText(allobjctrl.anggota.listkendaraan().getValueAt(i, 2).toString());
                textthn.setText(allobjctrl.anggota.listkendaraan().getValueAt(i, 3).toString());
                textnopol.setText(allobjctrl.anggota.listkendaraan().getValueAt(i, 4).toString()); 
                
            }            
        });
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                        String merk = textmerk.getText();
                        String jenis = textjenis.getText();
                        String tahunkendaraan = textthn.getText();
                        String nopol = textnopol.getText();
                        allobjctrl.kendaraan.deleteData(index);
                        JOptionPane.showMessageDialog(null,"Hapus Data Sukses","Information", JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                        tabel.setModel(allobjctrl.anggota.listkendaraan());
                    }catch (Exception exception){}
            }
        });
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               try{
                        String merk = textmerk.getText();
                        String jenis = textjenis.getText();
                        String tahunkendaraan = textthn.getText();
                        String nopol = textnopol.getText();
                        allobjctrl.kendaraan.updateData(merk, jenis, tahunkendaraan, nopol,pilkategori.getSelectedIndex());
                        JOptionPane.showMessageDialog(null,"Data berhasil dirubah","Information", JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                        tabel.setModel(allobjctrl.anggota.listkendaraan());
                    }catch (Exception exception){
                    JOptionPane.showMessageDialog(null,"Format Salah", "gagal merubah data", JOptionPane.INFORMATION_MESSAGE);
                    }
            }
        });
        
        detail.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Admin.dispose();
                detailAnggotaGUI det =new detailAnggotaGUI();
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
