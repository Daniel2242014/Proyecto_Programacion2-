
package presentacion;

import java.awt.Image;
import javax.swing.ImageIcon;
import logica.Jugador;


public class Listajugador extends javax.swing.JPanel {
    Jugador integrante;
    
    public Listajugador(Jugador j) {
        initComponents();
        imagen.setIcon(new ImageIcon(j.getImg().getImage().getScaledInstance(240,240, Image.SCALE_DEFAULT)));
        nombre.setText(j.getNombre());
        numeroCamisa.setText(String.valueOf(j.getNumeroCamisa()));
        edad.setText(String.valueOf(j.getEdad()));
        primeraPosicion.setText(j.getPrimeraPosicion());
        segundaPosicion.setText(j.getSegundaPosicion());
        altura.setText(String.valueOf(j.getAltura()));
        pais.setText(j.getPais());
        integrante=j;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        imagen = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label7 = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        numeroCamisa = new javax.swing.JLabel();
        edad = new javax.swing.JLabel();
        primeraPosicion = new javax.swing.JLabel();
        segundaPosicion = new javax.swing.JLabel();
        altura = new javax.swing.JLabel();
        pais = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jButton1.setText("jButton1");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        label3.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        label3.setForeground(new java.awt.Color(51, 51, 51));
        label3.setText("Edad");
        label3.setToolTipText("");

        label.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        label.setForeground(new java.awt.Color(51, 51, 51));
        label.setText("Nombre");
        label.setToolTipText("");

        label5.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        label5.setForeground(new java.awt.Color(51, 51, 51));
        label5.setText("2º Posicion");
        label5.setToolTipText("");

        label4.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        label4.setForeground(new java.awt.Color(51, 51, 51));
        label4.setText("Posicion");
        label4.setToolTipText("");

        label6.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        label6.setForeground(new java.awt.Color(51, 51, 51));
        label6.setText("Altura");
        label6.setToolTipText("");

        label2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        label2.setForeground(new java.awt.Color(51, 51, 51));
        label2.setText("Numero de camisa");
        label2.setToolTipText("");

        label7.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        label7.setForeground(new java.awt.Color(51, 51, 51));
        label7.setText("Pais");
        label7.setToolTipText("");

        nombre.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        nombre.setForeground(new java.awt.Color(51, 51, 51));
        nombre.setText("///////");
        nombre.setToolTipText("");

        numeroCamisa.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        numeroCamisa.setForeground(new java.awt.Color(51, 51, 51));
        numeroCamisa.setText("///////");
        numeroCamisa.setToolTipText("");

        edad.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        edad.setForeground(new java.awt.Color(51, 51, 51));
        edad.setText("///////");
        edad.setToolTipText("");

        primeraPosicion.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        primeraPosicion.setForeground(new java.awt.Color(51, 51, 51));
        primeraPosicion.setText("///////");
        primeraPosicion.setToolTipText("");

        segundaPosicion.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        segundaPosicion.setForeground(new java.awt.Color(51, 51, 51));
        segundaPosicion.setText("///////");
        segundaPosicion.setToolTipText("");

        altura.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        altura.setForeground(new java.awt.Color(51, 51, 51));
        altura.setText("///////");
        altura.setToolTipText("");

        pais.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        pais.setForeground(new java.awt.Color(51, 51, 51));
        pais.setText("///////");
        pais.setToolTipText("");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Detalles");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label)
                    .addComponent(label2)
                    .addComponent(label3)
                    .addComponent(label4)
                    .addComponent(label5)
                    .addComponent(label6)
                    .addComponent(label7))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(numeroCamisa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(edad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(primeraPosicion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(32, 32, 32))
                            .addComponent(altura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(segundaPosicion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(170, 170, 170)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label)
                            .addComponent(nombre))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label2)
                            .addComponent(numeroCamisa))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label3)
                            .addComponent(edad))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(primeraPosicion))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label5)
                            .addComponent(segundaPosicion))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label6)
                                    .addComponent(altura))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label7)
                                    .addComponent(pais)))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 830, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Principal.getInstancia().cargarPanel(new DescripcionJugador(integrante));
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel altura;
    private javax.swing.JLabel edad;
    private javax.swing.JLabel imagen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel numeroCamisa;
    private javax.swing.JLabel pais;
    private javax.swing.JLabel primeraPosicion;
    private javax.swing.JLabel segundaPosicion;
    // End of variables declaration//GEN-END:variables
}
