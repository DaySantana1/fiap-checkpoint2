package br.com.fiap.checkpoint2.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.io.Serializable;

import static jakarta.persistence.GenerationType.AUTO;

@SuppressWarnings("JpaAttributeTypeInspection")
@MappedSuperclass
public class AbstractEntity<ID> implements Serializable {
    @Id
    @GeneratedValue(strategy = AUTO)
    private ID id;

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }
}