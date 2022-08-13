package com.exercicioSpring.agendaDeTelefones.Controller;


import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @GetMapping(path = "/status")
    public String checar() {return "Funcionando";

    }

}
