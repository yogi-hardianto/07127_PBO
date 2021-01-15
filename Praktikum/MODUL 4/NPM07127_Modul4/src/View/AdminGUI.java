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

public class AdminGUI {
    private static Yogi07127_SiswaController praktikan = new Yogi07127_SiswaController();
    JFrame Aslab = new JFrame();
    JTable tabelpraktikan = new JTable();
    JScrollPane scrollaslab = new JScrollPane(tabelpraktikan);
    JButton back,verif;
    JLabel admin,npmlabel,passlabel;
    JTextField npmtext,passtext;
    public AdminGUI(){
        Aslab.setSize(650, 500);
        Aslab.setLayout(null);
        Aslab.getContentPane().setBackground(Color.PINK);
            admin = new JLabel("Admin");
            admin.setBounds(250, 30, 200, 30);
            admin.setFont(new Font("Times New Roman",Font.BOLD,40));
            Aslab.add(admin);
            
            scrollaslab.setBounds(30, 100, 570, 200);
            tabelpraktikan.setModel(praktikan.daftarprak());
            Aslab.add(scrollaslab);
            
            npmlabel = new JLabel("NPM");
            npmlabel.setBounds(50, 320, 100, 30);
            Aslab.add(npmlabel);
            
            npmtext = new JTextField();
            npmtext.setBounds(50, 350, 100, 30);
            Aslab.add(npmtext);
            
            passlabel = new JLabel("password");
            passlabel.setBounds(200, 320, 100, 30);
            Aslab.add(passlabel);
            
            passtext = new JTextField();
            passtext.setBounds(200, 350, 100, 30);
            Aslab.add(passtext);
            
            verif = new JButton("verif");
            verif.setBounds(350, 350, 100, 30);
            Aslab.add(verif);
            
            back = new JButton("back");
            back.setBounds(50, 400, 100, 30);
            back.setBackground(Color.red);
            Aslab.add(back);
            
            Aslab.setLocationRelativeTo(null);
            Aslab.setVisible(true);
            Aslab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            back.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                Aslab.dispose();
                Yogi07127_GUILogin men = new Yogi07127_GUILogin();
            }
        });
    }
}
