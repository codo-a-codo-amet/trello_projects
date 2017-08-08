Algoritmo ListadoAlumnos
	Dimension lista_meses[12]
	
	lista_meses[0] <- "Enero"
	lista_meses[1] <- "Febrero"
	lista_meses[2] <- "Marzo"
	lista_meses[3] <- "Abril"
	lista_meses[4] <- "Mayo"
	lista_meses[5] <- "Junio"
	lista_meses[6] <- "Julio"
	lista_meses[7] <- "Agosto"
	lista_meses[8] <- "Septiembre"
	lista_meses[9] <- "Octubre"
	lista_meses[10] <- "Noviembre"
	lista_meses[11] <- "Diciembre"
	
	Escribir "Seleccione un numero entre 1 y 12"
	Leer numero_mes
	Escribir "El mes seleccionado es ", lista_meses[numero_mes-1]
	
FinAlgoritmo


