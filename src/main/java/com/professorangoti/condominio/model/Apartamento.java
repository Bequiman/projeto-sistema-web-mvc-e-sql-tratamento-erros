package com.professorangoti.condominio.model;

import javax.validation.constraints.Positive;

import org.hibernate.validator.constraints.Range;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Apartamento {
    // O atributo id do objeto é necessário para fazer a sincronização com o
    // registro no banco de dados. Ojetos não possuem chave primária
    private Long id;

    // Um apartamento tem um dono. observe que uma chave estrangeira no banco de
    // dados é mapeada diretamente como um objeto na classe Java
    private Proprietario proprietario;

    // @Min(value = 1, message = "a quantidade de quartos deve estar entre 1 e 4")
    // @Max(value = 4, message = "a quantidade de quartos deve estar entre 1 e 4")

    @Range(min = 1, max = 4, message = "a quantidade de quartos deve estar entre 1 e 4")
    private int quantidadeDeQuartos;

    @Positive
    private int numeroDoApartamento;

    // O tipo de ocupação pode ser: proprietário, inquilino ou vazio.
    // Para simplificar vou usar valores literais do tipo String.
    // Aqui poderíamos usar enumeração Java.
    private String tipoDeOcupacao;

}
