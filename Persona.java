public class Persona {
	
	private String nombre;
	private int edad;
	private Trabajo trabajo = new Trabajo();
	
	public Persona(String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void getTrabajo(int salario, String puesto) {
		trabajo.setSueldo(salario);
		trabajo.setPuesto(puesto);
	}
	
	public void mostrarInfo() {
		System.out.print("Nombre: "+ getNombre() + "\nEdad: "+ getEdad() + "\nPuesto: "+ trabajo.getPuesto() + "\nSalario: $"+ trabajo.getSueldo());
	}
}