package presentacion;

import java.awt.Color;
import javax.swing.JOptionPane;
import fachada.Fachada;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import logica.Jugador;
import logica.Persona;
import logica.Seleccion;


public class Menu_busqueda extends javax.swing.JPanel {

    public static final int BUSQUEDA_PERSONA_POR_NOMBRE=0;
    public static final int BUSQUEDA_PERSONA_POR_NUMERO_CAMISA=1;
    public static final int BUSQUEDA_PERSONA_POR_NOMBRE_SELECION=2;
    public static final int BUSQUEDA_PERSONA_POR_EDAD=3;
    public static final int BUSQUEDA_PERSONA_POR_ALTURA=4;
    public static final int BUSQUEDA_PERSONA_POR_CLUB=5;
    public static final int BUSQUEDA_PERSONA_POR_PRIMERA_POSICION=6;
    public static final int BUSQUEDA_PERSONA_POR_SEGUNDA_POSICION=7;
    public static final int BUSQUEDA_SELECCIONES_POR_NOMBRE=8;
    public static final int BUSQUEDA_SELECCIONES_POR_CONFEDERACION=9;
    public static final int BUSQUEDA_SELECCIONES_POR_NOMBRE_DIRECTOR=10;
    public static final int BUSQUEDA_SELECCIONES_POR_NOMBRE_FASE=11;
    
   

    public Menu_busqueda( ) {
        initComponents();
    }
    
    public Menu_busqueda(String consulta, int tipo){
        initComponents();
        realizarConsulta(consulta, tipo);
        criterio.setText(consulta);
        this.tipoBusqueda.setSelectedIndex(tipo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultados = new javax.swing.JPanel();
        criterio = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        tipoBusqueda = new javax.swing.JComboBox<>();
        ayuda = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        resultados.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout resultadosLayout = new javax.swing.GroupLayout(resultados);
        resultados.setLayout(resultadosLayout);
        resultadosLayout.setHorizontalGroup(
            resultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        resultadosLayout.setVerticalGroup(
            resultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 443, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(resultados);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        criterio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        criterio.setForeground(new java.awt.Color(51, 51, 51));
        criterio.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 51, 51)));
        criterio.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        buscar.setBackground(new java.awt.Color(255, 255, 255));
        buscar.setForeground(new java.awt.Color(51, 51, 51));
        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/img/buscarBuscador.png"))); // NOI18N
        buscar.setBorder(null);
        buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        tipoBusqueda.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        tipoBusqueda.setForeground(new java.awt.Color(51, 51, 51));
        tipoBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre del jugador", "Numero de camiseta", "Por nombre de seleccion ", "Por edad ", "Por altura", "Por club", "Por primera posicion", "Por segunda posicion", "Seleccion por nombre", "Selecion por confederacion", "Selecion por nombre director", "Selecion por fase" }));
        tipoBusqueda.setBorder(null);
        tipoBusqueda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tipoBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccionSeleccionTipo(evt);
            }
        });

        ayuda.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        ayuda.setForeground(new java.awt.Color(255, 255, 255));
        ayuda.setText("Ayuda: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(criterio, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tipoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(criterio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(ayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AccionSeleccionTipo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccionSeleccionTipo
       ayuda.setForeground(new Color(51,51,51));
        if(tipoBusqueda.getSelectedIndex()==3){
            ayuda.setText("AYUDA: Posibles formatos: 1) Edad (EJ 21) ,  2) Rango (EJ 22/28),  3) Edad en adelante (EJ: 22+)  4) Edad para atras (EJ 28-)");
        }else if(tipoBusqueda.getSelectedIndex()==4){
            ayuda.setText("AYUDA: Posibles formatos: 1) Altura (EJ 1.70) ,  2) Rango (EJ 1.52/1.70),  3) Altura en adelante (EJ: 1.80+)  4) Altura para atras (EJ 1.90-)");
        }else if(tipoBusqueda.getSelectedIndex()==6 || tipoBusqueda.getSelectedIndex()==7){
            ayuda.setText("AYUDA: Posibles busquedas : Arquero, Defensa, Volante y Delantero");
            
        }else if(tipoBusqueda.getSelectedIndex()==11){
            ayuda.setText("AYUDA: Posibles busquedas : A,B,C,D,E,F,G,H (GRUPOS) y 8 (octabos), 4 (cuartos), 3 (3º y 2º puesto),2 (semifinal),1(final) (ELIMINATORIAS)");
        }else{
             ayuda.setForeground(Color.white);
        }
    }//GEN-LAST:event_AccionSeleccionTipo

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        this.realizarConsulta(criterio.getText(), tipoBusqueda.getSelectedIndex());
    }//GEN-LAST:event_buscarActionPerformed

    private void realizarConsulta(String conuslta, int tipo){
        ArrayList <JPanel> paneles = new ArrayList();
        if(!conuslta.equalsIgnoreCase("") || tipo==Menu_busqueda.BUSQUEDA_PERSONA_POR_CLUB){
            
            if(tipo==Menu_busqueda.BUSQUEDA_PERSONA_POR_NOMBRE){
                for(Persona p:Fachada.getInstancia().debolberPersonaPorNombre(conuslta)){
                    paneles.add(new resultadoBusquedaPersona(p));
                    
                }
            }
            
            if(tipo==Menu_busqueda.BUSQUEDA_PERSONA_POR_NUMERO_CAMISA){
                try{
                for (Jugador jug:Fachada.getInstancia().debolberJugadoresPorNumeroCamisa(Integer.valueOf(conuslta))){
                    paneles.add(new resultadoBusquedaPersona(jug));
                }
                }catch (Exception e){
                    Principal.getInstancia().estiloWindows();
                    JOptionPane.showMessageDialog(null, "Ingrese un número entero", "Error", JOptionPane.ERROR_MESSAGE);
                    Principal.getInstancia().estiloMetal();
                }
            }
            
            if(tipo==Menu_busqueda.BUSQUEDA_PERSONA_POR_NOMBRE_SELECION){
                for (Persona p: Fachada.getInstancia().debolberPersonasPorNombreSeleccion(conuslta)){
                    paneles.add(new resultadoBusquedaPersona(p));
                }
            }
            
            if(tipo==Menu_busqueda.BUSQUEDA_PERSONA_POR_EDAD){
               try{
                if(conuslta.contains("/")){
                    int posicionSeparador=0;
                    for(int i=0;i<conuslta.length();i++){
                        if(conuslta.charAt(i)=='/'){
                            posicionSeparador=i;
                            break;
                        }
                    }
                    int rango1=Integer.valueOf(conuslta.substring(0, posicionSeparador));
                    int rango2=Integer.valueOf(conuslta.substring(posicionSeparador+1, conuslta.length()));
                    for (Persona p:Fachada.getInstancia().debolberPersonasPorEdad(rango1, rango2, 1)){
                        paneles.add(new resultadoBusquedaPersona(p));
                    }
                }else{
                    if(conuslta.charAt(conuslta.length()-1)=='+'){
                        for(Persona p: Fachada.getInstancia().debolberPersonasPorEdad( Integer.valueOf(conuslta.substring(0, conuslta.length()-1)), 0, 2) ){
                             paneles.add(new resultadoBusquedaPersona(p));
                        }
                    }else if (conuslta.charAt(conuslta.length()-1)=='-'){
                         for(Persona p: Fachada.getInstancia().debolberPersonasPorEdad(Integer.valueOf(conuslta.substring(0, conuslta.length()-1)), 0, 3)){
                             paneles.add(new resultadoBusquedaPersona(p));
                         }
                    }else{
                        for(Persona p: Fachada.getInstancia().debolberPersonasPorEdad(Integer.valueOf(conuslta), 0, 0)){
                             paneles.add(new resultadoBusquedaPersona(p));
                         }
                    }
                }
               }catch(Exception e){
                   Principal.getInstancia().estiloWindows();
                   JOptionPane.showMessageDialog(null, "Error de sintaxis en la consulta, revise las sugerencias", "Error", JOptionPane.ERROR_MESSAGE);
                   Principal.getInstancia().estiloMetal();
               }
            }
            
            if(tipo==Menu_busqueda.BUSQUEDA_PERSONA_POR_ALTURA){
                try{
                if(conuslta.contains("/")){
                    int posicionSeparador=0;
                    for(int i=0;i<conuslta.length();i++){
                        if(conuslta.charAt(i)=='/'){
                            posicionSeparador=i;
                            break;
                        }
                    }
                    double rango1=Double.parseDouble(conuslta.substring(0, posicionSeparador));
                    double rango2=Double.parseDouble(conuslta.substring(posicionSeparador+1, conuslta.length()));
                    for (Jugador juga:Fachada.getInstancia().DevolverPorAltura(rango1, rango2, 1)){
                        paneles.add(new resultadoBusquedaPersona(juga));
                    }
                }else{
                    if(conuslta.charAt(conuslta.length()-1)=='+'){
                        for(Jugador juga:Fachada.getInstancia().DevolverPorAltura(Double.parseDouble(conuslta.substring(0, conuslta.length()-1)), 0, 2)){
                             paneles.add(new resultadoBusquedaPersona(juga));
                        }
                    }else if (conuslta.charAt(conuslta.length()-1)=='-'){
                         for(Jugador juga: Fachada.getInstancia().DevolverPorAltura(Double.parseDouble(conuslta.substring(0, conuslta.length()-1)), 0, 3)){
                             paneles.add(new resultadoBusquedaPersona(juga));
                         }
                    }else{
                        for(Jugador juga: Fachada.getInstancia().DevolverPorAltura(Double.parseDouble(conuslta), 0, 0)){
                             paneles.add(new resultadoBusquedaPersona(juga));
                         }
                    }
                }
               }catch(Exception e){
                   Principal.getInstancia().estiloWindows();
                   JOptionPane.showMessageDialog(null, "Error de sintaxis en la consulta, revise las sugerencias", "Error", JOptionPane.ERROR_MESSAGE);
                   Principal.getInstancia().estiloMetal();
               }
            }
            
            if(tipo==Menu_busqueda.BUSQUEDA_PERSONA_POR_CLUB){
                if(conuslta.equalsIgnoreCase("")){
                        for (Jugador juga:Fachada.getInstancia().devolverPorClub(null)){ 
                        paneles.add(new resultadoBusquedaPersona(juga));
                 }
                }else{
                    for (Jugador juga:Fachada.getInstancia().devolverPorClub(conuslta)){
                        paneles.add(new resultadoBusquedaPersona(juga));
                    }
                 }
            }
            
            if(tipo==Menu_busqueda.BUSQUEDA_PERSONA_POR_PRIMERA_POSICION){
                for(Jugador juga:Fachada.getInstancia().devolverPorPosicion(conuslta, true)){
                     paneles.add(new resultadoBusquedaPersona(juga));
                }
            }
            
             if(tipo==Menu_busqueda.BUSQUEDA_PERSONA_POR_SEGUNDA_POSICION){
                for(Jugador juga:Fachada.getInstancia().devolverPorPosicion(conuslta, false)){
                     paneles.add(new resultadoBusquedaPersona(juga));
                }
            }
             
             if(tipo==Menu_busqueda.BUSQUEDA_SELECCIONES_POR_NOMBRE){
                  for(Seleccion selc:Fachada.getInstancia().devolverSelecionPorNombre(conuslta)){
                     paneles.add(new resultadoBusquedaSeleccion(selc));
                }
             }
             
             if(tipo==Menu_busqueda.BUSQUEDA_SELECCIONES_POR_CONFEDERACION){
                  for(Seleccion selc:Fachada.getInstancia().devolverSelecionPorConfederacion(conuslta)){
                     paneles.add(new resultadoBusquedaSeleccion(selc));
                }
             }
             
             if(tipo==Menu_busqueda.BUSQUEDA_SELECCIONES_POR_NOMBRE_DIRECTOR){
                  for(Seleccion selc:Fachada.getInstancia().devolverSelecionPorNombreDirectorTecnico(conuslta)){
                     paneles.add(new resultadoBusquedaSeleccion(selc));
                }
             }
             
              if(tipo==Menu_busqueda.BUSQUEDA_SELECCIONES_POR_NOMBRE_FASE){
                  for(Seleccion selc:Fachada.getInstancia().devolverSelecionPorFase(conuslta)){
                     paneles.add(new resultadoBusquedaSeleccion(selc));
                }
             }
             
            
            
            /*Carga paneles*/
            if(paneles.size()!=0){
                resultados.removeAll();
                resultados.setLayout(new GridLayout(paneles.size(),1));
                resultados.setSize(760, 160*paneles.size());
                for(JPanel jp: paneles){
                    resultados.add(jp);
                }
                resultados.updateUI();
                resultados.repaint();
                this.repaint();
            }else{
                Principal.getInstancia().estiloWindows();
                JOptionPane.showMessageDialog(null, "Sin resultados", "Error", JOptionPane.ERROR_MESSAGE);
                Principal.getInstancia().estiloMetal();
            }
            
        }else{
            Principal.getInstancia().estiloWindows();
            JOptionPane.showMessageDialog(null, "Ingrese un dato para buscar","Error", JOptionPane.ERROR_MESSAGE);
            Principal.getInstancia().estiloMetal();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ayuda;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField criterio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel resultados;
    private javax.swing.JComboBox<String> tipoBusqueda;
    // End of variables declaration//GEN-END:variables
}
