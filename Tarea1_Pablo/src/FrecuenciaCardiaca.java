
public class FrecuenciaCardiaca {
    
    // Variables de instancia
    private Fecha fechaNacimiento;
    private String nombre;
    
    public FrecuenciaCardiaca(){
        nombre = "";
    }
    
    public FrecuenciaCardiaca(String nombre, Fecha fecha){
        fechaNacimiento = fecha;
        this.nombre = nombre;
    }
    
    public double getMaximaFrecuenciaCardiaca(){
        double frecuencia;
        frecuencia = 220 - fechaNacimiento.calcularEdad();
        return frecuencia;
    }
    
    public String getNombre(){
        return nombre;
        
    }
    
    public Fecha getFechaNacimiento(){
        return fechaNacimiento;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setFechaNacimiento(Fecha fecha){
        fechaNacimiento = fecha;        
    }
    
}
