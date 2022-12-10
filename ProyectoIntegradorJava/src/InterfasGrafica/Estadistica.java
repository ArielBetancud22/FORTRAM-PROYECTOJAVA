package InterfasGrafica;

import MenuOpciones.MenuOpciones;
import img.ImgFondo;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Estadistica extends javax.swing.JFrame {

    int n;
    int sueldo = 0;
    double media = 0;
    int suma = 0;
    double sumatoria = 0;
    int cantSueldos = 0;
    double varianza = 0;
    int a[] = new int[n];
    int sueldos[] = new int[n];

    ImgFondo p = new ImgFondo();

    public Estadistica() {
        this.setContentPane(new ImgFondo());
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Regresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jrb_mediana = new javax.swing.JRadioButton();
        jrb_media = new javax.swing.JRadioButton();
        jrb_varianza = new javax.swing.JRadioButton();
        btn_aceptar = new javax.swing.JButton();
        btn_mediana = new javax.swing.JButton();
        btn_media = new javax.swing.JButton();
        btn_varianza = new javax.swing.JButton();
        llb_mediana = new javax.swing.JLabel();
        jlb_media = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        btn_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estadistica");
        setUndecorated(true);

        btn_Regresar.setBackground(new java.awt.Color(102, 102, 102));
        btn_Regresar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_Regresar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Regresar.setText("Regresar");
        btn_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegresarActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¿Que desea Calcular?");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jrb_mediana.setBackground(new java.awt.Color(204, 204, 204));
        jrb_mediana.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jrb_mediana.setForeground(new java.awt.Color(255, 255, 255));
        jrb_mediana.setText("Mediana");

        jrb_media.setBackground(new java.awt.Color(204, 204, 204));
        jrb_media.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jrb_media.setForeground(new java.awt.Color(255, 255, 255));
        jrb_media.setText("Media");

        jrb_varianza.setBackground(new java.awt.Color(204, 204, 204));
        jrb_varianza.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jrb_varianza.setForeground(new java.awt.Color(255, 255, 255));
        jrb_varianza.setText("Varianza");

        btn_aceptar.setBackground(new java.awt.Color(204, 204, 204));
        btn_aceptar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_aceptar.setForeground(new java.awt.Color(0, 0, 0));
        btn_aceptar.setText("Aceptar");
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

        btn_mediana.setBackground(new java.awt.Color(204, 204, 204));
        btn_mediana.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_mediana.setForeground(new java.awt.Color(0, 0, 0));
        btn_mediana.setText("Calculo Mediana");
        btn_mediana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_medianaActionPerformed(evt);
            }
        });

        btn_media.setBackground(new java.awt.Color(204, 204, 204));
        btn_media.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_media.setForeground(new java.awt.Color(0, 0, 0));
        btn_media.setText("Calculo Media");
        btn_media.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mediaActionPerformed(evt);
            }
        });

        btn_varianza.setBackground(new java.awt.Color(204, 204, 204));
        btn_varianza.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_varianza.setForeground(new java.awt.Color(0, 0, 0));
        btn_varianza.setText("Calculo Varianza");
        btn_varianza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_varianzaActionPerformed(evt);
            }
        });

        llb_mediana.setBackground(new java.awt.Color(255, 255, 255));
        llb_mediana.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        llb_mediana.setForeground(new java.awt.Color(0, 0, 0));
        llb_mediana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        llb_mediana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/median-berechnen-1.png"))); // NOI18N
        llb_mediana.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlb_media.setBackground(new java.awt.Color(255, 255, 255));
        jlb_media.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jlb_media.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb_media.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/media.jpg"))); // NOI18N

        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/varianza.png"))); // NOI18N

        btn_salir.setBackground(new java.awt.Color(102, 102, 102));
        btn_salir.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_salir.setForeground(new java.awt.Color(0, 0, 0));
        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Regresar)
                        .addGap(45, 45, 45)
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(72, 72, 72)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(42, 42, 42))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn_mediana)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jrb_media, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jrb_mediana)
                                            .addComponent(jrb_varianza)
                                            .addComponent(btn_aceptar)))
                                    .addGap(11, 11, 11)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(105, 105, 105)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(158, 158, 158)
                                        .addComponent(jlb_media, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btn_varianza)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(llb_mediana, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_media, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(241, 241, 241)))))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jrb_mediana)
                        .addGap(18, 18, 18)
                        .addComponent(jrb_media)
                        .addGap(18, 18, 18)
                        .addComponent(jrb_varianza)
                        .addGap(13, 13, 13))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(btn_aceptar)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(llb_mediana, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(btn_mediana)))
                        .addGap(60, 60, 60)
                        .addComponent(btn_media)
                        .addGap(65, 65, 65)
                        .addComponent(btn_varianza)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Regresar)
                            .addComponent(btn_salir))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                        .addComponent(jlb_media, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegresarActionPerformed
        MenuOpciones Menu = new MenuOpciones();
        Menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_RegresarActionPerformed

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        String mensaje = "Calculo elegido: ";
        if (jrb_mediana.isSelected()) {
            mensaje = mensaje + "La media aritmética es un concepto matemático "
                    + "\nusado en estadística. También llamada promedio o simplemente "
                    + "\nmedia, se obtiene con la suma de un conjunto de valores dividida "
                    + "\nentre el número total de sumandos.";
        } else if (jrb_media.isSelected()) {
            mensaje = mensaje + "En el ámbito de la estadística, la mediana "
                    + "\nrepresenta el valor de la variable de posición central "
                    + "\nen un conjunto de datos ordenados. Se le denota mediana.";
        } else if (jrb_varianza.isSelected()) {
            mensaje = mensaje + "La Varianza es una medida de dispersión que se "
                    + "\nutiliza para representar la variabilidad de un conjunto de "
                    + "\ndatos respecto de la media aritmética de los mismo."
                    + "\n Así, se calcula como la suma de los residuos elevados"
                    + "\n al cuadrado y divididos entre el total de observaciones.";
        }
        jTextArea1.setText(mensaje);
    }//GEN-LAST:event_btn_aceptarActionPerformed

    private void btn_medianaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_medianaActionPerformed

        Scanner ingreso = new Scanner(System.in);
        int i, j, aux;
        int a[] = new int[5];

        for (i = 0; i < 5; i++) {

            //System.out.print("Ingresa un numero: ");
            a[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite un sueldo: " + i));
        }//fin for

        for (i = 1; i < 5; i++) {
            for (j = 0; j < 5 - i; j++) {
                if (a[j] > a[j + 1]) {
                    aux = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;

                }//fin if     
            }//fin for   
        }//fin for
        //System.out.printf("La mediana es: %d\n",a[2]);
        JOptionPane.showMessageDialog(null, "La mediana de los sueldos es: " + a[2]);
    }//GEN-LAST:event_btn_medianaActionPerformed

    private void btn_mediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mediaActionPerformed
        sueldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un sueldo: "));

        while (sueldo != n) {
            suma += sueldo;
            sumatoria += sueldo;
            cantSueldos++;
            media = suma / cantSueldos;
            sueldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro sueldo: "));
        }
        if (sueldo < 0) {
            JOptionPane.showMessageDialog(null, "Sueldo invalido, digite otro sueldo.");
        } else {
            JOptionPane.showMessageDialog(null, "La media de los sueldos es: " + media);
        }
    }//GEN-LAST:event_btn_mediaActionPerformed

    private void btn_varianzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_varianzaActionPerformed
        int i = 0;
        int sueldos[] = new int[5];
        double sumatoria = 0;
        int cantSueldos = 5;

        for (i = 0; i < 5; i++) {
            sueldos[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un sueldo: " + i));
            sumatoria += sueldos[i];

            media = sumatoria / cantSueldos;
            sumatoria = Math.pow(sueldos[i] - media, 2);
        }

        varianza = varianza + sumatoria;
        varianza = varianza / (cantSueldos - 1);

        JOptionPane.showMessageDialog(null, "La varianza de los sueldos es: " + varianza);
    }//GEN-LAST:event_btn_varianzaActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        int a = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(this, "Desea Salir", "Salir", a);
        if (resultado == 0) {
            System.exit(0);

        }
    }//GEN-LAST:event_btn_salirActionPerformed

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
            java.util.logging.Logger.getLogger(Estadistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estadistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estadistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estadistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estadistica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Regresar;
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_media;
    private javax.swing.JButton btn_mediana;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton btn_varianza;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel jlb_media;
    private javax.swing.JRadioButton jrb_media;
    private javax.swing.JRadioButton jrb_mediana;
    private javax.swing.JRadioButton jrb_varianza;
    private javax.swing.JLabel llb_mediana;
    // End of variables declaration//GEN-END:variables
}
