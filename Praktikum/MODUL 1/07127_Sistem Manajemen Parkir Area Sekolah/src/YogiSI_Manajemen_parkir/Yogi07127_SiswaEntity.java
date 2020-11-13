/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package YogiSI_Manajemen_parkir;

import java.util.Date;

/**
 *
 * @author yogi
 */
public class Yogi07127_SiswaEntity {
    String yogi07127_nis,yogi07127_nama,yogi07127_alamat,yogi07127_password,yogi07127_notelp;

    public Yogi07127_SiswaEntity(String yogi07127_nis, String yogi07127_nama, String yogi07127_alamat, String yogi07127_password, String yogi07127_notelp) {
        this.yogi07127_nis = yogi07127_nis;
        this.yogi07127_nama = yogi07127_nama;
        this.yogi07127_alamat = yogi07127_alamat;
        this.yogi07127_password = yogi07127_password;
        this.yogi07127_notelp = yogi07127_notelp;
    }

    String Yogi07127_getNis() {
        return yogi07127_nis;
    }

    String Yogi07127_getNama() {
        return yogi07127_nama;
    }

    String Yogi07127_getAlamat() {
        return yogi07127_alamat;
    }

    String Yogi07127_getPassword() {
        return yogi07127_password;
    }

    String Yogi07127_getNotelp() {
        return yogi07127_notelp;
    }

    
    
    
    
}
