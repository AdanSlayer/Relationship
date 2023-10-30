/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import Service.Service;
import entidad.Perro;
import entidad.Person;

/**
 *
 * @author chech
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Perro dog = new Perro("firulais", "chihuahua", 5, "pequeño");
        Person person = new Person("Juan", "Lopez", 34, "documento");
        Service servicio = new Service();
        servicio.AsignarPerro(person, dog);
        Perro dog2 = new Perro("chancla", "caniche", 12, "mediano");
        Person person2 = new Person("Alexis", "Castillo", 30, "documento");
        servicio.AsignarPerro(person2, dog2);
    }

}
