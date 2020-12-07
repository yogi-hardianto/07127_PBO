package Model_07127;
import Entity_07127.JenisKendaraanEntity_07127;
import java.util.ArrayList;
public class JenisKendaraanModel_07127 {
    private ArrayList<JenisKendaraanEntity_07127> jenisKendaraan;

public  JenisKendaraanModel_07127 () {
    
}    
    
    public JenisKendaraanModel_07127(ArrayList<JenisKendaraanEntity_07127> jenisKendaraan) {
        jenisKendaraan = new ArrayList <>();
    }
    
    public ArrayList<JenisKendaraanEntity_07127> getJenisKendaraan(){
       return jenisKendaraan;
    }

public void insert(Object x) {
        jenisKendaraan.add((JenisKendaraanEntity_07127) x);
    }



}
