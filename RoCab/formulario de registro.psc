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
		Escribir "Ingrese Contrase�a (min 8 caracteres)"
		Leer contrase�a1
	Hasta Que Longitud(contrase�a1)>=8 
	Repetir
		Escribir "Repetir Contrase�a "
		Leer contrase�a2
	Hasta Que contrase�a1=contrase�a2	
	
	//Borrar Pantalla
				Imprimir  "Bienvenido sus datos de registro son: "
				Imprimir " Nombre : ",nombre
				Imprimir "Apellido: ",apellido
				Imprimir " e-Mail : ",email
				Borrar Pantalla			
		Repetir
				
		Escribir "Inicie Sesion ingresando e-Mail y contrase�a "			
		Escribir "e-Mail: "
		Leer emailreg
		Escribir "Contrase�a: "
		Leer contrase�areg
		
				si emailreg=email Y contrase�a1=contrase�areg
					Imprimir "Inicio exitoso"
				Sino
					imprimir "Verifique los datos"
				FinSi
		Hasta Que emailreg=email Y contrase�a1=contrase�areg
FinAlgoritmo
