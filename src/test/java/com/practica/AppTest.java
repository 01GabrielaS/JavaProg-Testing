package com.practica;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;




class AppTest {
    @BeforeEach
    void setUp() {
        System.out.println("Iniciando caso de prueba...");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Finalizando caso de prueba...");
    }


    //Tests
    @Test 
    @DisplayName("Solo un elemento en el array") 

    void testCP1_UnElementos(){
        //Arrange
        int []vet ={3};
        int [] esperado={3};

        //Act
        App.bubbleSort(vet);

        //Assert
        assertArrayEquals(esperado,vet,"Arreglo de 1 elemento, for no se ejecuta");
    }

    @Test 
    @DisplayName("Array ya esta ordenado") 
    void testCP2_Ordenado(){
        int []vet ={1,2};
        int [] esperado={1,2};

        //Act
        App.bubbleSort(vet);

        //Assert
        assertArrayEquals(esperado,vet,"Arreglo ordenado, no se realiza intercambio");
    }

    @Test 
    @DisplayName("Array sin ordenar") 
    void testCP3_No_Ordenado(){
        int []vet ={2,1};
        int [] esperado={1,2};

        //Act
        App.bubbleSort(vet);

        //Assert
        assertArrayEquals(esperado,vet,"Arreglo desordenado, realiza intercambio");
    }
}
