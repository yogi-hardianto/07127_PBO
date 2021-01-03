package Model;

import Entity.Yogi07127_SiswaEntity;
import java.util.ArrayList;

public class Yogi07127_SiswaModel implements Yogi07127_ModelInterfaces{
    private ArrayList<Yogi07127_SiswaEntity> Anggota;
    
    public Yogi07127_SiswaModel(){
       Anggota = new ArrayList<>();
    }
    
    public ArrayList<Yogi07127_SiswaEntity> getAnggota(){
       return Anggota;
    }

    @Override
    public void insert(Object x) {
        Anggota.add((Yogi07127_SiswaEntity) x);
    }

    @Override
    public void update(int index, Object x) {
        
    }

    @Override
    public void delete(int index) {
    
    }
    
  
}

