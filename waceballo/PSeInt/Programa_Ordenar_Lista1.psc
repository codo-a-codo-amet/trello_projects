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
	
	//Creo una lista donde voy guardando el menor valor
	Dimension lista_ordenada(elementos)
	tercer_contador <- 0
	auxiliar<-lista_a_ordenar[0]
	segundo_auxiliar <-auxiliar
	
	Repetir
		segundo_contador <- 0
		Repetir
			valor_en_la_lista<-lista_a_ordenar[segundo_contador]
			Si valor_en_la_lista<auxiliar Entonces //
				auxiliar<-valor_en_la_lista
			FinSi
			segundo_contador<-segundo_contador+1
		Hasta Que segundo_contador>=elementos 
		
		lista_ordenada[tercer_contador]<-auxiliar
		
		tercer_contador<-tercer_contador+1
	Hasta Que tercer_contador>=elementos
	
	Escribir "La lista Ordenada es"
	Escribir "+++++++++++++++++"
	
	cuarto_contador<-0
	
	Repetir
		
		Escribir lista_ordenada[cuarto_contador]
	
		cuarto_contador<-cuarto_contador+1
	Hasta Que cuarto_contador>=elementos
	
Fin Algoritmo
