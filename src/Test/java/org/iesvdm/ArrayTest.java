package org.iesvdm;
import org.assertj.core.api.AbstractBooleanAssert;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import static org.assertj.core.api.Assertions.*;
public class ArrayTest {

    @Test
    void limpiar(){

        int[] aux = UtilesArrays.limpiar();

        assertThat(aux).isNullOrEmpty();
    }
    @Test
    void rellenarCeros(){

        int[] prueba = new int[7];
        int[] aux = UtilesArrays.rellenar(prueba, prueba.length);

        assertThat(aux).containsOnly(0);
        assertThat(aux).hasSize(7);
    }
@Test
    void rellenarCerosTamano(){

        int[] prueba = new int[7];
        int[] aux = UtilesArrays.rellenar(prueba, prueba.length);

        assertThat(aux).hasSize(7);
    }

    @Test
    void rellenarNum(){

        int[] prueba = new int[7];
        int[] aux = UtilesArrays.rellenar(prueba, prueba.length, 7);

        assertThat(aux).containsOnly(7);

    }

    @Test
    void insertarFinalTamanoTest(){
        int[] array = {1, 2, 3};
        int[] prueba = new int[array.length + 1];

        prueba = UtilesArrays.insertarAlFinal(array, 4);
        assertThat(prueba).hasSize(4);
    }

    @Test
    void insertarFinalUltimoTest(){
        int[] array = {1, 2, 3};
        int[] prueba = new int[array.length + 1];

        prueba = UtilesArrays.insertarAlFinal(array, 4);
        assertThat(prueba[3]).isEqualTo(4);
    }

    @Test
    void insertarPrincipioTamanoTest(){
        int[] array = {1, 2, 3};
        int[] prueba = new int[array.length + 1];

        prueba = UtilesArrays.insertarAlPrincipio(array, 4);
        assertThat(prueba).hasSize(4);
    }

    @Test
    void insertarPrincipioTest(){
        int[] array = {1, 2, 3};
        int[] prueba = new int[array.length + 1];

        prueba = UtilesArrays.insertarAlPrincipio(array, 4);
        assertThat(prueba[0]).isEqualTo(4);;
    }

    @Test
    void insertarPosicionTamanoTest(){
        int[] array = {1, 2, 3};
        int[] prueba = new int[array.length + 1];

        prueba = UtilesArrays.insertarEnPosicion(array, 4, 1);
        assertThat(prueba).hasSize(4);
    }

    @Test
    void insertarPosicionTest(){
        int[] array = {1, 2, 3};
        int[] prueba = new int[array.length + 1];

        prueba = UtilesArrays.insertarEnPosicion(array, 4, 1);
        assertThat(prueba[1]).isEqualTo(4);;
    }

    @Test
    void eliminarUltTamano(){
        int[] array = {1, 2, 3};
        int[] prueba = new int[array.length - 1];

        prueba = UtilesArrays.eliminarUltimo(array);
        assertThat(prueba).hasSize(array.length-1);
    }

    @Test
    void eliminarUltTest(){
        int[] array = {1, 2, 3};
        int[] prueba = new int[array.length - 1];

        prueba = UtilesArrays.eliminarUltimo(array);
        assertThat(prueba[1]).isEqualTo(2);
    }

    @Test
    void eliminarPrimTamano(){
        int[] array = {1, 2, 3};
        int[] prueba = new int[array.length - 1];

        prueba = UtilesArrays.eliminarPrimero(array);
        assertThat(prueba).hasSize(array.length-1);
    }

    @Test
    void eliminarPrimTest(){
        int[] array = {1, 2, 3};
        int[] prueba = new int[array.length - 1];

        prueba = UtilesArrays.eliminarPrimero(array);
        assertThat(prueba[0]).isEqualTo(2);
    }

    @Test
    void eliminarPosTamano(){
        int[] array = {1, 2, 3};
        int[] prueba = new int[array.length - 1];

        prueba = UtilesArrays.eliminarPosicion(array, 1);
        assertThat(prueba).hasSize(array.length-1);
    }

    @Test
    void eliminarPosTest(){
        int[] array = {1, 2, 3};
        int[] prueba = new int[array.length - 1];

        prueba = UtilesArrays.eliminarPosicion(array, 1);
        assertThat(prueba[1]).isEqualTo(3);
    }

    @Test
    void eliminarTamano(){
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] prueba = new int[array.length - 1];

        prueba = UtilesArrays.eliminar(array, 1);
        assertThat(prueba).hasSize(array.length-1);
    }

    @Test
    void eliminarTest(){
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] prueba = new int[array.length - 1];

        prueba = UtilesArrays.eliminar(array, 1);
        assertThat(prueba).doesNotContain(1);
    }

    @Test
    void ordenarTest(){
        int[] aux = {5, 4, 7, 2, 3};
        assertThat(UtilesArrays.ordenar(aux)).isSorted();
    }

    @Test
    void desordenarTest(){
        int[] aux = {5, 4, 7, 2, 3};
        int[] aux2 = {5, 4, 7, 2, 3};

        assertThat(aux).isNotEqualTo(UtilesArrays.ordenar(aux2));
    }

    @Test
    void invertirTest(){
        int[] aux = {1, 2, 3, 4, 5, 6};
        int[] aux2 = {1, 2, 3, 4, 5, 6};
        int[] prueba = UtilesArrays.invertir(aux2);
        assertThat(prueba).containsExactly(6, 5, 4, 3, 2, 1);
    }



}
