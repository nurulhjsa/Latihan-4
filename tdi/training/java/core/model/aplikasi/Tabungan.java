package tdi.training.java.core.model.aplikasi;

import java.math.BigDecimal;

public class Tabungan
{
    private Double sukuBunga;
    private BigDecimal saldo;
    private BigDecimal akrual;
    private String kriteriaProduct;

    public Tabungan() {

    }
    
    public Tabungan (Double sukuBunga, BigDecimal saldo, BigDecimal akrual, String kriteriaProduct){
        this.sukuBunga = sukuBunga;
        this.saldo = saldo;
        this.akrual = akrual;
        this.kriteriaProduct = kriteriaProduct;
    }

    public Double getSukuBunga(){
        return this.sukuBunga;
    }

    public void setSukuBunga(Double sukuBunga){
        this.sukuBunga = sukuBunga;
    }

    public BigDecimal getSaldo(){
        return this.saldo;
    }

    public void setSaldo(BigDecimal saldo){
        this.saldo = saldo;
    }

    public BigDecimal getAkrual(){
        return this.akrual;
    }

    public void setAkrual(BigDecimal akrual){
        this.akrual = akrual;
    }

    public String getKriteriaProduct(){
        return this.kriteriaProduct;
    }

    public void setKriteriaProduct(String kriteriaProduct){
        this.kriteriaProduct = kriteriaProduct;
    }
}