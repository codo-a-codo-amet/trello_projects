Funcion contador <- contar_vocales ( texto_completo )
	contador <-0
	indice<-0
	longitud_del_texto <-Longitud(texto_completo)
	
	Repetir
		un_caracter<-subcadena(texto_completo,indice,indice)
		
		Si una_vocal(un_caracter) Entonces
			contador<-contador+1	
		FinSi
		indice<-indice+1
	Hasta Que indice>=longitud_del_texto
Fin Funcion 

Funcion es_vocal <- una_vocal(letra)
	es_vocal<-Falso
	Si letra='a' o letra='e'o letra='i' o letra='o' o letra='u' Entonces
		es_vocal <- Verdadero
	FinSi
FinFuncion

Algoritmo ContarVocales
	Escribir "----------------------------"	
	Escribir "Ingrese una cadena de texto"
	Leer tex
	Borrar Pantalla
	
	Escribir "----------------------------"	
	Escribir 'La cadena que ud. escribio es: '+tex
	num<-contar_vocales(Minusculas(tex))
	
	Si num=1 Entonces
		t<-" vocal"
	Sino
		t<-" vocales"
	FinSi
	
	Escribir "Su cadena tiene ",num,t
	Escribir "Su cadena tiene una longitud de ", Longitud(tex)
	Escribir "----------------------------"
FinAlgoritmo
