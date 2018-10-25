package presentacion;
import fachada.Fachada;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import logica.Jugador;
import logica.Seleccion;
/**
 * 
 * Clase encargada de la creación o modficación de un objeto del tipo jugador.
 */
public class nuevoJugador extends javax.swing.JPanel {
    private Jugador aModificar;
    /**
     * Creción o modificación de objeto del tipo Jugador.
     * Si es null lo crea, y si se le pasa un objeto, lo modifica.
     * @param Jugador j (objeto o null)
     */
    public nuevoJugador(Jugador j) {
        Principal.getInstancia().estiloMetal();
        aModificar = j;

        this.initComponents();
        System.out.println(Fachada.getInstancia().getSelecciones().size());
        for (Seleccion s : Fachada.getInstancia().getSelecciones()) {
            seleccion.addItem(s.getNombre());
        }
        segPosicion.setSelectedIndex(3);

        if (aModificar != null) {
            titulo.setText("Modificar datos");
            nombre.setText(aModificar.getNombre());
            priPosicion.setSelectedItem(aModificar.getPrimeraPosicion());
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
            altura.setValue(aModificar.getAltura());
            ruta.setText(aModificar.rutaImg());//22/04/2018
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
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
        priPosicion = new javax.swing.JComboBox<>();
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
        altura = new javax.swing.JSpinner();

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelPrincipal.setFocusable(false);
        panelPrincipal.setPreferredSize(new java.awt.Dimension(834, 603));

        titulo.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        titulo.setForeground(new java.awt.Color(51, 51, 51));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Crear jugador");
        titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        titulo.setFocusable(false);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Numero de camiseta*");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jLabel2.setFocusable(false);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Nombre* ");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jLabel3.setFocusable(false);

        nombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        nombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 51, 51)));
        nombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Primera posición*");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jLabel4.setFocusable(false);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Segunda posición");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jLabel5.setFocusable(false);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Club");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jLabel7.setFocusable(false);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("País*");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jLabel8.setFocusable(false);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Imagen");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jLabel9.setFocusable(false);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Edad*");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jLabel10.setFocusable(false);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Fecha Debut*");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jLabel11.setFocusable(false);

        segPosicion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        segPosicion.setForeground(new java.awt.Color(51, 51, 51));
        segPosicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Defensa", "Volante", "Delantero", "Sin determinar" }));
        segPosicion.setEnabled(false);
        segPosicion.setFocusable(false);
        segPosicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segPosicionActionPerformed(evt);
            }
        });

        seleccion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        seleccion.setForeground(new java.awt.Color(51, 51, 51));
        seleccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        seleccion.setFocusable(false);
        seleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionActionPerformed(evt);
            }
        });

        priPosicion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        priPosicion.setForeground(new java.awt.Color(51, 51, 51));
        priPosicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arquero", "Defensa", "Volante", "Delantero" }));
        priPosicion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        priPosicion.setFocusable(false);
        priPosicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priPosicionActionPerformed(evt);
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

        club.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        club.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 51, 51)));
        club.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        club.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clubActionPerformed(evt);
            }
        });

        mes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mes.setForeground(new java.awt.Color(51, 51, 51));
        mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "04", "05", "06", "07", "08", "09", "10", "11", "12", " " }));
        mes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mes.setFocusable(false);

        dia.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        dia.setForeground(new java.awt.Color(51, 51, 51));
        dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        dia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dia.setFocusable(false);
        dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaActionPerformed(evt);
            }
        });

        año.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        año.setForeground(new java.awt.Color(51, 51, 51));
        año.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2017", "2018", " " }));
        año.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        año.setFocusable(false);

        ruta.setEditable(false);
        ruta.setBackground(new java.awt.Color(255, 255, 255));
        ruta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ruta.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 51, 51)));
        ruta.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ruta.setFocusable(false);

        buscar.setBackground(new java.awt.Color(255, 255, 255));
        buscar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        buscar.setForeground(new java.awt.Color(51, 51, 51));
        buscar.setText("Buscar");
        buscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ingresar.setFocusable(false);
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Altura");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jLabel12.setFocusable(false);

        altura.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        altura.setModel(new javax.swing.SpinnerNumberModel(1.5d, 1.0d, 3.0d, 0.1d));
        altura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        altura.setFocusable(false);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                                .addComponent(nombre)
                                                .addGap(6, 6, 6))
                                            .addComponent(club)))))
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                                        .addComponent(priPosicion, 0, 246, Short.MAX_VALUE)
                                        .addGap(19, 19, 19)
                                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10)))
                                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(numCamisa)
                                            .addComponent(seleccion, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addGap(105, 105, 105))
                                            .addComponent(mes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(altura, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(segPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(141, 141, 141)
                        .addComponent(ruta)
                        .addGap(18, 18, 18)
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(205, 205, 205))))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(club, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(segPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)))
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numCamisa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(altura, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        Principal.getInstancia().estiloWindows();
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
                if(nombre.getText().isEmpty()) //Si está vacío tira una excepción y no deja guardarlo
                {
                    throw new IndexOutOfBoundsException();
                }
                String rutadirec;
                if (ruta.getText().equalsIgnoreCase("")) {
                    rutadirec = "src/img/default.jpg";
                } else {
                    rutadirec = ruta.getText();
                }

                Jugador j = new Jugador(nombre.getText(), (int) numCamisa.getValue(), String.valueOf(priPosicion.getSelectedItem()), (int) edad.getValue(), String.valueOf(seleccion.getSelectedItem()), Fachada.getInstancia().sigienteCodigo(), rutadirec);
                if ((double)altura.getValue()!=0) {
                    j.setAltura((double)altura.getValue());
                }
                if (!String.valueOf(priPosicion.getSelectedItem()).equalsIgnoreCase("Arquero") && segPosicion.getSelectedIndex()!=3) {
                    j.setSegundaPosicion(String.valueOf(segPosicion.getSelectedItem()));
                }
                j.setClub(club.getText());
                j.setFechaDebut(String.valueOf(dia.getSelectedItem()) + " / " + String.valueOf(mes.getSelectedItem()) + " / " + String.valueOf(año.getSelectedItem()));
                j.setEdad((int) edad.getValue());
                Fachada.getInstancia().agregarJugador(j);
                Principal.getInstancia().estiloWindows();
                Principal.getInstancia().setAutoGuardado(true);
                JOptionPane.showMessageDialog(null, "Jugador cargado con exito", "Informacion", JOptionPane.INFORMATION_MESSAGE);

            } else {

                aModificar.setNombre(nombre.getText());
                aModificar.setClub(club.getText());
                aModificar.setPrimeraPosicion(String.valueOf(priPosicion.getSelectedItem()));
                if(aModificar.getPrimeraPosicion().equalsIgnoreCase(priPosicion.getSelectedItem().toString()))
                {
                    if (!String.valueOf(priPosicion.getSelectedItem()).equalsIgnoreCase("Arquero") && segPosicion.getSelectedIndex()!=3) {
                        aModificar.setSegundaPosicion(String.valueOf(segPosicion.getSelectedItem()));
                    }
                }
                aModificar.setNumeroCamisa((int) numCamisa.getValue());
                aModificar.setEdad((int) edad.getValue());
                aModificar.setFechaDebut(String.valueOf(dia.getSelectedItem()) + " / " + String.valueOf(mes.getSelectedItem()) + " / " + String.valueOf(año.getSelectedItem()));
                
                if (!ruta.getText().equalsIgnoreCase(aModificar.rutaImg())) {
                    aModificar.setImg(ruta.getText());
                }
                if(!aModificar.getPais().equalsIgnoreCase(String.valueOf(seleccion.getSelectedItem()))){
                    aModificar.setPais(String.valueOf(seleccion.getSelectedItem()));
                    Fachada.getInstancia().cambiarDeSelecion(aModificar);
                }
                Principal.getInstancia().estiloWindows();
                Principal.getInstancia().setAutoGuardado(true);
                JOptionPane.showMessageDialog(null, "Infromacion Modificada", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            Principal.getInstancia().estiloWindows();
            JOptionPane.showMessageDialog(null, "Alguno de los datos ingresados es incorecto", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ingresarActionPerformed

    private void priPosicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priPosicionActionPerformed
        if (String.valueOf(priPosicion.getSelectedItem()).equalsIgnoreCase("Arquero")) {
            segPosicion.setEnabled(false);
        } else {
            segPosicion.setEnabled(true);
        }
    }//GEN-LAST:event_priPosicionActionPerformed

    private void segPosicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segPosicionActionPerformed
    }//GEN-LAST:event_segPosicionActionPerformed

    private void clubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clubActionPerformed
    }//GEN-LAST:event_clubActionPerformed

    private void diaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaActionPerformed
    }//GEN-LAST:event_diaActionPerformed

    private void seleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionActionPerformed
    }//GEN-LAST:event_seleccionActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner altura;
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
    private javax.swing.JComboBox<String> mes;
    private javax.swing.JTextField nombre;
    private javax.swing.JSpinner numCamisa;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JComboBox<String> priPosicion;
    private javax.swing.JTextField ruta;
    private javax.swing.JComboBox<String> segPosicion;
    private javax.swing.JComboBox<String> seleccion;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
