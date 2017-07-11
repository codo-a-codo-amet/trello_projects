Funcion encontro <- ValidaCorreo (valor)
	largocorreo<-Longitud(valor)
	
	Dimension correo[largocorreo]
	encontro<-Falso
	Para x<-0 Hasta largocorreo-1 Con Paso 1 Hacer
		Si encontro=Falso Entonces
			correo[x]<-Subcadena(valor, x, x)
			Si correo[x]="@" Entonces
				encontro<-Verdadero
			FinSi	
		FinSi
	Fin Para
Fin Funcion

Funcion contrasenia <- ValidaContrasenia (valor)
	pws<-valor
	largo <- Longitud(pws)
		
	Si largo=8 Entonces
		contrasenia<-pws
	Sino
		Escribir "Debe ingresar una contrasenia de 8 caracteres"
		Leer contra
	FinSi
FinFuncion

Funcion Logearse(u, c, user, pws)
	Si user=u Y contrasenia=c Entonces
		Escribir "Bienvenido al Sistema"
	Sino
		Escribir "Error de Usuario y/o Contraseña ...."
	FinSi
FinFuncion

//Formulario de Registro
Funcion Formulario(user,contrasenia )
	Escribir "Complete los campos requeridos para registrarse"
	Escribir "+++++++++++++++++++++++++++++++++++++++++++++++"
	Escribir "Ingrese su Nombre"
	Leer nombre
	Escribir "Ingrese su Apellido"
	Leer apellido
	Escribir "Ingrese su Correo Electronico"
	Repetir
		Leer email
		encontro<-ValidaCorreo(email)
	Hasta Que encontro
		
	Escribir "Ingrese un Usuario"
	Leer usuario
	user<-usuaio
	Escribir "Ingrese una Contraseña"
	Leer contra
	contrasenia <- ValidaContrasenia (contra)
	Escribir "Reingrese de nuevo su Contraseña"
	vali<-Falso
	Repetir
		Leer contra1
		Si contrasenia=contra1 Entonces
			Escribir "Contrasenia Confirmada..."
			vali<-Verdadero
		FinSi
	Hasta Que vali
	Borrar Pantalla
FinFuncion

Funcion FormularioLogin(user,contrasenia)
	Escribir "+++++++++++++++++++++++++++++++++++++++++++++++"
	Escribir "Ingrese su Usuario"
	Leer user
	Escribir "Ingrese su Clave"
	Leer pws
	Logearse(user, pws, usuario, contrasenia)
	Escribir "+++++++++++++++++++++++++++++++++++++++++++++++"
FinFuncion

//Inicio del programa
Algoritmo Login
	user<-""
	contrasenia<-""
	Formulario(user,contrasenia)
	FormularioLogin(user,contrasenia)
FinAlgoritmo
