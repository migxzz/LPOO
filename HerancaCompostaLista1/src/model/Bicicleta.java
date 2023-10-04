package model;

public class Bicicleta extends  Veiculos{
    private int tamanhoRoda;
    private String chassi;

    public Bicicleta(int numeroDeEixos, String propulsao, String marca, String modelo, int anoFabricacao, int tamanhoRoda, String chassi) {
        super(numeroDeEixos, propulsao, marca, modelo, anoFabricacao);
        this.tamanhoRoda = tamanhoRoda;
        this.chassi = chassi;
    }

    public int getTamanhoRoda() {
        return tamanhoRoda;
    }

    public void setTamanhoRoda(int tamanhoRoda) {
        this.tamanhoRoda = tamanhoRoda;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    @Override
    public String toString() {
        return "Bicicleta\n" +
                "\ntamanhoRoda=" + tamanhoRoda +
                ", \nchassi='" + chassi + '\'' +
                " \n" + super.toString();
    }
}
