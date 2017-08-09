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
		Escribir "Ingrese Contraseña (min 8 caracteres)"
		Leer contraseña1
	Hasta Que Longitud(contraseña1)>=8 
	Repetir
		Escribir "Repetir Contraseña "
		Leer contraseña2
	Hasta Que contraseña1=contraseña2	
	
	//Borrar Pantalla
				Imprimir  "Bienvenido sus datos de registro son: "
				Imprimir " Nombre : ",nombre
				Imprimir "Apellido: ",apellido
				Imprimir " e-Mail : ",email
				Borrar Pantalla			
		Repetir
				
		Escribir "Inicie Sesion ingresando e-Mail y contraseña "			
		Escribir "e-Mail: "
		Leer emailreg
		Escribir "Contraseña: "
		Leer contraseñareg
		
				si emailreg=email Y contraseña1=contraseñareg
					Imprimir "Inicio exitoso"
				Sino
					imprimir "Verifique los datos"
				FinSi
		Hasta Que emailreg=email Y contraseña1=contraseñareg
FinAlgoritmo
