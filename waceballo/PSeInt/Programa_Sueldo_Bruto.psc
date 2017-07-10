// Esta funcion debe Escribir una ayuda para el usuario del programa que explique como funciona cada parametro u opcion 
// por ejemplo , si nuestra aplicacion termina su ejecuion ingresando el valor 0 entonces debe estar explicado en la ayuda.
Funcion EscribirAyuda()
    Escribir "Programa: Calculo de Sueldo bruto version "
    Escribir "*********************2****************"
    Escribir "Con este programa ud podra calcular su sueldo neto mensual y "
    Escribir "si realiza horas extras el importe neto de las mismas al 50% o 100%"
    Escribir "*************************************"
    // Terminar de escribir la funcion de ayuda
Fin Funcion

// Esta funcion servira para que cada programa en pseudocodigo tenga un Menu de opciones. 
// No recibe Argumentos ni retorna ningun valor.
// Recordemos que las funciones son de la siguiente manera
// Funcion variable_retorno <- NombreFuncion (argumento1, argumento2, argumento3 ...) <- Puede tener ninguno o varios argumentos.
Funcion  EscribirMenu ( )
    Escribir "*************************************"
    Escribir " Seleccione una de las ociones"
    Escribir "*************************************"
    Escribir " 1- Calcular el sueldo bruto mensual tomando en cuenta el valor por hora"
    Escribir " 2- Muestra la ayuda"
    Escribir " 0- Salir del programa"    
Fin Funcion

// Escribir y usar la funcion siguiente
Funcion sueldo_bruto<-CalcularBruto(op, horas_trabajadas, valor_por_hora)
    bruto <- horas_trabajadas*horasextras(op, valor_por_hora)
    CalcularNeto(bruto)
    
    //Escribir "El neto de sus horas extra es de ",
Fin Funcion

Funcion CalcularNeto(importe)
    jub<-importe*11/100
    ley<-importe*3/100
    os<-importe*3/100
    sind<-importe*2/100
	
    neto<-importe-jub-ley-os-sind
    
    Escribir "Su neto es de ", neto
FinFuncion

Funcion valor<-horasextras(op, importe)
    Segun op Hacer
        1:
            valor<-importe/200*15/10
        2:
            valor<-importe/200*2
        De Otro Modo:
            Escribir "No ingreso ninguna operacion permitida..."
    Fin Segun
FinFuncion


// El algoritmo principal que decide que hacer con la opcion ingresada esta encapsulado en esta funcion 
Funcion   CalculoDeSueldoBruto ( opcionSeleccionada )
    Segun opcionSeleccionada Hacer
        1:
            //Escribir "opcion 1"//Terminar de escribir
            Escribir "Escriba un Sueldo"
            Leer importe
            CalcularNeto(importe)
            
            Escribir "Escriba la cantidad de horas extras"
            Leer horas
            
            Escribir "Seleccione a que valor las quiere calcular"
            Escribir "1 - Calcular horas extras al 50%"
            Escribir "2 - Calcular horas extras al 100%"            
            Leer op
            sueldo_bruto <- CalcularBruto(op, horas, importe)
            
        2:
            EscribirAyuda()//Terminar de escribir
        0:
            Escribir "Gracias por usar este programa. Saliendo..."
        De Otro Modo:
            Escribir "Opcion invalida, para mas ayuda ingrese H"
    Fin Segun
Fin Funcion

//Este es un programa simple que usa funciones y repetecion en el control de flujo del programa
Algoritmo SueldoBruto
    //Usaremos Repetir mientras para este ejemplo
    Repetir
        Borrar Pantalla
        EscribirMenu()
        Leer opcion_seleccionada
        CalculoDeSueldoBruto(opcion_seleccionada)
        //Terminar de escribir el programa
		
        Escribir "Presione una tecla para continuar..."
        Esperar Tecla
        
    Hasta Que opcion_seleccionada es 0
    
    
FinAlgoritmo