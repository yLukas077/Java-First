package app;

import javax.swing.*;

public class Program {

    public static void main(String[] args) {

        String cars = JOptionPane.showInputDialog("Informe a quantidade de carros");
        String persons = JOptionPane.showInputDialog("Informe a quantidade de pessoas");

        double numberCars = Double.parseDouble(cars);
        double numberPersons = Double.parseDouble(persons);

        int CarsPersons = (int) (numberCars / numberPersons) ;

        double rest = numberCars % numberPersons;

        int resultCP = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado?");

        if (resultCP == 0) {
            JOptionPane.showMessageDialog(null, "O resultado é: " + CarsPersons);
            resultCP = JOptionPane.showConfirmDialog(null, "Deseja ver o resto?");

            if (resultCP == 0) {
                JOptionPane.showMessageDialog(null, "O resto é: " + rest);
            } else if(resultCP == 1) {
                JOptionPane.showMessageDialog(null, "Ok, você optou por saber apenas o resultado");
            }
        }

        if (resultCP == 1) {
             resultCP = JOptionPane.showConfirmDialog(null, "Ok, você não quis ver o resultado, mas deseja ver o resto da divisão?");

                if (resultCP == 0) {
                    JOptionPane.showMessageDialog(null, "O resto é: " + rest);
                } else if(resultCP == 1) {
                    JOptionPane.showMessageDialog(null, "Ok, você optou por saber não saber nem o resultado nem o resto");
                }
        }






    }
}
