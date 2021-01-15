package Controller;

import Model.Yogi07127_SiswaModel;
import Entity.Yogi07127_SiswaEntity;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class Yogi07127_SiswaController {
    Yogi07127_SiswaModel siswa_m = new Yogi07127_SiswaModel();
    int indexLogin = 0;
     
 public ArrayList<Yogi07127_SiswaEntity> getListSiswa(){
       return siswa_m.getAnggota();
    }
 public Yogi07127_SiswaEntity getData(){
     return getData();
 }
 
 public DefaultTableModel daftarprak(){
        DefaultTableModel dtmdaftar = new DefaultTableModel();
        Object[] kolom = {"No","Nama","Password","No Telp","Alamat","NPM"};
        dtmdaftar.setColumnIdentifiers(kolom);
        return dtmdaftar;
        }

    public void insertSiswa(String no,String nama, String alamat, String no_telp, 
            String password, String npm){
        Yogi07127_SiswaEntity data = new Yogi07127_SiswaEntity();
        data.setNo(no);
        data.setNama(nama);
        data.setAlamat(alamat);
        data.setNoTelp(no_telp);
        data.setPassword(password);
        data.setNPM(npm);
        siswa_m.insert(data);
    }
    public int cekData (String npm, String password){
        int loop = 0;
        if(getListSiswa().size()==0){
            loop=-1; //data kosong
        } else {
            for(int i=0 ; i<getListSiswa().size();i++){
                if(getListSiswa().get(i).getNPM().equals(npm)){
                    loop= i;
                    break;
                }else{
                    loop = -2;
                }
            }
        } return loop; 
    }
    public void login(String npm,String password){
        indexLogin = cekData(npm, password);
    }
    public Yogi07127_SiswaEntity siswaEntity(){
        return
                siswa_m.getSiswaArrayList(indexLogin);
}
}