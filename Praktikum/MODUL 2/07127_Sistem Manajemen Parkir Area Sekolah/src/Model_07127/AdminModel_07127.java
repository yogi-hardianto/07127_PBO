package Model_07127;

import Entity_07127.AdminEntity_07127;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class AdminModel_07127 implements ModelInterfaces_07127 {
    private ArrayList<AdminEntity_07127> adminEntityArrayList;

public AdminModel_07127 (){
adminEntityArrayList = new ArrayList <AdminEntity_07127>();
}
public void insertAdmin (AdminEntity_07127 admin){
    adminEntityArrayList.add(admin);
}
@Override
public void view(){
    for (AdminEntity_07127 adminEntity : adminEntityArrayList){
        System.out.print(adminEntity.getNo());
        System.out.print(adminEntity.getNama());
        System.out.print(adminEntity.getPassword());
        System.out.print(adminEntity.getNo_telp());
            System.out.println();
    }
}
public int cek(String no,String password){
        int loop = 0;
        for (AdminEntity_07127 adminEntity : adminEntityArrayList){
            if (adminEntity.getNo().equals(no) &&  adminEntity.getPassword().equals(password)){
                break;
} else {
    loop ++;
        }
    }
    return loop;
}
public AdminEntity_07127 showDataAdmin(int index){
    return adminEntityArrayList.get(index);
    }
}