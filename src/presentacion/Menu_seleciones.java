package presentacion;
import fachada.Fachada;
import logica.Seleccion;
/**
 * Clase que contiene todos los objetos de Seleccion que participan en el 
 * mundial Rusia 2018
 */
public class Menu_seleciones extends javax.swing.JPanel 
{
    private static Menu_seleciones initi; 
    /**
     * Costructor por defecto
     */
    private Menu_seleciones() 
    {
        initComponents();
    }
    /**
     * Instancia de clase (patrón Singleton)
     * @return Instancia
     */
    public static Menu_seleciones getInstancia()
    {
        if (initi==null)
        {
            initi = new Menu_seleciones();
        }
        return initi;
    }
    
    public void mostrarSeleccion(String nombre)
    {
        for(Seleccion a: Fachada.getInstancia().getSelecciones())
        {
            if(nombre.equals(a.getNombre()))
            {
                Principal.getInstancia().cargarPanel(new ListarSeleccion(a));
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        argentina = new javax.swing.JButton();
        alemania = new javax.swing.JButton();
        arabia = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        brasil = new javax.swing.JButton();
        australia = new javax.swing.JButton();
        belgica = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        colombia = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        corea = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        costaRica = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        egipto = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        dinamarca = new javax.swing.JButton();
        croacia = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        espania = new javax.swing.JButton();
        francia = new javax.swing.JButton();
        inglaterra = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        islandia = new javax.swing.JButton();
        iran = new javax.swing.JButton();
        japon = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        marruecos = new javax.swing.JButton();
        mexico = new javax.swing.JButton();
        nigeria = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        polonia = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        peru = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        panama = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        senegal = new javax.swing.JButton();
        rusia = new javax.swing.JButton();
        portugal = new javax.swing.JButton();
        suiza = new javax.swing.JButton();
        suecia = new javax.swing.JButton();
        serbia = new javax.swing.JButton();
        uruguay = new javax.swing.JButton();
        tunez = new javax.swing.JButton();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Alemania");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        argentina.setBackground(new java.awt.Color(255, 255, 255));
        argentina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/selecciones/argentinaR.jpg"))); // NOI18N
        argentina.setBorder(null);
        argentina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        argentina.setFocusable(false);
        argentina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                argentinaActionPerformed(evt);
            }
        });

        alemania.setBackground(new java.awt.Color(255, 255, 255));
        alemania.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/selecciones/alemaniaR.jpg"))); // NOI18N
        alemania.setText("jButton1");
        alemania.setBorder(null);
        alemania.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        alemania.setFocusable(false);
        alemania.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alemaniaActionPerformed(evt);
            }
        });

        arabia.setBackground(new java.awt.Color(255, 255, 255));
        arabia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/selecciones/arabiaSauditaR.jpg"))); // NOI18N
        arabia.setText("jButton1");
        arabia.setBorder(null);
        arabia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        arabia.setFocusable(false);
        arabia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arabiaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Selecciones");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Argentina");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Arabia Saudita");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        brasil.setBackground(new java.awt.Color(255, 255, 255));
        brasil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/selecciones/brasilR.jpg"))); // NOI18N
        brasil.setText("jButton1");
        brasil.setBorder(null);
        brasil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        brasil.setFocusable(false);
        brasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brasilActionPerformed(evt);
            }
        });

        australia.setBackground(new java.awt.Color(255, 255, 255));
        australia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/selecciones/australiaR.jpg"))); // NOI18N
        australia.setText("jButton1");
        australia.setBorder(null);
        australia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        australia.setFocusable(false);
        australia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                australiaActionPerformed(evt);
            }
        });

        belgica.setBackground(new java.awt.Color(255, 255, 255));
        belgica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/selecciones/belgicaR.jpg"))); // NOI18N
        belgica.setText("jButton1");
        belgica.setBorder(null);
        belgica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        belgica.setFocusable(false);
        belgica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                belgicaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Bélgica");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Brasil");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Australia");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        colombia.setBackground(new java.awt.Color(255, 255, 255));
        colombia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/selecciones/colombiaR.png"))); // NOI18N
        colombia.setText("jButton1");
        colombia.setBorder(null);
        colombia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        colombia.setFocusable(false);
        colombia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colombiaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Colombia");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        corea.setBackground(new java.awt.Color(255, 255, 255));
        corea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/selecciones/coreaR.jpg"))); // NOI18N
        corea.setText("jButton1");
        corea.setBorder(null);
        corea.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        corea.setFocusable(false);
        corea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coreaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Corea");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        costaRica.setBackground(new java.awt.Color(255, 255, 255));
        costaRica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/selecciones/costaRicaR.jpg"))); // NOI18N
        costaRica.setText("jButton1");
        costaRica.setBorder(null);
        costaRica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        costaRica.setFocusable(false);
        costaRica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costaRicaActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Costa Rica");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        egipto.setBackground(new java.awt.Color(255, 255, 255));
        egipto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/selecciones/egiptoR.jpg"))); // NOI18N
        egipto.setText("jButton1");
        egipto.setBorder(null);
        egipto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        egipto.setFocusable(false);
        egipto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                egiptoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Egipto");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Dinamarca");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        dinamarca.setBackground(new java.awt.Color(255, 255, 255));
        dinamarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/selecciones/dinamarcaR.jpg"))); // NOI18N
        dinamarca.setText("jButton1");
        dinamarca.setBorder(null);
        dinamarca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dinamarca.setFocusable(false);
        dinamarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dinamarcaActionPerformed(evt);
            }
        });

        croacia.setBackground(new java.awt.Color(255, 255, 255));
        croacia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/selecciones/croaciaR.jpg"))); // NOI18N
        croacia.setText("jButton1");
        croacia.setBorder(null);
        croacia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        croacia.setFocusable(false);
        croacia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                croaciaActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Croacia");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        espania.setBackground(new java.awt.Color(255, 255, 255));
        espania.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/selecciones/espaniaR.jpg"))); // NOI18N
        espania.setText("jButton1");
        espania.setBorder(null);
        espania.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        espania.setFocusable(false);
        espania.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                espaniaActionPerformed(evt);
            }
        });

        francia.setBackground(new java.awt.Color(255, 255, 255));
        francia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/selecciones/FranciaR.jpg"))); // NOI18N
        francia.setText("jButton1");
        francia.setBorder(null);
        francia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        francia.setFocusable(false);
        francia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                franciaActionPerformed(evt);
            }
        });

        inglaterra.setBackground(new java.awt.Color(255, 255, 255));
        inglaterra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/selecciones/inglaterraR.jpg"))); // NOI18N
        inglaterra.setText("jButton1");
        inglaterra.setBorder(null);
        inglaterra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inglaterra.setFocusable(false);
        inglaterra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inglaterraActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Inglaterra");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Francia");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("España");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        islandia.setBackground(new java.awt.Color(255, 255, 255));
        islandia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/selecciones/islandiaR.jpg"))); // NOI18N
        islandia.setText("jButton1");
        islandia.setBorder(null);
        islandia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        islandia.setFocusable(false);
        islandia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                islandiaActionPerformed(evt);
            }
        });

        iran.setBackground(new java.awt.Color(255, 255, 255));
        iran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/selecciones/iranR.jpg"))); // NOI18N
        iran.setText("jButton1");
        iran.setBorder(null);
        iran.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iran.setFocusable(false);
        iran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iranActionPerformed(evt);
            }
        });

        japon.setBackground(new java.awt.Color(255, 255, 255));
        japon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/selecciones/japonR.jpg"))); // NOI18N
        japon.setText("jButton1");
        japon.setBorder(null);
        japon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        japon.setFocusable(false);
        japon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                japonActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Japón");
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Irán");
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Islandia");
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        marruecos.setBackground(new java.awt.Color(255, 255, 255));
        marruecos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/selecciones/marruecosR.jpg"))); // NOI18N
        marruecos.setText("jButton1");
        marruecos.setBorder(null);
        marruecos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        marruecos.setFocusable(false);
        marruecos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marruecosActionPerformed(evt);
            }
        });

        mexico.setBackground(new java.awt.Color(255, 255, 255));
        mexico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/selecciones/mexicoR.jpg"))); // NOI18N
        mexico.setText("jButton1");
        mexico.setBorder(null);
        mexico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mexico.setFocusable(false);
        mexico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mexicoActionPerformed(evt);
            }
        });

        nigeria.setBackground(new java.awt.Color(255, 255, 255));
        nigeria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/selecciones/nigeriaR.jpg"))); // NOI18N
        nigeria.setText("jButton1");
        nigeria.setBorder(null);
        nigeria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nigeria.setFocusable(false);
        nigeria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nigeriaActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Nigeria");
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel21.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("México");
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel22.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Marruecos");
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        polonia.setBackground(new java.awt.Color(255, 255, 255));
        polonia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/selecciones/poloniaR.jpg"))); // NOI18N
        polonia.setText("jButton1");
        polonia.setBorder(null);
        polonia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        polonia.setFocusable(false);
        polonia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poloniaActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Polonia");
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        peru.setBackground(new java.awt.Color(255, 255, 255));
        peru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/selecciones/peruR.jpg"))); // NOI18N
        peru.setText("jButton1");
        peru.setBorder(null);
        peru.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        peru.setFocusable(false);
        peru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peruActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Perú");
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        panama.setBackground(new java.awt.Color(255, 255, 255));
        panama.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/selecciones/panamaR.jpg"))); // NOI18N
        panama.setText("jButton1");
        panama.setBorder(null);
        panama.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panama.setFocusable(false);
        panama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panamaActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Panamá");
        jLabel25.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        senegal.setBackground(new java.awt.Color(255, 255, 255));
        senegal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/selecciones/senegalR.jpg"))); // NOI18N
        senegal.setText("jButton1");
        senegal.setBorder(null);
        senegal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        senegal.setFocusable(false);
        senegal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senegalActionPerformed(evt);
            }
        });

        rusia.setBackground(new java.awt.Color(255, 255, 255));
        rusia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/selecciones/rusiaR.jpg"))); // NOI18N
        rusia.setText("jButton1");
        rusia.setBorder(null);
        rusia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rusia.setFocusable(false);
        rusia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rusiaActionPerformed(evt);
            }
        });

        portugal.setBackground(new java.awt.Color(255, 255, 255));
        portugal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/selecciones/portugalR.jpg"))); // NOI18N
        portugal.setText("jButton1");
        portugal.setBorder(null);
        portugal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        portugal.setFocusable(false);
        portugal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portugalActionPerformed(evt);
            }
        });

        suiza.setBackground(new java.awt.Color(255, 255, 255));
        suiza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/selecciones/suizaR.jpg"))); // NOI18N
        suiza.setText("jButton1");
        suiza.setBorder(null);
        suiza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        suiza.setFocusable(false);
        suiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suizaActionPerformed(evt);
            }
        });

        suecia.setBackground(new java.awt.Color(255, 255, 255));
        suecia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/selecciones/sueciaR.jpg"))); // NOI18N
        suecia.setText("jButton1");
        suecia.setBorder(null);
        suecia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        suecia.setFocusable(false);
        suecia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sueciaActionPerformed(evt);
            }
        });

        serbia.setBackground(new java.awt.Color(255, 255, 255));
        serbia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/selecciones/serbiaR.jpg"))); // NOI18N
        serbia.setText("jButton1");
        serbia.setBorder(null);
        serbia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        serbia.setFocusable(false);
        serbia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serbiaActionPerformed(evt);
            }
        });

        uruguay.setBackground(new java.awt.Color(255, 255, 255));
        uruguay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/selecciones/uruguayR.jpg"))); // NOI18N
        uruguay.setText("jButton1");
        uruguay.setBorder(null);
        uruguay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        uruguay.setFocusable(false);
        uruguay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uruguayActionPerformed(evt);
            }
        });

        tunez.setBackground(new java.awt.Color(255, 255, 255));
        tunez.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/selecciones/tunezR.jpg"))); // NOI18N
        tunez.setText("jButton1");
        tunez.setBorder(null);
        tunez.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tunez.setFocusable(false);
        tunez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tunezActionPerformed(evt);
            }
        });

        jLabel63.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(51, 51, 51));
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setText("Portugal");
        jLabel63.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel64.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(51, 51, 51));
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setText("Rusia");
        jLabel64.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel65.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(51, 51, 51));
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setText("Senegal");
        jLabel65.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel66.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(51, 51, 51));
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setText("Serbia");
        jLabel66.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel67.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(51, 51, 51));
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setText("Suecia");
        jLabel67.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel68.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(51, 51, 51));
        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel68.setText("Suiza");
        jLabel68.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel69.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(51, 51, 51));
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setText("Túnez");
        jLabel69.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel70.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(51, 51, 51));
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setText("Uruguay");
        jLabel70.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(alemania, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(arabia, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(argentina, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(croacia, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dinamarca, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(egipto, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(colombia, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(corea, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(costaRica, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(panama, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(peru, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(polonia, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(espania, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(francia, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(inglaterra, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(islandia, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(iran, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(japon, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGap(20, 20, 20))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(marruecos, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(mexico, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(22, 22, 22)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nigeria, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(portugal, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(rusia, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(senegal, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(serbia, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(suecia, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(suiza, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(tunez, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(uruguay, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(australia, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(belgica, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(brasil, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(288, 288, 288))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(alemania)
                        .addComponent(arabia))
                    .addComponent(argentina, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(belgica)
                    .addComponent(australia)
                    .addComponent(brasil))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colombia)
                    .addComponent(corea)
                    .addComponent(costaRica))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(croacia)
                    .addComponent(dinamarca)
                    .addComponent(egipto))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(espania)
                    .addComponent(francia)
                    .addComponent(inglaterra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(islandia)
                    .addComponent(iran)
                    .addComponent(japon))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marruecos)
                    .addComponent(mexico)
                    .addComponent(nigeria))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(panama)
                    .addComponent(peru)
                    .addComponent(polonia))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(portugal)
                    .addComponent(rusia)
                    .addComponent(senegal))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(jLabel64)
                    .addComponent(jLabel63))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serbia)
                    .addComponent(suecia)
                    .addComponent(suiza))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(jLabel67)
                    .addComponent(jLabel66))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tunez)
                    .addComponent(uruguay))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70)
                    .addComponent(jLabel69))
                .addGap(75, 75, 75))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 2710));
    }// </editor-fold>//GEN-END:initComponents

    private void alemaniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alemaniaActionPerformed
        mostrarSeleccion("Alemania");
    }//GEN-LAST:event_alemaniaActionPerformed

    private void arabiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arabiaActionPerformed
        mostrarSeleccion("Arabia");
    }//GEN-LAST:event_arabiaActionPerformed

    private void argentinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_argentinaActionPerformed
        mostrarSeleccion("Argentina");
    }//GEN-LAST:event_argentinaActionPerformed

    private void brasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brasilActionPerformed
        mostrarSeleccion("Brasil");
    }//GEN-LAST:event_brasilActionPerformed

    private void australiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_australiaActionPerformed
        mostrarSeleccion("Australia");
    }//GEN-LAST:event_australiaActionPerformed

    private void belgicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_belgicaActionPerformed
        mostrarSeleccion("Bélgica");
    }//GEN-LAST:event_belgicaActionPerformed

    private void colombiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colombiaActionPerformed
        mostrarSeleccion("Colombia");
    }//GEN-LAST:event_colombiaActionPerformed

    private void coreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coreaActionPerformed
        mostrarSeleccion("Corea");
    }//GEN-LAST:event_coreaActionPerformed

    private void costaRicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costaRicaActionPerformed
        mostrarSeleccion("Costa Rica");
    }//GEN-LAST:event_costaRicaActionPerformed

    private void egiptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_egiptoActionPerformed
        mostrarSeleccion("Egipto");
    }//GEN-LAST:event_egiptoActionPerformed

    private void dinamarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dinamarcaActionPerformed
        mostrarSeleccion("Dinamarca");
    }//GEN-LAST:event_dinamarcaActionPerformed

    private void croaciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_croaciaActionPerformed
        mostrarSeleccion("Croacia");
    }//GEN-LAST:event_croaciaActionPerformed

    private void espaniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_espaniaActionPerformed
        mostrarSeleccion("España");
    }//GEN-LAST:event_espaniaActionPerformed

    private void franciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_franciaActionPerformed
        mostrarSeleccion("Francia");
    }//GEN-LAST:event_franciaActionPerformed

    private void inglaterraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inglaterraActionPerformed
        mostrarSeleccion("Inglaterra");
    }//GEN-LAST:event_inglaterraActionPerformed

    private void islandiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_islandiaActionPerformed
        mostrarSeleccion("Islandia");
    }//GEN-LAST:event_islandiaActionPerformed

    private void iranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iranActionPerformed
        mostrarSeleccion("Irán");
    }//GEN-LAST:event_iranActionPerformed

    private void japonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_japonActionPerformed
        mostrarSeleccion("Japón");
    }//GEN-LAST:event_japonActionPerformed

    private void marruecosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marruecosActionPerformed
        mostrarSeleccion("Marruecos");
    }//GEN-LAST:event_marruecosActionPerformed

    private void mexicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mexicoActionPerformed
        mostrarSeleccion("México");
    }//GEN-LAST:event_mexicoActionPerformed

    private void nigeriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nigeriaActionPerformed
        mostrarSeleccion("Nigeria");
    }//GEN-LAST:event_nigeriaActionPerformed

    private void poloniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poloniaActionPerformed
        mostrarSeleccion("Polonia");
    }//GEN-LAST:event_poloniaActionPerformed

    private void peruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peruActionPerformed
        mostrarSeleccion("Perú");
    }//GEN-LAST:event_peruActionPerformed

    private void panamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panamaActionPerformed
        mostrarSeleccion("Panamá");
    }//GEN-LAST:event_panamaActionPerformed

    private void senegalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senegalActionPerformed
        mostrarSeleccion("Senegal");
    }//GEN-LAST:event_senegalActionPerformed

    private void rusiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rusiaActionPerformed
        mostrarSeleccion("Rusia");
    }//GEN-LAST:event_rusiaActionPerformed

    private void portugalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portugalActionPerformed
        mostrarSeleccion("Portugal");
    }//GEN-LAST:event_portugalActionPerformed

    private void suizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suizaActionPerformed
        mostrarSeleccion("Suiza");
    }//GEN-LAST:event_suizaActionPerformed

    private void sueciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sueciaActionPerformed
        mostrarSeleccion("Suecia");
    }//GEN-LAST:event_sueciaActionPerformed

    private void serbiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serbiaActionPerformed
        mostrarSeleccion("Serbia");
    }//GEN-LAST:event_serbiaActionPerformed

    private void uruguayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uruguayActionPerformed
        mostrarSeleccion("Uruguay");
    }//GEN-LAST:event_uruguayActionPerformed

    private void tunezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tunezActionPerformed
        mostrarSeleccion("Túnez");
    }//GEN-LAST:event_tunezActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alemania;
    private javax.swing.JButton arabia;
    private javax.swing.JButton argentina;
    private javax.swing.JButton australia;
    private javax.swing.JButton belgica;
    private javax.swing.JButton brasil;
    private javax.swing.JButton colombia;
    private javax.swing.JButton corea;
    private javax.swing.JButton costaRica;
    private javax.swing.JButton croacia;
    private javax.swing.JButton dinamarca;
    private javax.swing.JButton egipto;
    private javax.swing.JButton espania;
    private javax.swing.JButton francia;
    private javax.swing.JButton inglaterra;
    private javax.swing.JButton iran;
    private javax.swing.JButton islandia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton japon;
    private javax.swing.JButton marruecos;
    private javax.swing.JButton mexico;
    private javax.swing.JButton nigeria;
    private javax.swing.JButton panama;
    private javax.swing.JButton peru;
    private javax.swing.JButton polonia;
    private javax.swing.JButton portugal;
    private javax.swing.JButton rusia;
    private javax.swing.JButton senegal;
    private javax.swing.JButton serbia;
    private javax.swing.JButton suecia;
    private javax.swing.JButton suiza;
    private javax.swing.JButton tunez;
    private javax.swing.JButton uruguay;
    // End of variables declaration//GEN-END:variables
}
