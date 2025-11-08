package org.example.model;

/**
 * Clase principal que representa a una persona en el sistema {@code SistemaSalmontt}.
 * <p>
 * Se relaciona con otras clases por composición, {@link Direccion} y {@link Contrato}.
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String rut;
    private String email;
    private String telefono;
    private Direccion direccion;
    private Contrato contrato;

    /**
     * Constructor de {@code Persona}
     * <p>
     * @param nombre Nombre de la persona.
     * @param apellido Apellido de la persona.
     * @param rut RUT.
     * @param email Correo electrónico.
     * @param telefono Número de teléfono.
     * @param direccion Dirección objeto.
     * @param contrato Contrato objeto.
     */
    public Persona(String nombre, String apellido, String rut, String email, String telefono, Direccion direccion, Contrato contrato) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
        this.contrato = contrato;
    }

    //Métodos de acceso Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    /**
     * Muestra la información completa de la persona, su dirección y contrato en forma legible.
     * @return texto con los datos personales de la persona, dirección y contrato.
     */
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
                "Apellido: " + apellido + "\n" +
                "Rut: " + rut + "\n" +
                "Email: " + email + "\n" +
                "Telefono: " + telefono + "\n\n" +
                "===Direccion===\n" + direccion + "\n\n" +
                "===Contrato===\n" + contrato + "\n";
    }
}
