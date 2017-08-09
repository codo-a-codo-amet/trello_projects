//Ingresa el listado de alumnos
Funcion IngresoAlumnos (lista_alumnos, cantidad_alumnos)
	Dimension lista_alumno[cantidad_alumnos]
	Dimension Lista_apellido[cantidad_alumnos]
	
	alumnos_ingresados<-0
	
	Repetir
		Escribir "Ingrese el nombre del alumno N° ",alumnos_ingresados+1
		Leer nombre_alumno
		Escribir "Ingrese apellido del alumno"
		Leer apellido_alumno
		
		lista_alumno[alumnos_ingresados] <- nombre_alumno
		lista_apellido[alumnos_ingresados] <- apellido_alumno
		
		alumnos_ingresados <- alumnos_ingresados+1
		
	Hasta Que alumnos_ingresados>=cantidad_alumnos
Fin Funcion

//Imprimi el listado de alumnos
Funcion ImprimirAlumnos (lista_alumno, lista_apellido, cantidad_alumnos)
	Borrar Pantalla
	
	Escribir "La Lista completa de Alumnos es"
	Escribir "*******************************"
	Escribir "Nombre  |  Apellido"
	Escribir "*******************************"
	
	paso <- 0
	
	Repetir
		Escribir lista_alumno[paso], "  |  ",lista_apellido[paso]
		paso<-paso+1
	Hasta Que paso=cantidad_alumnos	
FinFuncion

Algoritmo Programa_Lista_Alumnos
	Escribir "Ingrese la cantidad de alumnos"
	Leer cantidad_alumnos
	
	Dimension lista_alumno[cantidad_alumnos]
	Dimension Lista_apellido[cantidad_alumnos]
	
	IngresoAlumnos(Lista_alumno, cantidad_alumnos)
	ImprimirAlumnos(Lista_alumno, Lista_apellido, cantidad_alumnos)
FinAlgoritmo
