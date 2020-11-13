
package YogiSI_Manajemen_parkir;
import java.util.ArrayList;
import java.util.Scanner;

public class Yogi07127_MainSIParkir {
    ArrayList <Yogi07127_SiswaEntity> yogi07127_dataSiswa = new ArrayList();
    ArrayList <Yogi07127_KendaraanEntity> yogi07127_dataKendaraan = new ArrayList();
    Scanner yogi07127_input = new Scanner(System.in);
    
    public static void main(String args[]) {
        System.out.print("SELAMAT DATANG DI SEKOLAH MAJU MUNDUR !! ");
        int yogi07127_pil;
        Yogi07127_MainSIParkir yogi = new Yogi07127_MainSIParkir ();
        Scanner input = new Scanner(System.in);
        do{
           System.out.println(" ");
           System.out.println("***** MENU ***** ");
           System.out.println("1. Daftar");
           System.out.println("2. Login");
           System.out.println("3. Exit");
           System.out.println("Pilih = ");
           yogi07127_pil= input.nextInt();
           switch(yogi07127_pil){
               case 1:
                    yogi.yogi07127_Daftar();
                    break;
               case 2:
                   System.out.println("NIS = ");
                   String yogi07127_nis = input.next();
                   System.out.println("Password = ");
                   String yogi07127_password = input.next();
                   yogi.yogi07127_Login(yogi07127_nis,yogi07127_password);
           }
        }while(yogi07127_pil != 3);
    }
    
    void yogi07127_Daftar(){
        System.out.println("Input NIS = ");
        String yogi07127_nis = yogi07127_input.next();
        System.out.println("Input Nama = ");
        String yogi07127_nama = yogi07127_input.next();
        System.out.println("Input Password = ");
        String yogi07127_password = yogi07127_input.next();
        System.out.println("Input Alamat = ");
        String yogi07127_alamat = yogi07127_input.next();
        System.out.println("Input No Telepon = ");
        String yogi07127_notelp = yogi07127_input.next();
        
        yogi07127_dataSiswa.add(new Yogi07127_SiswaEntity(yogi07127_nis,yogi07127_nama,yogi07127_password,yogi07127_alamat,yogi07127_notelp));
        System.out.print("Data Berhasil Di Simpan !!\n");
    }
    
    void yogi07127_Login(String yogi07127_nis, String yogi07127_password){
        boolean yogi07127_cekLogin = false;
        int yogi07127_j;
        
        for(yogi07127_j=0;yogi07127_j<yogi07127_dataSiswa.size();yogi07127_j++){
           
         if(yogi07127_nis.equals(yogi07127_dataSiswa.get(yogi07127_j).Yogi07127_getNis()) && yogi07127_password.equals(yogi07127_dataSiswa.get(yogi07127_j).Yogi07127_getPassword())){
             yogi07127_cekLogin = true;
             break;
        }else{
             yogi07127_cekLogin = true;
             break;
            }
        }
        
        //get index login
        if(yogi07127_cekLogin){
            System.out.println("");
            System.out.println("Hallo "+yogi07127_dataSiswa.get(yogi07127_j).Yogi07127_getNama()+" Selamat Datang di Sekolah Maju Mundur!!");
            Yogi07127_MenuAwal();
        }else{
            System.out.print("Maaf Password atau ID SALAH!!");
        }
    }
    
    void Yogi07127_MenuAwal(){
        Yogi07127_MainSIParkir  yogi1 = new Yogi07127_MainSIParkir ();
        int yogi07127_pilih;
        do{
             System.out.println("===== PILIHAN =====");
             System.out.println("1. Tambah ");
             System.out.println("2. Lihat ");
             System.out.println("3. Ubah ");
             System.out.println("4. Hapus ");
             System.out.println("5. Keluar ");
             System.out.println("Pilih : ");
             yogi07127_pilih = yogi07127_input.nextInt();
             
             switch(yogi07127_pilih){
                case 1 :
                    Yogi07127_TambahData();
                    break;
                case 2 : 
                    Yogi07127_LihatData();
                    break;
                case 3 : 
                    Yogi07127_UbahData();
                    break;
                case 4 : 
                    Yogi07127_Hapus();
                    break;
                }  
             }while(yogi07127_pilih != 5);

    }
    void Yogi07127_TambahData(){
        System.out.println("Masukkan Nis = ");
        String yogi07127_nomer = yogi07127_input.next();
        
        System.out.println("Masukkan Merk Kendaraan = ");
        String yogi07127_merk = yogi07127_input.next();
        
        System.out.println("Masukkan Nomer Polisi = ");
        String yogi07127_nopol = yogi07127_input.next();
        
        System.out.println("Masukkan Warna = ");
        String yogi07127_warna = yogi07127_input.next();
        
        
        yogi07127_dataKendaraan.add(new Yogi07127_KendaraanEntity(yogi07127_nomer, yogi07127_merk, yogi07127_nopol, yogi07127_warna));
        System.out.println("Data Berhasil Disimpan !!\n");
    }
    
    void Yogi07127_LihatData(){
        if(yogi07127_dataKendaraan.size()>0){
            int yogi07127_noUrut = 0;
            for (int j = 0; j < yogi07127_dataKendaraan.size(); j++) {
                yogi07127_noUrut++;
                System.out.println("[Merk " + yogi07127_noUrut + "]");
                System.out.println(yogi07127_dataKendaraan.get(j).Yogi07127_getnomer());
                System.out.println(yogi07127_dataKendaraan.get(j).Yogi07127_getmerk());
                System.out.println(yogi07127_dataKendaraan.get(j).Yogi07127_getnopol());
                System.out.println(yogi07127_dataKendaraan.get(j).Yogi07127_getwarna());
                System.out.println("-------------------------");
            }
        }else{
            System.out.println("Data Kosong");
        }
    }
    void Yogi07127_UbahData(){
        if(yogi07127_dataKendaraan.size()>0){
            for (int j = 0; j < yogi07127_dataKendaraan.size(); j++) {
                System.out.println("["+j+"] "+yogi07127_dataKendaraan.get(j).Yogi07127_getmerk());
            }
             
            System.out.println("Pilih Index Kendaraan : ");
            int selectIndex = yogi07127_input.nextInt();
            
            // Update            
            System.out.println("Masukkan Nomer : ");
            String yogi07127_nomer = yogi07127_input.next();

            System.out.println("Masukkan Merk : ");
            String yogi07127_merk = yogi07127_input.next();

            System.out.println("Masukkan Nomer Polisi : ");
            String yogi07127_nopol = yogi07127_input.next();

            System.out.println("Masukkan Warna Kendaraan = ");
            String yogi07127_warna = yogi07127_input.next();

            yogi07127_dataKendaraan.set(selectIndex, new Yogi07127_KendaraanEntity(yogi07127_nomer, yogi07127_merk, yogi07127_nopol, yogi07127_warna));
            System.out.println("Data Berhasil Diubah !!\n");
        }else{
            System.out.println("Data Kosong\n");
        }
    }
    void Yogi07127_Hapus(){
        if(yogi07127_dataKendaraan.size()>0){
            for (int j = 0; j < yogi07127_dataKendaraan.size(); j++) {
                System.out.println("["+j+"] "+yogi07127_dataKendaraan.get(j).Yogi07127_getmerk());
            }
            
            System.out.println("Pilih Index Kendaraan : ");
            int selectIndex = yogi07127_input.nextInt();
            
            yogi07127_dataKendaraan.remove(selectIndex);
            System.out.print("Data Berhasil Dihapus !!\n");
        }else{
            System.out.println("Data Kosong\n");
        }
    }
}
