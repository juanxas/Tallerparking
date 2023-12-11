public class Car {
    private String placa;
    private int horaEntrada;

    public Car(String placa, int horaEntrada) {
        this.placa = placa;
        this.horaEntrada = horaEntrada;
    }

    public String getPlaca(){
        return placa;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }
}
