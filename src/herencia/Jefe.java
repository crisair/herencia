
package herencia;


public class Jefe extends Persona {
    
    public int id_jefe ;
    public String departamento_jefe;
    
    public Jefe (){
        
    }

    public Jefe(int id_jefe, String departamento_jefe, int id, int dni, String nombre, String apellido, String domicilio, String telefono) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.id_jefe = id_jefe;
        this.departamento_jefe = departamento_jefe;
    }
    
    public int getId_jefe(){
        return id_jefe;
    }
    
    public void setId_jefe(){
        this.id_jefe = id_jefe;
    }
    
    public String getDepartamento_jefe(){
        
        return departamento_jefe;  
    }
    
    public void setDepartamento_jefe(){
        
        this.departamento_jefe= departamento_jefe;
    }
    
    
    
    
}
