package model;

import java.util.List;

//4.2.1 Associação Unária

public class Funcionario {

    private String nome;

    //relação de Chefe ( q tb eh Funcionario ) com funcionários
    List<Funcionario> funcionario;

}

