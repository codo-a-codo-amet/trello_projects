Algoritmo Dibujar
	Escribir "Ingrese un ancho"
	Leer ancho 
	Escribir "Ingrese un alto"
	Leer alto
	
	filaasteriscos<-""
	
	x<-0
	Repetir
		filaasteriscos<-Concatenar(filaasteriscos,"*")
		x<-x+1
	Hasta Que x>=ancho
	
	p<-0
	Repetir
		Escribir "fila ",p+1," ", filaasteriscos
		p<-p+1
	Hasta Que p>=alto
	
FinAlgoritmo
