package controllers;

import java.util.Set;
import java.util.TreeSet;
import models.Contacto;
import utils.ContactoComparator;
import utils.ContactoComparatorHash;
import utils.ContactoComparatorNumeros;

public class ContactoController {

    public ContactoController(){

        runTreeContacto();
        runTreeContactosNumero();
        runTreeContactosHash();
        

    }
    public void runTreeContacto(){
        Set<Contacto> agenda=new TreeSet<>(new ContactoComparator());
        
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Pedro", "Gonzales", "123456789"));
        agenda.add(new Contacto("Pablo", "Lopez", "222222222"));
        System.out.println();
        System.out.println("Agenda ordenada por Apellido: ");
       

        for (Contacto contacto : agenda) {
            System.out.println(contacto);
        }

    }
    

public void runTreeContactosNumero(){
        Set<Contacto> agenda=new TreeSet<>(new ContactoComparatorNumeros());
        
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Pedro", "Gonzales", "123456789"));
        agenda.add(new Contacto("Pablo", "Lopez", "222222222"));
        System.out.println();
         System.out.println("Agenda ordenada por Apellido - Nombre - Telefono: ");

        for (Contacto contacto : agenda) {
            System.out.println(contacto);
        }

    }
    

public void runTreeContactosHash(){
        Set<Contacto> agenda=new TreeSet<>(new ContactoComparatorHash());
        
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Pedro", "Gonzales", "123456789"));
        agenda.add(new Contacto("Pablo", "Lopez", "222222222"));
        System.out.println();
         System.out.println("Agenda ordenada por Hashcode: ");

        for (Contacto contacto : agenda) {
            System.out.println(contacto);
        }

    }
    
}
