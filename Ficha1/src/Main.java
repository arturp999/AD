
public class Main {
    public static void main(final String[] arguments) {
        System.out.println(perimetro(2, 5));
        System.out.println(volume(12.5, 23, 10));
        System.out.println(centigrados(14));
        System.out.println(temporal(15, 25, 30));
        System.out.println("O numero máximo é " + maximo(1, 2));
        //System.out.println("O numero minimo é " + minimo(1, 2));
        System.out.println("O numero minimo é " + minimo(new int[]{1, 2}));
        System.out.println("A média " + media(new int[]{1, 5, 6, 2}));
    }

    //7. Implemente uma função que calcule o perímetro de um retângulo. As medidas dos lados deverão ser
    //passadas como argumentos da função.
    public static int perimetro(int a, int b) {
        return 2 * (a * b);
    }

    //8. Implemente uma função que calcule o volume de um paralelepípedo. O comprimento, altura e largura
    //deverão ser passados como argumentos da função.
    public static double volume(double comprimento, double altura, double largura) {
        return comprimento * altura * largura;
    }

    //9. Implemente uma função que receba uma temperatura fornecida em graus Farenheit e a converta para o
    //seu equivalente em graus centígrados.
    public static double centigrados(double farenheit) {
        double centig = (farenheit - 32) * 5 / 9;
        return centig;
    }

    //10. Implemente uma função que transforme o valor correspondente a um intervalo temporal, expresso em
    //horas, minutos e segundos, no valor correspondente em segundos.
    public static int temporal(int horas, int minutos, int segundos) {
        int horaSegundos = horas * 3600; // 1hora
        int minutoSegundo = minutos * 60; // 1min
        int calcSegundos;
        return calcSegundos = horaSegundos + minutoSegundo + segundos;
    }

    //11. Implemente várias funções para calcular o máximo, o mínimo e a média de uma sequência de números
    //positivos armazenados numa estrutura de dados como um array.
    public static int maximo(int v1, int v2) {
        int nMaximo = 0;
        if (v1 > v2) {
            return nMaximo = v1;
        } else {
            return nMaximo = v2;
        }
    }

   // public static int minimo(int v1, int v2) {
   //     int nMinimo = 0;
    //    if (v1 > v2) {
    //         return nMinimo = v1;
    //    } else {
    //        return nMinimo = v2;
    //   }
    //}

    public static double minimo(int[] numeros){
        for (int i = 0; i < numeros.length; i++) {
            int nMinimo = 0;
            if (int v1 > int v2) {
                return nMinimo = v1;
            } else {
                return nMinimo = v2;
            }
        }
    }

    public static double media(int[] numeros) {
        double soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma = soma + numeros[i];
        }
        return soma / numeros.length;
    }


}
