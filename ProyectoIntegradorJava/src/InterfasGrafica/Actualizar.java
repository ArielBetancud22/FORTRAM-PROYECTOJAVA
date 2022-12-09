package InterfasGrafica;

import Metodos.Metodos;
import img.ImgFondo;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Actualizar extends javax.swing.JFrame {

    ImgFondo p = new ImgFondo();

    int filas;
    Metodos metodos = new Metodos();
    DefaultTableModel mdlTable;
    private Date date;

    public Actualizar() {
        this.setContentPane(new ImgFondo());
        initComponents();
        this.setTitle("Actualizacion de datos");
        this.setSize(800, 400);
        this.setLocationRelativeTo(null);
        jt_actualizardatos.setModel(metodos.listaPersona());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_dni = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_cuit = new javax.swing.JTextField();
        jcb_categoria = new javax.swing.JComboBox<>();
        jcb_sueldo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_actualizardatos = new javax.swing.JTable();
        btn_salir = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(153, 51, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Actualización De Datos");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Nombre");

        txt_nombre.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombre.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        txt_nombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Apellido");

        txt_apellido.setBackground(new java.awt.Color(255, 255, 255));
        txt_apellido.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        txt_apellido.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("DNI");

        txt_dni.setBackground(new java.awt.Color(255, 255, 255));
        txt_dni.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        txt_dni.setForeground(new java.awt.Color(0, 0, 0));
        txt_dni.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("CUIT");

        txt_cuit.setBackground(new java.awt.Color(255, 255, 255));
        txt_cuit.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        txt_cuit.setForeground(new java.awt.Color(0, 0, 0));
        txt_cuit.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jcb_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Categorias", "Contratado", "Planta Permanente" }));

        jcb_sueldo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sueldos", "160000", "220000" }));

        jt_actualizardatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jt_actualizardatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_actualizardatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_actualizardatos);

        btn_salir.setBackground(new java.awt.Color(153, 153, 153));
        btn_salir.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btn_salir.setForeground(new java.awt.Color(0, 0, 0));
        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        btn_modificar.setBackground(new java.awt.Color(153, 153, 153));
        btn_modificar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btn_modificar.setForeground(new java.awt.Color(0, 0, 0));
        btn_modificar.setText("Modificar");
        btn_modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_modificarMouseClicked(evt);
            }
        });
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        btn_regresar.setBackground(new java.awt.Color(153, 153, 153));
        btn_regresar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btn_regresar.setForeground(new java.awt.Color(0, 0, 0));
        btn_regresar.setText("Regresar");
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_cuit, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcb_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcb_sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(365, 365, 365))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_regresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(164, 164, 164))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_cuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcb_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcb_sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_modificar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_salir))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        int a = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(this, "Desea Salir", "Salir", a);
        if (resultado == 0) {
            System.exit(0);

        }
    }//GEN-LAST:event_btn_salirActionPerformed

    private void jt_actualizardatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_actualizardatosMouseClicked
        this.mdlTable = (DefaultTableModel) jt_actualizardatos.getModel();
        int seleccion = jt_actualizardatos.getSelectedRow();
        txt_nombre.setText(jt_actualizardatos.getValueAt(seleccion, 0).toString());
        txt_apellido.setText(jt_actualizardatos.getValueAt(seleccion, 1).toString());
        txt_dni.setText(jt_actualizardatos.getValueAt(seleccion, 2).toString());
        txt_cuit.setText(jt_actualizardatos.getValueAt(seleccion, 3).toString());
        jcb_categoria.setSelectedItem(jt_actualizardatos.getValueAt(seleccion, 4).toString());
        jcb_sueldo.setSelectedItem(jt_actualizardatos.getValueAt(seleccion, 5).toString());
        filas = seleccion;

    }//GEN-LAST:event_jt_actualizardatosMouseClicked

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        String[] datoper = new String[6];
        datoper[0] = txt_nombre.getText();
        datoper[1] = txt_apellido.getText();
        datoper[2] = txt_dni.getText();
        datoper[3] = txt_cuit.getText();
        datoper[4] = jcb_categoria.getSelectedItem().toString();
        datoper[5] = jcb_sueldo.getSelectedItem().toString();

        for (int i = 0; i < jt_actualizardatos.getColumnCount(); i++) {

            jt_actualizardatos.setValueAt(datoper[i], filas, i);

        }
        try {
            String archivo = "Personal.txt";
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
            for (int i = 0; i < jt_actualizardatos.getRowCount(); i++) {
                for (int j = 0; j < jt_actualizardatos.getColumnCount(); j++) {
                    bw.write((String) (jt_actualizardatos.getValueAt(i, j)));
                    if (j < jt_actualizardatos.getColumnCount() - 1) {
                        bw.write("|");
                    }
                }
                bw.newLine();
            }
            bw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        JOptionPane.showMessageDialog(null, "Registro Actualizado");
        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_dni.setText("");
        txt_cuit.setText("");
        jcb_categoria.setSelectedItem("");
        jcb_sueldo.setSelectedItem("");
        txt_nombre.requestFocus();
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modificarMouseClicked

    }//GEN-LAST:event_btn_modificarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Actualizar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcb_categoria;
    private javax.swing.JComboBox<String> jcb_sueldo;
    private javax.swing.JTable jt_actualizardatos;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_cuit;
    private javax.swing.JTextField txt_dni;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
