package MatrixUtils;


public class MatrixUtilities {
    //a. show – imprime na consola uma matriz tendo em conta as linhas e as colunas da mesma
    public static String show(int[][] matrix) {
        String str = "";
        for (int i = 0; i < matrix.length; i++) {
            str += '\n';
            for (int j = 0; j < matrix.length; j++) {
                if (j < 2) {
                    str += matrix[i][j] + ",";
                } else {
                    str += matrix[i][j] + " ";
                }
            }
        }
        return str;
    }

    //b. isMatrix – verifica se o array multi-dimensional que é passado como argumento é uma matriz, ou
    //seja, o número de colunas deve ser igual para todas as linhas.
    public static Boolean isMatrix(int[][] matrix) {
        int columns = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (i == matrix[0].length - 1) {
                return true;
            }
        }
        return false;
    }

    //c. isIdentity – verifica se o array multi-dimensional que é passado como argumento é uma matriz
    //identidade, ou seja, os elementos na diagonal da matriz são iguais a 1 e os restantes iguais a zero.

    // public static boolean isIdentity(int[][] matrizIdentidade) {
    //  for (int i = 0; i < matrizIdentidade.length; i++) {
    // System.out.print(matrizIdentidade[0][i]);
    //  }
    // System.out.print("\n");
    // for (int j = 0; j < matrizIdentidade.length; j++) {
    //     System.out.print(matrizIdentidade[1][j]);
    //  }
    //  System.out.print("\n");
    //   return false;
    // }

    //d. multiplyBy – pretende-se multiplicar uma matriz por um valor constante e devolver o resultado.
    //A matriz e a constante são passadas como argumentos.
    public static int[] multiplyBy(int[][] multiplyBy, int a) {
        int valor = 0;
        int[] newArray = new int[multiplyBy.length];
        for (int i = 0; i < multiplyBy.length; i++) {
            for (int j = 0; j < multiplyBy[0].length; j++) {
                valor = multiplyBy[i][j] * a;
                newArray[i] = valor;
                System.out.println(valor);
            }
        }
        return newArray;
    }

    //areCompatibleForSum – verifica se dois arrays multi-dimensionais (passados como argumentos)
    //são compatíveis para efetuar uma soma. Duas matrizes apenas podem ser adicionadas se tiverem
    //o mesmo tamanho.
    public static boolean areCompatibleForSum(int[][] array1, int[][] array2) {
        int size = 0;
        int size2 = 0;
        int size3 = 0;
        int size4 = 0;
        for (int i = 0; i < array1[0].length; i++) {
            size = size + 1;
        }
        for (int j = 0; j < array1[1].length; j++) {
            size2 = size2 + 1;
        }
        for (int i = 0; i < array2[0].length; i++) {
            size3 = size3 + 1;
        }
        for (int j = 0; j < array2[1].length; j++) {
            size4 = size4 + 1;
        }
        int sizeArray1 = size + size2;
        int sizeArray2 = size3 + size4;
        if (sizeArray1 == sizeArray2) {
            return true;

        } else {
            System.out.println("Não têm o mesmo tamanho por isso não podem ser adiciondos");
        }
        return false;
    }


    public static int[][] sumOf(int[][] array1, int[][] array2) {
        int[][] sum = new int[array1.length][array1[0].length];
        if (areCompatibleForSum(array1, array2)) {
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array1[i].length; j++) {
                    sum[i][j] = array1[i][j] + array2[i][j];
                }
            }
        }
        return sum;
    }

    public static void drawElement(char a) {
        System.out.print(a);
    }

    public static void drawNewLine() {
        System.out.println(" ");
    }

    public static char drawHorizontalSegmentWith(char c, int colums) {
        for (int i = 0; i < colums; i++) {
            drawElement('+');
        }
        return 0;
    }

    //d. drawFilledRectangleWith – imprime um retângulo preenchido onde a altura, largura e o
    //caractere a desenhar são passados como argumentos (utilize as funções 3.b e 3C).
    public static void drawFilledRectangleWith(int columns, int rows, char c) {
        for (int i = 0; i < rows; i++) {
            drawHorizontalSegmentWith(c,columns);
            drawNewLine();
        }
    }

    public static void drawHorizontalSegmentWithEmpty(char c, int colums) {
        for (int i = 0; i < colums; i++) {
          if (i == 0 || i == colums -1){
              drawElement(c);
          }else {
              drawElement(' ');
          }
        }
    }

    public static void drawEmptyRectangleWith(int columns, int rows, char c) {
        for (int i = 0; i < rows; i++) {
            if (i == 0 || i == rows-1){
                drawHorizontalSegmentWith(c,columns);
            }else {
                drawHorizontalSegmentWithEmpty(c,columns);
            }
            drawNewLine();
        }
    }
}
