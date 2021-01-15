package Model;

import Entity.Yogi07127_AdminEntity;
import java.util.ArrayList;
public class Yogi07127_AdminModel implements Yogi07127_ModelInterfaces{
     private ArrayList<Yogi07127_AdminEntity> Admin;
     int indexLogin = 0;
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
    
    public int cekData (String npm, String password){
        int loop = 0;
        if(getAdmin().size()==0){
            loop=-1; //data kosong
        } else {
            for(int i=0 ; i<getAdmin().size();i++){
                if(getAdmin().get(i).getPassword().equals(password)){
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
    public Yogi07127_AdminEntity showDataAdmin(int index){
        return Admin.get(index);
}
}
