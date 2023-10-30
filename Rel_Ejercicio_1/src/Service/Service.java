/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import entidad.Perro;
import entidad.Person;
import java.util.Scanner;

/**
 *
 * @author chech
 */
public class Service {

    Scanner read = new Scanner(System.in);
    Person person = new Person();
    Perro dog = new Perro();

//    public Person crearPersona() {
//        System.out.println("Ingresar nombre");
//        String name = read.next();
//        System.out.println("Ingresar apellido");
//        String apellido = read.next();
//        System.out.println("Ingresar edad");
//        int edad = read.nextInt();
//        System.out.println("Ingresar documento");
//        String docum = read.next();
//        person.setNombre(name);
//        person.setApellido(apellido);
//        person.setDocumento(docum);
//       
//        return person ;

    
//    public Perro crearPerro() {
//        System.out.println("Ingresar nombre del perro");
//        String nombre = read.next();
//        System.out.println("Ingresar raza del perro");
//        String raza = read.next();
//        System.out.println("Ingresar edad del perro");
//        int age = read.nextInt();
//        System.out.println("Ingresar tamaño del perro");
//        String tamaño = read.next();
//        dog.setEdad(age);
//        dog.setNombre(nombre);
//        dog.setRaza(raza);
//        dog.setTamaño(tamaño);
//        return dog;

    
    public void AsignarPerro(Person p, Perro d){
        p.setPerro(d);
        mostrarPerro(p);
        
    }
    public void mostrarPerro(Person p){
        System.out.println("A usted se le asigno este perro");
        System.out.println(p.toString());
        
        
    }
}
