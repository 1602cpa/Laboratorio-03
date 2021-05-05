public class Composicion { 
    public static void main(String[] args){
        Persona p1 = new Persona("Candido Polanco", 22);
        p1.getTrabajo(50000, "Gerente General");
        
        p1.mostrarInfo();
  }
}