package Controller;

import Model.Yogi07127_SiswaModel;
import Entity.Yogi07127_SiswaEntity;
import java.util.ArrayList;

public class Yogi07127_SiswaController {
    Yogi07127_SiswaModel siswa_m = new Yogi07127_SiswaModel();
     
 public ArrayList<Yogi07127_SiswaEntity> getListSiswa(){
       return siswa_m.getAnggota();
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
    
}
