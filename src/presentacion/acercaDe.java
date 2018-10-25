package presentacion;
import java.awt.Image;
import javax.swing.ImageIcon;

public class acercaDe extends javax.swing.JPanel {
    public acercaDe() {
        initComponents();
        ImageIcon back=new ImageIcon("src/img/acercaDe.jpg");
        fondo.setIcon(new ImageIcon(back.getImage().getScaledInstance(430, 230, Image.SCALE_DEFAULT)));
        esi.setIcon(new ImageIcon("src/img/esi.jpg"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        nombres = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        esi = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        proser = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 0, 0));
        setEnabled(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 230));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Arial", 3, 26)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 0, 51));
        titulo.setText(" Proyecto - Rusia 2018");
        jPanel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 320, 90));

        nombres.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        nombres.setForeground(new java.awt.Color(204, 102, 0));
        nombres.setText("Agustín Pérez - Daniel Padrón - Facundo Silvetti");
        jPanel1.add(nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 310, 50));

        fecha.setForeground(new java.awt.Color(153, 153, 0));
        fecha.setText("25/10/2018");
        fecha.setToolTipText("");
        jPanel1.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 100, 30));

        esi.setText("jLabel2");
        jPanel1.add(esi, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 150, 70));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 310, 10));

        proser.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        proser.setForeground(new java.awt.Color(255, 51, 51));
        proser.setText("Profesor - Nicolás Artigas");
        jPanel1.add(proser, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 150, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 330, 230));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel esi;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nombres;
    private javax.swing.JLabel proser;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
