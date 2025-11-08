package org.example.model;

/**
 * La clase @code Direccion representa la ubicación física
 * asociada a una {@link Persona}.
 * <p>
 * Contiene información como calle, número, comuna, ciudad, región y código postal.
 * Es parte de una relación de composición {@code Persona tiene una Direccion.}
 */
public class Direccion {

    private String calle;
    private int numero;
    private String comuna;
    private String ciudad;
    private String region;
    private String codigoPostal;

    /**
     * Constructor para inicializar una dirección.
     * <p>
     * @param calle Nombre de la calle.
     * @param numero Número de la vivienda.
     * @param comuna Comuna.
     * @param ciudad Ciudad.
     * @param region Región.
     * @param codigoPostal Código Postal.
     */
    public Direccion(String calle, int numero, String comuna, String ciudad, String region, String codigoPostal) {

        this.calle = calle;
        this.numero = numero;
        this.comuna = comuna;
        this.ciudad = ciudad;
        this.region = region;
        this.codigoPostal = codigoPostal;
    }

    //Métodos de acceso Getters y Setters
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    /**
     * Muestra la información completa de la dirección en forma legible.
     * @return texto con los datos de la dirección.
     */
    @Override
    public String toString() {
        return  "Calle: " + calle + " " + numero + "\n" +
                "Comuna: " + comuna + "\n" +
                "Ciudad: " + ciudad + "\n" +
                "Region: " + region + "\n" +
                "Codigo Postal: " + codigoPostal;
    }
}
