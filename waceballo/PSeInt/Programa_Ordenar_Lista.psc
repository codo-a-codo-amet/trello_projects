Algoritmo Ordenar_Lista
	elementos <- Aleatorio(3,10) //pueden ser 10, 100, 1000
	Dimension lista_a_ordenar[elementos]
	
	contador<-0
	Repetir
		valor_aleatorio<-Aleatorio(-1000,1000)
		lista_a_ordenar[contador]<-valor_aleatorio
		contador<-contador+1
		
		Escribir valor_aleatorio
	Hasta Que contador>=elementos
	
	aux <- lista_a_ordenar[0]
	Para x<-0 Hasta contador-1 Con Paso 1 Hacer
		Si aux < lista_a_ordenar[x] Entonces
			aux<-aux
		Sino
			aux <- lista_a_ordenar[x]
		FinSi
		
	Fin Para
	Escribir "El numero menor es ",aux	
	
	
Fin Algoritmo
