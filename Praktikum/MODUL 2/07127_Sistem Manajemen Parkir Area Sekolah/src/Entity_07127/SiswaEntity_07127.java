package Entity_07127;

import java.util.Date;
public class SiswaEntity_07127 extends WargaSekolahAbstractEntity_07127   {
    public SiswaEntity_07127(String no,String password,String nama,String no_telp,String status,Date TglDaftar){
        super(no,password,nama,no_telp,status,TglDaftar);
    }
    @Override
    public String getNo(){
        return no;
    }
}
