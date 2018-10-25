package presentacion;
import java.awt.Image;
import javax.swing.ImageIcon;
import logica.Director;
/**
 * Muestra los datos de un objeto del tipo Director para mostrar en el menú 
 * de jugadores.
 */
public class DescripcionDirector extends javax.swing.JPanel {
    /**
     * Constructor específico, se cargan los datos del objeto a la parte gráfica.
     * @param d Director
     */
    public DescripcionDirector(Director d) {
        initComponents();
        imagen.setIcon(new ImageIcon(d.getImg().getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT)));
        edad.setText(String.valueOf(d.getEdad()));
        pais.setText(d.getPais());
        descripcion.setLineWrap(true);
        descripcion.setWrapStyleWord(true);
        descripcion.setText(d.getDescripcion());
        nombre.setText(d.getNombre());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        imagen = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        nombre1 = new javax.swing.JLabel();
        edad = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextArea();
        nombre3 = new javax.swing.JLabel();
        pais = new javax.swing.JLabel();
        nombre2 = new javax.swing.JLabel();

        setFocusable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 0));

        imagen.setFocusable(false);

        nombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        nombre.setForeground(new java.awt.Color(51, 51, 51));
        nombre.setText("Pais");
        nombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nombre.setFocusable(false);

        nombre1.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        nombre1.setForeground(new java.awt.Color(51, 51, 51));
        nombre1.setText("Nombre");
        nombre1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nombre1.setFocusable(false);

        edad.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        edad.setForeground(new java.awt.Color(51, 51, 51));
        edad.setText("Nombre");
        edad.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edad.setFocusable(false);

        descripcion.setEditable(false);
        descripcion.setBackground(new java.awt.Color(255, 255, 255));
        descripcion.setColumns(20);
        descripcion.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        descripcion.setRows(5);
        descripcion.setWrapStyleWord(true);
        descripcion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        descripcion.setFocusable(false);
        jScrollPane1.setViewportView(descripcion);

        nombre3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        nombre3.setForeground(new java.awt.Color(51, 51, 51));
        nombre3.setText("Edad");
        nombre3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nombre3.setFocusable(false);

        pais.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pais.setForeground(new java.awt.Color(51, 51, 51));
        pais.setText("Nombre");
        pais.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pais.setFocusable(false);

        nombre2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        nombre2.setForeground(new java.awt.Color(51, 51, 51));
        nombre2.setText("Descripcion");
        nombre2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nombre2.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(nombre2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombre3)
                                    .addComponent(nombre))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(pais)
                                    .addComponent(edad))))
                        .addGap(0, 319, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(328, 328, 328)
                    .addComponent(nombre1)
                    .addContainerGap(353, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edad)
                            .addComponent(nombre3))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre)
                            .addComponent(pais))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nombre2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(nombre1)
                    .addContainerGap(528, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea descripcion;
    private javax.swing.JLabel edad;
    private javax.swing.JLabel imagen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel nombre1;
    private javax.swing.JLabel nombre2;
    private javax.swing.JLabel nombre3;
    private javax.swing.JLabel pais;
    // End of variables declaration//GEN-END:variables
}
