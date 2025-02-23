import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int cantidadEstudiantes=  Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes"));
        ArrayList<Estudiante> listaEstudiante= new ArrayList<Estudiante>();
        for (int i = 1; i < cantidadEstudiantes; i++) {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
            String sexo = JOptionPane.showInputDialog("Ingrese el sexo");
            double documento = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el documento"));
            String alergia = JOptionPane.showInputDialog("Ingrese la alergia");
            double contacto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el contacto"));
            String acudiente = JOptionPane.showInputDialog("Ingrese el acudiente");

            Estudiante newEstudiante =
                    new Estudiante(nombre, edad, sexo, documento, alergia, contacto, acudiente);

            JOptionPane.showMessageDialog(null, newEstudiante);

            listaEstudiante.add(newEstudiante);
        }
    }
}