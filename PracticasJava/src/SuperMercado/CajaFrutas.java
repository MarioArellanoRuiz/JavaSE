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
public class CajaFrutas {
    private Papaya [] papayas;
    private Sandia [] sandias;
    private Banana [] bananas;

    public Papaya[] getPapayas() {
        return papayas;
    }

    public void setPapayas(Papaya[] papayas) {
        this.papayas = papayas;
    }

    public Sandia[] getSandias() {
        return sandias;
    }

    public void setSandias(Sandia[] sandias) {
        this.sandias = sandias;
    }

    public Banana[] getBananas() {
        return bananas;
    }

    public void setBananas(Banana[] bananas) {
        this.bananas = bananas;
    }
    
    public void mostrarFrutas(){
        for (Papaya papaya : papayas) {
            System.out.println(papaya.toString()+" Expira:"+papaya.getExpiracion());
        }
        for (Banana banana : bananas) {
            System.out.println(banana.toString()+" Expira:" + banana.getExpiracion());
        }
        for (Sandia sandia : sandias) {
            System.out.println(sandia.toString()+"Expira:" + sandia.getExpiracion());
        }
    }
}
