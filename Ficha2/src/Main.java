import ArrayUtils.ArrayUtilities;
import numUtili.NumericalUtilities;

public class Main {
    public static void main(String[] args) {
        int powerof = NumericalUtilities.powerOf(2, 15);
        //System.out.println("Power of " + powerof);

        int sumOfNupTo = NumericalUtilities.sumOfNaturalNumbersUpTo(5);
        //System.out.println("sumOfNaturalNumbersUpTo of " + sumOfNupTo);

        int NaturalNumbersBetween = NumericalUtilities.sumOfNaturalNumbersBetween(5, 6);
        //System.out.println("NaturalNumbersBetween is " + NaturalNumbersBetween);

        int sumOfEvenNumBetween = NumericalUtilities.sumOfEvenNumbersBetween(2, 8);
        //System.out.println("sumOfEvenNumbersBetween is " + sumOfEvenNumBetween);

        int numberDivisorsOf = NumericalUtilities.numberOfDivisorsOf(10);
        //System.out.println("numberOfDivisorsOf is " + numberDivisorsOf);

        boolean isPrim = NumericalUtilities.isPrime(4);
        //System.out.println("This number is " + isPrim);

        //3. Crie uma classe denominada por ArrayUtilities e implemente os seguintes métodos
        int[] myArrays = {5, 7, 4, 6, 8, 1, 2};
        //ArrayUtilities.toString(myArrays);
        //System.out.println("O numero maximo: " + ArrayUtilities.maximumOf(myArrays));
        //System.out.println("O numero minimo: " + ArrayUtilities.minimumOf(myArrays));
        //ArrayUtilities.copyOf(myArrays);
        //System.out.println(ArrayUtilities.contains(myArrays,9));
        //System.out.print(ArrayUtilities.containsDuplicate(myArrays));

        int[] array ={ 1,2,3,2};  //versao do prof
        //System.out.print(ArrayUtilities.containsDuplicate(array));  //versao do prof

        //System.out.print(ArrayUtilities.indexOf(myArrays, 6));
        //ArrayUtilities.add(myArrays, 9);
        ArrayUtilities.remove(myArrays, 4);
    }

}