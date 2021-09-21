
package programa_pila;
/**
 * @Guadalupe Lopez Salazar
 */
import java.util.Scanner; /*Libreria de introduccion de datos*/
public class Programa_pila {

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);    /*Permite ingresar datos por teclado*/
        int op = 0, top=0, tam=26 ;     /*Declaracion de variables*/ 
        char[] pilabc= new char [tam];  
        
        do{ 
            
            System.out.println("ESCOJA LA OPCION QUE QUIERA REALIZAR:\n"  /*El usuario indica la actividad a realizar*/
            + "1- LLENAR \n"
            + "2- MOSTRAR \n"
            + "3- ELIMINAR \n"
            + "4- SALIR \n");
            
            switch (op= sc.nextInt()) { /*Se empieza a ejecutar la accion que el usuario solicito*/
                
                case 1: /*Se llena la pila*/
                    char A= 'a'; 
                    for (int i= 0; i <tam; i++){ 
                        if (top<tam){  
                            pilabc[top]=A; 
                            top++;   A++; 
                        } else { System.out.println("Pila llena"); 
                         break;} 
                    } System.out.println("Los valores se han agregado"); 
                    break; /*Se termina el primer caso*/
                    
                    
                case 2: /*Se muestran los datos de la pila*/
                    if(top>0){ 
                        for(int i=top-1; i>0;i--){ 
                            System.out.println(pilabc[i]); 
                        }
                    }else { System.out.println("Pila vacia"); 
                    } break; /*Se termina el segundo caso*/
                    
                    
                case 3: /*Se elimina algun dato de la pila*/
                   if(top>0){ 
                        System.out.println("Dato eliminado"); 
                        top--;       /*Se resta la unidad del dato eliminado*/
                    } else{ System.out.println("La pila está vacía"); 
                    } break;             /*Se termina el tercer caso*/
                    
            }
        } while(op != 4); 
    }           
} 
    
    

