package Model;

import Entity.Yogi07127_KendaraanEntity;
import java.util.ArrayList;

public class Yogi07127_KendaraanModel implements Yogi07127_ModelInterfaces{
     private ArrayList<Yogi07127_KendaraanEntity> ListKendaraan;
    
    public Yogi07127_KendaraanModel(){
        ListKendaraan = new ArrayList<>();
    }
    
    public ArrayList<Yogi07127_KendaraanEntity> getListKendaraan(){
       return ListKendaraan;
    }   

    @Override
    public void insert(Object x) {
        ListKendaraan.add((Yogi07127_KendaraanEntity) x);
    }

    @Override
    public void update(int index, Object x) {
        ListKendaraan.set(index ,(Yogi07127_KendaraanEntity) x);
    }

    @Override
    public void delete(int index) {
        ListKendaraan.remove(index);
    } 
}
