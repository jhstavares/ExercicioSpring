package com.exercicioSpring.agendaDeTelefones.Service;

import com.exercicioSpring.agendaDeTelefones.Model.AgendaDeTelefonesModel;
import com.exercicioSpring.agendaDeTelefones.Repository.AgendaDeTelefonesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class AgendaDeTelefonesService {

    @Autowired
    private AgendaDeTelefonesRepository agendaDeTelefonesRepository;

    public List<AgendaDeTelefonesModel> buscarTodos() {

        return agendaDeTelefonesRepository.findAll();
    }
    public Optional<AgendaDeTelefonesModel> buscarPorId(Long codigo) {
        return agendaDeTelefonesRepository.findById(codigo);
    }
    public AgendaDeTelefonesModel cadastrar(AgendaDeTelefonesModel agendaDeTelefonesModel) {

        agendaDeTelefonesModel.getCodigo();
        agendaDeTelefonesModel.getNome();
        agendaDeTelefonesModel.getNumero();

        return agendaDeTelefonesRepository.save(agendaDeTelefonesModel);

    }
    public AgendaDeTelefonesModel alterar(AgendaDeTelefonesModel agendaDeTelefonesModel){

        agendaDeTelefonesModel.getCodigo();
        agendaDeTelefonesModel.getNome();
        agendaDeTelefonesModel.getNumero();

        return agendaDeTelefonesRepository.save(agendaDeTelefonesModel);

    }
    public void deletar(Long codigo){
        agendaDeTelefonesRepository.deleteById(codigo);
    }

}
