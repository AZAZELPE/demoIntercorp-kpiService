package com.azazelpe.demoIntercorpkpiService.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "kpi")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt","updatedAt"},
                allowGetters = true)
public class Kpi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Double promedioEdadTodosClientes;
    private Double desvEstandarEdadTodosClientes;

    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPromedioEdadTodosClientes() {
        return promedioEdadTodosClientes;
    }

    public void setPromedioEdadTodosClientes(Double promedioEdadTodosClientes) {
        this.promedioEdadTodosClientes = promedioEdadTodosClientes;
    }

    public Double getDesvEstandarEdadTodosClientes() {
        return desvEstandarEdadTodosClientes;
    }

    public void setDesvEstandarEdadTodosClientes(Double desvEstandarEdadTodosClientes) {
        this.desvEstandarEdadTodosClientes = desvEstandarEdadTodosClientes;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
