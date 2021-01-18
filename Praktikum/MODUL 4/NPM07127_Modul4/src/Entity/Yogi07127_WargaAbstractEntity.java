package Entity;
public abstract class Yogi07127_WargaAbstractEntity {
    protected String no, nama, alamat, no_telp;
    
    public Yogi07127_WargaAbstractEntity(String no, String nama, String alamat, String no_telp){
        this.no = no;
        this.nama = nama;
        this.alamat = alamat;
        this.no_telp = no_telp;
    }
    
    public Yogi07127_WargaAbstractEntity(){
       
    }
    public abstract String getNo();
    
    // Setter       
    public void setNo(String no){
        this.no = no;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public void setNoTelp(String no_telp){
        this.no_telp = no_telp;
    }
    
    // Selector / Getter
    public String getNama(){
        return this.nama;
    }
    
    public String getAlamat(){
        return this.alamat;
    }
    
    public String getNoTelp(){
        return this.no_telp;
    }
}


