package presentacion;
import java.awt.Image;
import javax.swing.ImageIcon;
import logica.Director;
/**
 * Clase encargada de mostrar gráficamente el contenido de un objeto del tipo 
 * Director en presentacion.Principal, panelScroll>displayInterno.
 */
public class ListaDirector extends javax.swing.JPanel {
    Director integrante; 
    /**
     * Constructor específico que se encarga de setear los datos gráficamente.
     * @param Director r 
     */
    public ListaDirector(Director r) {
        initComponents();
        imagen.setIcon(new ImageIcon(r.getImg().getImage().getScaledInstance(238, 238, Image.SCALE_DEFAULT)));
        nombre.setText(r.getNombre());
        edad.setText(String.valueOf(r.getEdad()));
        pais.setText(r.getPais());
        integrante=r;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ss = new javax.swing.JPanel();
        imagen = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        edad = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        pais = new javax.swing.JLabel();
        detalle = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        ss.setBackground(new java.awt.Color(255, 255, 255));

        label.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        label.setForeground(new java.awt.Color(51, 51, 51));
        label.setText("Pais");
        label.setToolTipText("");

        nombre.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        nombre.setForeground(new java.awt.Color(51, 51, 51));
        nombre.setText("Nombre");
        nombre.setToolTipText("");

        edad.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        edad.setForeground(new java.awt.Color(51, 51, 51));
        edad.setText("////////////////");
        edad.setToolTipText("");

        label3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        label3.setForeground(new java.awt.Color(51, 51, 51));
        label3.setText("Edad");
        label3.setToolTipText("");

        pais.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pais.setForeground(new java.awt.Color(51, 51, 51));
        pais.setText("////////////////");
        pais.setToolTipText("");

        detalle.setBackground(new java.awt.Color(204, 0, 0));
        detalle.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        detalle.setForeground(new java.awt.Color(255, 255, 255));
        detalle.setText("Detalles");
        detalle.setBorder(null);
        detalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detalleActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout ssLayout = new javax.swing.GroupLayout(ss);
        ss.setLayout(ssLayout);
        ssLayout.setHorizontalGroup(
            ssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ssLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ssLayout.createSequentialGroup()
                        .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(ssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ssLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(nombre))
                            .addGroup(ssLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(ssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ssLayout.createSequentialGroup()
                                        .addComponent(label3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(edad))
                                    .addGroup(ssLayout.createSequentialGroup()
                                        .addComponent(label)
                                        .addGap(18, 18, 18)
                                        .addComponent(pais))))
                            .addGroup(ssLayout.createSequentialGroup()
                                .addGap(430, 430, 430)
                                .addComponent(detalle, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        ssLayout.setVerticalGroup(
            ssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ssLayout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ssLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(nombre)
                        .addGap(26, 26, 26)
                        .addGroup(ssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edad)
                            .addComponent(label3))
                        .addGap(21, 21, 21)
                        .addGroup(ssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label)
                            .addComponent(pais))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(detalle, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(ssLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void detalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detalleActionPerformed
        Principal.getInstancia().cargarPanel(new DescripcionDirector(integrante));
    }//GEN-LAST:event_detalleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton detalle;
    private javax.swing.JLabel edad;
    private javax.swing.JLabel imagen;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel pais;
    private javax.swing.JPanel ss;
    // End of variables declaration//GEN-END:variables
}
