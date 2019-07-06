 
public class Producto{
    
	private String nombre;
    	private float precio;
	private int cantidad;
	
        public Producto (String nombre, float precio, int cantidad){ 
        	this.nombre=nombre;
        	this.precio=precio;
		this.cantidad=cantidad;
    }
	public void setNombre(String nombre){
       		nombre=nombre;   
    }
        public String getNombre(){
        	return nombre;
    }
        public void setPrecio (float precio){
        	precio=precio;
    }
        public float getPrecio(){
       		return precio;
    }
 	public void setCantidad (int cantidad){
        	cantidad=cantidad;
    }
        public int getCantidad(){
       		return cantidad;
    }	
  	public void ImprimirDatos(){
		System.out.println(getNombre());
		System.out.println(getPrecio());
		System.out.println(getCantidad());
       }
    }

    
   
   
    
   
    

