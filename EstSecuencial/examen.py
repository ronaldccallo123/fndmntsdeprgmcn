def promedioNotasDNP():
  print("*****Calculat Promedio final*****")
 #Datos de entrada
 nota1=float(input("Ingrese nota 1:"))
 nota2=float(input("Ingrese nota 2:"))
 nota3=float(input("Ingrese nota 3:"))
 #Proceso
 promedioFin=(nota1*0.03)+(nota2*0.04)+(nota3*0.10)
 #Datos de Salida
 print(f"Su promedio final es: {round(promedioFin,5)}")

promedioNotasDNP()