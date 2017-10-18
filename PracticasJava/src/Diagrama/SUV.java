
package Diagrama;

public class SUV extends AutomovilGasolina {

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the subMarca
     */
    public String getSubMarca() {
        return subMarca;
    }

    /**
     * @param subMarca the subMarca to set
     */
    public void setSubMarca(String subMarca) {
        this.subMarca = subMarca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the numeroPuertas
     */
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    /**
     * @param numeroPuertas the numeroPuertas to set
     */
    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    private String marca;
    private String subMarca;
    private String modelo;
    private int numeroPuertas;
}
