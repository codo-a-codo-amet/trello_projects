Algoritmo Reloj
	h<-0
	m<-0
	s<-0
	
	Escribir "Ingrese un horario en formato 24 hs"
	Escribir "----------------------------------------"
	Escribir "Hora y Minutos"
	
	Repetir
		Escribir "Ingrese una hora"
		Leer hora	
	Hasta Que hora<=24
	
	Repetir
		Escribir "Ingrese los minutos"
		Leer minuto	
	Hasta Que minuto<=60
	
	Escribir  "Ud. ingreso la siguiente hora ", hora, "-", minuto
	Escribir "----------------------------------------"
	
	Escribir "1- h y m ", h," ",m
	Escribir "2- minuto ", hora, " ",minuto
	
	
	Si h=hora y m=minuto Entonces
	Repetir
		//Borrar Pantalla

		Si s=60 Entonces
			m<-m+10
			s<-0
			Si m=60 Entonces
				h<-h+1
				m<-0
				s<-0
			FinSi
		FinSi
			
		Escribir h,"-",m,"-",s
		Esperar 1 Segundos
		s<-s+10
	Hasta Que s>60
	
	seguir<-Falso			
	Escribir "2 ", seguir
	
FinSi	

	Escribir "2- h y m ", h," ",m
	Escribir "2- minuto ", hora, " ",minuto
	
	Si seguir Entonces
		Escribir "Hora de levantarse...!!!"
	FinSi
	
FinAlgoritmo
