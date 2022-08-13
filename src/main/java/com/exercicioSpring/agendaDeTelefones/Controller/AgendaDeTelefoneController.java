package com.exercicioSpring.agendaDeTelefones.Controller;


import com.exercicioSpring.agendaDeTelefones.Model.AgendaDeTelefonesModel;
import com.exercicioSpring.agendaDeTelefones.Service.AgendaDeTelefonesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AgendaDeTelefoneController {
    @Autowired
    private AgendaDeTelefonesService agendaDeTelefonesService;

    @GetMapping(path = "/telefones")
    public List<AgendaDeTelefonesModel> buscarTodosOsNumerosDeTelefonesDaAgenda() {
        return agendaDeTelefonesService.buscarTodos();
    }

    @GetMapping(path = "/telefones/{codigo}")
    public Optional<AgendaDeTelefonesModel> buscarPorId(@PathVariable Long codigo) {
        return agendaDeTelefonesService.buscarPorId(codigo);
    }

    @PostMapping(path = "/telefones")
    @ResponseStatus(HttpStatus.CREATED)
    public AgendaDeTelefonesModel cadastrarTelefones(@RequestBody AgendaDeTelefonesModel agendaDeTelefonesModel) {
        return agendaDeTelefonesService.cadastrar(agendaDeTelefonesModel);

    }
    @PutMapping(path = "/telefones/{codigo}")
    public AgendaDeTelefonesModel alterarNumero(@RequestBody AgendaDeTelefonesModel agendaDeTelefonesModel) {
        return agendaDeTelefonesService.alterar(agendaDeTelefonesModel);
    }
    @DeleteMapping(path = "/telefones/{codigo}")
    public void deletarTelefones(@PathVariable Long codigo){
        agendaDeTelefonesService.deletar(codigo);


    }

}
