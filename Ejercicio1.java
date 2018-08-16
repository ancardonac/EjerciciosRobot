package unal.poo.practica;

import becker.robots.*;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class Ejercicio1
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("Field.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,0, 2, Direction.WEST,10);
            
	    girar();
            estudiante.move();
            derecha();
            for(int i=1;i<=3;i=i+1){
            camino();
                  
            }
            estudiante.move();
            estudiante.move();
            girar();
            
            
	}
        public static void girar(){
        estudiante.turnLeft();
        estudiante.turnLeft();
        
        }
        public static void derecha(){
        estudiante.turnLeft();
        estudiante.turnLeft();
        estudiante.turnLeft();
        
        }
        public static void camino(){
        estudiante.move();
        estudiante.move();
        estudiante.move();
        derecha();
            
        }
        
        
}

