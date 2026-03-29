package models;

import java.util.Date;
import java.util.List;

public class Consulta {
    private String idConsulta;
    private String motivo;
    private String fecha;
    private List<Medicamento> medicamentos;
    private Veterinario medicoResponsable;

    public Consulta() {
    }

    public Consulta(String idConsulta, String motivo,
                    String fecha, List<Medicamento> medicamentos,
                    Veterinario medicoResponsable) {
        this.idConsulta = idConsulta;
        this.motivo = motivo;
        this.fecha = fecha;
        this.medicamentos = medicamentos;
        this.medicoResponsable = medicoResponsable;
    }

    public String getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(String idConsulta) {
        this.idConsulta = idConsulta;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(List<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public Veterinario getMedicoResponsable() {
        return medicoResponsable;
    }

    public void setMedicoResponsable(Veterinario medicoResponsable) {
        this.medicoResponsable = medicoResponsable;
    }

}
