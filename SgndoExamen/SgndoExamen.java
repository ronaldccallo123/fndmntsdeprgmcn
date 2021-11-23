import java.util.Scanner;
public class SgndoExamen{
static Scanner sc = new Scanner(System.in);
static void tablademultiplicar(){
  int i, n=0, resultado=0;
  for (n=1; n<=20; n++){
    for (i=1; i<=12; i++){
      resultado=n*i;
      System.out.println(+n+" x "+i+" = "+resultado);

    }
    System.out.println("--------------------");
  }
}
static void menuOpciones(){ 
  int opcionesA=0;
  System.out.println("-------------------------------");
  String msg="\nIngrese el Algoritmo que desea Probar:";
  System.out.println(msg);
  String msg1="ejercicio1:";
  System.out.println(msg1);
  String msg2="ejercicio2:";
  System.out.println(msg2);
opcionesA=sc.nextInt();  
  while(opcionesA!=0){
      switch(opcionesA) {
      
        case 1: tablademultiplicar();break;
         default:
          System.out.println("El Algoritmo no existe!");
      }   
    System.out.println("------------------------------");  
    System.out.println(msg);
    opcionesA=sc.nextInt();        
  }
}
    public static void main(String[] args) {
    menuOpciones();
  } 

}