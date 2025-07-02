package utils;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import models.Contacto;

public class ContactoComparatorHash implements Comparator<Contacto>{

    @Override
    public int compare(Contacto c1, Contacto c2) {
        
            
        return Integer.compare(c1.hashCode(), c2.hashCode());

                
                
    }
    

    
}
