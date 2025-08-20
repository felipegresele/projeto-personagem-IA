package br.com.fiap.personagemia.Personagem.IA;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonagemIA {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 3, max = 50, message="O nome deve ter entre 2 e 50 caracteres")
    private String nome;

    @NotNull(message = "A personalidade é obrigatória")
    @Size(min = 3, max = 100, message = "A personalidade deve ter entre 3 e 100 caracteres")
    private String personalidade;

    @NotNull
    private EstiloDialogo estiloDialogo;

    @NotNull
    @Size(max = 50, message = "Maxímo 50 caracteres")
    private String habilidades;

}


