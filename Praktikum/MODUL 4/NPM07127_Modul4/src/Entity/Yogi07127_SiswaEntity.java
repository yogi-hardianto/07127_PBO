package Entity;

public class Yogi07127_SiswaEntity extends Yogi07127_WargaAbstractEntity{
    private String password,NPM;
    
    public Yogi07127_SiswaEntity(String no,String nama, String alamat, String no_telp, 
            String password, String NPM){
        super(no, nama, alamat, no_telp);
        this.password = password;
        this.NPM = NPM;
    }
    public Yogi07127_SiswaEntity(){
        
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    public String getNPM(){
        return this.NPM;
    }
    public void setNPM(String NPM){
        this.NPM = NPM;
    }
    
    @Override
    public String getNo(){
        return this.no;
    }
    
    public String getPassword(){
        return this.password;
    }
}