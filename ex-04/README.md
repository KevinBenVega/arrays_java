```pascal
INICI
    DEFINIR nombres COM ARRAY DE 8 ENTERS
    numPositivos <- 0
    numNegativos <- 0
    numCeros <- 0
    
    PER i DES DE 0 FINS A array1.length - 1
        ESCRIURE("Ingrese el numero ", i)
        LLEGIR(num)
        nombres[i] <- num
    FIPER
    
    PER i DES DE 0 FINS A array1.length - 1
        SI nombres[i] > 0 LLAVORS
            numPositivos <- numPositivos + 1
        SINO nombres[i] < 0 LLAVORS
            numNegativos <- numNegativos + 1
        SINO
            numCeros <- numCeros + 1
    FIPER
    
    ESCRIURE("Positivos: ", numPositivos)
    ESCRIURE("Negativos: ", numNegativos)
    ESCRIURE("Ceros: ", Ceros)
FI
```