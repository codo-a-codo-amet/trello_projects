Algoritmo Dibujar2
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
	Escribir "fila ",p," ", filaasteriscos
	Repetir
		Si p>1 Entonces
			Escribir "fila ",p+1," ", filaasteriscos	
		FinSi
		
		p<-p+1
	Hasta Que p>=alto
	Escribir "fila ",p+1," ", filaasteriscos
FinAlgoritmo
