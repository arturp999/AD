package ficha3Pack;

public class CharacterUtilities {


    //a. lowerLetterSuccessorOf – devolve o caractere seguinte ao que é passado como argumento (char).
    //Válido apenas para carateres minúsculos de ‘a’ – ‘z’. Se o caractere for o último devolva o
    //primeiro.
    public static char lowerLetterSuccessorOf(char letra) {

        int code = letra + 1;
        return (char) code;
    }

    //b. lowerLetterPredecessorOf – devolve o caractere anterior ao que é passado como argumento
    //(char). Válido apenas para carateres minúsculos de ‘a’ – ‘z’. Se o caractere for o primeiro devolva
    //o último.
    public static char lowerLetterPredecessorOf(char letra) {
        int code = letra - 1;
        return (char) code;
    }

    //c. lowerLetterSuccessorStepsOf – semelhante ao exercício 2.a mas neste caso a função recebe um
    //argumento extra indicando o número de carateres que pretendemos efetuar para obter o
    //caractere pretendido.
    public static char lowerLetterSuccessorStepsOf(char letra, int num) {
        int code = letra + num;
        return (char) code;
    }

    //d. lowerLetterPredecessorStepsOf – semelhante ao exercício 2.b mas neste caso a função recebe
    //um argumento extra indicando o número de carateres que pretendemos efetuar para obter o
    //caractere pretendido
    public static char lowerLetterPredecessorStepsOf(char letra, int num) {
        int code = letra - num;
        return (char) code;
    }

    //e. occurrencesOfCharacterIn – conta e devolve o número de ocorrências de um determinado
    //caractere num array de caracteres (ambos passados como argumentos).
    public static int occurrencesOfCharacterIn(char[] arrayLetras, char letra) {
        int conta = 0;
        for (int i = 0; i < arrayLetras.length; i++) {
            if (arrayLetras[i] == letra) {
                conta += 1;
            }
        }
        return conta;
    }

    //f. replaceCharacterIn – substitui um determinado caractere (se existir) num array de caracteres
    public static char[] replaceCharacterIn(char[] arrayLetras, char letra, char letra2) {
        for (int i = 0; i < arrayLetras.length; i++) {
            if (arrayLetras[i] == letra) {
                arrayLetras[i] = letra2;
            }
        }
        return arrayLetras;
    }

    //g. concatenationOf – concatena dois arrays de caracteres num só. Recebe como argumentos os dois
    //arrays a concatenar.
    public static char[] concatenationOf(char[] array1, char[] array2) {
        char[] newArray = new char[array1.length + array2.length];
        int pos = 0;
        for (int i = 0; i < array1.length; i++) {
            newArray[i] = array1[i];
            pos++;
        }
        for (int j = 0; j < array2.length; j++) {
            newArray[pos] = array2[j];
            pos++;
        }
        return newArray;
    }

//h. copyOfPartOf- copia e devolve uma seleção do array indicada pelo índice inicial e o índice final
//que são passados como argumentos juntamente com o array.

    public static char[] copyOfPartOf(char[] array1, int index1, int index2) {
        char[] newArray = new char[array1.length];
        if (index2 > array1.length) {
            System.out.print("Out of bounds");
        } else {
            for (int i = index1; i <= index2; i++) {
                newArray[i] = array1[i];
            }
        }
        return newArray;
    }
}
