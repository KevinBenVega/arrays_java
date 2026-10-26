```pascal
INICI
    DEFINIR nombres COM ARRAY DE 5 ENTERS
    sumaNombres <- 0
    PER i DES DE 0 FINS A nombres.length - 1
        ESCRIURE("Ingrese el numero ", i)
        LLEGIR(num)
        nombres[i] <- num
        sumaNombres <- sumaNombres + nombres[i] 
    FIPER
    
    mitjana <- sumaNombres / nombres.length
    
    ESCRIURE("Suma: ", sumaNombres)
    ESCRIUR("Mitjana: ", mitjana)
FI
```