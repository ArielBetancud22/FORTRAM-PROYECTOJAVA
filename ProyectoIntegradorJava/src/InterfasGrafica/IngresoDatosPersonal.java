package InterfasGrafica;

import Metodos.Metodos;
import Personal.Personal;
import img.ImgFondo;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.*;
import javax.swing.table.TableRowSorter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.RowFilter;

public class IngresoDatosPersonal extends javax.swing.JFrame {
    ImgFondo p = new ImgFondo();
    private TableRowSorter trsfiltro;
    String filtro;
    int fila;
    Personal personal = new Personal();
    Metodos metodos = new Metodos();
    DefaultTableModel mdlTable;
    Vector cabecera = new Vector();

    public IngresoDatosPersonal() {
        this.setContentPane(new ImgFondo());
        initComponents();
        this.cabecera.addElement("Nombre");
        this.cabecera.addElement("Apellido");
        this.cabecera.addElement("DNI");
        this.cabecera.addElement("CUIT");
        this.cabecera.addElement("Categoria");
        this.cabecera.addElement("Sueldo");
        mdlTable = new DefaultTableModel(cabecera, 0);
        jtb_registropersonal.setModel(mdlTable);
        this.setTitle("Registro Del Personal");
        this.setSize(830, 460);
        this.setLocationRelativeTo(null);
        //Botones de genero

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlb_nombre = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_dni = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_cuit = new javax.swing.JTextField();
        jcb_categoria = new javax.swing.JComboBox<>();
        jcb_sueldo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtb_registropersonal = new javax.swing.JTable();
        jbt_regresar = new javax.swing.JButton();
        Jbt_guardar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btn_baja = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setToolTipText("INGRESO DE DATOS DEL PERSONAL");
        jPanel1.setOpaque(false);

        jLabel1.setBackground(new java.awt.Color(102, 102, 255));
        jLabel1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INGRESO DE INFORMACION DEL PERSONAL");

        jlb_nombre.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jlb_nombre.setForeground(new java.awt.Color(255, 255, 255));
        jlb_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb_nombre.setText("Nombre");
        jlb_nombre.setToolTipText("");

        txt_nombre.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombre.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(0, 0, 0));
        txt_nombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_nombre.setToolTipText("");
        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Apellido");

        txt_apellido.setBackground(new java.awt.Color(255, 255, 255));
        txt_apellido.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        txt_apellido.setForeground(new java.awt.Color(0, 0, 0));
        txt_apellido.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("DNI");

        txt_dni.setBackground(new java.awt.Color(255, 255, 255));
        txt_dni.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        txt_dni.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("CUIT");

        txt_cuit.setBackground(new java.awt.Color(255, 255, 255));
        txt_cuit.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        txt_cuit.setForeground(new java.awt.Color(0, 0, 0));
        txt_cuit.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jcb_categoria.setBackground(new java.awt.Color(153, 153, 153));
        jcb_categoria.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jcb_categoria.setForeground(new java.awt.Color(255, 255, 255));
        jcb_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Categoria", "Contratado", "Planta Permanente" }));

        jcb_sueldo.setBackground(new java.awt.Color(153, 153, 153));
        jcb_sueldo.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jcb_sueldo.setForeground(new java.awt.Color(255, 255, 255));
        jcb_sueldo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sueldo", "160000", "220000" }));

        jtb_registropersonal.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtb_registropersonal);

        jbt_regresar.setBackground(new java.awt.Color(153, 153, 153));
        jbt_regresar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jbt_regresar.setForeground(new java.awt.Color(0, 0, 0));
        jbt_regresar.setText("Regresar");
        jbt_regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbt_regresarMouseClicked(evt);
            }
        });
        jbt_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_regresarActionPerformed(evt);
            }
        });

        Jbt_guardar.setBackground(new java.awt.Color(153, 153, 153));
        Jbt_guardar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        Jbt_guardar.setForeground(new java.awt.Color(0, 0, 0));
        Jbt_guardar.setText("Guardar");
        Jbt_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jbt_guardarMouseClicked(evt);
            }
        });

        btn_actualizar.setBackground(new java.awt.Color(153, 153, 153));
        btn_actualizar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btn_actualizar.setForeground(new java.awt.Color(0, 0, 0));
        btn_actualizar.setText("Actualizar");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        btn_baja.setBackground(new java.awt.Color(153, 153, 153));
        btn_baja.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btn_baja.setForeground(new java.awt.Color(0, 0, 0));
        btn_baja.setText("Baja");
        btn_baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bajaActionPerformed(evt);
            }
        });

        btn_salir.setBackground(new java.awt.Color(153, 153, 153));
        btn_salir.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btn_salir.setForeground(new java.awt.Color(0, 0, 0));
        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(61, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlb_nombre)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2))
                            .addComponent(txt_cuit, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jcb_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jcb_sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(197, 197, 197))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_actualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_baja, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_regresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_salir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jbt_guardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(159, 159, 159))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_nombre)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcb_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcb_sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txt_cuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Jbt_guardar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_actualizar)
                        .addGap(10, 10, 10)
                        .addComponent(btn_baja)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbt_regresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_salir))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_bajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bajaActionPerformed

        BajaPersonal datos = new BajaPersonal();
        datos.setVisible(true);
    }//GEN-LAST:event_btn_bajaActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed

        Actualizar datos = new Actualizar();
        datos.setVisible(true);
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void Jbt_guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jbt_guardarMouseClicked
        mdlTable = new DefaultTableModel();
        String nombre = txt_nombre.getText();
        String apellido = txt_apellido.getText();

        String dni = txt_dni.getText();
        String cuit = txt_cuit.getText();
        String categoria = jcb_categoria.getSelectedItem().toString();
        double sueldo = Double.parseDouble(jcb_sueldo.getSelectedItem().toString());

        personal.setNombre(nombre);
        personal.setApellido(apellido);
        personal.setDni(dni);
        personal.setCuit(cuit);
        personal.setCategoria(categoria);
        personal.setSueldo(sueldo);
        metodos.guardar(personal);
        metodos.guardarArchivo(personal);
        JOptionPane.showMessageDialog(null, "Registro cargado con exito");

        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_dni.setText("");
        txt_cuit.setText("");
        jcb_categoria.setSelectedItem("");
        jcb_sueldo.setSelectedItem("");
        jtb_registropersonal.setModel(metodos.listaPersona());
        jtb_registropersonal.setToolTipText("");
    }//GEN-LAST:event_Jbt_guardarMouseClicked

    private void jbt_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_regresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt_regresarActionPerformed

    private void jbt_regresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbt_regresarMouseClicked
        this.dispose();
    }//GEN-LAST:event_jbt_regresarMouseClicked

    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped
        trsfiltro = new TableRowSorter(jtb_registropersonal.getModel());
        jtb_registropersonal.setRowSorter(trsfiltro);
    }//GEN-LAST:event_txt_nombreKeyTyped

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        int a = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(this, "Desea Salir","Salir",a);
        if(resultado ==0){
            System.exit(0);
            
        }
    }//GEN-LAST:event_btn_salirActionPerformed
    public void filtro() {
        filtro = txt_nombre.getText();
        trsfiltro.setRowFilter(RowFilter.regexFilter(txt_nombre.getText(), 0));

    }

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
            java.util.logging.Logger.getLogger(IngresoDatosPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresoDatosPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresoDatosPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresoDatosPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresoDatosPersonal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jbt_guardar;
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_baja;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbt_regresar;
    private javax.swing.JComboBox<String> jcb_categoria;
    private javax.swing.JComboBox<String> jcb_sueldo;
    private javax.swing.JLabel jlb_nombre;
    private javax.swing.JTable jtb_registropersonal;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_cuit;
    private javax.swing.JTextField txt_dni;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
