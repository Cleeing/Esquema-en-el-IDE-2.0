
interface AccionesVeiculo {
    void acelerar();
    void frenar();
    void estacionar();
    void dirigir();
}


abstract class Vehiculo implements AccionesVeiculo {
    String marca;
    String modelo;
    String placa;
    int velocidadMaxima;

   
    public Vehiculo(String marca, String modelo, String placa, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.velocidadMaxima = velocidadMaxima;
    }
    
    
    public void registrarCompra() {
    
    }
    
    public void registrarVenta() {
    
    }
}


class Moto extends Vehiculo {
    int cilindraje;

 
    public Moto(String marca, String modelo, String placa, int velocidadMaxima, int cilindraje) {
        super(marca, modelo, placa, velocidadMaxima);
        this.cilindraje = cilindraje;
    }

  
    @Override
    public void acelerar() {
     
    }

    @Override
    public void frenar() {
      
    }

    @Override
    public void estacionar() {
       
    }

    @Override
    public void dirigir() {
     
    }
}


class Carro extends Vehiculo {
    String tipoTraccion;

  
    public Carro(String marca, String modelo, String placa, int velocidadMaxima, String tipoTraccion) {
        super(marca, modelo, placa, velocidadMaxima);
        this.tipoTraccion = tipoTraccion;
    }

 
    @Override
    public void acelerar() {
    
    }

    @Override
    public void frenar() {
        // Lógica de frenar para carros
    }

    @Override
    public void estacionar() {
     
    }

    @Override
    public void dirigir() {
   
    }
}

public class Main {
    public static void main(String[] args) {
       
    }
}