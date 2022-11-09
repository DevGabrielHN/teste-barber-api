package com.paysoft.testeapidilao.repository;


import com.paysoft.testeapidilao.model.Horario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HorarioRepository extends JpaRepository<Horario,Long> {


}
