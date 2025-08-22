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

    @NotNull(message = "Este campo é obrigatório")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Este campo é obrigatório")
    @Size(min = 3, max = 40, message="O nome deve ter entre 2 e 50 caracteres")
    private String name;

    @NotNull(message = "Este campo é obrigatório")
    private EstiloDialogo species;

    @NotNull
    @Size(min = 1, max 10, message="O level deve ser de 0 até 10")
    private int level;

    @NotNull(message = "Este campo é obrigatório")
    @Size(max = 280, message = "Maxímo 280 caracteres")
    private String bio;

    @NotNull(message = "Este campo é obrigatório")
    @Size(max = 60, message = "Maxímo 60 caracteres")
    private String specialAbility;

    @NotNull(message = "Este campo é obrigatório")
    @PastOrPresent
    private LocalDate creationDate();

}


