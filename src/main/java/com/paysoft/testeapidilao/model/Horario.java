package com.paysoft.testeapidilao.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "HORARIO")
@SequenceGenerator(name="HORARIO_SEQUENCE", sequenceName="HORARIO_SEQ")
public class Horario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "HORARIO_SEQUENCE")
    @Column(name = "ID_HORARIO")
    private Long idHorario;

    @Column(name = "SEMANA")
    private String semana;

    @Column(name = "HORA")
    private String hora;

    @Column(name = "SESSAO")
    private String sessao;

    @Column(name = "MARCADO")
    private String marcado;


}
