
import java.util.Scanner;

    
public class Tarea1 {
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Tarea 1");
        System.out.println("Nombre: Pablo Sánchez Tadeo");
        System.out.println("Matrícula: A01377515\n");
        
        System.out.print("Teclea tu día de nacimiento: ");
        int dia = teclado.nextInt();
        System.out.print("Teclea tu mes de nacimiento: ");
        int mes = teclado.nextInt();
        System.out.print("Teclea tu año de nacimiento: ");
        int anio = teclado.nextInt(); 
        
        Fecha miFecha = new Fecha(dia,mes,anio);
        
        teclado.nextLine();
        System.out.print("Teclea tu nombre: ");        
        String nombre = teclado.nextLine();
        
        FrecuenciaCardiaca miFrecuencia = new FrecuenciaCardiaca(nombre,miFecha);
        
        System.out.println("\nNombre: "+miFrecuencia.getNombre());
        System.out.println("Fecha de nacimiento: "+miFrecuencia.getFechaNacimiento());
        System.out.println("Edad: "+miFecha.calcularEdad());
        System.out.println("Frecuencia cardiaca máxima: "+miFrecuencia.getMaximaFrecuenciaCardiaca());
        System.out.println("Frecuencia recomendada: ["+miFrecuencia.getMaximaFrecuenciaCardiaca()*.5+", "+miFrecuencia.getMaximaFrecuenciaCardiaca()*.85+"]");
        
        
    }
    
}
