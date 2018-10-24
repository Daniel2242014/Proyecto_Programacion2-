package presentacion;
import java.awt.Image;
import logica.Seleccion;
import javax.swing.ImageIcon;

public class ListarSeleccion extends javax.swing.JPanel 
{
    public ListarSeleccion(Seleccion s) 
    {
        initComponents();
        icon.setIcon(new ImageIcon(s.getImg().getImage().getScaledInstance(250, 170, Image.SCALE_DEFAULT))); //Setea la bandera
        nombre.setText(s.getNombre());
        cantJugador.setText(String.valueOf(s.getJugadores().size()));
        confederacion.setText(s.getConfederacion());
        director.setText(s.getMaestro().getNombre());
        rankingFifa.setText(String.valueOf(s.getRanking_FIFA()));
        fechaSalida.setText(s.getFecha_salida());
        letraGrupo.setText(String.valueOf(s.getLetra_grupo()).toUpperCase());
        if(s.getNombre().equals("Francia")) //Solo se considera francia como único ganador
        {
            fechaSalida.setText("-");
            ganador.setText("GANADOR DEL MUNDIAL");
            copaIco.setIcon(new ImageIcon(fachada.Fachada.getInstancia().getCopa().getImage().getScaledInstance(74, 157, Image.SCALE_DEFAULT)));
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        icon = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cantJugador = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        letraGrupo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        director = new javax.swing.JLabel();
        confederacion = new javax.swing.JLabel();
        rankingFifa = new javax.swing.JLabel();
        fechaSalida = new javax.swing.JLabel();
        ganador = new javax.swing.JLabel();
        copaIco = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(834, 603));

        icon.setBackground(new java.awt.Color(255, 255, 255));
        icon.setInheritsPopupMenu(false);

        nombre.setBackground(new java.awt.Color(255, 255, 255));
        nombre.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        nombre.setForeground(new java.awt.Color(153, 0, 51));
        nombre.setText("nombre");
        nombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Cantidad de jugadores");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        cantJugador.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        cantJugador.setText("...");
        cantJugador.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ver todos");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Director");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Confederación");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Fecha de salida");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Grupo");

        letraGrupo.setBackground(new java.awt.Color(255, 255, 255));
        letraGrupo.setFont(new java.awt.Font("Arial", 2, 72)); // NOI18N
        letraGrupo.setForeground(new java.awt.Color(255, 204, 102));
        letraGrupo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letraGrupo.setText("A");
        letraGrupo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setText("Ranking FIFA");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        director.setBackground(new java.awt.Color(255, 255, 255));
        director.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        director.setText("..");
        director.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        confederacion.setBackground(new java.awt.Color(255, 255, 255));
        confederacion.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        confederacion.setText("..");
        confederacion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        rankingFifa.setBackground(new java.awt.Color(255, 255, 255));
        rankingFifa.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        rankingFifa.setText("..");
        rankingFifa.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        fechaSalida.setBackground(new java.awt.Color(255, 255, 255));
        fechaSalida.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        fechaSalida.setText("..");
        fechaSalida.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        ganador.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        ganador.setForeground(new java.awt.Color(0, 255, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(58, 58, 58)
                                .addComponent(cantJugador)
                                .addGap(98, 98, 98)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(117, 117, 117)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(letraGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(confederacion, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                            .addComponent(director, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rankingFifa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fechaSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ganador, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(copaIco, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(jLabel6))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(letraGrupo)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cantJugador)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(confederacion))
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(director, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(rankingFifa)))
                    .addComponent(copaIco, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(fechaSalida)
                    .addComponent(ganador, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(113, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cantJugador;
    private javax.swing.JLabel confederacion;
    private javax.swing.JLabel copaIco;
    private javax.swing.JLabel director;
    private javax.swing.JLabel fechaSalida;
    private javax.swing.JLabel ganador;
    private javax.swing.JLabel icon;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel letraGrupo;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel rankingFifa;
    // End of variables declaration//GEN-END:variables
}
