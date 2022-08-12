package com.exercicioSpring.agendaDeTelefones.Service;

import com.exercicioSpring.agendaDeTelefones.Model.AgendaDeTelefonesModel;
import com.exercicioSpring.agendaDeTelefones.Repository.AgendaDeTelefonesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendaDeTelefonesService {

    @Autowired
    private static AgendaDeTelefonesRepository agendaDeTelefonesRepository;

    public List<AgendaDeTelefonesModel> buscartodos() {

        return agendaDeTelefonesRepository.findAll();
    }

    public AgendaDeTelefonesModel cadastrar(AgendaDeTelefonesModel agendaDeTelefonesModel) {

        agendaDeTelefonesModel.getCodigo();
        agendaDeTelefonesModel.getNome();
        agendaDeTelefonesModel.getNumero();

        return agendaDeTelefonesRepository.save(agendaDeTelefonesModel);

    }


}
