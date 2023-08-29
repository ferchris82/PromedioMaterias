
import java.util.Scanner;


public class PromedioMaterias {
    public static void main(String[] args){
        
        //Usamos la libreria Scanner
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Seleccione la materia para calcular el promedio:");
        System.out.println("1. Matemáticas");
        System.out.println("2. Español");
        System.out.println("3. Inglés");
        
        //Capturamos lo que ingrese el usuario 
        int opcion = sc.nextInt();
        
        int totalEstudiantes;
        double sumaNotas = 0;
        
        System.out.println("Ingrese el número total de estudiantes: ");
        totalEstudiantes = sc.nextInt();
        
        switch(opcion){
            case 1:
                for(int i = 1; i<= totalEstudiantes; i++){
                    System.out.println("Ingrese la nota del estudiante " + i + " en Matemáticas: ");
                    double nota = sc.nextDouble();
                    sumaNotas += nota;
                }
                break;
            
            case 2: 
                int contador = 1;
                while(contador <= totalEstudiantes){
                    System.out.println("Ingrese la nota del estudiante " + contador + " en Español");
                }
                break;
                
            case 3:
                int indice = 1;
                do{
                    System.out.println("Ingrese la nota del estudiante " + indice + " en Ingles");
                }while(indice <= totalEstudiantes);
                break;
                
            default:
                System.out.println("Opción no válida.");
                return;
        }
        
        double promedio = sumaNotas / totalEstudiantes;
        System.out.println("El promedio del grupo en la materia seleccionada es: " + promedio);
        
        sc.close();
    }
}
