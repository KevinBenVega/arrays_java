```pascal
INICI
    DEFINIR nombres COM ARRAY DE 7 ENTERS
    
    PER i DES DE 0 FINS A nombres.length - 1
        ESCRIURE("Ingrese el numero ", i)
        LLEGIR(num)
        nombres[i] <- num
    FIPER
    
    maximo <- nombres[0]
    posicionMaximo <- 0
    
    minimo <- nombres[0]
    posicionMinimo <- 0
    
    PER i DES DE 1 FINS A nombres.length
        SI nombres[i] > maximo LLAVORS
            maximo <- nombres[i]
            posicionMaximo <- i
        FISI
        
        SI nombres[i] < minimo LLAVORS
            minimo <- nombres[i]
            posicionMinimo <- i
        FISI
    FIPER
    
    ESCRIURE("Maximo: ", maximo, ", al indice", posicionMaximo)
    ESCRIURE("Minimo: ", minimo, ", al indice", posicionMinimo)
FI
```