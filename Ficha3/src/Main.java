import ficha3Pack.CharacterUtilities;

public class Main {
    public static void main(String[] args) {
        //System.out.print(CharacterUtilities.lowerLetterSuccessorOf('a'));
        //System.out.print(CharacterUtilities.lowerLetterPredecessorOf('a'));
        //System.out.print(CharacterUtilities.lowerLetterSuccessorStepsOf('a',4));
        //System.out.print(CharacterUtilities.lowerLetterPredecessorStepsOf('a',4));
        char[] letras = {'a', 'x', 'b', 'f', 'z'};
        //System.out.print(CharacterUtilities.occurrencesOfCharacterIn(letras,'a'));
        //System.out.print(CharacterUtilities.replaceCharacterIn(letras, 'a', 'c'));
        char[] array1 = {'a', 'a', 'b'};
        char[] array2 = {'k', 'x', 'v'};
        System.out.println(CharacterUtilities.concatenationOf(array1,array2));
        //System.out.println(CharacterUtilities.copyOfPartOf(letras,3,9));
    }
}
