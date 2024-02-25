package oop.Presentation;



import oop.Operathions.Division;
import oop.Operathions.Model;
import oop.Operathions.Multiply;
import oop.Operathions.Summ;
import oop.View.View;
import oop.Logging.Logging;
import oop.Logging.Logtxt;

public class Presenter<T extends Model> {
    View v;
    T model;


    public Presenter(View v, T model) {
        this.model = model;
        this.v = v;
    }

    public void runOperation() {
        Logging log = new Logtxt();
        String txt = "";
        Double x = v.inputDouble.apply("Введите первое число: ");
        Double y = v.inputDouble.apply("Введите второе число: ");
        int choice = v.getChoice();
        switch (choice) {
            case 1: {
                Summ model = new Summ();
                model.setX(x);
                model.setY(y);
                Double res = model.result();
                txt = log.getExpression(x, y, res, choice);
                System.out.println(res);
                break;
            }
            case 2: {
                Multiply model = new Multiply();
                model.setX(x);
                model.setY(y);
                Double res = model.result();
                txt = log.getExpression(x, y, res, choice);
                System.out.println(res);
                break;
            }
            case 3: {
                Division model = new Division();
                model.setX(x);
                model.setY(y);
                Double res = model.result();
                txt = log.getExpression(x, y, res, choice);
                System.out.println(res);
                break;
            }

        }
        log.writeFile(txt, "src/main/java/oop/Logging/Saving.txt");
    }
}
