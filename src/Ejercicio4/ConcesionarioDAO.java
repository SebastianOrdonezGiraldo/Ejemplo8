package Ejercicio4;


import java.util.ArrayList;

public class ConcesionarioDAO {
    private Concesionario concesionario;

   public ConcesionarioDAO(Concesionario concesionario){
       this.concesionario = concesionario;
   }

    public void addCar(Car car){
        concesionario.addCar(car);
    }

    public boolean deleteCar(Car car){
        return concesionario.deleteCar(car);
    }

    public String getInfo(){
        return "Nombre: " + concesionario.getName() + " Dirección: " + concesionario.getAddress() + " Número de carros: " + concesionario.getNumberOfCars();
    }

    public boolean sellCar(Car carro){
        return concesionario.deleteCar(carro);
    }

    public void showCars(){
        ArrayList<Car> carros = concesionario.getCars();
        for (Car carro : carros) {

        }
}

    @Override
    public String toString() {
        return "ConcesionarioDAO{" +
                "concesionario=" + concesionario +
                '}';
    }}
