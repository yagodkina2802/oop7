package oop;

import oop.Operathions.Model;
import oop.Presentation.Presenter;
import oop.View.View;

public class Main {
    public static void main(String[] args) {
        Presenter presenter = new Presenter(new View(), new Model());

        presenter.runOperation();
    }
}