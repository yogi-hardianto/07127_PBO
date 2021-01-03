package npm07127modul3;

import Entity.*;
import Controller.*;
import java.util.Scanner;

public class NPM07127Modul3 {
   Yogi07127_SiswaController siswa_c = new Yogi07127_SiswaController();
   Yogi07127_AdminController admin_c = new Yogi07127_AdminController();
   Yogi07127_KendaraanController kendaraan_c = new Yogi07127_KendaraanController();
   Yogi07127_KategoriEntity kategori= new Yogi07127_KategoriEntity();
   Scanner input = new Scanner(System.in);

  
    public static void main(String[] args) {
         NPM07127Modul3 app = new NPM07127Modul3();
        app.Menu();
    }
    
    public void Menu(){
        System.out.println("Selamat Datang Di Sistem Manajemen Parkir ITATS :");
       int pil;

               
       do{
           System.out.println("------------------------");
           System.out.println("1. Daftar Anggota");
           System.out.println("2. Login");
           System.out.println("3. Berhenti");
           System.out.print("Pilih = ");
           pil = input.nextInt();
           System.out.println("------------------------");
           switch(pil){
               case 1:
                  register();
                   break;
               case 2:
                   int pilLogin;
               System.out.print("1. Login Admin" + "\n2. Login Anggota"+
                       "\nPilih : ");
                       pilLogin = input.nextInt();
                       System.out.print("No ID = ");
                            String no = input.next();
                            System.out.print("Password = ");
                            String pass = input.next();
                       if(pilLogin == 1){
                            admin_c.DataAdmin();
                            LoginAdmin(no, pass);
                            break;
                       }else{
                            Login(no, pass);
                            
                            break;
                       }
                             
           }
       }while(pil!=3);
    }
    
    
    
    public void Login (String no, String pass){
    
            boolean isLogin = false;
        int i;
        for (i = 0; i < siswa_c.getListSiswa().size(); i++) {
            if(no.equals(siswa_c.getListSiswa().get(i).getNo()) && pass.equals(siswa_c.getListSiswa().get(i).getPassword())){
                isLogin = true;
                break;
            }else{
                isLogin = false;
            }
        }
        try{
        if(isLogin){
            System.out.println("");
            System.out.println("Selamat Datang " + siswa_c.getListSiswa().get(i).getNama()+ " Di Sistem Manajemen Parkir ITATS !!");
            menuSiswa();
        }else{
            System.out.println("Username Atau Password Salah\n");
        }
        }catch (Exception exception){
            System.out.println("NPM atau Password Anda Salah !!");
        }
        }
    
    public void LoginAdmin(String no, String pass){
    
            boolean isLogin = false;
        int i;
        for (i = 0; i < admin_c.admin_m.getAdmin().size(); i++) {
            if(no.equals(admin_c.admin_m.getAdmin().get(i).getNo()) && pass.equals(admin_c.admin_m.getAdmin().get(i).getPassword())){
                isLogin = true;
                break;
            }else{
                isLogin = false;
            }
        }      
        if(isLogin){
            System.out.println("");
            System.out.println("Selamat Datang "+admin_c.getListAdmin().get(i).getNama()+
                    " Selamat Bertugas!!!");
            System.out.println("------------------------");
            MenuAdmin();
        }else{
            System.out.println("Username Atau Password Salah\n");
        }       
        }
            
   
     public void register(){
        System.out.print("Input No = ");
        String no = input.next();
        System.out.print("Input Nama = ");
        String nama = input.next();
        System.out.print("Input Alamat = ");
        String alamat = input.next();
        System.out.print("Input No telp = ");
        String no_telp = input.next();
        System.out.print("Input Password = ");
        String pass = input.next();  
        System.out.print("Input Npm = ");
        String npm = input.next();
       siswa_c.insertSiswa(no, nama, alamat, no_telp, pass, npm);
        
    }
     public void addData(){
        
        for(int i=0;i<kategori.kategoripilkend.length;i++){
        System.out.println(i+"."+kategori.kategoripilkend[i]);
        }
        System.out.println("Pilih kategori Kendaraan = ");
        int indexpil = input.nextInt();
        System.out.print("Input Merk = ");
        String merk = input.next(); 
        System.out.print("Input Jenis = ");
        String jenis = input.next();
        System.out.print("Input Tahun Kendaraan = ");
        String tahun = input.next();
        System.out.print("Input Nopol = ");
        String nopol = input.next();
        kendaraan_c.insertData(merk,jenis, tahun, nopol, indexpil);
        System.out.print("Data Berhasil Disimpan !!\n");
    }
    
    public void menuSiswa(){
        int pil;
        do{
            System.out.println("------------------------");
            System.out.println("=== Menu Data ====");
            System.out.println("1. Tambah Data");
            System.out.println("2. Lihat Data");
            System.out.println("0. Keluar");
            System.out.print("Pilih : ");
            pil = input.nextInt();
            System.out.println("------------------------");

            switch(pil){
                case 1 :
                    addData();
                    break;
                case 2 : 
                    viewListKendaraan();
                    break;
                case 3:
                    
                    break;
    }
        }while (pil!=0);
        }
     
        
    public void viewListKendaraan(){
    
        if(kendaraan_c.getListKendaraan().size()>0){
            int no = 0;
            for (int i = 0; i < kendaraan_c.getListKendaraan().size(); i++) {
                no++;
                System.out.println("Pemilik = "+siswa_c.getListSiswa().get(i).getNama());
                System.out.println("[Kendaraan " + no + "]");
                System.out.println("kategori = "+kategori.kategoripilkend[kendaraan_c.getListKendaraan().get(i).getIndexpilkend()]);
                System.out.println("Merk = "+kendaraan_c.getListKendaraan().get(i).getMerk());
                System.out.println("Jenis Kendaraan ="+kendaraan_c.getListKendaraan().get(i).getJenis());
                System.out.println("Tahun Kendaraan = "+kendaraan_c.getListKendaraan().get(i).getTahunkendaraan());
                System.out.println("Nopol = "+kendaraan_c.getListKendaraan().get(i).getNopol());      
            }
        }else{
            System.out.println("Data Kosong");
        }
    }
    
    public void update(){
        if(kendaraan_c.getListKendaraan().size()>0){
            for (int i = 0; i < kendaraan_c.getListKendaraan().size(); i++) {
                System.out.println("["+i+"] "+kendaraan_c.getListKendaraan().get(i).getMerk());
            }
             
            System.out.print("Pilih Index Kendaraan : ");
            int pilIndex = input.nextInt();
          
        for(int i=0;i<kategori.kategoripilkend.length;i++){
        System.out.println(i+"."+kategori.kategoripilkend[i]);
        }
        System.out.println("Pilih kategori = ");
        int indexpil = input.nextInt();
        System.out.print("Input Merk = ");
        String merk = input.next();
        System.out.print("Input Jenis = ");
        String jenis = input.next();
        System.out.print("Input Tahun Kendaraan= ");
        String tahun = input.next();
        System.out.print("Input Nopol = ");
        String nopol = input.next();
            kendaraan_c.updateData(merk,jenis, tahun, nopol, indexpil);
            
            System.out.print("Data Berhasil Diubah !!\n");
        }else{
            System.out.println("Data Kosong\n");
        }
    }
    
   public void delete(){
        if(kendaraan_c.getListKendaraan().size()>0){
            for (int i = 0; i < kendaraan_c.getListKendaraan().size(); i++) {
                System.out.println("Pemilik = "+siswa_c.getListSiswa().get(i).getNama());
                System.out.println("["+i+"] "+kendaraan_c.getListKendaraan().get(i).getMerk());
            }
            
            System.out.print("Pilih Index : ");
            int pilIndex = input.nextInt();
            
            kendaraan_c.deleteData(pilIndex);
            System.out.print("Data Berhasil Dihapus !!\n");
        }else{
            System.out.println("Data Kosong\n");
        }
    }
    public void viewSiswa(){
         if(siswa_c.getListSiswa().size()>0){
            int no = 0;
            System.out.println("List Daftar Siswa");
            for (int i = 0; i < siswa_c.getListSiswa().size(); i++) {
                no++;
                System.out.print("[ "+ no + " ]: " +siswa_c.getListSiswa().get(i).getNama());
                System.out.println( " NPM : " +siswa_c.getListSiswa().get(i).getNPM());
            }
        }else{
             System.out.println("List Daftar Kosong");
         }
    }
    
    public void MenuAdmin(){
        int pil;
        viewSiswa();
        do{
            System.out.println("------------------------");
            System.out.println("=== Menu Data Buku ====");
            System.out.println("1. Lihat Data");
            System.out.println("2. Ubah Data");
            System.out.println("3. Hapus Data");
            System.out.println("0. Keluar");
            System.out.print("Pilih : ");
            pil = input.nextInt();
            System.out.println("------------------------");

            switch(pil){
                case 1 : 
                    viewListKendaraan();
                    break;
                case 2 : 
                    update();
                    break;
                case 3 : 
                    delete();
                    break;
            }
        }while (pil!=0);
    }
}
