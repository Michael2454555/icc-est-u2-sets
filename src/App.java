import java.util.Set;

import controllers.Sets;


public class App {
    public static void main(String[] args) throws Exception {
         Sets sets= new Sets(); 
         System.out.println("Impresión de hashset: ");
         runHashSet(sets);
         System.out.println("Impresión de Linkedhashset: ");
         runLinkedHashSet(sets);
         System.out.println("Impresión de Treeset: ");
         runTreeSet(sets);
         System.out.println("Impresión de ConComparadorTreeset: ");
         runTreeSetConComparador(sets);
         System.out.println("Impresión de ConComparadorTreesetInverso: ");
         TreeSetConComparadorInverso(sets);



        
    }
    public static void runHashSet(Sets sets){
        Sets palabraSets = new Sets();
        Set<String> palabras = palabraSets.construirHashSet();
        for (String palabrasImp : palabras) {
            System.out.println("-"+ palabrasImp);
            
        }

    }
    public static void runLinkedHashSet(Sets sets){
        Sets palabraSets = new Sets();
        Set<String> palabras = palabraSets.construirLinkedHashSet();
        for (String palabrasImp : palabras) {
            System.out.println("-"+ palabrasImp);
            
        }

    }
    public static void runTreeSet(Sets sets){
        Sets palabraSets = new Sets();
        Set<String> palabras = palabraSets.TreeSet();
        for (String palabrasImp : palabras) {
            System.out.println("-"+ palabrasImp);
            
        }

    }
    public static void runTreeSetConComparador(Sets sets){
        Sets palabraSets = new Sets();
        Set<String> palabras = palabraSets.TreeSetConComparador();
        for (String palabrasImp : palabras) {
            System.out.println("-"+ palabrasImp);
            
        }

    }
    public static void TreeSetConComparadorInverso(Sets sets){
        Sets palabraSets = new Sets();
        Set<String> palabras = palabraSets.TreeSetConComparadorInverso();
        for (String palabrasImp : palabras) {
            System.out.println("-"+ palabrasImp);
            
        }

    }
}
