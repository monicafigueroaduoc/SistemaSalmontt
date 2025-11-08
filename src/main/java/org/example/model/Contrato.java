package org.example.model;

/**
 * Representa un contrato laboral asociado a una {@link Persona}.
 * <p>
 * Contiene información sobre el tipo de contrato, el cargo y el salario mensual.
 * <p>
*  Esta clase forma parte de una relación de composición {@code Persona tiene un Contrato}
 */
public class Contrato {
    private String tipoContrato;
    private String cargo;
    private double salario;

    /**
     * Constructor para inicializar un contrato
     * @param tipoContrato Tipo de contrato de trabajo.
     * @param cargo Cargo que desempeña la persona dentro de la empresa.
     * @param salario Salario mensual en pesos chilenos.
     */
    public Contrato(String tipoContrato, String cargo, double salario) {
        this.tipoContrato = tipoContrato;
        this.cargo = cargo;
        this.salario = salario;
    }

    //Métodos de acceso Getters y Setters

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Muestra la información completa del contrato,
     * incluye tipo de contrato, cargo y salario mensual en forma legible.
     * @return texto formateado con los datos del contrato.
     */
    @Override
    public String toString() {
        return "Tipo de Contrato: " + tipoContrato + "\n" +
                "Cargo: " + cargo + "\n" +
                "Salario: $" + salario;
    }
}
