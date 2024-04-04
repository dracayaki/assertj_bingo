package org.iesvdm;

import org.assertj.core.api.AbstractBooleanAssert;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import static org.assertj.core.api.Assertions.*;

public class BingoTest {

    @Test
    void testCartonNoRepetidos() {
        int[][] carton = new int[9][3];
        boolean repetido = true;
        Bingo.rellenarNumerosCarton(carton);

        for (int i = 0; i < carton.length; i++) {
            for (int j = 0; j < carton[0].length; j++) {
                if (j == 0) {
                    if (carton[i][j] == carton[i][1] || carton[i][j] == carton[i][2]) {
                        repetido = false;
                    }
                } else if (j == 1) {
                    if (carton[i][j] == carton[i][0] || carton[i][j] == carton[i][2]) {
                        repetido = false;
                    }
                } else if (j == 2) {
                    if (carton[i][j] == carton[i][0] || carton[i][j] == carton[i][1]) {
                        repetido = false;
                    }
                }
            }
        }
        /*leyendo la libreria he visto que podia usar assert().doesNotHaveDuplicates*/
        AbstractBooleanAssert<?> notEqualTo = assertThat(repetido).isNotEqualTo(false);
    }

    @Test
    void testCartonOrdenado(){
        int [][] carton = new int[9][3];
        Bingo.rellenarNumerosCarton(carton);
     for (int i = 0; i < 9; i++){
        assertThat(carton[i]).isSorted();
        }
    }

    @Test
    void buscarFilaNegativo(){ //no deberia de fallar

        int[][] carton = {
                {1, -1, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        assertThat(Bingo.buscarFila(carton, 0, 1)).isNotEqualTo(false);
    }

    @Test
    void buscarFilaNoNegativo(){

        int[][] carton = {
                {1, -1, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        assertThat(Bingo.buscarFila(carton, 1, 1)).isNotEqualTo(true);
    }

    @Test
    void buscarColumnaTrue(){
        int[][]carton = {
                {-1, -1, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        assertThat(Bingo.buscarColumna(carton, 0)).isNotEqualTo(false);
    }

    @Test
    void buscarColumnaFalse(){
        int[][]carton = {
                {-1, -1, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        assertThat(Bingo.buscarColumna(carton, 1)).isNotEqualTo(true);
    }

    @Test
    void ponerBlancos(){
      int[][] carton = new int[9][3];


      Bingo.ponerBlancos(carton);


        for (int i = 0; i < carton.length; i++) {
            int contadorBlanco = 0;
            for (int j = 0; j < carton[0].length; j++) {
              if(carton[i][j] == -1){
                  contadorBlanco++;
              }
          }
            assertThat(contadorBlanco).isLessThanOrEqualTo(4);

        }

    }

    @Test
    void pintarCarton(){
        int[][] carton = {
                {1, 2, 3},
                {4, 5, 6},
                {11, 6, 10},
                {10, 7, 86},
                {32, 4, 54},
                {67, 6, 54},
                {22, 7, 45},
                {23, 45, 43},
                {6, 32, 67},
        };

        int[] bolas = { 6, 1, 7}; // 7 aciertos
        assertThat(Bingo.pintarCarton(carton, bolas)).isEqualTo(7);
    }

    @Test
    void insertarAlFinalUltimoIndex(){
        int[] bolas = {1, 2, 3};
        int elemento = 4;


        assertThat(Bingo.insertarAlFinal(bolas, elemento)).contains(4, atIndex(3));
    }
    @Test
    void ordenarTest(){
        int[] bolas = {6, 1,7, 2};

        assertThat(Bingo.ordenar(bolas)).isSorted();
    }
}

