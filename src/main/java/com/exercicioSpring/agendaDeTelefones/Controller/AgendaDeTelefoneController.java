package com.exercicioSpring.agendaDeTelefones.Controller;


import com.exercicioSpring.agendaDeTelefones.Model.AgendaDeTelefonesModel;
import com.exercicioSpring.agendaDeTelefones.Service.AgendaDeTelefonesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AgendaDeTelefoneController{

    @Autowired
    private AgendaDeTelefonesService agendaDeTelefonesService;


    @GetMapping(path ="/telefones")
    public List<AgendaDeTelefonesModel>buscarTodosOsNumerosDeTelefonesDaAgenda(){
        return agendaDeTelefonesService.buscartodos();
    }
    @PostMapping(path ="/telefones")
    @ResponseStatus(HttpStatus.CREATED)
    public AgendaDeTelefonesModel cadastrarTelefones(@RequestBody AgendaDeTelefonesModel agendaDeTelefonesModel){
        return agendaDeTelefonesService.cadastrar(agendaDeTelefonesModel);

    }


}
