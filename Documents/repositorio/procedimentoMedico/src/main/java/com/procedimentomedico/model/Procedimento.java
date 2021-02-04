package com.procedimentomedico.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "tb_pin")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Procedimento {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;

    @Column(name = "procedimento")
    private Integer procedimento;

    @Column(name = "idade")
    private Integer idade;

    @Column(name = "sexo")
    private String sexo;

    @Column(name = "permitido")
    private String permitido;

}
