package model;

/*
Toda a interface é uma abstração;
Toda interface contém métodos abstratos e público;
Não precisa escrever publico e abstract;
Todoo atributo é uma constante (final e public);

 */

public interface Investidor {
     String getTicker();
     void setTicker(String ticket);

     int getQuantidade();

     void setQuantidade(int quantidade);
}
