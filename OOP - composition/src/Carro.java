public class Carro {
    String marca;
    int ano;
    Motor motor;

    Carro(String marca , int ano , String motorTipo){
        this.marca = marca;
        this.ano = ano;
        this.motor = new Motor(motorTipo);
    }
}

