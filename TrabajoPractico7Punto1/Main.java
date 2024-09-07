package TrabajoPractico7Punto1;

public class Main {
    public static void main(String[] args){
        Zoologico zoo = new Zoologico();
        
        Dieta carnivoro = new Dieta("D01","Carnivoro");
        Dieta herbivoro = new Dieta("D02","Herbivoro");
        Dieta omnivoro = new Dieta("D03","Omnivoro");
        
        zoo.agregarDieta(carnivoro);
        zoo.agregarDieta(herbivoro);
        zoo.agregarDieta(omnivoro);
        
        Animal leon = new Mamifero("A01","Leon",5,190.5);
        Animal elefante = new Mamifero("A02","Elefante",10,3500.2);
        Animal aguila = new Ave("A03","Aguila",3,6.3);
        Animal loro = new Ave("A04","Loro",20,1.2);
        Animal cocodrilo = new Reptil("A05","Cocodrilo",15,400.5);
        Animal serpiente = new Reptil("A06","Serpiente",10,4.0);
        
        zoo.asignarDieta("A01","D01");
        zoo.asignarDieta("A02", "D02");
        zoo.asignarDieta("A03","D03");
        zoo.asignarDieta("A04","D03");
        zoo.asignarDieta("A05","D01");
        zoo.asignarDieta("A06","D01");
        
        zoo.agregarAnimal(leon);
        zoo.agregarAnimal(elefante);
        zoo.agregarAnimal(aguila);
        zoo.agregarAnimal(loro);
        zoo.agregarAnimal(cocodrilo);
        zoo.agregarAnimal(serpiente);
        
        Cuidador cuidador1 = new Cuidador("C01","Jose Ruiz","Mamiferos");
        Cuidador cuidador2 = new Cuidador("C02","Juan Lopez","Aves");
        Cuidador cuidador3 = new Cuidador("C03","Franco Diaz","Reptiles");
        
        zoo.agregarCuidador(cuidador1);
        zoo.agregarCuidador(cuidador2);
        zoo.agregarCuidador(cuidador3);
        
        Habitat sabana = new Habitat("H01","Sabana","Sabana",5);
        Habitat selva = new Habitat("H02","Selva","Selva Tropical",3);
        
        sabana.agregarAnimal(leon);
        sabana.agregarAnimal(elefante);
        sabana.agregarAnimal(aguila);
        selva.agregarAnimal(loro);
        selva.agregarAnimal(cocodrilo);
        selva.agregarAnimal(serpiente);
        
        zoo.agregarHabitat(sabana);
        zoo.agregarHabitat(selva);
        
        zoo.escribirAnimalesCSV("Animales.csv");
        zoo.escribirCuidadoresCSV("Cuidadores.csv");
        zoo.escribirHabitatsCSV("Habitats.csv");
        zoo.escribirDietasCSV("Dietas.csv");
                    
    }
    
}
