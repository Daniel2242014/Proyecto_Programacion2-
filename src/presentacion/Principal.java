package presentacion;
import java.awt.BorderLayout;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;
import fachada.Fachada;
import javax.swing.JFrame;
/**
 * 
 * @author Daniel Padrón - Agustín Pérez - Facundo Silvetti
 */
public class Principal extends javax.swing.JFrame {
    public static JFileChooser a; //Ventana de guardado de Archivos
    private FileNameExtensionFilter mun; //Filtro por extensión 
    private static Principal initi;
    private boolean autoGuardado=false;
    private boolean errorArchivo=false;
    
    public static Principal getInstancia(){
        if (initi==null){
            initi = new Principal();
        }
        return initi;
    }
    
    private Principal() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        displayInterno.setLayout(new BorderLayout());
        mun=new FileNameExtensionFilter("Mundial","mun"); //Se crea el filtro por extensión para el archivo
        estiloWindows();
        JOptionPane.showMessageDialog(null, "Se cargarán los datos OFICIALES del mundial", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        estiloMetal();
        Fachada.getInstancia().sistemaBase(); //Llama al método que carga los datos OFICIALES
        panelScroll.getVerticalScrollBar().setUnitIncrement(50); //Aumenta la velocidad del ScrollPane
        errorArchivo=false;
    }
    
    public void cargarPanel(JPanel j){ //Se cargan los diferentes paneles dentro del ScrollPane
        displayInterno.removeAll();
        displayInterno.add(j,BorderLayout.CENTER);
        displayInterno.repaint();
        displayInterno.updateUI();
        this.repaint();
    }
    
    public void estiloMetal() //Cambia el estilo a Metal (Para que se vea horriblemente java pero modificable)
    {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
        {
            if ("Metal".equals(info.getName())) 
            {
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
    }
    
    public void estiloWindows() //Cambia el estilo a Windows (Para que no se vea horriblemente java)
    {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) 
        {
            if ("Windows".equals(info.getName())) 
            {
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
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelLateral = new javax.swing.JPanel();
        simularGrupos = new javax.swing.JButton();
        nuevoMundial = new javax.swing.JButton();
        abrir = new javax.swing.JButton();
        agregarJugador = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        panelSuperior = new javax.swing.JPanel();
        salir = new javax.swing.JButton();
        selecciones = new javax.swing.JButton();
        motorBusqueda = new javax.swing.JButton();
        partidos = new javax.swing.JButton();
        jugadores = new javax.swing.JButton();
        fases = new javax.swing.JButton();
        acercaDe = new javax.swing.JButton();
        panelScroll = new javax.swing.JScrollPane();
        displayInterno = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setUndecorated(true);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        panelLateral.setBackground(new java.awt.Color(131, 0, 0));

        simularGrupos.setBackground(new java.awt.Color(131, 0, 0));
        simularGrupos.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        simularGrupos.setForeground(new java.awt.Color(255, 255, 255));
        simularGrupos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/img/simular.png"))); // NOI18N
        simularGrupos.setText("    Simular");
        simularGrupos.setBorder(null);
        simularGrupos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        simularGrupos.setFocusable(false);
        simularGrupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simularGruposActionPerformed(evt);
            }
        });

        nuevoMundial.setBackground(new java.awt.Color(131, 0, 0));
        nuevoMundial.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        nuevoMundial.setForeground(new java.awt.Color(255, 255, 255));
        nuevoMundial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/img/nuevoMundial.png"))); // NOI18N
        nuevoMundial.setText(" Nuevo mundial");
        nuevoMundial.setBorder(null);
        nuevoMundial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevoMundial.setFocusable(false);
        nuevoMundial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoMundialActionPerformed(evt);
            }
        });

        abrir.setBackground(new java.awt.Color(131, 0, 0));
        abrir.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        abrir.setForeground(new java.awt.Color(255, 255, 255));
        abrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/img/abrir.png"))); // NOI18N
        abrir.setText("    Abrir");
        abrir.setBorder(null);
        abrir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        abrir.setFocusable(false);
        abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirActionPerformed(evt);
            }
        });

        agregarJugador.setBackground(new java.awt.Color(131, 0, 0));
        agregarJugador.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        agregarJugador.setForeground(new java.awt.Color(255, 255, 255));
        agregarJugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/img/nuevoJugador.png"))); // NOI18N
        agregarJugador.setText(" Agregar Jugador");
        agregarJugador.setBorder(null);
        agregarJugador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregarJugador.setFocusable(false);
        agregarJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarJugadorActionPerformed(evt);
            }
        });

        guardar.setBackground(new java.awt.Color(131, 0, 0));
        guardar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        guardar.setForeground(new java.awt.Color(255, 255, 255));
        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/img/guardar.png"))); // NOI18N
        guardar.setText("    Guardar");
        guardar.setBorder(null);
        guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardar.setFocusable(false);
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        botonSalir.setBackground(new java.awt.Color(109, 0, 0));
        botonSalir.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(255, 255, 255));
        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/img/salir.png"))); // NOI18N
        botonSalir.setText("    Salir");
        botonSalir.setBorder(null);
        botonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSalir.setFocusable(false);
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLateralLayout = new javax.swing.GroupLayout(panelLateral);
        panelLateral.setLayout(panelLateralLayout);
        panelLateralLayout.setHorizontalGroup(
            panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(simularGrupos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(nuevoMundial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(agregarJugador, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
            .addComponent(guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(abrir, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE))
        );
        panelLateralLayout.setVerticalGroup(
            panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLateralLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(nuevoMundial, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(agregarJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(simularGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelLateralLayout.createSequentialGroup()
                    .addGap(177, 177, 177)
                    .addComponent(abrir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(443, Short.MAX_VALUE)))
        );

        panelSuperior.setBackground(new java.awt.Color(197, 0, 0));

        salir.setBackground(new java.awt.Color(197, 0, 0));
        salir.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setText("X");
        salir.setBorder(null);
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.setFocusable(false);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        selecciones.setBackground(new java.awt.Color(197, 0, 0));
        selecciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/img/selecion .png"))); // NOI18N
        selecciones.setBorder(null);
        selecciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selecciones.setFocusable(false);
        selecciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionesActionPerformed(evt);
            }
        });

        motorBusqueda.setBackground(new java.awt.Color(197, 0, 0));
        motorBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/img/buscar.png"))); // NOI18N
        motorBusqueda.setBorder(null);
        motorBusqueda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        motorBusqueda.setFocusable(false);
        motorBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motorBusquedaActionPerformed(evt);
            }
        });

        partidos.setBackground(new java.awt.Color(197, 0, 0));
        partidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/img/partido.png"))); // NOI18N
        partidos.setBorder(null);
        partidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        partidos.setFocusable(false);
        partidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partidosActionPerformed(evt);
            }
        });

        jugadores.setBackground(new java.awt.Color(197, 0, 0));
        jugadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/img/jugador.png"))); // NOI18N
        jugadores.setBorder(null);
        jugadores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jugadores.setFocusable(false);
        jugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugadoresActionPerformed(evt);
            }
        });

        fases.setBackground(new java.awt.Color(197, 0, 0));
        fases.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/img/face.png"))); // NOI18N
        fases.setBorder(null);
        fases.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fases.setFocusable(false);
        fases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fasesActionPerformed(evt);
            }
        });

        acercaDe.setBackground(new java.awt.Color(197, 0, 0));
        acercaDe.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        acercaDe.setForeground(new java.awt.Color(255, 255, 255));
        acercaDe.setText("i");
        acercaDe.setBorder(null);
        acercaDe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        acercaDe.setFocusPainted(false);
        acercaDe.setFocusable(false);
        acercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acercaDeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selecciones, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(motorBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(partidos, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fases, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(salir, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(acercaDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );
        panelSuperiorLayout.setVerticalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSuperiorLayout.createSequentialGroup()
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(acercaDe, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(motorBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(partidos, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fases, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selecciones, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelScroll.setAutoscrolls(true);

        displayInterno.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout displayInternoLayout = new javax.swing.GroupLayout(displayInterno);
        displayInterno.setLayout(displayInternoLayout);
        displayInternoLayout.setHorizontalGroup(
            displayInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 834, Short.MAX_VALUE)
        );
        displayInternoLayout.setVerticalGroup(
            displayInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 603, Short.MAX_VALUE)
        );

        panelScroll.setViewportView(displayInterno);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panelLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelScroll)))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                        .addComponent(panelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(panelScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelLateral, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        estiloWindows();
        if(autoGuardado)
        {
            int confirm=JOptionPane.showConfirmDialog(null, "Desea guardar los cambios?", "Guardar antes de salir", JOptionPane.YES_NO_CANCEL_OPTION);
            if(confirm!=1)
            {
                if(confirm==0)
                {
                    guardarActionPerformed(null);
                    if(!errorArchivo)
                    {
                     System.exit(0);
                    }
                }
            }
            else
                System.exit(0);
        }
        else
            System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void simularGruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simularGruposActionPerformed
        Fachada.getInstancia().simularDatos();
    }//GEN-LAST:event_simularGruposActionPerformed

    private void nuevoMundialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoMundialActionPerformed
        //Se eliminan todos los datos actuales, se carga sistemaBase (datos OFICIALES) y se limpian los paneles
        if(autoGuardado)
        {
            estiloWindows();
            if(JOptionPane.showConfirmDialog(null, "Guarde su trabajo actual para continuar", "Nuevo", JOptionPane.OK_CANCEL_OPTION)==0)
            {
                guardarActionPerformed(null);
                Fachada.getInstancia().limpiarArrays();
                Fachada.getInstancia().sistemaBase();
                displayInterno.removeAll();
                displayInterno.repaint();
                displayInterno.updateUI();
                this.repaint();
                setAutoGuardado(true);
            }
            estiloMetal();
        }
        else
        {
            Fachada.getInstancia().limpiarArrays();
            Fachada.getInstancia().sistemaBase();
            displayInterno.removeAll();
            displayInterno.repaint();
            displayInterno.updateUI();
            this.repaint();
            setAutoGuardado(true);
        }
    }//GEN-LAST:event_nuevoMundialActionPerformed

    private void abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirActionPerformed
        //Este método se encarga de guardar archivos del tipo mundial bajo la extensión *.mun
        estiloWindows();
        a=new JFileChooser();
        a.setFileFilter(mun);
        if(a.showOpenDialog(a)!=JFileChooser.CANCEL_OPTION) //Verifica que no se le de a la opción cancelar, para no seguir el flujo del programa
        {
            if(!Fachada.getInstancia().abrirMun(a.getSelectedFile().getAbsolutePath())) //Comprueba que el archivo se haya cargado en la clase Archivo
            {
                JOptionPane.showMessageDialog(null, "Error al cargar el archivo", "Error al cargar archivo", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_abrirActionPerformed

    private void agregarJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarJugadorActionPerformed
        Principal.getInstancia().cargarPanel(new nuevoJugador(null));
    }//GEN-LAST:event_agregarJugadorActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        salirActionPerformed(null); //Llama al botón de salir de arriba (la cruz)
    }//GEN-LAST:event_botonSalirActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        //Este método se encarga del guardado de archivos bajo la extensión *.mun
        estiloWindows();
        File f=new File("Mundial.mun"); //Da el nombre al archivo a ser guardado
        a=new JFileChooser(); 
        a.setFileFilter(mun);
        a.setSelectedFile(f); //Setea el nombre
        if(a.showSaveDialog(a)!=JFileChooser.CANCEL_OPTION) //Verifica que no se le de a la opción cancelar, para no seguir el flujo del programa
        {
            errorArchivo=false;
            if(!Fachada.getInstancia().guardarMun(a.getSelectedFile().getAbsolutePath())) //Comprueba que se haya guardado en la clase Archivo
            {
                JOptionPane.showMessageDialog(null, "Error al guardar el archivo, asegúrese que lo esté guardando en una ruta válida", "Error al guardar archivo", JOptionPane.ERROR_MESSAGE);
                errorArchivo=true; //Setea error por si se usa autoguardado
            }
            else
            {
                Principal.getInstancia().setAutoGuardado(false);
            }    
        }
        else
            errorArchivo=true;
    }//GEN-LAST:event_guardarActionPerformed

    private void jugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugadoresActionPerformed
        Principal.getInstancia().cargarPanel(new menuJugador());
    }//GEN-LAST:event_jugadoresActionPerformed

    private void seleccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionesActionPerformed
        estiloMetal();
        this.cargarPanel(Menu_seleciones.getInstancia());
    }//GEN-LAST:event_seleccionesActionPerformed

    private void motorBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motorBusquedaActionPerformed
        estiloMetal();
        this.cargarPanel(new Menu_busqueda()); //Carga el motor de búsqueda
    }//GEN-LAST:event_motorBusquedaActionPerformed

    private void partidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partidosActionPerformed
        estiloWindows();
        JOptionPane.showMessageDialog(rootPane, "Cancelado por propuesta", "Aviso", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_partidosActionPerformed

    private void fasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fasesActionPerformed
        Principal.getInstancia().cargarPanel(new Menu_Fase());
    }//GEN-LAST:event_fasesActionPerformed

    private void acercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acercaDeActionPerformed
        //Se llama a la ventana de Acerca De
        JFrame i = new JFrame("Acerca De..");
        i.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        i.setResizable(false);
        i.setSize(766, 258);
        i.add(new acercaDe());
        i.setVisible(true);
        i.setLocationRelativeTo(Principal.getInstancia());
    }//GEN-LAST:event_acercaDeActionPerformed
    
    public void setAutoGuardado(boolean autoGuardado) {
        this.autoGuardado = autoGuardado;
    }
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Principal.getInstancia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abrir;
    private javax.swing.JButton acercaDe;
    private javax.swing.JButton agregarJugador;
    private javax.swing.JButton botonSalir;
    private javax.swing.JPanel displayInterno;
    private javax.swing.JButton fases;
    private javax.swing.JButton guardar;
    private javax.swing.JButton jugadores;
    private javax.swing.JButton motorBusqueda;
    private javax.swing.JButton nuevoMundial;
    private javax.swing.JPanel panelLateral;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JScrollPane panelScroll;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JButton partidos;
    private javax.swing.JButton salir;
    private javax.swing.JButton selecciones;
    private javax.swing.JButton simularGrupos;
    // End of variables declaration//GEN-END:variables
}
