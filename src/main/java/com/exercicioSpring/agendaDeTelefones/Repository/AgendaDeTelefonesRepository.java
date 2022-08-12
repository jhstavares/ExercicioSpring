package com.exercicioSpring.agendaDeTelefones.Repository;


import com.exercicioSpring.agendaDeTelefones.Model.AgendaDeTelefonesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendaDeTelefonesRepository extends JpaRepository<AgendaDeTelefonesModel, Long> {
}
