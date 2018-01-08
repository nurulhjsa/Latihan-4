package tdi.training.java.core.model.nasabah;

import tdi.training.java.core.model.aplikasi.Tabungan;

public class NasabahBadanUsaha
{
    private String namaInstitusi;
    private String nomorNpwp;
    private String alamatKantor;
    private Tabungan tabungan; 

    public String getNamaInstitusi(){
        return this.namaInstitusi;
    }

    public void setNamaInstitusi(String namaInstitusi){
        this.namaInstitusi = namaInstitusi;
    }

    public String getNomorNpwp(){
        return this.nomorNpwp;
    }

    public void setNomorNpwp(String nomorNpwp){
        this.nomorNpwp = nomorNpwp;
    }

    public String getAlamatKantor(){
        return this.alamatKantor;
    }

    public void setAlamatKantor(String alamatKantor){
        this.alamatKantor = alamatKantor;
    }

    public Tabungan getTabungan(){
        return this.tabungan;
    }

    public void setTabungan(Tabungan tabungan){
        this.tabungan = tabungan;
    }    
}