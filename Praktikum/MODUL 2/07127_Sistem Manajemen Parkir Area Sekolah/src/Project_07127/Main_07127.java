package Project_07127;

import Model_07127.SiswaModel_07127;
import Model_07127.AdminModel_07127;
import Model_07127.DaftarKendaraanSiswaModel_07127;
import Entity_07127.KendaraanEntity_07127;
import Entity_07127.DaftarKendaraanSiswaEntity_07127;
import Entity_07127.SiswaEntity_07127;
import Entity_07127.AdminEntity_07127;
import Controller.JenisKendaraanController;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
        
public class Main_07127 {
    private static AdminModel_07127 adminModel = new AdminModel_07127();
    private static Scanner input = new Scanner(System.in);
    private static SiswaModel_07127 siswaModel = new SiswaModel_07127();
    private static DaftarKendaraanSiswaModel_07127 daftarKendaraanModel = new DaftarKendaraanSiswaModel_07127();
    private static JenisKendaraanController kendaraancontroller = new JenisKendaraanController();
    private static int pilMerk;
    static int cekSiswa;
    static int cekAdmin;
    
    public static void main (String[] args) {
        int loop = 0;
        dataAdmin();
        do{
            int pilih = 0;
            System.out.print("** Sistem Manajemen Parkir **"+ 
                    "\n 1. Login" +
                    "\n 2. Daftar"+
                    "\n 0. Berhenti"+
                    "\n Masukkan Pilihan Anda :");
            pilih = input.nextInt();
            if (pilih == 1){
                int pilLogin = 0;
                System.out.print("1. Login Admin "+
                        "\n2. Login Anggota" + 
                        "\nPilih : ");
                pilLogin = input.nextInt();
                if(pilLogin == 1){
                    loginAdmin();
                }else {
                    login();
                }
            }else if (pilih == 1){
                int pilLogin = 0;
        System.out.print("1. Login Admin" + 
                "\n2. Login Siswa" + 
                "\nPilih : ");
                pilLogin = input.nextInt ();
                if (pilLogin ==1) {
                    loginAdmin ();
                }else{
                    login();
                }
            }else if(pilih==2) {
                register ();
            }else if (pilih==3){
                    siswaModel.view();
                    }else if (pilih==4){
                    }else {
                    break;
                    }
            }while (loop!=1);
        }
    
    
        static void dataAdmin(){
            String noAdmin [] = {"01", "02"};
            String passwordAdmin [] = {"01", "02"};
            String namaAdmin [] = {"Petugas_1", "Petugas_2"};
            String notelpAdmin [] = {"111111", "222222"};
            String statusAdmin [] = {"Online","Online"};
            String tglLahir [] = {"10/01/1990", "01/10/1990"};
            for (int i = 0; i<noAdmin.length ; i++){
                adminModel.insertAdmin(new AdminEntity_07127(noAdmin [i], passwordAdmin[i],namaAdmin[i],notelpAdmin[i],statusAdmin[i],new Date (tglLahir[i])));
                }
            }
        static void register (){
            System.out.print("Input No[NIS/NRP] = ");
            String no = input.next();
            System.out.print("Input Nama = ");
            String nama = input.next();
            System.out.print("Input Password = ");
            String pass = input.next();
            System.out.print("Input notelp = ");
            String notelp = input.next();
            System.out.print("Input Tgl Daftar dd/mm/yyyy = ");
            Date tanggal = new Date(input.next());
            System.out.print("Status [Siswa/Guru]= ");
            String status = input.next();
            siswaModel.insert(new SiswaEntity_07127(no,pass,nama,notelp,status,tanggal));
            System.out.print("Data Berhasil Di Simpan !!\n");
        }
        
        
        static void login (){
            System.out.println("");
            System.out.print("No[NIS/NRP] : ");
            String no = input.next();
            System.out.print("Password : ");
            String password = input.next();
            cekSiswa = siswaModel.cek(no,password);
            System.out.println("\nSELAMAT DATANG "+siswaModel.getSiswaEntityArrayList(cekSiswa).getNama()+" di SISTEM MANAJEMEN PARKIR");
            int cekData = daftarKendaraanModel.cek(no,password);
            if(cekData == -1){
                System.out.println("Masukan Data :");
                System.out.print("");
                daftarMerk();
            }else if (cekData == -2){
                System.out.println("Masukan Data");
                System.out.print("");
                daftarMerk();
            }else {
                System.out.println("Nama ="+daftarKendaraanModel.showDaftarKendaraan(cekSiswa).getSiswa().getNama());
                System.out.println("NPM = "+daftarKendaraanModel.showDaftarKendaraan(cekSiswa).getSiswa().getNo());
                System.out.println("No Telp = "+daftarKendaraanModel.showDaftarKendaraan(cekSiswa).getSiswa().getNo_telp());
                System.out.println("Merk = "+KendaraanEntity_07127.merk[daftarKendaraanModel.showDaftarKendaraan(cekSiswa).getIndexKendaraan()]);
                System.out.println("isVerified = "+daftarKendaraanModel.showDaftarKendaraan(cekSiswa).isVerified());
            }
        }

        
        static void daftarMerk(){
            System.out.println("Pilih Merk = ");
            for (int i= 0; i<KendaraanEntity_07127.merk.length;i++){
                System.out.println(i+". "+KendaraanEntity_07127.merk[i]);
            }
            System.out.print("Pilih Merk = ");
                pilMerk = input.nextInt();
            daftarKendaraanModel.insertDataDaftarKendaraan(new DaftarKendaraanSiswaEntity_07127(pilMerk,siswaModel.getSiswaEntityArrayList(cekSiswa),false));
        }
        
        
                
        static void loginAdmin(){
            System.out.print("No : ");
            String no = input.next();
            System.out.print("Password :");
            String password = input.next();
            cekAdmin =adminModel.cek(no,password);
            System.out.print("");
            System.out.println("Selamat Datang "+adminModel.showDataAdmin(cekAdmin).getNama()+
                    " Selamat Bertugas!!!");
            System.out.print("");
            
            System.out.println("**MENU ADMIN**");
            siswaModel.view();
            System.out.print("Pilihan :"+
                             "\n 1. Verifikasi Data Parkir:"+
                             "\n 2. Hapus Data Parkir:");
            System.out.print("\n Pilih Menu :");
            int pilih = input.nextInt();
                if(pilih==1){
                    System.out.println("Menu Update Data:");
                    updateIsverified();
                }else{               
                siswaModel.delete();
                }
        }
        
        
        static void updateIsverified (){
            System.out.print("No [NIS/NRP] = ");
            String no = input.next();
            System.out.print("Data DiVerifikasi");
            System.out.print("");
            int index = daftarKendaraanModel.cek(no, null);
            daftarKendaraanModel.updateIsVerified(index, new DaftarKendaraanSiswaEntity_07127(pilMerk,siswaModel.getSiswaEntityArrayList(index),true));            
        }
    }

