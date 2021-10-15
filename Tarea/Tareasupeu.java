import java.util.Scanner;
public class Tareasupeu{
  static Scanner sc = new Scanner(System.in);
  static void ejercicio1(){
    int edad=0;
    System.out.println("Ingresar edad:");
    edad=sc.nextInt();
    if(edad>=18){
      System.out.println("apto para votar");
    }else {
      System.out.println("no apto para votar");
    }
  }
  static void ejercicio2(){
    double sueldo, horasT, pagoH;
     System.out.println("Ingresar horas de trabajo:");
    horasT=sc.nextDouble();
    sc.nextLine();
     System.out.println("Ingresar pagop por hora:");
    pagoH=sc.nextDouble();
    sc.nextLine();
    sueldo=0;
    if(horasT<=40)
    sueldo=horasT*pagoH;
    if(horasT>40)
    sueldo=((horasT-40)*2*pagoH)+(pagoH*40);
    System.out.println("su pago semanal es de:"+sueldo);
  }
  static void ejercicio3(){
    int pago=0, horas=0;
    System.out.println("Ingresar horas de estacionamiento:");
    horas=sc.nextInt();
    if(horas<=2){
      pago=horas*5;
    }else if(horas>2&&horas<=5){
      pago=(2*5)+((horas-2)*4);
    }else if(horas>5&&horas<=10){
    pago=(2*5)+(3*4)+((horas-5)*3);
    }else{
      pago=(2*5)+(3*4)+(5*3)+((horas-10)*2);
    }
    System.out.println("el pago por estacionarse sera de:"+pago);
  }
  static void ejercicio4(){
    String nombre1, nombre2, nombre3, nombreF="";
    int edad, edad1, edad2, edad3;
    System.out.print(" ingresar el primer nombre: ");
   nombre1=sc.next().toUpperCase();
   System.out.println("ingresar su edad: ");
   edad1=sc.nextInt();
   System.out.print(" ingrese el segundo nombre: ");
   nombre2=sc.next().toUpperCase();
   System.out.println("ingresar su edad: ");
   edad2=sc.nextInt();
   System.out.print(" ingrese el tercer nombre: ");
   nombre3=sc.next().toUpperCase();
   System.out.println("ingresar su edad: ");
   edad3=sc.nextInt();
   edad=0;
   if(edad1<edad2 && edad1<edad3){
     nombreF=nombre1;
     edad=edad1;
   }
   if(edad2<edad1 && edad2<edad3){
     nombreF=nombre2;
     edad=edad2;
   }
   if(edad3<edad1 && edad3<edad2){
     nombreF=nombre3;
     edad=edad3;
  }
   System.out.print(" la persona menor es: "+nombreF+"su edad es"+edad);  
  }
  static void ejercicio5(){
    int i, n;
    double costo, descuento, pagoT, precio;
    pagoT=0;
    System.out.print("Ingresa el valor de N: ");
        n = sc.nextInt();
        sc.nextLine();
        for (i=1; i<=n; i++){
          System.out.print("proceso: "+i);
          System.out.print("\n---------------: ");
          System.out.print("\n ingresar el precio: ");
          precio=sc.nextDouble();
          sc.nextLine();
          descuento=precio*0.1;
          if(precio>=200)
          descuento=precio*0.15;
          if(precio>100 && precio<200)
          descuento=precio*0.12;
          costo=precio-descuento;
          pagoT =pagoT +costo;
          System.out.print(" el costo es: "+costo);
          System.out.print(" y el descuento es: "+descuento);
          System.out.println();
        }
        System.out.print(" el pago total es de : "+pagoT);
  }
  static void ejercicio6(){
    int presupuesto;
     System.out.print(" Ingresar el valor de presupuesto: ");
     presupuesto = sc.nextInt();
     sc.nextLine();
     if(presupuesto<=10)
     System.out.print(" podra adquirir tarjetas: ");
     if(presupuesto>10 && presupuesto<=100)
     System.out.print(" podra adquirir chocolates: ");
      if(presupuesto>100 && presupuesto<=250)
     System.out.print(" podra adquirir flores: ");
     if(presupuesto>250)
     System.out.print(" podra adquirir un anillo: ");
  }
  static void ejercicio7(){
    double bono, puntos, salario;
    System.out.print(" Ingresar los puntos: ");
     puntos = sc.nextInt();
     sc.nextLine();
     System.out.print(" Ingresar el salario: ");
     salario = sc.nextInt();
     sc.nextLine();
     bono=0;
     if(puntos<=100)
     bono=salario;
     if(puntos>100 && puntos<=150)
     bono=salario*2;
     if(puntos>150)
     bono=salario*3;
     System.out.print(" su bono es de "+bono+" por tener "+puntos+" puntos ");
  }
  static void ejercicio8(){
    double beca, edad, promedio;
     System.out.println("Ingresar edad:");
    edad=sc.nextDouble();
    sc.nextLine();
    System.out.println("Ingresar promedio:");
    promedio=sc.nextDouble();
    sc.nextLine();
    beca=0;
    if(edad>18&&promedio>=9)
            beca=2000;
    if(edad>18&&promedio>=7.5&&promedio<9)
            beca=1000;
    if(edad>18&&promedio>=6&&promedio<7.5)
            beca=500;
    if(edad<=18&&promedio>=9)
            beca=3000;
    if(edad<=18&&promedio>=8&&promedio<9)
            beca=2000;
    if(edad<=18&&promedio<=6&&promedio<8)
            beca=1000;
    if(promedio<6)
    System.out.println(" esfuerzate mas para la proxima ");
    System.out.println(" valor de beca: "+beca);
  }
  static void ejercicio9(){
    int calificacion;
     System.out.println(" Ingresar calificacion: ");
    calificacion=sc.nextInt();
    sc.nextLine();
    if(calificacion==10)
    System.out.println(" obtubo una calificacion A ");
    if(calificacion==9)
    System.out.println(" obtubo una calificacion B ");
    if(calificacion==8)
    System.out.println(" obtubo una calificacion C ");
    if(calificacion<=7 && calificacion>=6)
    System.out.println(" obtubo una calificacion D ");
    if(calificacion<=5 && calificacion>=0)
    System.out.println(" obtubo una calificacion F ");
  }
  static void ejercicio10(){
    double dinerorecibido;
    System.out.println(" Ingresar dinero recibido: ");
    dinerorecibido=sc.nextInt();
    sc.nextLine();
      if(dinerorecibido>=50000)
            System.out.println("Paquete A");
            System.out.println("Television,"+ "Un modular,"+"Tres parese de Zapatos,"+"cinco camisas,"+"y cinco pantalones.");
        if(dinerorecibido>=20000&&dinerorecibido<50000)
            System.out.println("Paquete B");
            System.out.println("una grabadora,"+" tres pares de zapatos," +"cinco camisas"+ "y cinco pantalones");
        if(dinerorecibido>=10000&&dinerorecibido<20000)
            System.out.println("Paquete C");
            System.out.println("dos pares de zapatos,"+ "tres camisas"+ "y tres pantalones.");
        if(dinerorecibido<10000)
            System.out.println("Paquete D");
            System.out.println("un par de zapatos,"+" dos camisas " +"y dos pantalones.");
  }
  
 static void menudeopciones(){
  int opcionesA=0;
   String msg="\n que opcion quieres provar ";
    System.out.println(msg);
    String msg1= " ejercicio1 (1)";
    System.out.println(msg1);
    String msg2= " ejercicio2 (2)";
    System.out.println(msg2);
     String msg3= " ejercicio3 (3)";
    System.out.println(msg3);
    String msg4= " ejercicio4 (4)";
    System.out.println(msg4);
     String msg5= " ejercicio5 (5)";
    System.out.println(msg5);
    String msg6= " ejercicio6 (6)";
    System.out.println(msg6);
     String msg7= " ejercicio7 (7)";
    System.out.println(msg7);
     String msg8= " ejercicio8 (8)";
    System.out.println(msg8);
     String msg9= " ejercicio9 (9)";
    System.out.println(msg9);
    String msg10= " ejercicio10 (10)";
    System.out.println(msg10);

      opcionesA=sc.nextInt();  
      while(opcionesA!=0){
          switch(opcionesA) {
          case 1:ejercicio1();break;
          case 2:ejercicio2();break;
          case 3:ejercicio3();break;
          case 4:ejercicio4();break;
          case 5:ejercicio5();break;
          case 6:ejercicio6();break;
          case 7:ejercicio7();break;
          case 8:ejercicio8();break;
          case 9:ejercicio9();break;
          case 10:ejercicio10();break;

           default:
          System.out.println("El Algoritmo no existe!");
        }
      System.out.println(msg);
      opcionesA=sc.nextInt();        
    }

  }

   public static void main(String[] args) {
    menudeopciones();
  }
}