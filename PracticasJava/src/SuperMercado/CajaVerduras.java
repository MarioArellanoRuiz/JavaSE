/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperMercado;

/**
 *
 * @author mario
 */
public class CajaVerduras {
    private Chayote[] chayotes;
    private Zanahoria[] zanahorias;

    public Chayote[] getChayotes() {
        return chayotes;
    }

    public void setChayotes(Chayote[] chayotes) {
        this.chayotes = chayotes;
    }

    public Zanahoria[] getZanahorias() {
        return zanahorias;
    }

    public void setZanahorias(Zanahoria[] zanahorias) {
        this.zanahorias = zanahorias;
    }
    public void mostrarVerduras(){
        for (Chayote chayote : chayotes) {
            System.out.println(chayote.toString() + "Experia:"+chayote.getExpiracion());
        }
        for (Zanahoria zanahoria : zanahorias) {
            System.out.println(zanahoria.toString()+"Expira: "+zanahoria.getExpiracion());
        }
    }
    
       
}
