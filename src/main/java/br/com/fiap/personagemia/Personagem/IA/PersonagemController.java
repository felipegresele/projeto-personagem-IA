package br.com.fiap.personagemia.Personagem.IA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/personagem")
public class PersonagemController {

    PersonagemRepository personagemRepository;

    @Autowired
    public PersonagemController(PersonagemRepository personagemRepository) {
        this.personagemRepository = personagemRepository;
    }

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("personagem", new PersonagemIA());
        model.addAttribute("personagens", personagemRepository.findAll());
        return "index"; // index.html
    }

    @PostMapping("/save")
    public String salvar(@ModelAttribute PersonagemIA personagem) {
        personagemRepository.save(personagem);
        return "redirect:/personagem/index";
    }

}
