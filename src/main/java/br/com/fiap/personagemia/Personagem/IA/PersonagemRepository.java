package br.com.fiap.personagemia.Personagem.IA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonagemRepository extends JpaRepository< PersonagemIA, Long> {
}
