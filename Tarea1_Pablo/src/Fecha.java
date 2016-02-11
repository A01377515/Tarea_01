
import java.util.Calendar;



public class Fecha {
    // Variables de instancia
    private int dia;
    private int mes;
    private int anio;
    
    public Fecha(){
        dia = 0;
        mes = 0;
        anio = 0;
    }
    
    public Fecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    public String toString(){
        String fecha;
        fecha = dia+"/"+mes+"/"+anio;
        return fecha;
    }
    
    public String fechaActual(){
        String fecha;
        int anioActual = Calendar.getInstance().get(Calendar.YEAR);
        int mesActual =	Calendar.getInstance().get(Calendar.MONTH);
        int diaActual =	Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        mesActual = mesActual + 1;
        fecha = diaActual+"/"+mesActual+"/"+anioActual;
        return fecha;
    }
    
    public int calcularEdad(){
        int edad;
        int anioActual = Calendar.getInstance().get(Calendar.YEAR);
        int mesActual =	Calendar.getInstance().get(Calendar.MONTH);
        int diaActual =	Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        mesActual = mesActual + 1;
        
        edad = anioActual - anio;
        if(mesActual < mes){
            edad = edad - 1;            
        }else if(mesActual == mes && diaActual < dia ){
            edad = edad -1;
        }        
        return edad;
    }
    
}
