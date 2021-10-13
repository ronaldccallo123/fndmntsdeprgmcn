import java.util.Scanner;
class Examen{ 
static Scanner sc = new Scanner(System.in);
static void promedionotas(){

   double nota1=0, nota2=0, nota3=0;
   double promedio=0;
   System.out.println("ingrese las notas del estudiante: ");
   System.out.print("ingrese la nota 1: ");
   nota1 = sc.nextDouble();
   System.out.print("ingrese la nota 2: ");
   nota2 = sc.nextDouble();
   System.out.print("ingrese la nota 3: ");
   nota3 = sc.nextDouble();

    promedio=nota1* 0.25+nota2* 0.25+nota3* 0.50;
      if(promedio>=13){
        System.out.println("el estudiante aprobo con: " + promedio);
      }else{
        System.out.println("el estudiante desaprobo con: " + promedio);
      }
 }
static void bonopordes(){
   double bono, puntos, salarioM;
    System.out.print("Ingresar puntos: ");
    puntos = sc.nextDouble();
    sc.nextLine();
    System.out.print("Ingresar salario minimo: ");
    salarioM = sc.nextDouble();
    sc.nextLine();
    bono=0;
    if(puntos>=100&&puntos<=200)
       bono=salarioM*0.10;
    if(puntos>=201&&puntos<=300)
       bono=salarioM*0.40;
    if(puntos>=301&&puntos<=400)
       bono=salarioM*0.70;
    if(puntos>=401)
       bono=salarioM*0.80;
    System.out.print("usted es acrededor de "+bono+ " por desempeño ");
 }

 static void vacunacion(){
   int edad, sexo;
    System.out.print("ingresar la edad: ");
    edad = sc.nextInt();
    sc.nextLine();
    System.out.print("ingresar el sexo: ");
    System.out.print("\t1.- mujer ");
    System.out.print("\t2.- hombre ");
    System.out.print("\t: ");
    do {
       sexo = sc.nextInt();
       sc.nextLine();
       if (sexo<1||sexo>2)
            System.out.print("Valor incorrecto. Ingresalo nuevamente.: ");

    }while (sexo<1||sexo>2);
    if((sexo==2&&edad>=16&&edad<70)||edad<16)
        System.out.println("usted resibira la vacuna A");
    if(sexo==1&&edad>=16&&edad<70)
        System.out.println("usted resibira la vacuna B");
    if(edad>=70)
        System.out.println("usted resibira la vacuna C");
        System.out.println("\t Ingrese codigo nuevamente");

        return;
   
 }
 static void operacionesaritmeticas(){
   double resultado=0;
   System.out.print("ingresar el primer numero: ");
   double num1 = sc.nextInt();
   System.out.print("ingresar el segundo numero: ");
   double num2 = sc.nextInt();
   System.out.print("ingresar la operacion: ");
   int operacion = sc.nextInt();
    switch(operacion){
     case 1: resultado=num1+num2;
     System.out.println("la suma de los dos numeros es :"+resultado);
     break;
     case 2: resultado=num1-num2;
     System.out.println("la resta de los dos numeros es:"+resultado);
     break;
     case 3: resultado=num1*num2;
     System.out.println("la multiplicacion de los dos numeros es:"+resultado);
     break;
     case 4: resultado=num1/num2;
     System.out.println("la division de los dos numeros es:"+resultado);
     break;
     default:
      System.out.println("LA OPERACION NO EXISTE");
      break;
     }
 }

static void menudeopciones(){
  int opcionesA=0;
   String msg="\n que opcion quieres provar ";
    System.out.println(msg);
   String msg1=" promedio del estudiante (1) ";
    System.out.println(msg1);
   String msg2=" bono por desempeño (2) ";
    System.out.println(msg2);
   String msg3=" tipo de vacuna (3) ";
    System.out.println(msg3);
    String msg4=" seleccionar operacion aritmetica  1=+, 2=-, 3=*, 4=/(4) ";
    System.out.println(msg4);

      opcionesA=sc.nextInt();  
      while(opcionesA!=0){
          switch(opcionesA) {
          case 1:promedionotas();break;
          case 2:bonopordes();break;
          case 3:vacunacion();break;
          case 4:operacionesaritmeticas();break;

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