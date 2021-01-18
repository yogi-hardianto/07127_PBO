
package Controller;

import Entity.Yogi07127_KendaraanEntity;
import Model.Yogi07127_KendaraanModel;
import Entity.Yogi07127_KategoriEntity;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import View.allobjctrl;

public class Yogi07127_KendaraanController {
    //inisialisasi object
    Yogi07127_KendaraanModel kendaraan_m = new Yogi07127_KendaraanModel();
    Yogi07127_KategoriEntity kategori = new Yogi07127_KategoriEntity();
    
public Yogi07127_KendaraanController() {
        kendaraan_m = new Yogi07127_KendaraanModel();
        
    } 

public ArrayList<Yogi07127_KendaraanEntity> getListKendaraan(){
       return kendaraan_m.getListKendaraan();
    }



public void insertData(String merk, String jenis, String tahunkendaraan,
             String nopol,int indexpilkend){
    Yogi07127_KendaraanEntity kendaraan = new Yogi07127_KendaraanEntity();
    kendaraan.setMerk(merk);
    kendaraan.setJenis(jenis);
    kendaraan.setTahunkendaraan(tahunkendaraan);
    kendaraan.setNopol(nopol);
    kendaraan.setIndexpilkend(indexpilkend);
        kendaraan_m.insert(kendaraan);
}
public void updateData (String merk,String jenis, String tahunkendaraan,
             String nopol,int indexpilkend){
             Yogi07127_KendaraanEntity kendaraan = new Yogi07127_KendaraanEntity();
    kendaraan.setMerk(merk);
    kendaraan.setJenis(jenis);
    kendaraan.setTahunkendaraan(tahunkendaraan);
    kendaraan.setNopol(nopol);
    kendaraan.setIndexpilkend(indexpilkend);
        kendaraan_m.update(indexpilkend, kendaraan);
    }
public void deleteData (int indexpilkend){
    kendaraan_m.delete(indexpilkend);
}

}

