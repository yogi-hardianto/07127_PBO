package Model_07127;

import Entity_07127.DaftarKendaraanSiswaEntity_07127;
import Entity_07127.KendaraanEntity_07127;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class DaftarKendaraanSiswaModel_07127 implements ModelInterfaces_07127 {
    private ArrayList<DaftarKendaraanSiswaEntity_07127> daftarKendaraanArrayList;
    public DaftarKendaraanSiswaModel_07127(){
daftarKendaraanArrayList = new ArrayList<DaftarKendaraanSiswaEntity_07127>();
    }
    public void insertDataDaftarKendaraan(DaftarKendaraanSiswaEntity_07127 daftarKendaraan){
        daftarKendaraanArrayList.add(daftarKendaraan);
    }
    public ArrayList<DaftarKendaraanSiswaEntity_07127> getDaftarKendaraanArrayList(){
        return daftarKendaraanArrayList;
    }
    @Override
    public void view(){
        for(DaftarKendaraanSiswaEntity_07127 daftarKendaraan : daftarKendaraanArrayList){
            System.out.println("===============================================");
            System.out.print("No :"+daftarKendaraan.getSiswa().getNo()+
                    "\n Nama :"+daftarKendaraan.getSiswa().getNama()+
                    "\n Password :"+daftarKendaraan.getSiswa().getPassword()+
                    "\n No.Telp :"+daftarKendaraan.getSiswa().getNo_telp()+
                    "\n Tanggal Daftar :"+new SimpleDateFormat ("dd-MM-yyyy").format(daftarKendaraan.getSiswa().getTglDaftar())+
                    "\n Merk :"+KendaraanEntity_07127.merk[daftarKendaraan.getIndexKendaraan()]+"\n IsVerified :");
            if (daftarKendaraan.isVerified()==false){
                System.out.println("Belum Terdaftar");
            } else{
                System.out.println("Telah Terdaftar");
            }
            System.out.println("===============================================");
        }
    }
    @Override
    public int cek (String no, String password){
        int loop = 0;
        if(daftarKendaraanArrayList.size()==0){
            loop=-1; //data kosong
        } else {
            for(int i=0 ; i<daftarKendaraanArrayList.size();i++){
                if(daftarKendaraanArrayList.get(i).getSiswa().getNo().equals(no)){
                    loop= i;
                    break;
                }else{
                    loop = -2;
                }
            }
        } return loop; 
    }
    public DaftarKendaraanSiswaEntity_07127 showDaftarKendaraan(int index){
        return daftarKendaraanArrayList.get(index);
    }
    public void updateIsVerified(int index,DaftarKendaraanSiswaEntity_07127 daftarKendaraanEntity){
        daftarKendaraanArrayList.set(index,daftarKendaraanEntity);
    }
}
