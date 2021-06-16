package ArrayUtils;

public class ArrayUtilities {


    //a. toString – devolve uma String representando o array separado por vírgulas
    public static void toString(int[] array1) {
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + ",");
        }
        return;

    }

    //– encontra o valor máximo num array e devolve o mesmo
    public static int maximumOf(int[] array1) {
        int max = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > max) {
                max = array1[i];
            }
        }
        return max;
    }

    // encontra o valor mínimo num array e devolve o mesmo
    public static int minimumOf(int[] array1) {
        int min = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < min) {
                min = array1[i];
            }
        }
        return min;
    }

    //– devolve uma cópia do array
    public static void copyOf(int[] array1) {
        int[] array2 = new int[array1.length]; //vai definir a dimensao do array novo
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
            System.out.print(array2[i] + " ");
        }
    }

    //e. contains – verifica se um determinado número existe no array
    public static boolean contains(int[] array1, int num1) {
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == num1) {
                return true;
            }
        }
        return false;
    }

    // f. containsDuplicates – verifica se existem valores repetidos no array
    // public static boolean containsDuplicate(int[] array1) {
        //     for (int i = 0; i < array1.length; i++) {
            //       for (int j = 0; j < array1.length; j++) {
                //           if (i != j) {
                    //               if (array1[i] == array1[j]) {
                    //                   return true;
                        //               }
                    //           }
                //        }
            //    }
        //    return false;
    //}

        public static boolean containsDuplicate(int[] array) {
            int[] aux = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                int value = array[i];
                if (contains(aux,value)){
                    return true;
                }
                aux[i] = value;
            }
            return false;
        }

    // g. indexOf – devolve o índice de um determinado valor se existir ou -1 se não existir
    public static int indexOf(int[] array1, int num1) {
        for (int i = 0; i < array1.length; i++) {
            if (num1 == array1[i]) {
                return i;
            }
        }
        return -1;
    }

    //h. add – adiciona um valor no fim do array
    public static void add(int[] array1, int num1) {
        int[] newArray = new int[array1.length + 1];
        for (int i = 0; i < array1.length; i++) {
            newArray[i] = array1[i];
        }
        newArray[newArray.length - 1] = num1;
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]);
        }
    }

    //i. remove – remove um elemento do array se existir
    public static void remove(int[] array1,int num1) {
        int[] newArray = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != num1) {
                    newArray[i] = array1[i];
                    System.out.print(newArray[i]);
            }
        }
    }
}
