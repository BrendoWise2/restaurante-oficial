package com.example.restaurante.model.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.HashSet;
import java.util.Set;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "restaurantes")
public class Restaurante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeRestaurante;
    private String cnpj;
    private String endereco;
    private String telefone;
    private String email;
    private String proprietarioRestaurante;

    @OneToMany(mappedBy = "restaurante")
    private Set<Cliente> clientes = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "proprietario_id")  // A chave estrangeira no banco de dados
    private Proprietario proprietario;

    @OneToMany(mappedBy = "restaurante")
    private Set<Mesa> mesas = new HashSet<>();

    @OneToMany(mappedBy = "restaurante")
    private Set<Comanda> comandas = new HashSet<>();
}
