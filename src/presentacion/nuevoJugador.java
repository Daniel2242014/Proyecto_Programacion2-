package presentacion;
import fachada.Fachada;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;
import logica.Jugador;
import logica.Seleccion;

public class nuevoJugador extends javax.swing.JPanel {

    private static nuevoJugador initi;
    private Jugador aModificar;

    public nuevoJugador(Jugador j) {
        aModificar = j;
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Metal".equals(info.getName())) {
                try {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            }
        }
        this.initComponents();
        System.out.println(Fachada.getInstancia().getSelecciones().size());
        for (Seleccion s : Fachada.getInstancia().getSelecciones()) {
            seleccion.addItem(s.getNombre());
        }
        segPosicion.setSelectedIndex(3);

        if (aModificar != null) {
            titulo.setText("Modificar datos");
            nombre.setText(aModificar.getNombre());
            priPosicon.setSelectedItem(aModificar.getPrimeraPosicion());
            if (aModificar.getSegundaPosicion() == null) {
                segPosicion.setSelectedIndex(3);
            } else {
                segPosicion.setSelectedItem(aModificar.getSegundaPosicion());
            }
            numCamisa.setValue(aModificar.getNumeroCamisa());
            edad.setValue(aModificar.getEdad());
            club.setText(aModificar.getClub());
            año.setSelectedItem(aModificar.getFechaDebut().subSequence(6, 10));
            mes.setSelectedItem(aModificar.getFechaDebut().subSequence(3, 5));
            dia.setSelectedItem(aModificar.getFechaDebut().subSequence(0, 2));
            seleccion.setSelectedIndex(Fachada.getInstancia().posicionSeleccion(Fachada.getInstancia().debolberSeleccionPorNombre(aModificar.getPais())));
            altura.setText(String.valueOf(aModificar.getAltura()));
            ruta.setText(aModificar.rutaImg());//22/04/2018
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        segPosicion = new javax.swing.JComboBox<>();
        seleccion = new javax.swing.JComboBox<>();
        priPosicon = new javax.swing.JComboBox<>();
        numCamisa = new javax.swing.JSpinner();
        edad = new javax.swing.JSpinner();
        club = new javax.swing.JTextField();
        mes = new javax.swing.JComboBox<>();
        dia = new javax.swing.JComboBox<>();
        año = new javax.swing.JComboBox<>();
        ruta = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        ingresar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        altura = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFocusable(false);

        titulo.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        titulo.setForeground(new java.awt.Color(51, 51, 51));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Crear jugador");
        titulo.setFocusable(false);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Numero de camiseta*");
        jLabel2.setFocusable(false);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Nombre* ");
        jLabel3.setFocusable(false);

        nombre.setBackground(new java.awt.Color(255, 255, 255));
        nombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        nombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 51, 51)));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Primera posición*");
        jLabel4.setFocusable(false);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Segunda posición");
        jLabel5.setFocusable(false);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Club");
        jLabel7.setFocusable(false);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("País*");
        jLabel8.setFocusable(false);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Imágen");
        jLabel9.setFocusable(false);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Edad*");
        jLabel10.setFocusable(false);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Fecha Debut*");
        jLabel11.setFocusable(false);

        segPosicion.setBackground(new java.awt.Color(255, 255, 255));
        segPosicion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        segPosicion.setForeground(new java.awt.Color(51, 51, 51));
        segPosicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Defensa", "Volante", "Delantero", "Sin determinar" }));
        segPosicion.setEnabled(false);
        segPosicion.setFocusable(false);

        seleccion.setBackground(new java.awt.Color(255, 255, 255));
        seleccion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        seleccion.setForeground(new java.awt.Color(51, 51, 51));
        seleccion.setFocusable(false);

        priPosicon.setBackground(new java.awt.Color(255, 255, 255));
        priPosicon.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        priPosicon.setForeground(new java.awt.Color(51, 51, 51));
        priPosicon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arquero", "Defensa", "Volante", "Delantero" }));
        priPosicon.setFocusable(false);
        priPosicon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priPosiconActionPerformed(evt);
            }
        });

        numCamisa.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        numCamisa.setModel(new javax.swing.SpinnerNumberModel(1, 1, 23, 1));
        numCamisa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        numCamisa.setFocusable(false);

        edad.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        edad.setModel(new javax.swing.SpinnerNumberModel(24, 15, 36, 1));
        edad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        edad.setFocusable(false);

        club.setBackground(new java.awt.Color(255, 255, 255));
        club.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        club.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 51, 51)));

        mes.setBackground(new java.awt.Color(255, 255, 255));
        mes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mes.setForeground(new java.awt.Color(51, 51, 51));
        mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "04", "05", "06", "07", "08", "09", "10", "11", "12", " " }));
        mes.setFocusable(false);

        dia.setBackground(new java.awt.Color(255, 255, 255));
        dia.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        dia.setForeground(new java.awt.Color(51, 51, 51));
        dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        dia.setFocusable(false);

        año.setBackground(new java.awt.Color(255, 255, 255));
        año.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        año.setForeground(new java.awt.Color(51, 51, 51));
        año.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2017", "2018", " " }));
        año.setFocusable(false);

        ruta.setEditable(false);
        ruta.setBackground(new java.awt.Color(255, 255, 255));
        ruta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ruta.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 51, 51)));
        ruta.setFocusable(false);

        buscar.setBackground(new java.awt.Color(255, 255, 255));
        buscar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        buscar.setForeground(new java.awt.Color(51, 51, 51));
        buscar.setText("Buscar");
        buscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buscar.setFocusable(false);
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        ingresar.setBackground(new java.awt.Color(0, 102, 102));
        ingresar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ingresar.setForeground(new java.awt.Color(255, 255, 255));
        ingresar.setText("Ingresar");
        ingresar.setBorder(null);
        ingresar.setFocusable(false);
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Altura");
        jLabel12.setFocusable(false);

        altura.setBackground(new java.awt.Color(255, 255, 255));
        altura.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        altura.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 51, 51)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4))
                                        .addGap(224, 224, 224)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(edad)
                                            .addComponent(segPosicion, 0, 142, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(26, 26, 26)
                                        .addComponent(ruta, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(ingresar, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))))
                                .addGap(0, 24, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(seleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(altura, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(club, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(numCamisa, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(priPosicon, javax.swing.GroupLayout.Alignment.LEADING, 0, 134, Short.MAX_VALUE)))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(titulo)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(segPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priPosicon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numCamisa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(club, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) //Cambia el estilo a Windows (Para que no se vea horriblemente java)
        {
            if ("Windows".equals(info.getName())) {
                try {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            }
        }
        FileNameExtensionFilter jpeg = new FileNameExtensionFilter("foto", "jpeg", "jpg", "png");
        JFileChooser selector = new JFileChooser();
        selector.setFileFilter(jpeg);
        if (selector.showOpenDialog(selector) == JFileChooser.APPROVE_OPTION) {
            ruta.setText(selector.getSelectedFile().getAbsolutePath());
        } else {
            JOptionPane.showMessageDialog(null, "Debe selecionar un foto", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_buscarActionPerformed

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
        try {
            if (aModificar == null) {

                String rutadirec;
                if (ruta.getText().equalsIgnoreCase("")) {
                    rutadirec = "src/img/default.jpg";
                } else {
                    rutadirec = ruta.getText();
                }

                Jugador j = new Jugador(nombre.getText(), (int) numCamisa.getValue(), String.valueOf(priPosicon.getSelectedItem()), (int) edad.getValue(), String.valueOf(seleccion.getSelectedItem()), Fachada.getInstancia().sigienteCodigo(), rutadirec);
                if (!altura.getText().equalsIgnoreCase("")) {
                    j.setAltura(Double.valueOf(altura.getText()));
                }
                if (!String.valueOf(priPosicon.getSelectedItem()).equalsIgnoreCase("Arquero") || !String.valueOf(segPosicion.getSelectedItem()).equalsIgnoreCase("Sin determinar")) {
                    j.setSegundaPosicion(String.valueOf(segPosicion.getSelectedItem()));
                }
                j.setClub(club.getText());
                j.setFechaDebut(String.valueOf(dia.getSelectedItem()) + " / " + String.valueOf(mes.getSelectedItem()) + " / " + String.valueOf(año.getSelectedItem()));
                j.setEdad((int) edad.getValue());
                Fachada.getInstancia().agregarJugador(j);
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) //Cambia el estilo a Windows (Para que no se vea horriblemente java)
                {
                    if ("Windows".equals(info.getName())) {
                        try {
                            javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (InstantiationException ex) {
                            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IllegalAccessException ex) {
                            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (UnsupportedLookAndFeelException ex) {
                            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        break;
                    }
                }
                JOptionPane.showMessageDialog(null, "Jugador cargado con exito", "Informacion", JOptionPane.INFORMATION_MESSAGE);

            } else {

                aModificar.setNombre(nombre.getText());
                aModificar.setClub(club.getText());
                aModificar.setPrimeraPosicion(String.valueOf(priPosicon.getSelectedItem()));
                if (!String.valueOf(priPosicon.getSelectedItem()).equalsIgnoreCase("Arquero") || !String.valueOf(segPosicion.getSelectedItem()).equalsIgnoreCase("Sin determinar")) {
                    aModificar.setSegundaPosicion(String.valueOf(segPosicion.getSelectedItem()));
                }
                aModificar.setNumeroCamisa((int) numCamisa.getValue());
                aModificar.setEdad((int) edad.getValue());
                aModificar.setFechaDebut(String.valueOf(dia.getSelectedItem()) + " / " + String.valueOf(mes.getSelectedItem()) + " / " + String.valueOf(año.getSelectedItem()));
                aModificar.setPais(String.valueOf(seleccion.getSelectedItem()));
                if (!ruta.getText().equalsIgnoreCase(aModificar.rutaImg())) {
                    aModificar.setImg(ruta.getText());
                }
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) //Cambia el estilo a Windows (Para que no se vea horriblemente java)
                {
                    if ("Windows".equals(info.getName())) {
                        try {
                            javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (InstantiationException ex) {
                            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IllegalAccessException ex) {
                            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (UnsupportedLookAndFeelException ex) {
                            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        break;
                    }
                }
                JOptionPane.showMessageDialog(null, "Infromacion Modificada", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) //Cambia el estilo a Windows (Para que no se vea horriblemente java)
            {
                if ("Windows".equals(info.getName())) {
                    try {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (InstantiationException ex) {
                        Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                        Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (UnsupportedLookAndFeelException ex) {
                        Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
            }
            JOptionPane.showMessageDialog(null, "Alguno de los datos ingresados es incorecto", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_ingresarActionPerformed

    private void priPosiconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priPosiconActionPerformed
        if (String.valueOf(priPosicon.getSelectedItem()).equalsIgnoreCase("Arquero")) {
            segPosicion.setEnabled(false);
        } else {
            segPosicion.setEnabled(true);
        }
    }//GEN-LAST:event_priPosiconActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField altura;
    private javax.swing.JComboBox<String> año;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField club;
    private javax.swing.JComboBox<String> dia;
    private javax.swing.JSpinner edad;
    private javax.swing.JButton ingresar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> mes;
    private javax.swing.JTextField nombre;
    private javax.swing.JSpinner numCamisa;
    private javax.swing.JComboBox<String> priPosicon;
    private javax.swing.JTextField ruta;
    private javax.swing.JComboBox<String> segPosicion;
    private javax.swing.JComboBox<String> seleccion;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
