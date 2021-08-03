package test;

import dominio.*;

public class Test_Class {

    public static void main(String[] args) {
        
        Planta p = new Planta();
        
        AnimalCarnívoro c = new AnimalCarnívoro();
        
        AnimalHerbívoro h = new AnimalHerbívoro();
        
        c.setClass_SV("Animal");
        c.setClassAnimal("Carnívoro:");
        System.out.println(c.getClass_SV()+" "+c.getClassAnimal());
        c.Alimentarse();
        
        h.setClass_SV("Animal");
        h.setClassAnimal("Herbívoro:");
        System.out.println(h.getClass_SV()+" "+h.getClassAnimal());
        h.Alimentarse();  
        
        p.setClass_SV("Planta:");
        System.out.println(p.getClass_SV());
        p.Alimentarse();
    }
}
