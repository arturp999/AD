import MatrixUtils.Calculadora;
import MatrixUtils.MatrixUtilities;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        final int[][] studentGrades = {
                {5, 8, 9},
                {6, 4, 3}
        };
        // System.out.println(MatrixUtilities.show(studentGrades));
        //System.out.println(MatrixUtilities.isMatrix(studentGrades));
        final int[][] matrizIdentidade = {
                {1, 0},
                {2, 1}
        };
        //// RIP System.out.println(MatrixUtilities.isIdentity(matrizIdentidade));


        //System.out.println(MatrixUtilities.multiplyBy(studentGrades,2));

        final int[][] array1 = {
                {4, 7},
                {8, 9}
        };
        final int[][] array2 = {
                {2, 8},
                {3, 1}
        };
        // System.out.println(MatrixUtilities.areCompatibleForSum(array1,array2));

        int[][] sum = MatrixUtilities.sumOf(array1, array2);
        //System.out.println(MatrixUtilities.show(sum));
        //System.out.println(MatrixUtilities.sumOf(array1,array2));

        //EXERCICIOS 3
        //System.out.println(MatrixUtilities.drawElement('a'));
        //System.out.println(MatrixUtilities.drawNewLine('-'));
        //System.out.println(MatrixUtilities.drawHorizontalSegmentWith('-',5));
        // MatrixUtilities.drawFilledRectangleWith(10,5,'+');
        //MatrixUtilities.drawEmptyRectangleWith(5, 5, '+');

        Calculadora c = new Calculadora();
        c.setValue(15);
        c.add(10);
        //System.out.println(c.getValue());
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher("+2+3*2-21/4+99+0+3555");

        List<String> teste = new ArrayList<>();
        String teste1 = "";
        while (m.find()){
            teste1 = m.group();
            teste.add(teste1);
        }
        System.out.println(teste);






    }
}
