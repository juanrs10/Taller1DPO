package uniandes.dpoo.taller0.consola;

import java.io.FileNotFoundException;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;


public class modificacion {

    public static void main(String args[]){

        try { 
            CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
            System.out.println(calc.paisConMasMedallistas());
        }

        catch (Exception e) {

            System.out.println("File not found"); 

        }
        

    }
    
}
