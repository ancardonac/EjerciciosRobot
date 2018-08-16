package unal.poo.practica;

import becker.robots.*;
import static unal.poo.practica.Ejercicio1.estudiante;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class ejercicio2
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("Field_2.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,1, 2, Direction.SOUTH,10);
            
	    derecha();
            estudiante.move();
            estudiante.turnLeft();
            estudiante.move();
            
            estudiante.turnLeft();
            estudiante.move();
           
            bool a=estudiante.canPickThing();
            if(a==true){
            estudiante.pickThing();
            }
            
	}
        
        public static void derecha(){
        estudiante.turnLeft();
        estudiante.turnLeft();
        estudiante.turnLeft();
        
        }
        
}

