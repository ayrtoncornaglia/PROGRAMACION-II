package TrabajoPractico7Punto1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Zoologico {
private ArrayList<Animal> animales;
    private ArrayList<Cuidador> cuidadores;
    private ArrayList<Habitat> habitats;
    private HashMap<String, Dieta> dietas;

    public Zoologico() {
        animales = new ArrayList<>();
        cuidadores = new ArrayList<>();
        habitats = new ArrayList<>();
        dietas = new HashMap<>();
    }
    public void agregarAnimal(Animal animal) {
        animales.add(animal);
    }
    public void agregarCuidador(Cuidador cuidador) {
        cuidadores.add(cuidador);
    }
    public void agregarHabitat(Habitat habitat) {
        habitats.add(habitat);
    }
    public void agregarDieta(Dieta dieta) {
        dietas.put(dieta.getCodigo(), dieta);
    }
    public void asignarDieta(String codigoAnimal, String codigoDieta) {
        for (Animal animal : animales) {
            if (animal.getCodigo().equals(codigoAnimal)) {
                Dieta dieta = dietas.get(codigoDieta);
                if (dieta != null) {
                    animal.setDieta(dieta);
                } else {
                    System.out.println("Dieta no encontrada.");
                }
                break;
            }
        }
    }
    public void escribirAnimalesCSV(String archivo) {
        try (FileWriter writer = new FileWriter(archivo)) {
            for (Animal animal : animales) {
                writer.write(animal.getCodigo() + "," + animal.getNombre() + "," + animal.getEdad() + "," + animal.getPeso() + "," + animal.getTipo() + "\n");
            }
            System.out.println("Datos de animales escritos correctamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo de animales: " + e.getMessage());
        }
    }
    public void escribirCuidadoresCSV(String archivo) {
        try (FileWriter writer = new FileWriter(archivo)) {
            for (Cuidador cuidador : cuidadores) {
                writer.write(cuidador.getCodigo() + "," + cuidador.getNombre() + "," + cuidador.getEspecialidad() + "\n");
            }
            System.out.println("Datos de cuidadores escritos correctamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo de cuidadores: " + e.getMessage());
        }
    }
    public void escribirHabitatsCSV(String archivo) {
        try (FileWriter writer = new FileWriter(archivo)) {
            for (Habitat habitat : habitats) {
                writer.write(habitat.getCodigo() + "," + habitat.getNombre() + "," + habitat.getTipo() + "," + habitat.getCapacidad() + "\n");
            }
            System.out.println("Datos de habitats escritos correctamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo de habitats: " + e.getMessage());
        }
    }
    public void escribirDietasCSV(String archivo) {
        try (FileWriter writer = new FileWriter(archivo)) {
            for (Dieta dieta : dietas.values()) {
                writer.write(dieta.getCodigo() + "," + dieta.getTipo() + "\n");
            }
            System.out.println("Datos de dietas escritos correctamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo de dietas: " + e.getMessage());
        }
    }
    public void leerAnimalesCSV(String archivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");
                Animal animal;
                switch (datos[4]) {
                    case "Mamifero":
                        animal = new Mamifero(datos[0], datos[1], Integer.parseInt(datos[2]), Double.parseDouble(datos[3]));
                        break;
                    case "Ave":
                        animal = new Ave(datos[0], datos[1], Integer.parseInt(datos[2]), Double.parseDouble(datos[3]));
                        break;
                    default:
                        System.out.println("Tipo de animal desconocido.");
                        continue;
                }
                animales.add(animal);
            }
            System.out.println("Datos de animales leidos correctamente.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de animales: " + e.getMessage());
        }
    }
    public void leerCuidadoresCSV(String archivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");
                Cuidador cuidador = new Cuidador(datos[0], datos[1], datos[2]);
                cuidadores.add(cuidador);
            }
            System.out.println("Datos de cuidadores leidos correctamente.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de cuidadores: " + e.getMessage());
        }
    }
    public void leerHabitatsCSV(String archivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");
                Habitat habitat = new Habitat(datos[0], datos[1], datos[2], Integer.parseInt(datos[3]));
                habitats.add(habitat);
            }
            System.out.println("Datos de habitats leidos correctamente.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de habitats: " + e.getMessage());
        }
    }
}
