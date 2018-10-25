package presentacion;
import java.awt.Image;
import javax.swing.ImageIcon;
import logica.Fase;
import fachada.Fachada;
import javax.swing.JOptionPane;

public class DescripcionFase extends javax.swing.JPanel {
    Fase f;

    public DescripcionFase(Fase f) {
        initComponents();
        this.f=f;
        String chardemierda=""+f.getLetra_posicion();
        LetraGrupo.setText(chardemierda);
        Bandera1.setIcon(new ImageIcon(f.getSeleciones().get(0).getImg().getImage().getScaledInstance(295,171, Image.SCALE_DEFAULT)));
        Bandera2.setIcon(new ImageIcon(f.getSeleciones().get(1).getImg().getImage().getScaledInstance(295,171, Image.SCALE_DEFAULT)));
        Bandera3.setIcon(new ImageIcon(f.getSeleciones().get(2).getImg().getImage().getScaledInstance(295,171, Image.SCALE_DEFAULT)));
        Bandera4.setIcon(new ImageIcon(f.getSeleciones().get(3).getImg().getImage().getScaledInstance(295,171, Image.SCALE_DEFAULT)));
        Seleccion1.setText(f.getSeleciones().get(0).getNombre());
        Seleccion2.setText(f.getSeleciones().get(1).getNombre());
        Seleccion3.setText(f.getSeleciones().get(2).getNombre());
        Seleccion4.setText(f.getSeleciones().get(3).getNombre());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        LetraGrupo = new javax.swing.JLabel();
        DosPuntos = new javax.swing.JLabel();
        Bandera1 = new javax.swing.JButton();
        Bandera2 = new javax.swing.JButton();
        Bandera3 = new javax.swing.JButton();
        Bandera4 = new javax.swing.JButton();
        Seleccion1 = new javax.swing.JLabel();
        Seleccion2 = new javax.swing.JLabel();
        Seleccion3 = new javax.swing.JLabel();
        Seleccion4 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Titulo.setFont(new java.awt.Font("Arial", 1, 72)); // NOI18N
        Titulo.setForeground(new java.awt.Color(51, 51, 51));
        Titulo.setText("Grupo");

        LetraGrupo.setFont(new java.awt.Font("Arial", 1, 72)); // NOI18N
        LetraGrupo.setForeground(new java.awt.Color(197, 0, 0));
        LetraGrupo.setText("S/D");

        DosPuntos.setFont(new java.awt.Font("Arial", 1, 72)); // NOI18N
        DosPuntos.setForeground(new java.awt.Color(51, 51, 51));
        DosPuntos.setText(":");

        Bandera1.setPreferredSize(new java.awt.Dimension(295, 171));
        Bandera1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bandera1ActionPerformed(evt);
            }
        });

        Bandera2.setPreferredSize(new java.awt.Dimension(295, 171));
        Bandera2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bandera2ActionPerformed(evt);
            }
        });

        Bandera3.setPreferredSize(new java.awt.Dimension(295, 171));
        Bandera3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bandera3ActionPerformed(evt);
            }
        });

        Bandera4.setPreferredSize(new java.awt.Dimension(295, 171));
        Bandera4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bandera4ActionPerformed(evt);
            }
        });

        Seleccion1.setFont(new java.awt.Font("Arial Black", 1, 42)); // NOI18N
        Seleccion1.setForeground(new java.awt.Color(51, 51, 51));
        Seleccion1.setText("NOMBRE1");

        Seleccion2.setFont(new java.awt.Font("Arial Black", 1, 42)); // NOI18N
        Seleccion2.setForeground(new java.awt.Color(51, 51, 51));
        Seleccion2.setText("NOMBRE2");

        Seleccion3.setFont(new java.awt.Font("Arial Black", 1, 42)); // NOI18N
        Seleccion3.setForeground(new java.awt.Color(51, 51, 51));
        Seleccion3.setText("NOMBRE3");

        Seleccion4.setFont(new java.awt.Font("Arial Black", 1, 42)); // NOI18N
        Seleccion4.setForeground(new java.awt.Color(51, 51, 51));
        Seleccion4.setText("NOMBRE4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Seleccion3)
                        .addGap(459, 459, 459))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Seleccion1)
                        .addGap(459, 459, 459))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(Titulo)
                                    .addGap(18, 18, 18)
                                    .addComponent(LetraGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addComponent(Bandera1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Bandera3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(DosPuntos)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Seleccion2)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Bandera2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Bandera4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Seleccion4))))))
                .addGap(148, 148, 148))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Titulo)
                    .addComponent(LetraGrupo)
                    .addComponent(DosPuntos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bandera1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bandera2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Seleccion1)
                    .addComponent(Seleccion2))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bandera3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bandera4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Seleccion3)
                    .addComponent(Seleccion4)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Bandera1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bandera1ActionPerformed
        // TODO add your handling code here:
        Principal.getInstancia().cargarPanel(new ListarSeleccion(f.getSeleciones().get(0)));
        
    }//GEN-LAST:event_Bandera1ActionPerformed

    private void Bandera2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bandera2ActionPerformed
        // TODO add your handling code here:
        Principal.getInstancia().cargarPanel(new ListarSeleccion(f.getSeleciones().get(1)));
    }//GEN-LAST:event_Bandera2ActionPerformed

    private void Bandera3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bandera3ActionPerformed
        // TODO add your handling code here:
        Principal.getInstancia().cargarPanel(new ListarSeleccion(f.getSeleciones().get(2)));
    }//GEN-LAST:event_Bandera3ActionPerformed

    private void Bandera4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bandera4ActionPerformed
        // TODO add your handling code here:
        Principal.getInstancia().cargarPanel(new ListarSeleccion(f.getSeleciones().get(3)));
    }//GEN-LAST:event_Bandera4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bandera1;
    private javax.swing.JButton Bandera2;
    private javax.swing.JButton Bandera3;
    private javax.swing.JButton Bandera4;
    private javax.swing.JLabel DosPuntos;
    private javax.swing.JLabel LetraGrupo;
    private javax.swing.JLabel Seleccion1;
    private javax.swing.JLabel Seleccion2;
    private javax.swing.JLabel Seleccion3;
    private javax.swing.JLabel Seleccion4;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
