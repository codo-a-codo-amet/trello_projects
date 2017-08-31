Algoritmo ConversionGrados
	
Texto <- tipoUnidad
Decimal <- valorTemperatura

IMPRIMIR "Ingrese el tipo de unidad entre K, F o C"
Leer tipoUnidad

IMPRIMIR "Ingrese el valor"
Leer valorTemperatura

IMPRIMIR "Seleccione entre K, F o C para conversion"
	Texto <- tipoUnidadDestino
	Decimal <- valorConvertidoTemperatura
	
	Leer tipoUnidadDestino
	
	SI (tipoUnidadDestino == 'F' ) 
		
		SI tipoUnidad == 'C' ENTONCES 
			valorConvertidoTemperatura = (C * 9 / 5) + 32
		SINO 
			SI == 'K' ENTONCES 
				valorConvertidoTemperatura = 9/5 * (K -273) + 32
			SINO 
				ENTONCES valorConvertidoTemperatura = valorTemperatura
			FIN SI
		SINO (tipoUnidadDestinto == 'K') ENTONCES 
				SI tipoUnidad == 'C' ENTONCES 
					valorConvertidoTemperatura = C + 273
				SINO 
					SI tipoUnidad == 'F' ENTONCES 
						valorConvertidoTemperatura =  ((F - 32) * 5/9) + 273
					SINO 
						ENTONCES valorConvertidoTemperatura = valorTemperatura
					FIN SI
				SINO SI (tipoUnidadDestinto == 'C') ENTONCES 
						SI tipoUnidad == 'K'
							ENTONCES valorConvertidoTemperatura = K - 273
						SINO SI tipoUnidad == 'F' 
								ENTONCES valorConvertidoTemperatura = (F - 32) * 5 / 9
							SINO 
								ENTONCES valorConvertidoTemperatura = valorTemperatura
							FIN SI
						FIN SI
						IMPRIMIR "El valor de temperatura " , valorTemperatura , tipoUnidad , " es equivalente a -> " , valorConvertidoTemperatura, tipoUnidadDestinto
					FIN
FinAlgoritmo