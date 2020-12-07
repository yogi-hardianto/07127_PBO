package Entity_07127;

public class DaftarKendaraanSiswaEntity_07127 {
    private SiswaEntity_07127 siswa;
    private boolean isVerified;
    private int indexKendaraan;
    
public DaftarKendaraanSiswaEntity_07127(int indexKendaraan,SiswaEntity_07127 siswa,boolean isVerified) {
    this.siswa = siswa;
    this.isVerified = isVerified;
    this.indexKendaraan = indexKendaraan;
}
public SiswaEntity_07127 getSiswa (){
    return siswa;
}
public void setSiswa(SiswaEntity_07127 siswa){
    this.siswa = siswa;
}
public boolean isVerified(){
    return isVerified;
}
public void setVerified (boolean verified) {
    isVerified = verified;
}
public int getIndexKendaraan() {
    return indexKendaraan;
}
public void setIndexKendaraan(int indexKendaraan){
    this.indexKendaraan = indexKendaraan;
}
}
