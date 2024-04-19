package br.com.fiap.checkpoint2.domain;

import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "consultas")
public class Consulta extends AbstractEntity<Long> {

    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "profissional_id_fk", nullable = false)
    private Profissional profissional;

    @ManyToOne
    @JoinColumn(name = "paciente_id_fk", nullable = false)
    private Paciente paciente;

    @Column(name = "data_consulta", nullable = false)
    private LocalDateTime data;

    @Enumerated(EnumType.STRING)
    @JdbcTypeCode(SqlTypes.CHAR)
    @Column(name = "status_consulta", nullable = false)
    private StatusConsulta status;

    @Column(name = "quantidade_horas")
    private long quantidadeHora;

    @Column(name = "valor_consulta")
    private double valorConsulta;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Profissional getProfissional() {
        return profissional;
    }

    public void setProfissional(Profissional profissional) {
        this.profissional = profissional;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public StatusConsulta getStatus() {
        return status;
    }

    public void setStatus(StatusConsulta status) {
        this.status = status;
    }

    public long getQuantidadeHora() {
        return quantidadeHora;
    }

    public void setQuantidadeHora(long quantidadeHora) {
        this.quantidadeHora = quantidadeHora;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }
}