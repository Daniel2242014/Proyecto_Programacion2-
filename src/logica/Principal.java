package logica;


public class Principal {
    
    public static void main(String [] main){
        /*Jugador [] jugu = new Jugador[20];
        jugu[0] = new Jugador("Uruguay", "alfonso", "Uruguay", 543546);
        jugu[1] = new Jugador("Uruguay", "alfonso", "Uruguay", 5244546);
        jugu[2] = new Jugador("Uruguay", "alfonso", "Uruguay", 143546);
        jugu[3] = new Jugador("Uruguay", "alfonso", "Uruguay", 243546);
        jugu[4] = new Jugador("Uruguay", "alfonso", "Uruguay", 343546);
        jugu[5] = new Jugador("Portugal", "alfonso", "Uruguay", 443546);
        jugu[6] = new Jugador("Portugal", "alfonso", "Uruguay", 643546);
        jugu[7] = new Jugador("Portugal", "alfonso", "Uruguay", 743546);
        jugu[8] = new Jugador("Portugal", "alfonso", "Uruguay", 843546);
        jugu[9] = new Jugador("Portugal", "alfonso", "Uruguay", 943546);
        jugu[10] = new Jugador("España", "alfonso", "Uruguay", 5435456);
        jugu[11] = new Jugador("España", "alfonso", "Uruguay", 5435116);
        jugu[12] = new Jugador("España", "alfonso", "Uruguay", 1743546);
        jugu[13] = new Jugador("España", "alfonso", "Uruguay", 347546);
        jugu[14] = new Jugador("España", "alfonso", "Uruguay", 245546);
        jugu[15] = new Jugador("Agrentina", "alfonso", "Uruguay", 10243546);
        jugu[16] = new Jugador("Agrentina", "alfonso", "Uruguay", 4743546);
        jugu[17] = new Jugador("Agrentina", "alfonso", "Uruguay", 69843546);
        jugu[18] = new Jugador("Agrentina", "alfonso", "Uruguay", 213436);
        jugu[19] = new Jugador("Agrentina", "alfonso", "Uruguay", 0314546);
       
        Seleccion [] sele = new Seleccion [4];
        sele [0]=new Seleccion("Uruguay");
        sele [1]=new Seleccion("Portugal");
        sele [2]=new Seleccion("España");
        sele [3]=new Seleccion("Agrentina");
        
        
        int contador=0;
        for(int i=0;i<4;i++){
           sele[i].agregarJugador(jugu[contador]);
           sele[i].agregarJugador(jugu[contador+1]);
           sele[i].agregarJugador(jugu[contador+2]);
           sele[i].agregarJugador(jugu[contador+3]);
           sele[i].agregarJugador(jugu[contador+4]);
           contador+=5;
        }
        
        Partido []  par = new Partido[6];
        par[0]= new Partido(sele[0],sele[1],90, 2);
        par[1]= new Partido(sele[0],sele[2],90, 4);
        par[2]= new Partido(sele[0],sele[3],140, 6);
        par[3]= new Partido(sele[1],sele[3],90, 10);
        par[4]= new Partido(sele[2],sele[1],136, 5);
        par[5]= new Partido(sele[3],sele[2],120, 6);
 
        
        Acciones[] acc=new Acciones[60];
        int contt=0;
        for(int i=0; i<jugu.length; i++)
        {
            int contPartido=0;
            
            while(!par[contPartido].getEquipo1().pertenece(jugu[i]) && !par[contPartido].getEquipo2().pertenece(jugu[i]) ){
                contPartido++;
             }
          
            acc[contt]=new Acciones(jugu[i]);
            par[contPartido].agregarEvento(acc[contt]);
            contPartido++;
            while(!par[contPartido].getEquipo1().pertenece(jugu[i]) && !par[contPartido].getEquipo2().pertenece(jugu[i]) ){
                contPartido++;
            }
            
            acc[contt+1]=new Acciones(jugu[i]);
            par[contPartido].agregarEvento(acc[contt+1]);
            contPartido++;
            while(!par[contPartido].getEquipo1().pertenece(jugu[i]) && !par[contPartido].getEquipo2().pertenece(jugu[i]) ){
                contPartido++;
            }
            acc[contt+2]=new Acciones(jugu[i]);
            par[contPartido].agregarEvento(acc[contt+2]);
            
            contt+=3;
        }
        
       
        
        acc[4].gol("13:55");
        acc[5].gol("55:03");
        acc[5].gol("03:02");
       acc[9].gol("87:06");
        acc[14].gol("66:02");
        
        acc[28].gol("110:22");
        acc[29].gol("110:22");
        acc[32].gol("10:22");
        acc[47].gol("45:21");
        //acc[34].gol("100:24");
        acc[49].gol("07:52");
        
        acc[52].gol("118:08");
        acc[53].gol("118:08");
        
        acc[29].setRoja(true);
        acc[13].setRoja(true);
        
        acc[16].setAmarilias(2);
        acc[30].setAmarilias(1);
        acc[4].setAmarilias(1);
        acc[22].setAmarilias(1);
        acc[9].setAmarilias(2);
        acc[43].setAmarilias(1);
        
       Extra e2=par[2].cearAlargue();
       Extra e4=par[4].cearAlargue();
       par[5].cearAlargue();
       
       e2.penal(jugu[2], true); 
       e2.penal(jugu[3], false);
       e2.penal(jugu[0], true);
       e2.penal(jugu[4], false);
       e2.penal(jugu[1], true);
       e2.penal(jugu[0], false);
       //---------------------------------
       e2.penal(jugu[16], true); 
       e2.penal(jugu[19], false);
       e2.penal(jugu[17], true);
       e2.penal(jugu[18], false);
       e2.penal(jugu[15], true);
       e2.penal(jugu[18], false);
       
       
       e4.penal(jugu[7], false); 
       e4.penal(jugu[5], false);
       e4.penal(jugu[6], false);
       e4.penal(jugu[9], false);
       e4.penal(jugu[8], true);
       //---------------------------------
       e4.penal(jugu[1], true); 
       e4.penal(jugu[2], true);
       e4.penal(jugu[0], true);
       e4.penal(jugu[4], false);
       e4.penal(jugu[3], true);
       
        Fase grupoA=new Fase();
        for(int i=0; i<par.length; i++)
        {
            grupoA.agregarPartido(par[i]);
        }
        
        Seleccion [] selectGan = grupoA.SeleccionesPerdedoras();
        
        for(int i=0;i<selectGan.length;i++){
            System.out.print(selectGan[i].getNombre());
        }
        boolean [] ii = e4.devolverPenales(sele[1]);
        for(int i=0;i<ii.length;i++){
            System.out.println(ii[i]);
        }
        */
        
        
        Jugador u_cabani = new Jugador("Edi" , "Cabani", "Uruguay " , 51768913 );
        Jugador u_muslera = new Jugador("Fernando" , "Cabani", "Uruguay " , 19736497 );
        Jugador u_godin = new Jugador("###" , "Godin", "Uruguay " , 46798216 );
        Jugador u_suelres = new Jugador("Luiz" , "Suarez", "Uruguay " , 92468759 );
        Jugador u_torreira = new Jugador("###" , "Torreira", "Uruguay " , 29786453 );
        Jugador u_gimenez = new Jugador("###" , "Gimenez", "Uruguay " , 79546327 );
        
        Jugador p_rui = new Jugador("###" , "Patrisio", "Portugal " , 14689752 );
        Jugador p_pepe = new Jugador("###" , "Pepe", "Portugal" , 76984531 );
        Jugador p_pereira = new Jugador("###" , "Pereira", "Portugal " , 12479865 );
        Jugador p_ronaldo = new Jugador("Cristiano" , "Ronaldo", "Porugal" , 67893215 );
        Jugador p_silva = new Jugador("###" , "Silva", "Portugal " , 84653478 );
        Jugador p_alves = new Jugador("###" , "Alves", "Portugal " , 79514689 );
        
        Jugador e_reina = new Jugador("###" , "Reina", "España " , 46879315 );
        Jugador e_carabajal = new Jugador("###" , "Carabajal", "España " , 15678942 );
        Jugador e_gea = new Jugador("###" , "Fea", "España " , 84652279 );
        Jugador e_saul = new Jugador("###" , "Saúl", "España " , 79654879);
        Jugador e_vazques = new Jugador("Lucas" , "Vazques", "España " , 99954631 );
        Jugador e_costa = new Jugador("Diego" , "Costa", "España " , 44698123 );
        
        Jugador b_alisson = new Jugador("###" , "Alison", "Brasil" , 87334689 );
        Jugador b_Paulinio = new Jugador("###" , "Pauliniho", "Brasil" , 77445699);
        Jugador b_neymar = new Jugador("###" , "Neymar", "Brasil" , 11365987);
        Jugador b_firminio = new Jugador("Roberto" , "Firminio", "Brasil " , 3311575);
        Jugador b_fred= new Jugador("###" , "Fred", "Brasil " , 87546631 );
        Jugador b_danilo = new Jugador("###" , "Danilo", "Brasil " , 97555584 );
       
    }
    
}
