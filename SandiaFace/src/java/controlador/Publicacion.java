/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author mario
 */
public class Publicacion {

    private int rsId = 0;
    private String rsContent = "";
    private int rsControl = 0;

    public int getRsId() {
        return rsId;
    }

    public void setRsId(int rsId) {
        this.rsId = rsId;
    }

    public String getRsContent() {
        return rsContent;
    }

    public void setRsContent(String rsContent) {
        this.rsContent = rsContent;
    }

    public int getRsControl() {
        return rsControl;
    }

    public void setRsControl(int rsControl) {
        this.rsControl = rsControl;
    }

}
