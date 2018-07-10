package logica;


public class Principal {
    
    public static void main(String [] main) {
        
        Jugador u_cabani = new Jugador("Edi" , "Cabani", "Uruguay " , 1 );
        Jugador u_muslera = new Jugador("Fernando" , "Cabani", "Uruguay " , 2 );
        Jugador u_godin = new Jugador("###" , "Godin", "Uruguay " , 3 );
        Jugador u_suelres = new Jugador("Luiz" , "Suarez", "Uruguay " , 4 );
        Jugador u_torreira = new Jugador("###" , "Torreira", "Uruguay " , 5 );
        Jugador u_gimenez = new Jugador("###" , "Gimenez", "Uruguay " , 6 );
        
        Jugador p_rui = new Jugador("###" , "Patrisio", "Portugal " , 7 );
        Jugador p_pepe = new Jugador("###" , "Pepe", "Portugal" , 8 );
        Jugador p_pereira = new Jugador("###" , "Pereira", "Portugal " , 9 );
        Jugador p_ronaldo = new Jugador("Cristiano" , "Ronaldo", "Porugal" , 10 );
        Jugador p_silva = new Jugador("###" , "Silva", "Portugal " , 11 );
        Jugador p_alves = new Jugador("###" , "Alves", "Portugal " , 12 );
        
        Jugador e_reina = new Jugador("###" , "Reina", "España " , 13 );
        Jugador e_carabajal = new Jugador("###" , "Carabajal", "España " , 14 );
        Jugador e_gea = new Jugador("###" , "Fea", "España " , 15 );
        Jugador e_saul = new Jugador("###" , "Saúl", "España " , 16);
        Jugador e_vazques = new Jugador("Lucas" , "Vazques", "España " , 17 );
        Jugador e_costa = new Jugador("Diego" , "Costa", "España " , 18 );
        
        Jugador b_alisson = new Jugador("###" , "Alison", "Brasil" , 19 );
        Jugador b_Paulinio = new Jugador("###" , "Pauliniho", "Brasil" , 20);
        Jugador b_neymar = new Jugador("###" , "Neymar", "Brasil" , 21);
        Jugador b_firminio = new Jugador("Roberto" , "Firminio", "Brasil " , 22);
        Jugador b_fred= new Jugador("###" , "Fred", "Brasil " , 23 );
        Jugador b_danilo = new Jugador("###" , "Danilo", "Brasil " , 24 );
        
        
        Seleccion uruguay = new Seleccion("Uruguay");
        Seleccion portugal = new Seleccion("Portugal");
        Seleccion españa = new Seleccion("España");
        Seleccion brasil = new Seleccion("Brasil");
        
        uruguay.agregarJugador(u_cabani);
        uruguay.agregarJugador(u_muslera);
        uruguay.agregarJugador(u_godin);
        uruguay.agregarJugador(u_suelres);
        uruguay.agregarJugador(u_torreira);
        uruguay.agregarJugador(u_gimenez);
        
        portugal.agregarJugador(p_rui);
        portugal.agregarJugador(p_pepe);
        portugal.agregarJugador(p_pereira);
        portugal.agregarJugador(p_ronaldo);
        portugal.agregarJugador(p_silva);
        portugal.agregarJugador(p_alves);
        
        españa.agregarJugador(e_reina);
        españa.agregarJugador(e_carabajal);
        españa.agregarJugador(e_gea);
        españa.agregarJugador(e_saul);
        españa.agregarJugador(e_vazques);
        españa.agregarJugador(e_costa);
        
        brasil.agregarJugador(b_alisson);
        brasil.agregarJugador(b_Paulinio);
        brasil.agregarJugador(b_neymar);
        brasil.agregarJugador(b_firminio);
        brasil.agregarJugador(b_fred);
        brasil.agregarJugador(b_danilo);
        
        Partido uy_es = new Partido (uruguay,españa,90,5);    
        Partido uy_por = new Partido (uruguay,portugal,120,7);    
        Partido uy_br = new Partido (uruguay,brasil,135,5);    
        Partido por_es = new Partido (portugal,españa,120,5);    
        Partido br_es = new Partido (brasil,españa,90,2);    
        Partido por_br = new Partido(portugal,brasil,130,2);
        
        Acciones u_cabani_UyEs = new Acciones (u_cabani);
        Acciones u_cabani_Uypor = new Acciones (u_cabani);
        Acciones u_cabani_Uybr = new Acciones (u_cabani);
       
        Acciones u_muslera_UyEs = new Acciones (u_muslera);
        Acciones u_muslera_Uypor = new Acciones (u_muslera);
        Acciones u_muslera_Uybr = new Acciones (u_muslera);
        
        Acciones u_suelres_UyEs = new Acciones (u_suelres);
        Acciones u_suelres_Uypor = new Acciones (u_suelres);
        Acciones u_suelres_Uybr = new Acciones (u_suelres);
       
        Acciones u_godin_UyEs = new Acciones (u_godin);
        Acciones u_godin_Uypor = new Acciones (u_godin);
        Acciones u_godin_Uybr = new Acciones (u_godin);
        
       Acciones u_torreiraa_UyEs = new Acciones (u_torreira);
        Acciones u_torreira_Uypor = new Acciones (u_torreira);
        Acciones u_torreira_Uybr = new Acciones (u_torreira);
        
        Acciones u_gimenez_UyEs = new Acciones (u_gimenez);
        Acciones u_gimenez_Uypor = new Acciones (u_gimenez);
        Acciones u_gimenez_Uybr = new Acciones (u_gimenez);
        
        
        Acciones p_rui_PorUy = new Acciones(p_rui);
        Acciones p_rui_PorEs = new Acciones(p_rui);
        Acciones p_rui_PorBr = new Acciones(p_rui);
        
        Acciones p_pepe_PorUy = new Acciones(p_pepe);
        Acciones p_pepe_PorEs = new Acciones(p_pepe);
        Acciones p_pepe_PorBr = new Acciones(p_pepe);
        
        Acciones p_pereira_PorUy = new Acciones(p_pereira);
        Acciones p_pereira_PorEs = new Acciones(p_pereira);
        Acciones p_pereira_PorBr = new Acciones(p_pereira);
        
        Acciones p_ronaldo_PorUy = new Acciones(p_ronaldo);
        Acciones p_ronaldo_PorEs = new Acciones(p_ronaldo);
        Acciones p_ronaldo_PorBr = new Acciones(p_ronaldo);
        
        Acciones p_silva_PorUy = new Acciones(p_silva);
        Acciones p_silva_PorEs = new Acciones(p_silva);
        Acciones p_silva_PorBr = new Acciones(p_silva);
        
        Acciones p_alves_PorUy = new Acciones(p_alves);
        Acciones p_alves_PorEs = new Acciones(p_alves);
        Acciones p_alves_PorBr = new Acciones(p_alves);
        
        
        Acciones e_reina_EsUy = new Acciones(e_reina);
        Acciones e_reina_EsPor = new Acciones(e_reina);
        Acciones e_reina_EsBr = new Acciones(e_reina);
        
        Acciones e_carabajal_EsUy = new Acciones(e_reina);
        Acciones e_carabajal_EsPor = new Acciones(e_reina);
        Acciones e_carabajal_EsBr = new Acciones(e_reina);
        
        Acciones e_gea_EsUy = new Acciones(e_reina);
        Acciones e_gea_EsPor = new Acciones(e_reina);
        Acciones e_gea_EsBr = new Acciones(e_reina);
        
        Acciones e_saul_EsUy = new Acciones(e_reina);
        Acciones e_saul_EsPor = new Acciones(e_reina);
        Acciones e_saul_EsBr = new Acciones(e_reina);
        
        Acciones e_vazques_EsUy = new Acciones(e_reina);
        Acciones e_vazques_EsPor = new Acciones(e_reina);
        Acciones e_vazques_EsBr = new Acciones(e_reina);
        
        Acciones e_costa_EsUy = new Acciones(e_reina);
        Acciones e_costa_EsPor = new Acciones(e_reina);
        Acciones e_costa_EsBr = new Acciones(e_reina);
       
       
       Acciones b_alisson_BrUy = new Acciones(b_alisson);
       Acciones b_alisson_BrEs = new Acciones(b_alisson);
       Acciones b_alisson_BrPor = new Acciones(b_alisson);
       
       Acciones b_Paulinio_BrUy = new Acciones(b_Paulinio);
       Acciones b_Paulinio_BrEs = new Acciones(b_Paulinio);
       Acciones b_Paulinio_BrPor = new Acciones(b_Paulinio);
       
       Acciones b_neymar_BrUy = new Acciones(b_neymar);
       Acciones b_neymar_BrEs = new Acciones(b_neymar);
       Acciones b_neymar_BrPor = new Acciones(b_neymar);
       
       Acciones b_firminio_BrUy = new Acciones(b_firminio);
       Acciones b_firminio_BrEs = new Acciones(b_firminio);
       Acciones b_firminio_BrPor = new Acciones(b_firminio);
       
       Acciones b_fred_BrUy = new Acciones(b_fred);
       Acciones b_fred_BrEs = new Acciones(b_fred);
       Acciones b_fred_BrPor = new Acciones(b_fred);
       
       Acciones b_danilo_BrUy = new Acciones(b_danilo);
       Acciones b_danilo_BrEs = new Acciones(b_danilo);
       Acciones b_danilo_BrPor = new Acciones(b_danilo);
    
       uy_br.agregarEvento(u_cabani_Uybr);
       uy_br.agregarEvento(u_gimenez_Uybr);
       uy_br.agregarEvento(u_godin_Uybr);
       uy_br.agregarEvento(u_muslera_Uybr);
       uy_br.agregarEvento(u_suelres_Uybr);
       uy_br.agregarEvento(u_torreira_Uybr);
       uy_br.agregarEvento(b_Paulinio_BrUy);
       uy_br.agregarEvento(b_alisson_BrUy);
       uy_br.agregarEvento(b_danilo_BrUy);
       uy_br.agregarEvento(b_firminio_BrUy);
       uy_br.agregarEvento(b_fred_BrUy);
       uy_br.agregarEvento(b_neymar_BrUy);
       
       uy_es.agregarEvento(u_cabani_UyEs);
       uy_es.agregarEvento(u_gimenez_UyEs);
       uy_es.agregarEvento(u_godin_UyEs);
       uy_es.agregarEvento(u_muslera_UyEs);
       uy_es.agregarEvento(u_suelres_UyEs);
       uy_es.agregarEvento(u_torreiraa_UyEs);
       uy_es.agregarEvento(e_carabajal_EsUy);
       uy_es.agregarEvento(e_costa_EsUy);
       uy_es.agregarEvento(e_gea_EsUy);
       uy_es.agregarEvento(e_saul_EsUy);
       uy_es.agregarEvento(e_reina_EsUy);
       uy_es.agregarEvento(e_vazques_EsUy);
       
       uy_por.agregarEvento(u_cabani_Uypor);
       uy_por.agregarEvento(u_gimenez_Uypor);
       uy_por.agregarEvento(u_godin_Uypor);
       uy_por.agregarEvento(u_muslera_Uypor);
       uy_por.agregarEvento(u_suelres_Uypor);
       uy_por.agregarEvento(u_torreira_Uypor);
       uy_por.agregarEvento(p_alves_PorUy);
       uy_por.agregarEvento(p_pepe_PorUy);
       uy_por.agregarEvento(p_pereira_PorUy);
       uy_por.agregarEvento(p_ronaldo_PorUy);
       uy_por.agregarEvento(p_rui_PorUy);
       uy_por.agregarEvento(p_silva_PorUy);
       
       por_br.agregarEvento(p_alves_PorBr);
       por_br.agregarEvento(p_pepe_PorBr);
       por_br.agregarEvento(p_pereira_PorBr);
       por_br.agregarEvento(p_ronaldo_PorBr);
       por_br.agregarEvento(p_rui_PorBr);
       por_br.agregarEvento(p_silva_PorBr);
       por_br.agregarEvento(b_Paulinio_BrPor);
       por_br.agregarEvento(b_alisson_BrPor);
       por_br.agregarEvento(b_danilo_BrPor);
       por_br.agregarEvento(b_firminio_BrPor);
       por_br.agregarEvento(b_fred_BrPor);
       por_br.agregarEvento(b_neymar_BrPor);
       
       por_es.agregarEvento(p_alves_PorEs);
       por_es.agregarEvento(p_pepe_PorEs);
       por_es.agregarEvento(p_pereira_PorEs);
       por_es.agregarEvento(p_ronaldo_PorEs);
       por_es.agregarEvento(p_rui_PorEs);
       por_es.agregarEvento(p_silva_PorEs);
       por_es.agregarEvento(e_carabajal_EsPor);
       por_es.agregarEvento(e_costa_EsPor);
       por_es.agregarEvento(e_gea_EsPor);
       por_es.agregarEvento(e_reina_EsPor);
       por_es.agregarEvento(e_saul_EsPor);
       por_es.agregarEvento(e_vazques_EsPor);
       
       br_es.agregarEvento(b_Paulinio_BrEs);
       br_es.agregarEvento(b_alisson_BrEs);  
       br_es.agregarEvento(b_danilo_BrEs);
       br_es.agregarEvento(b_firminio_BrEs);
       br_es.agregarEvento(b_fred_BrEs);
       br_es.agregarEvento(b_neymar_BrEs);
       br_es.agregarEvento(e_carabajal_EsBr);
       br_es.agregarEvento(e_costa_EsBr);
       br_es.agregarEvento(e_gea_EsBr);
       br_es.agregarEvento(e_reina_EsBr);
       br_es.agregarEvento(e_saul_EsBr);
       br_es.agregarEvento(e_vazques_EsBr);
       
        uy_por.cearAlargue();
       Extra e_UyBr=uy_br.cearAlargue();
       por_es.cearAlargue();
       Extra e_PorBr=por_br.cearAlargue();
       
       e_UyBr.penal(b_Paulinio, true);
       e_UyBr.penal(b_alisson, true);
       e_UyBr.penal(b_firminio, true);
       e_UyBr.penal(b_neymar, true);
       e_UyBr.penal(b_fred, true);
       e_UyBr.penal(b_danilo, false);
       
       e_UyBr.penal(u_cabani, true);
       e_UyBr.penal(u_gimenez, true);
       e_UyBr.penal(u_godin, true);
       e_UyBr.penal(u_suelres, true);
       e_UyBr.penal(u_torreira, true);
       e_UyBr.penal(u_cabani, true);
       
       
       e_PorBr.penal(b_Paulinio, false);
       e_PorBr.penal(b_alisson, false);
       e_PorBr.penal(b_firminio, true);
       e_PorBr.penal(b_neymar, true);
       e_PorBr.penal(b_fred, false);
       
       e_PorBr.penal(p_ronaldo, true);
       e_PorBr.penal(p_pepe, true);
       e_PorBr.penal(p_silva, false);
       e_PorBr.penal(p_rui, true);
       e_PorBr.penal(p_pereira, true);
       
       
       u_cabani_Uypor.gol("32:14");
       u_godin_Uypor.gol("64:44");
       u_godin_Uypor.falta(1,Acciones.PARCIAL);
       u_muslera_Uypor.falta(1, Acciones.PARCIAL);
       u_suelres_Uypor.falta(1, Acciones.TOTAL);
       p_pereira_PorUy.falta(1, Acciones.TOTAL);
       p_ronaldo_PorUy.falta(1, Acciones.PARCIAL);
       p_pepe_PorUy.gol("32:44");
         
       u_cabani_Uybr.falta(1, Acciones.PARCIAL);
       b_alisson_BrUy.falta(2, Acciones.PARCIAL);
       
       e_carabajal_EsUy.falta(2, Acciones.PARCIAL);
       e_reina_EsUy.gol("89:20");
       
       e_gea_EsPor.falta(1, Acciones.PARCIAL);
       e_costa_EsPor.falta(1, Acciones.PARCIAL);
       e_reina_EsPor.gol("89:20");
       p_ronaldo_PorEs.falta(1, Acciones.TOTAL);
       p_ronaldo_PorEs.gol("10:49");
      // p_ronaldo_PorEs.gol("10:49");
       p_pereira_PorEs.gol("55:47");
       
       b_Paulinio_BrEs.gol("32:55");
       b_alisson_BrEs.falta(1, Acciones.PARCIAL);
       b_neymar_BrEs.falta(1, Acciones.PARCIAL);
       
       b_neymar_BrPor.gol("55:14");
       b_firminio_BrPor.falta(1, Acciones.TOTAL);
       p_rui_PorBr.falta(2, Acciones.PARCIAL);
       p_pepe_PorBr.falta(1, Acciones.PARCIAL);
       p_alves_PorBr.gol("16:56");
       
       Fase totoal = new Fase(Fase.GRUPO_A);
       totoal.agregarPartido(uy_br);
       totoal.agregarPartido(uy_por);
       totoal.agregarPartido(uy_es);
       totoal.agregarPartido(br_es);
       totoal.agregarPartido(por_br);
       totoal.agregarPartido(por_es);
       
      Seleccion [] ganadoras = totoal.SeleccionesGanadoras(false);
      for(int i=0;i<ganadoras.length;i++){
          System.out.println(ganadoras[i].getNombre() + " / " + totoal.devolverPunto(ganadoras[i] )+ " / " +
                   totoal.devolverGoles(ganadoras[i], true) + " / " + totoal.devolverGoles(ganadoras[i], false) + " / " + 
                           totoal.fairPlay(ganadoras[i]));
       }
      
      boolean [] penales_uy = e_UyBr.devolverPenales(uruguay);
      for(int i=0;i<penales_uy.length;i++){
          System.out.print(penales_uy[i]+ " / ");
      } 
      System.out.println();
      
      boolean [] penales_br = e_UyBr.devolverPenales(brasil);
       for(int i=0;i<penales_br.length;i++){
          System.out.print(penales_br[i] + " / ");
      }
            System.out.println();
      boolean [] penales_br2 = e_PorBr.devolverPenales(brasil);
       for(int i=0;i<penales_br2.length;i++){
          System.out.print(penales_br2[i] + " / ");
      }
           System.out.println();
      boolean [] pentale_por = e_PorBr.devolverPenales(portugal);
       for(int i=0;i<pentale_por.length;i++){
          System.out.print(pentale_por[i] + " / ");
      }
      
      
       
       
    }
    
}
