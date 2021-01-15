package Entity;

public class Yogi07127_AdminEntity extends Yogi07127_WargaAbstractEntity {
    private String password;
    
    public Yogi07127_AdminEntity(String no, String password, String nama,String alamat, String no_telp ){
        super(no, nama, alamat, no_telp);
        this.password = password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    
    @Override
    public String getNo(){
        return this.no;
    }
    
    public String getPassword(){
        return this.password;
    }
}
