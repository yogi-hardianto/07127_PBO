package Model_07127;

import Entity_07127.SiswaEntity_07127;
import java.util.ArrayList;
import java.util.Scanner;
public class SiswaModel_07127 implements ModelInterfaces_07127 {
    private ArrayList<SiswaEntity_07127> siswaEntityArrayList;
    private static Scanner input = new Scanner(System.in);
    public SiswaModel_07127 (){
        siswaEntityArrayList = new ArrayList <SiswaEntity_07127>();
    }
    public SiswaEntity_07127 getSiswaEntityArrayList (int index){
        return siswaEntityArrayList.get(index);
    }
    public void insert (SiswaEntity_07127 siswaEntity){
        siswaEntityArrayList.add(siswaEntity);
    }
    @Override
    public void view(){
        if(siswaEntityArrayList.size()!=0){
        for(SiswaEntity_07127 siswaEntity : siswaEntityArrayList){
            System.out.println("===============================================");
            System.out.println("No : "+siswaEntity.getNo()+"\n Nama : "+siswaEntity.getNama ()+"\n Password :"+siswaEntity.getPassword()+"\n No.Telp :"+siswaEntity.getNo_telp()+"\n Status :"+siswaEntity.getStatus()+"\n Tanggal Daftar :"+siswaEntity.getTglDaftar());
            System.out.println("===============================================");
            }
        }else {
            System.out.println("Data Kosong");
        }
        }
    @Override
    public int cek (String no,String password){
        int loop = 0;
        while (!siswaEntityArrayList.get(loop).getNo().equals(no)&&!siswaEntityArrayList.get(loop).getPassword().equals(password)){
            loop++;
        }
        return loop;
    }
    
    public void delete(){
        System.out.print("Pilih Index yang Akan dihapus : ");
        int pilIndex = input.nextInt();
        siswaEntityArrayList.remove(pilIndex);
        System.out.print("Data Berhasil Dihapus");
    }
}
