package mx.com.capacitacionhospital.util.error;

public enum ErrorCodesEnum {
    /**
     * Codigos de error de reglas de negocio de sistema
     */
    /**
    RNS001("Campo Obligatorio"),
    RNS002("Longitud de campo"),
    RNS003 ("Formato de nombre"),
    RNS004("Maquina de estados"),
    RNS005 ("Fecha válida"),
    */

    RNN001("Unicidad de elementos"),
    RNN002("Paciente no encontrado"),
    RNN003("Entrada invalida de datos"),
    RNN004("El paciente tiene una cita"),
    RNN005("Nombre de paciente duplicado"),
    RNN006("Lista de hospitales no debe estar vacia"),
    RNN007("Nombre de medico duplicado"),
    ERROR("Error inesperado"),
    /**
     * Errores NO asociados a una regla de negocio
     */
    INVALID_LINK("Liga no vigente"),
    BAD_REQUEST("Error en la petición"),
    NOT_FOUND("Recurso no encontrado"),
    NEW_LINK("Nueva liga para registrar contraseña"),
    CAPA_PERSISTENCIA("Error en la capa de persistencia"),
    ERROR_EN_COMUNICACIONES("Error en la capa de comunicaciones");

    private final String detail;

    ErrorCodesEnum(String detail) {
        this.detail = detail;
    }

    public String getName() {
        return this.name();
    }

    public String getDetail() {
        return detail;
    }

}
