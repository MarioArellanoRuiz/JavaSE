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
public class Refrigerador implements Clavija{
    private int temperatura;
    private CajaFrutas cajaFrutas;
    private CajaVerduras cajaVerduras;

    public CajaFrutas getCajaFrutas() {
        return cajaFrutas;
    }
    
    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public void setCajaFrutas(CajaFrutas cajaFrutas) {
        this.cajaFrutas = cajaFrutas;
    }

    public CajaVerduras getCajaVerduras() {
        return cajaVerduras;
    }

    public void setCajaVerduras(CajaVerduras cajaVerduras) {
        this.cajaVerduras = cajaVerduras;
    }

    @Override
    public void conectarse() {
    
        
    }
}
