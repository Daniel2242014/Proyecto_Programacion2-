package presentacion;
import java.awt.Image;
import javax.swing.ImageIcon;
import logica.Jugador;
import fachada.Fachada;
import javax.swing.JOptionPane;
/**
 * Se encarga de mostrar de una forma detallada todos los datos de un objeto
 * del tipo Jugador.
 */
public class DescripcionJugador extends javax.swing.JPanel {
    Jugador integrante;
    /**
     * Costructor específico que setea los datos gráficamente.
     * @param Jugador j 
     */
    public DescripcionJugador(Jugador j) {
        initComponents();
        imagen.setIcon(new ImageIcon(j.getImg().getImage().getScaledInstance(330, 330, Image.SCALE_DEFAULT)));
        nombre.setText(j.getNombre());
        priposicion.setText(j.getPrimeraPosicion());
        segPosicion.setText(j.getSegundaPosicion());
        numcamisa.setText(String.valueOf(j.getNumeroCamisa()));
        club.setText(j.getClub());
        fechaDebut.setText(j.getFechaDebut());
        edad.setText(String.valueOf(j.getEdad()));
        rojas.setText(String.valueOf(j.getRojasTotales()));
        amarilias.setText(String.valueOf(j.getAmarillasTotales()));
        faltas.setText(String.valueOf(j.getFaltasTotales()));
        pais.setText(j.getPais());
        integrante=j;
               
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ss = new javax.swing.JPanel();
        imagen = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        segPosicion = new javax.swing.JLabel();
        numcamisa = new javax.swing.JLabel();
        priposicion = new javax.swing.JLabel();
        fechaDebut = new javax.swing.JLabel();
        rojas = new javax.swing.JLabel();
        edad = new javax.swing.JLabel();
        club = new javax.swing.JLabel();
        faltas = new javax.swing.JLabel();
        amarilias = new javax.swing.JLabel();
        editar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        pais = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        ss.setBackground(new java.awt.Color(255, 255, 255));

        imagen.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Segunda posicion");

        nombre.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        nombre.setForeground(new java.awt.Color(51, 51, 51));
        nombre.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Primera posicion");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Fecha Debut");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Pais");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Edad");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Rojas totales");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Club");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Faltas totales");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Amarilias totales");

        segPosicion.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        segPosicion.setForeground(new java.awt.Color(51, 51, 51));
        segPosicion.setText("SIN DEFINIR");

        numcamisa.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        numcamisa.setForeground(new java.awt.Color(51, 51, 51));
        numcamisa.setText("SIN DEFINIR");

        priposicion.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        priposicion.setForeground(new java.awt.Color(51, 51, 51));
        priposicion.setText("SIN DEFINIR");

        fechaDebut.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        fechaDebut.setForeground(new java.awt.Color(51, 51, 51));
        fechaDebut.setText("SIN DEFINIR");

        rojas.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        rojas.setForeground(new java.awt.Color(51, 51, 51));
        rojas.setText("SIN DEFINIR");

        edad.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        edad.setForeground(new java.awt.Color(51, 51, 51));
        edad.setText("SIN DEFINIR");

        club.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        club.setForeground(new java.awt.Color(51, 51, 51));
        club.setText("SIN DEFINIR");

        faltas.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        faltas.setForeground(new java.awt.Color(51, 51, 51));
        faltas.setText("SIN DEFINIR");

        amarilias.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        amarilias.setForeground(new java.awt.Color(51, 51, 51));
        amarilias.setText("SIN DEFINIR");

        editar.setBackground(new java.awt.Color(0, 153, 153));
        editar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        editar.setForeground(new java.awt.Color(255, 255, 255));
        editar.setText("Editar");
        editar.setBorder(null);
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        eliminar.setBackground(new java.awt.Color(255, 0, 0));
        eliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        eliminar.setForeground(new java.awt.Color(255, 255, 255));
        eliminar.setText("Eliminar");
        eliminar.setBorder(null);
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Numero de camiseta");

        pais.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        pais.setForeground(new java.awt.Color(51, 51, 51));
        pais.setText("SIN DEFINIR");

        javax.swing.GroupLayout ssLayout = new javax.swing.GroupLayout(ss);
        ss.setLayout(ssLayout);
        ssLayout.setHorizontalGroup(
            ssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ssLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(ssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ssLayout.createSequentialGroup()
                        .addGroup(ssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ssLayout.createSequentialGroup()
                        .addGroup(ssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(edad)
                            .addGroup(ssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(ssLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fechaDebut))
                                .addGroup(ssLayout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(club))))
                        .addGap(69, 69, 69)))
                .addGroup(ssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ssLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(faltas))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ssLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(amarilias))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ssLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rojas))
                    .addGroup(ssLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(segPosicion))
                    .addGroup(ssLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(priposicion))
                    .addGroup(ssLayout.createSequentialGroup()
                        .addComponent(nombre)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(ssLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(numcamisa))
                    .addGroup(ssLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pais)))
                .addGap(36, 56, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ssLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(editar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );
        ssLayout.setVerticalGroup(
            ssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ssLayout.createSequentialGroup()
                .addGroup(ssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ssLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ssLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(nombre)
                        .addGap(35, 35, 35)
                        .addGroup(ssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(priposicion))
                        .addGap(36, 36, 36)
                        .addGroup(ssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(segPosicion))
                        .addGap(37, 37, 37)
                        .addGroup(ssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numcamisa)
                            .addComponent(jLabel12))
                        .addGap(30, 30, 30)
                        .addGroup(ssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(pais))))
                .addGroup(ssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rojas)
                    .addComponent(jLabel8)
                    .addComponent(club)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(ssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(fechaDebut)
                    .addComponent(jLabel5)
                    .addComponent(amarilias))
                .addGap(32, 32, 32)
                .addGroup(ssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(faltas)
                    .addComponent(jLabel7)
                    .addComponent(edad))
                .addGap(18, 18, 18)
                .addGroup(ssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
       if(JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea eliminar?", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE)==0){
           Fachada.getInstancia().eliminarJugador(integrante);
           JOptionPane.showMessageDialog(null, "Operacion concluida con exito", "Informacion", JOptionPane.INFORMATION_MESSAGE);
           Principal.getInstancia().cargarPanel(new menuJugador());
       }
        
    }//GEN-LAST:event_eliminarActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        Principal.getInstancia().cargarPanel(new nuevoJugador(integrante));
    }//GEN-LAST:event_editarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amarilias;
    private javax.swing.JLabel club;
    private javax.swing.JLabel edad;
    private javax.swing.JButton editar;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel faltas;
    private javax.swing.JLabel fechaDebut;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel numcamisa;
    private javax.swing.JLabel pais;
    private javax.swing.JLabel priposicion;
    private javax.swing.JLabel rojas;
    private javax.swing.JLabel segPosicion;
    private javax.swing.JPanel ss;
    // End of variables declaration//GEN-END:variables
}
