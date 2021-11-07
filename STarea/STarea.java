import java.util.Scanner;
public class STarea{
  static Scanner sc = new Scanner(System.in);

  static void salarioprof(){
    double salarioI=1500, salarioF=0, incremento, salarioT=0;
    int i=0, años=0;
     
    for(i=1; i<=6; i++){
      if (i<6){
        salarioF=salarioI*12;
        años=i;
        System.out.println("en "+años+" años obtubo un salario de "+salarioF);
        incremento=salarioI*0.10+salarioI;
        salarioI=incremento;

      } else{
        salarioF=salarioI*12;
        System.out.println("en 6 años obtubo un salario de "+salarioF);
        
      }
    }
  }
  static void hamburguesas(){
    int hamburgS=0, hamburgD=0, hamburgT=0;
    double pago1=0, pago2=0, pago3=0, pagoT=0, pagoTR=0, compra=0;
    System.out.println("ingrese la cantidad de hamburguesas sencillas a adquirir");
    hamburgS=sc.nextInt();
    sc.nextLine();
    System.out.println("ingrese la cantidad de hamburguesas dobles a adquirir");
    hamburgD=sc.nextInt();
    sc.nextLine();
    System.out.println("ingrese la cantidad de hamburguesas triples a adquirir");
    hamburgT=sc.nextInt();
    sc.nextLine();
    System.out.println("elige metodo de pago");
    System.out.println("\t1.- pago por tarjeta");
    System.out.println("\t2.- pago por efectivo");
    System.out.println("\t: ");
    compra=sc.nextInt();
    sc.nextLine();

    do {
      if (compra<1||compra>2){
        System.out.println("valor incorrecto");
      }
    }while(compra<1||compra>2);
    if (compra==1){
      pago1=hamburgS*20;
      pago2=hamburgD*25;
      pago3=hamburgT*28;
      pagoT=pago1+pago2+pago3;
      pagoTR=pagoT*0.05+pagoT;
      System.out.println("el pago a realizar es de: "+pagoTR);
    }
    if (compra==2){
      pago1=hamburgS*20;
      pago2=hamburgD*25;
      pago3=hamburgT*28;
      pagoT=pago1+pago2+pago3;
      System.out.println("el pago a realizar es de: "+pagoT);
      }
    }
    static void dineroahorrar(){
      long dinero, i=1;
      double suma=0;
      dinero=3;
      for(i=0; i<=365; i++){
        suma=suma+Math.pow(dinero, i);
        System.out.println("el dia "+i+" el ahorro es "+Math.pow(dinero, i));
      }
      System.out.println("el ahorro total durante el año es de "+suma+"pesos");
    }
    static void articuloscompra(){
      int n;
      double presio, descuento=0, total=0, total1=0;
      System.out.println("ingrese en numero de articulos que desee comprar:");
      n=sc.nextInt();
      while(n>0){
        System.out.println("ingrese el precio del articulo "+n+":");
        presio=sc.nextInt();
        if(presio>=200){
          descuento=presio*0.15;
  
        } if(presio>100&&presio<200){
          descuento=presio*0.12;
        } if(presio<=100){
          descuento=presio*0.10;

        }
        total1=presio-descuento;
        System.out.println("el presio del articulo adquirido es: S/"+total1);
        System.out.println("el descuento obtenido es: S/"+descuento);
        total=total+total1;
        n--;

      }
      System.out.println("el total que tiene que pagar es: S/"+total);
    }
    static void promediodedatos(){
      int i, n, salones=0, edad, alumnos=0;
      double total=0, suma=0;
      System.out.println("ingresar numero de salones de la escuela");
      salones=sc.nextInt();
      while(salones>0){
        System.out.println("ingrese cantidad de alumnos");
        n=sc.nextInt();
        for(i=1; i<=n; i++){
          System.out.println("ingrese la edad del alumno "+i);
          edad=sc.nextInt();
          suma=suma+edad;
        
        }
        System.out.println("el promedio del salon"+salones+" es:"+(suma /n)+"años");
        alumnos=alumnos+n;
        total=total+suma;
        salones--;
      }
      System.out.println("el promedio de todos los salones de la escuela es:"+(total /alumnos)+"años");
    }
    static void calcularnumeros(){
      int n, total;
      System.out.println("ingresar la cantidad de numeros:");
      total=sc.nextInt();
      while(total>0){
        System.out.println("ingrese un numero");
        n=sc.nextInt();
        if(n>0){
          System.out.println("el numero "+n+" elevado al cubo es: "+(n*n*n));

        }
        total--;

      } 

    }
    static void tablamultiplicar(){
      int i=0, n, resultado;
      System.out.println("ingrese el numero entero:");
      n=sc.nextInt();

      for (i=1; i<=12; i++){
        resultado=n*i;
        System.out.println(+n+" x "+i+" = "+resultado);

      }
    }
    static void interes(){
      int i;
      double inversion=1500, inversionT=0;

      for(i=1; i<=60; i++){
        inversionT=inversion*0.15+inversion;
        System.out.println("en el año "+i+" la inversion es de: S/"+inversionT);
        inversion=inversionT;

      }
      System.out.println("la inversion total hasta la actualidad es de: S/"+inversionT);
    }
    static void problemascero(){
      int i, n, total, igual, menor, mayor;
      igual=0;
      menor=0;
      mayor=0;
      System.out.println("ingrese el total de numeros:");
      total=sc.nextInt();
      for(i=1; i<=total; i++){
        System.out.println("ingrese un numero:");
        n=sc.nextInt();

        if(n==0){
          igual++;
        }
        if(n<0){
          menor++;
        }if(n>0){
          mayor++;
        }
      }
       System.out.println("el total de numeros iguales a cero es: "+ igual);
       System.out.println("el total de numeros menores a cero es: "+ menor);
       System.out.println("el total de numeros mayores a cero es: "+ mayor);
    } 
    static void cantidaddinero(){
      int n, bill10, bill20, bill50, mon10, mon5, mon1, total, totalM, totalB;
      totalM=0;
      totalB=0;
      System.out.println("ingrese cantidad de monedas de 10 pesos:");
      mon10=sc.nextInt();
      System.out.println("ingrese cantidad de monedas de 5 pesos:");
      mon5=sc.nextInt();
      System.out.println("ingrese cantidad de monedas de 1 pesos:");
      mon1=sc.nextInt();
      System.out.println("ingrese cantidad de billetes de 10 pesos:");
      bill10=sc.nextInt();
      System.out.println("ingrese cantidad de billetes de 20 pesos:");
      bill20=sc.nextInt();
      System.out.println("ingrese cantidad de billetes de 50 pesos:");
      bill50=sc.nextInt();
      System.out.println("\t1.- total de dinero en monedas");
      System.out.println("\t2.- total de dinero en billetes");
      System.out.println("\t:");
      total=sc.nextInt();
      sc.nextLine();
      do{
        if(total<1||total>2){
          System.out.println("valor incorrecto. Ingresalo nuevamente.:");
        }
      }while(total<1||total>2);
      if(total==1){
        totalM=(mon10*10)+(mon5*5)+(mon1*1);
        System.out.println("el dinero total en monedas es de: S/"+totalM);
      }
      if(total==2){
        totalB=(bill10*10)+(bill20*20)+(bill50*50);
        System.out.println("el dinero total en billetes es de: S/"+totalB);
  }
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
          case 1:salarioprof();break;
          case 2:hamburguesas();break;
          case 3:dineroahorrar();break;
          case 4:articuloscompra();break;
          case 5:promediodedatos();break;
          case 6:calcularnumeros();break;
          case 7:tablamultiplicar();break;
          case 8:interes();break;
          case 9:problemascero();break;
          case 10:cantidaddinero();break;

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