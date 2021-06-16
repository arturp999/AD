public class Main {
    public static void main(String[] args) {

        final int[] studentNumbers = {20032, 30312, 25324, 31432};
        final String[] courseAcronyms = {"AD", "WEB-FE", "WEB-BE"};
        final int[][] studentGrades = {
                {15, 18, 17},
                {18, 10, 11},
                {11, 13, 15},
                {10, 19, 16},
        };
        //Mostre a notas de cada aluno
        //      for (int i = 0; i < studentGrades.length; i++) {
        //          System.out.println("[" + studentNumbers[i] + "]" + "-> ");
        //         for (int j = 0; j < courseAcronyms.length; j++) {
        //            System.out.println(studentGrades[i][j] + ",");
        //        }
        //    }

        //Mostre a media das notas de cada aluno //        //mostre a media mais alta identifacndo a quem pertence
        float mAlta = 0;
        for (int i = 0; i < studentNumbers.length; i++) {
            float cValue = 0;
            for (int j = 0; j < 3; j++) {
                cValue = cValue + studentGrades[i][j] / 3;
            }
            if (mAlta < cValue){
                mAlta = cValue;
            }
            System.out.println(cValue + " " + " Aluno:" + studentNumbers[i]);
        }
        System.out.println("A média mais alta é " + mAlta);
    }
}
