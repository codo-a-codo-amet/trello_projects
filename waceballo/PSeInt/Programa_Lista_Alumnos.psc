Algoritmo Programa_Lista_Alumnos
	Escribir "Ingrese la cantidad de alumnos"
	Leer cantidad_alumnos
	
	Dimension lista_alumno[cantidad_alumnos]
	
	alumnos_ingresados<-0
	
	Repetir
		Escribir "Ingrese nombre del alumno"
		Leer nombre_alumno
		
		lista_alumno[alumnos_ingresados] <- nombre_alumno
		alumnos_ingresados <- alumnos_ingresados+1
		
	Hasta Que alumnos_ingresados>=cantidad_alumnos
	
	Borrar Pantalla
	
	Escribir "La Lista completa de Alumnos es"
	Escribir "*******************************"
	Escribir "Nombre | "
	Escribir "*******************************"
	Repetir
		Escribir lista_alumno[paso]
		paso<-paso+1
	Hasta Que paso=cantidad_alumnos
	
FinAlgoritmo


