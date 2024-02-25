package oop.Logging;

import java.io.IOException;
import java.io.FileWriter;

public class Logtxt implements Logging {

    @Override
    public String getExpression(Double x, Double y, Double result, Integer operation) {
        String op = "";
        if (operation == 1)
            op = " + ";
        else if (operation == 2)
            op = " * ";
        else if (operation == 3)
            op = " / ";
        return String.format("%s%s%s = %s", x, op, y, result);
    }

    @Override
    public void writeFile(String expression, String nameFile) {
        try (FileWriter fw = new FileWriter(nameFile, true)) {
            fw.write(expression + ";");
            fw.append('\n');
            fw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}