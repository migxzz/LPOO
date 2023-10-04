package model;

public class Caminhao extends  Veiculos implements Automovel {
    private int capacidadeDeCarga;
    private String renavam;
    private String chassi;
    private String placa;

    public Caminhao(int numeroDeEixos, String propulsao, String marca, String modelo, int anoFabricacao,
                    int capacidadeDeCarga, String renavam, String chassi, String placa) {
        super(numeroDeEixos, propulsao, marca, modelo, anoFabricacao);
        this.capacidadeDeCarga = capacidadeDeCarga;
        this.renavam = renavam;
        this.chassi = chassi;
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Caminhao{" +
                "capacidadeDeCarga=" + capacidadeDeCarga +
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
