package com.paysoft.testeapidilao.service;

import com.paysoft.testeapidilao.model.Horario;
import com.paysoft.testeapidilao.repository.HorarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HorarioService {

    @Autowired
    private HorarioRepository horarioRepository;

    public List<Horario> getHorario(){
        return horarioRepository.findAll();
    }

    public List<Horario> postHorario(List<Horario> body){

        List<Horario> retorno = new ArrayList();

        for(Horario horario : body){
            retorno.add(horarioRepository.save(horario));
        }

        return retorno;
    }





}
