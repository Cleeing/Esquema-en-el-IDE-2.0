// Interfaz para acciones del vehículo
interface AccionesVeiculo {
    void acelerar();
    void frenar();
    void estacionar();
    void dirigir();
}

// Clase abstracta para los vehículos
abstract class Vehiculo implements AccionesVeiculo {
    String marca;
    String modelo;
    String placa;
    int velocidadMaxima;

    // Constructor
    public Vehiculo(String marca, String modelo, String placa, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.velocidadMaxima = velocidadMaxima;
    }
    
    // Métodos para registro de compra y venta
    public void registrarCompra() {
        // Lógica para registrar la compra
    }
    
    public void registrarVenta() {
        // Lógica para registrar la venta
    }
}

// Clase para motos
class Moto extends Vehiculo {
    int cilindraje;

    // Constructor
    public Moto(String marca, String modelo, String placa, int velocidadMaxima, int cilindraje) {
        super(marca, modelo, placa, velocidadMaxima);
        this.cilindraje = cilindraje;
    }

    // Implementación de acciones del vehículo para motos
    @Override
    public void acelerar() {
        // Lógica de acelerar para motos
    }

    @Override
    public void frenar() {
        // Lógica de frenar para motos
    }

    @Override
    public void estacionar() {
        // Lógica de estacionar para motos
    }

    @Override
    public void dirigir() {
        // Lógica de dirigir para motos
    }
}

// Clase para carros
class Carro extends Vehiculo {
    String tipoTraccion;

    // Constructor
    public Carro(String marca, String modelo, String placa, int velocidadMaxima, String tipoTraccion) {
        super(marca, modelo, placa, velocidadMaxima);
        this.tipoTraccion = tipoTraccion;
    }

    // Implementación de acciones del vehículo para carros
    @Override
    public void acelerar() {
        // Lógica de acelerar para carros
    }

    @Override
    public void frenar() {
        // Lógica de frenar para carros
    }

    @Override
    public void estacionar() {
        // Lógica de estacionar para carros
    }

    @Override
    public void dirigir() {
        // Lógica de dirigir para carros
    }
}

public class Main {
    public static void main(String[] args) {
        // Aquí puedes ingresar por consola los datos de una moto y un carro
        // Luego, puedes crear instancias de Moto y Carro y llamar a los métodos de prueba de ruta
    }
}