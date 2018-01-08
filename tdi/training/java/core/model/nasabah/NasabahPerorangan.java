package tdi.training.java.core.model.nasabah;

import tdi.training.java.core.model.aplikasi.Tabungan;
import java.math.BigDecimal;

public class NasabahPerorangan extends Nasabah
{
    private String namaLengkap;
    private String alamatRumah;
    private String nomorHp;
    private String foto;
    private Tabungan tabungan;

    public String getNamaLengkap(){
        return this.namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap){
        this.namaLengkap = namaLengkap;
    }

    public String getAlamatRumah(){
        return this.alamatRumah;
    }

    public void setAlamatRumah(String alamatRumah){
        this.alamatRumah = alamatRumah;
    }

    public String getNomorHp(){
        return this.nomorHp;
    }

    public void setNomorHp(String nomorHp){
        this.nomorHp = nomorHp;
    }

    public String getFoto(){
        return this.foto;
    }

    public void setFoto(String foto){
        this.foto = foto;
    }

    public Tabungan getTabungan(){
        return this.tabungan;
    }

    public void setTabungan(Tabungan tabungan){
        this.tabungan = tabungan;
    }

    public NasabahPerorangan(String noIdentitas, String namaLengkap, String alamatRumah, String nomorHp){
        this.namaLengkap = namaLengkap;
        this.alamatRumah = alamatRumah;
        this.nomorHp = nomorHp;
        super.setNoIdentitas(noIdentitas);
        super.setActive(false);
        super.setSaldo(BigDecimal.ZERO);
        this.tabungan = new Tabungan(0.1d, new BigDecimal(0), new BigDecimal(0), "Tabungan Mapan");
    }

    @Override
    public String toString(){
        return String.format("nasabah [noIdentitas: %s, status: %s, nama lengkap: %s, saldo: %s]",
                super.getNoIdentitas(), super.getActive(), this.getNamaLengkap(), super.getSaldo());
    }
}