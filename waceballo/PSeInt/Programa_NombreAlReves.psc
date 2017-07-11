Algoritmo NombreAlReves
	Escribir "Ingrese un Nombre"
	Leer nombre
	
	largo<-Longitud(nombre)
	Escribir "La longitud del nombre es ",largo
	
	Dimension listanombre[largo]
	Para x<-0 Hasta Longitud(nombre)-1 Con Paso 1 Hacer
		listanombre[x]<-Subcadena(nombre, x, x)
	Fin Para
	
	Escribir "Su nombre al reves es "
	Para p<-largo-1 Hasta 0 Con Paso -1 Hacer
		Escribir sin saltar listanombre[p]
	Fin Para
	Escribir ""
	Escribir ""
	Para p<-largo-1 Hasta 0 Con Paso -1 Hacer
		Escribir "Su nombre al reves es ", listanombre[p]
	Fin Para
	
	
FinAlgoritmo
