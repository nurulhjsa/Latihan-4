package  tdi.training.java.core.model.nasabah;

import java.math.BigDecimal;

public class Nasabah
{
    private String noIdentitas;
    private boolean active;
    private BigDecimal saldo; 

    public String getNoIdentitas(){
        return this.noIdentitas;
    }

    public void setNoIdentitas(String noIdentitas){
        this.noIdentitas = noIdentitas;
    }

    public boolean getActive(){
        return this.active;
    }

    public void setActive(boolean active){
        this.active = active;
    }

    public BigDecimal getSaldo(){
        return this.saldo;
    }

    public void setSaldo(BigDecimal saldo){
        this.saldo = saldo;
    }
}
