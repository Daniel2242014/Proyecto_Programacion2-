package presentacion;

import java.awt.Image;
import javax.swing.ImageIcon;
import logica.Jugador;


public class DescripcionJugador extends javax.swing.JPanel {

    
    public  DescripcionJugador(Jugador j) {
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
               
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jLabel5.setText("Fecha debut");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Nuemro de camisa");

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

        javax.swing.GroupLayout ssLayout = new javax.swing.GroupLayout(ss);
        ss.setLayout(ssLayout);
        ssLayout.setHorizontalGroup(
            ssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ssLayout.createSequentialGroup()
                .addGroup(ssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ssLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(ssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addGap(45, 45, 45)
                        .addGroup(ssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edad)
                            .addComponent(fechaDebut)
                            .addComponent(club))
                        .addGap(95, 95, 95)
                        .addGroup(ssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)))
                    .addGroup(ssLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(ssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ssLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(nombre))
                            .addGroup(ssLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(ssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(ssLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(segPosicion))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ssLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(priposicion))
                                    .addGroup(ssLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(42, 42, 42)
                                        .addGroup(ssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rojas)
                                            .addComponent(numcamisa)
                                            .addComponent(faltas)
                                            .addComponent(amarilias))))))))
                .addGap(0, 44, Short.MAX_VALUE))
        );
        ssLayout.setVerticalGroup(
            ssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ssLayout.createSequentialGroup()
                .addGroup(ssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addComponent(jLabel6)
                            .addComponent(numcamisa)))
                    .addGroup(ssLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(ssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ssLayout.createSequentialGroup()
                        .addGroup(ssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(fechaDebut))
                        .addGap(39, 39, 39)
                        .addGroup(ssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(edad)))
                    .addGroup(ssLayout.createSequentialGroup()
                        .addGroup(ssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ssLayout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(ssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(amarilias)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ssLayout.createSequentialGroup()
                                .addGroup(ssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(rojas)
                                    .addComponent(club)
                                    .addComponent(jLabel9))
                                .addGap(65, 65, 65)))
                        .addGap(39, 39, 39)
                        .addGroup(ssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(faltas))))
                .addContainerGap(34, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amarilias;
    private javax.swing.JLabel club;
    private javax.swing.JLabel edad;
    private javax.swing.JLabel faltas;
    private javax.swing.JLabel fechaDebut;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel numcamisa;
    private javax.swing.JLabel priposicion;
    private javax.swing.JLabel rojas;
    private javax.swing.JLabel segPosicion;
    private javax.swing.JPanel ss;
    // End of variables declaration//GEN-END:variables
}
