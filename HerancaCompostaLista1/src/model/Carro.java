package model;

public class Carro extends  Veiculos implements Automovel{
    private int capacidadePortaMalas;
    private String renavam;
    private String chassi;
    private String placa;

    public Carro(int numeroDeEixos, String propulsao, String marca, String modelo, int anoFabricacao,
                 int capacidadePortaMalas, String renavam, String chassi, String placa) {
        super(numeroDeEixos, propulsao, marca, modelo, anoFabricacao);
        this.capacidadePortaMalas = capacidadePortaMalas;
        this.renavam = renavam;
        this.chassi = chassi;
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Carro{\n" +
                "capacidadePortaMalas=" + capacidadePortaMalas +
                ", renavam='" + renavam + '\'' +
                ", chassi='" + chassi + '\'' +
                ", placa='" + placa + '\'' +
                "} " + super.toString();
    }

    @Override
    public String getRenavam() {
        return this.renavam;
    }

    @Override
    public void setRenavam(String renavam) {

    }

    @Override
    public String getChassi() {
        return this.chassi;
    }

    @Override
    public void setChassi(String chassi) {

    }

    @Override
    public String getPlaca() {
        return this.placa;
    }

    @Override
    public void setPlaca(String placa) {

    }
}
