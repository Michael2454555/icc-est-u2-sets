package controllers;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.*;

public class Sets {
    public Sets(){

    }
    public Set<String> construirHashSet(){
        Set <String> palabra=new HashSet<>();
        palabra.add("Laptop");
        palabra.add("Manzana");
        palabra.add("Pera");
        palabra.add("Celular");
        palabra.add("Laptop");
        palabra.add("Celular");
        return palabra;
    }
    public Set <String> construirLinkedHashSet(){
        Set <String> palabra=new LinkedHashSet<>();
        palabra.add("Laptop");
        palabra.add("Manzana");
        palabra.add("Pera");
        palabra.add("Celular");
        palabra.add("Laptop");
        palabra.add("Celular");
        return palabra;

    }
    public Set <String> TreeSet(){
        Set <String> palabra=new TreeSet<>();
        palabra.add("Laptop");
        palabra.add("Manzana");
        palabra.add("Pera");
        palabra.add("Celular");
        palabra.add("Laptop");
        palabra.add("Celular");
        return palabra;

    }
    public Set <String> TreeSetConComparador(){
        Comparator<String> comparador =new Comparator<String>() {
            @Override
            public int compare(String s1, String s2){
                int result =Integer.compare(s1.length(),s2.length());
                if(result==0){
                    result = s1.compareTo(s2);
                }
                return result;

            }
        };
         Set <String> miTreeSetComparador=new TreeSet<>(comparador);
        miTreeSetComparador.add("laptop");
        miTreeSetComparador.add("Manzana");
        miTreeSetComparador.add("Pera");
        miTreeSetComparador.add("Celular");
        miTreeSetComparador.add("laptop");
        miTreeSetComparador.add("Celular");
        miTreeSetComparador.add("Celulas");
        return miTreeSetComparador;
    }


    public Set <String> TreeSetConComparadorInverso(){
        Comparator<String> comparador =new Comparator<String>() {
            @Override
            public int compare(String s2, String s1){
                int result =Integer.compare(s1.length(),s2.length());
                if(result==0){
                    result = s1.compareTo(s2);
                }
                return result;

            }
        };
         Set <String> miTreeSetComparador=new TreeSet<>(comparador);
        miTreeSetComparador.add("laptop");
        miTreeSetComparador.add("Manzana");
        miTreeSetComparador.add("Pera");
        miTreeSetComparador.add("Celular");
        miTreeSetComparador.add("laptop");
        miTreeSetComparador.add("Celular");
        miTreeSetComparador.add("Celulas");
        return miTreeSetComparador;
    }

    
}
