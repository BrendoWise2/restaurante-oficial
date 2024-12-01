package com.example.restaurante.model.domain;

import java.io.Serializable;

//import org.springframework.boot.context.properties.ConfigurationProperties;

//import org.hibernate.validator.constraints.br.CPF;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
//import jakarta.validation.constraints.Email;
//import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

  //  @CPF
  //  @NotBlank
    @Column(nullable = false)
    private String cpf;
    private String telefone;

   // @Email
    private String email;

    @ManyToMany
    @JoinColumn(name = "id_mesa")
    private Mesa mesa;
    
    public void setCpf(String cpf) {
        this.cpf = cpf.replaceAll("[^0-9]", "");
    }
}
