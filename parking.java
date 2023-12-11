import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class parking {
    private Map<Integer, Car> puestos;
    private double tarifa;
    private int horaActual;

    public parking() {
        this.puestos = new HashMap<>();
        this.tarifa = 0.0;
        this.horaActual = 6;
    }


    public double darTiempoPromedio() {
        if (puestos.isEmpty()) {
            return 0.0;
        }

        int totalHoras = 0;
        for (Car carro : puestos.values()) {
            totalHoras += horaActual - carro.getHoraEntrada();
        }

        return (double) totalHoras / puestos.size();
    }

    public boolean hayCarroMasDeOchoHoras() {
        for (Car car : puestos.values()) {
            if (horaActual - car.getHoraEntrada() > 8) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Car> darCarrosMasDeTresHorasParqueados() {
        ArrayList<Car> carrosMasDeTresHoras = new ArrayList<>();
        for (Car car : puestos.values()) {
            if (horaActual - car.getHoraEntrada() > 3) {
                carrosMasDeTresHoras.add(car);
            }
        }
        return carrosMasDeTresHoras;
    }

    public boolean hayCarrosPlacaIgual() {
        ArrayList<String> placas = new ArrayList<>();
        for (Car car : puestos.values()) {
            if (placas.contains(car.getPlaca())) {
                return true;
            }
            placas.add(car.getPlaca());
        }
        return false;
    }

    public int contarCarrosQueComienzanConPlacaPB() {
        int contador = 0;
        for (Car car : puestos.values()) {
            if (car.getPlaca().startsWith("PB")) {
                contador++;
            }
        }
        return contador;
    }

    public boolean hayCarroCon24Horas() {
        for (Car car: puestos.values()) {
            if (horaActual - car.getHoraEntrada() >= 24) {
                return true;
            }
        }
        return false;
    }

    public int desocuparParqueadero() {
        int cantidadCarrosSacados = puestos.size();
        puestos.clear();
        return cantidadCarrosSacados;
    }

    public String metodo1() {
        return "Cantidad de carros con placa PB: " + contarCarrosQueComienzanConPlacaPB() +
                " – Hay carro parqueado por 24 o más horas: " + (hayCarroCon24Horas() ? "Sí" : "No") + ".";
    }

    public String metodo2() {
        return "Cantidad de carros sacados: " + desocuparParqueadero() + ".";
    }


    public void ingresarCarro(int puesto, Car car) {
        puestos.put(puesto, car);
    }

    public void darSalidaCarro(int puesto) {
        puestos.remove(puesto);
    }

    public double calcularIngresos() {
        return puestos.size() * tarifa;
    }

    public int consultarPuestosDisponibles() {
        return 40 - puestos.size();
    }

    public void avanzarReloj() {
        horaActual = (horaActual + 1) % 24;
    }

    public void cambiarTarifa(double nuevaTarifa) {
        tarifa = nuevaTarifa;
    }

}
