package pe.edu.upeu.modulo;
import java.util.Scaner;

public class SubProgramas{

 public string nombre="Dario";
  private String dni="";

  public Scanner sc=new Scaner(System.in);

  public void saludo(){
    System.out.println("Hola"+nombre);
  }

  public void otrosaludo(){
    String apellidos="perez";
    System.out.println("hola"+nombre+" "+apellidos);
  }

}