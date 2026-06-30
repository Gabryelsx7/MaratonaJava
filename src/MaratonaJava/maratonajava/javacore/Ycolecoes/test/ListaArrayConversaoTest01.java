package MaratonaJava.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        Integer[] ListToArray = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(ListToArray));
        System.out.println("------------------");
        //Aqui fazemos a transformação de Array para List
        Integer[] numeroArray = new Integer[4];

        numeroArray[0] = 1;
        numeroArray[1] = 2;
        numeroArray[2] = 3;
        numeroArray[3] = 4;

        List<Integer> arrayToList = Arrays.asList(numeroArray);// como se fosse um Link
        arrayToList.set(0,12);

        System.out.println(Arrays.toString(numeroArray));
        System.out.println(arrayToList);

        System.out.println("---------");
        //Aqui eu passo um coleção(nomes e numeors) e onde vou adicionar
        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numeroArray));

        numerosList.add(15);
        System.out.println(numerosList);

        List<String> strings = Arrays.asList("1","2");

    }
}
