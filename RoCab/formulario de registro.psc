Algoritmo FormularioDeRegistro
					
	Escribir "Ingrese Nombre "
	Leer nombre
	Escribir "Ingrese Apellido "
	Leer apellido	
	
	Repetir
		Escribir "Ingrese e-Mail "
		Leer email
			Repetir
				contador1<-contador1+1
				si Subcadena(email,contador1,contador1)="@"
					email_verif<-1
				FinSi
			Hasta Que email_verif=1 o contador1>longitud(email)
		contador1<-0
	Hasta que email_verif=1
	
	Repetir
		Escribir "Ingrese Contraseņa (min 8 caracteres)"
		Leer contraseņa1
	Hasta Que Longitud(contraseņa1)>=8 
	Repetir
		Escribir "Repetir Contraseņa "
		Leer contraseņa2
	Hasta Que contraseņa1=contraseņa2	
	
	//Borrar Pantalla
				Imprimir  "Bienvenido sus datos de registro son: "
				Imprimir " Nombre : ",nombre
				Imprimir "Apellido: ",apellido
				Imprimir " e-Mail : ",email
				Borrar Pantalla			
		Repetir
				
		Escribir "Inicie Sesion ingresando e-Mail y contraseņa "			
		Escribir "e-Mail: "
		Leer emailreg
		Escribir "Contraseņa: "
		Leer contraseņareg
		
				si emailreg=email Y contraseņa1=contraseņareg
					Imprimir "Inicio exitoso"
				Sino
					imprimir "Verifique los datos"
				FinSi
		Hasta Que emailreg=email Y contraseņa1=contraseņareg
FinAlgoritmo
