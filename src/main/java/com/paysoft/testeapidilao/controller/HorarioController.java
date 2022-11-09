package com.paysoft.testeapidilao.controller;


import com.paysoft.testeapidilao.model.Horario;
import com.paysoft.testeapidilao.service.HorarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/horario")
@CrossOrigin(origins = "*")
public class HorarioController {

    @Autowired
    private HorarioService horarioService;

    @GetMapping("/get")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Horario> getHorario(){
        return horarioService.getHorario();
    }

    @PostMapping("/post")
    @ResponseStatus(HttpStatus.CREATED)
    public List<Horario> postHorario(@RequestBody List<Horario> body){
        return horarioService.postHorario(body);
    }






}
