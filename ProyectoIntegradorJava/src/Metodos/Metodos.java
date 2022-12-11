package Metodos;

import Personal.Personal;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.*;

public class Metodos {

    Vector vPrincipal = new Vector();

    public void guardar(Personal unpersonal) {
        vPrincipal.addElement(unpersonal);
    }

    public void guardarArchivo(Personal personal) {
        try {
            FileWriter fw = new FileWriter("Personal.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(personal.getNombre());
            pw.print("|" + personal.getApellido());
            pw.print("|" + personal.getDni());
            pw.print("|" + personal.getCuit());
            pw.print("|" + personal.getFechaIngreso());
            pw.print("|" + personal.getCategoria());
            pw.print("|" + personal.getSueldo());
            pw.println("|" + personal.getSexo());
            pw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public DefaultTableModel listaPersona() {
        Vector datos = new Vector();
        datos.addElement("Nombre");
        datos.addElement("Apellido");
        datos.addElement("DNI");
        datos.addElement("CUIT");
        datos.addElement("Fecha Ingreso");
        datos.addElement("Categoria");
        datos.addElement("Sueldo");
        datos.addElement("Sexo");

        DefaultTableModel mdlTable = new DefaultTableModel(datos, 0);
        try {
            FileReader fr = new FileReader("Personal.txt");
            BufferedReader br = new BufferedReader(fr);
            String d;
            while ((d = br.readLine()) != null) {
                StringTokenizer dato = new StringTokenizer(d, "|");
                Vector x = new Vector();
                while (dato.hasMoreTokens()) {
                    x.addElement(dato.nextToken());
                }
                mdlTable.addRow(x);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return mdlTable;
    }
}
