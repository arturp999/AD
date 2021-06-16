package arqdesp;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Menu.Options myVar = Menu.Options.START;
        switch (myVar) {
            case START:
                System.out.println("START");
                break;
            case SAVEGAMES:
                System.out.println("SAVEGAMES");
                break;
            case LOADGAMES:
                System.out.println("LOADGAMES");
                break;
            case HIGHSCORE:
                System.out.println("HIGHSCORE");
                break;
            case QUIT:
                System.out.println("QUIT");
                break;
        }

        for (Menu.Options myValues : Menu.Options.values()) {
            System.out.println(myValues);
        }

        //COM OS IFS E ELSES
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Introduza uma comando:");
        //String line = scanner.nextLine();
        //Menu.Options command = Menu.Options.valueOf(line);
        //if (command == command.START) {
        //    System.out.println("You Started");
        //} else if (command == command.SAVEGAMES) {
        //    System.out.println("You Saved");
        //} else if (command == command.LOADGAMES) {
        //    System.out.println("Your game has loaded");
        //} else if (command == command.HIGHSCORE) {
        //    System.out.println("This is your HIGHSCORE");
        //} else if (command == command.QUIT) {
        //    System.out.println("You have quit the game");
        //}

        Rational r1 = new Rational(8, 9);
        Rational r2 = new Rational(3, 6);
        Rational r3 = new Rational(1, 12);
        Rational r4 = new Rational(4, 2);

        List<Rational> rationals = new ArrayList<>();
        rationals.add(r1);
        rationals.add(r2);
        rationals.add(r3);
        rationals.add(r4);

        System.out.println("Lista por Ordenar:");
        for (Rational r: rationals){
            System.out.println("\t" + r.toString());
        }
        System.out.println("");

        System.out.println("Lista Ordenada");
        Collections.sort(rationals);
        for (Rational r: rationals){
            System.out.println("\t" + r.toString());
        }
        //Student:

        Student s1 = new Student(8,"artur");
        Student s2 = new Student(3,"Carlos");
        Student s3 = new Student(1, "Xeta");
        Student s4 = new Student(4,"Skynite");

        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        System.out.println("Lista por Ordenar:");
        for (Student r: students){
            System.out.println("\t" + r.toString());
        }
        System.out.println("");

    }
}