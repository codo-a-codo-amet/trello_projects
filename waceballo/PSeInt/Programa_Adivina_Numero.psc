Funcion n <- genera_numero ()
	n<-Aleatorio(0,1000)
Fin Funcion

Funcion compara_numeros(v1, v2)
	Si v1>v2 Entonces
		Escribir "Debes elegir un numero mayor"
	Sino
		Escribir "Debes elegir un numero menor"
	FinSi
FinFuncion

Algoritmo AdivinaNumero
	numero_a_adivinar<-genera_numero()
	//Escribir numero_a_adivinar
	contador<-1
	intentos<-4
	i<-intentos-3
	
	Escribir "Adivine que numero se genero, tiene 4 intentos"
	Escribir "Ingrese un numero que este entre 0 y 1000"
	Escribir "Intento numero ", i
	Leer num
	Borrar Pantalla
	
		Si num=numero_a_adivinar Entonces
			Escribir "Son un genio....."
		Sino

			Repetir
				i<-i+1			
				compara_numeros(numero_a_adivinar,num)
				Escribir "Fallastes, intento numero ", i
				Leer num
				contador<-contador+1	
			Hasta Que contador>=intentos
		FinSi
		Escribir "---------------------------------------------------"
FinAlgoritmo
