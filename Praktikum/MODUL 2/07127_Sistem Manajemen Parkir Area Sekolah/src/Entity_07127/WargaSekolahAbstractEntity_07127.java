package Entity_07127;

import java.util.Date;

public abstract class WargaSekolahAbstractEntity_07127 {
    protected String no,password,nama,no_telp,status;
    protected Date tglDaftar;
    public WargaSekolahAbstractEntity_07127 (String no, String password, String nama, String no_telp,String status,Date tglDaftar){
    this.no =no;
    this.password =password;
    this.nama = nama;
    this.no_telp = no_telp;
    this.status = status;
    this.tglDaftar = tglDaftar;
}

public WargaSekolahAbstractEntity_07127 (){
}
public abstract String getNo ();

public void setNo (String no){
    this.no = no;
}
   
public String getPassword (){
    return password;
}

public void setPassword (String password){
    this.password = password;
}

public String getNama(){
    return nama;
}

public void setNama(String nama){
    this.nama = nama;
}

public String getNo_telp (){
    return no_telp;
}

public void setNo_telp (String no_telp){
    this.no_telp = no_telp;
}

public String getStatus() {
    return status;
    }

public void setStatus(String status) {
    this.status = status;
    }

public Date getTglDaftar() {
        return tglDaftar;
    }

public void setTglDaftar(Date tglDaftar) {
        this.tglDaftar = tglDaftar;
    }


}
