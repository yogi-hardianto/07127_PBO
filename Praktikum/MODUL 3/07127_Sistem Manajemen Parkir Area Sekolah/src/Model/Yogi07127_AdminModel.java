package Model;

import Entity.Yogi07127_AdminEntity;
import java.util.ArrayList;
public class Yogi07127_AdminModel implements Yogi07127_ModelInterfaces{
     private ArrayList<Yogi07127_AdminEntity> Admin;
    
    public Yogi07127_AdminModel(){
        Admin = new ArrayList<>();
    }
    
    public ArrayList<Yogi07127_AdminEntity> getAdmin(){
       return Admin;
    }   

    @Override
    public void insert(Object x) {
        Admin.add((Yogi07127_AdminEntity) x);
    }

    @Override
    public void update(int index, Object x) {
        Admin.set(index ,(Yogi07127_AdminEntity) x);
    }

    @Override
    public void delete(int index) {
        Admin.remove(index);
    } 
}
