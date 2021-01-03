package Controller;
import java.util.ArrayList;
import Model.Yogi07127_AdminModel;
import Entity.Yogi07127_AdminEntity;


public class Yogi07127_AdminController {
     public Yogi07127_AdminModel admin_m;
   
  
    public Yogi07127_AdminController() {
        admin_m = new Yogi07127_AdminModel(); 
    }

    public ArrayList<Yogi07127_AdminEntity> getListAdmin(){
       return admin_m.getAdmin();
    }
     public void DataAdmin() {
        
       String no []      = {"01","02"};
       String nama []    = {"Petugas_1","Petugas_2"};
       String pass []    = {"01","02"};
       String alamat []  = {"surabaya","surabaya"};
       String no_telp [] = {"111","222"};
        for(int i = 0; i < no.length; i++) {
            admin_m.insert(new Yogi07127_AdminEntity(no[i],pass[i],nama [i],alamat [i],no_telp [i]));
        }
    }
}
