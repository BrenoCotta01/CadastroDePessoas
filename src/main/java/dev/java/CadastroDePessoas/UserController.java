package dev.java.CadastroDePessoas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class UserController {

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa e minha primeira mensagem";
    }
}
