package numUtili;

public class NumericalUtilities {

    public static int powerOf(int num1, int num2) {
        int power = 1;
        for (int i = 0; i < num2; i++) {
            power = power * num1;
        }
        return power;
    }

    public static int sumOfNaturalNumbersUpTo(int num1) {
        int res = 0;
        for (int i = 0; i <= num1; i++) {
            res = res + i;
        }
        return res;
    }

    public static int sumOfNaturalNumbersBetween(int num1, int num2) {
        int res = 0;
        for (int i = num1; i <= num2; i++) {
            res = res + i;
        }
        return res;
    }

    public static int sumOfEvenNumbersBetween(int num1, int num2) {
        int res = 0;
        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                res = res + i;
            }
        }
        return res;
    }

    //f – devolve o número de divisores para um determinado número inteiro
    public static int numberOfDivisorsOf(int num1) {
        int conta = 0;
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0) {
                conta = conta + 1;
            }
        }
        return conta;
    }

    // isPrime – indica se um número é primo, utilize o método anterior para resolver este problema
    public static boolean isPrime(int num1) {
        if (numberOfDivisorsOf(num1) == 2) {
            return true;
        }
        else return false;
    }
}





