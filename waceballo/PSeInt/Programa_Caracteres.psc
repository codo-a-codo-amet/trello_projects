Algoritmo LeerCaracteres
	Escribir "Ingrese Nombre"
	Leer nombre
	Escribir "Ingrese Apellido"
	Leer apellido
	
	nombre_completo<-Concatenar(nombre, " ")
	nombre_completo<-Concatenar(nombre_completo, apellido)
	
	Escribir "La longitud de tu nombre completo es ", Longitud(nombre_completo)
	
	primer_nombre<-subcadena(nombre_completo,0,Longitud(nombre))
	
	Escribir "Tu primer nombre extraido de la cadena completa es ",primer_nombre
	
	Escribir "La longitud de tu nombre es ",Longitud(nombre)
	
	Escribir "Opcion Para"
	Para x<-0 Hasta Longitud(nombre)-1 Con Paso 1 Hacer
		Escribir "La letra para la posicion ", x, " es ", Mayusculas(Subcadena(nombre, x, x))
	Fin Para
	
	Escribir "Opcion Mientras"
	p<-0
	Mientras Longitud(nombre)>p Hacer
		Escribir "La letra para la posicion ", p, " es ", Mayusculas(Subcadena(nombre, p, p))
		p<-p+1
	Fin Mientras
	
	Escribir "Opcion Repetir"
	m<-0
	Repetir
		Escribir "La letra para la posicion ", m, " es ", Mayusculas(Subcadena(nombre, m, m))
		m<-m+1
	Hasta Que m>Longitud(nombre)-1
	
FinAlgoritmo
