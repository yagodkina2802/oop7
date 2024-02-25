package oop.View;

import java.util.Scanner;
import java.util.function.Function;

public class View {

    Scanner in = new Scanner(System.in, "cp866");


    public Function<String, Double> inputDouble = msg -> {
        System.out.println(msg);
        return in.nextDouble();
    };

    public int getChoice() {
        System.out.println("Выберети действие: ");
        System.out.println("\t1. +");
        System.out.println("\t2. *");
        System.out.println("\t3. /");
        return in.nextInt();
    }
}
