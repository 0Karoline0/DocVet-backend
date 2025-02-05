package br.com.docvet.docvet.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_veterinario")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Veterinario extends Pessoa{

    private String crmv;

    @ManyToMany(mappedBy = "veterinarios")
    private List<Especialidade> especialidades;

    Veterinario(){}

    Veterinario(String nome, String cpf, String email, String foto, String crmv){
        this.setNome(nome);
        this.setCpf(cpf);
        this.setEmail(email);
        this.setFoto(foto);
        this.crmv = crmv;
    }

    public String getCrmv() {
        return crmv;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }

    public List<Especialidade> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<Especialidade> especialidades) {
        this.especialidades = especialidades;
    }



}