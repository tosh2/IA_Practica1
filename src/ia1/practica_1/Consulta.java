/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia1.practica_1;

import java.util.Map;
import javax.swing.JTextArea;
import org.jpl7.Atom;
import org.jpl7.Query;
import org.jpl7.Term;
import org.jpl7.Variable;

/**
 *
 * @author tosh
 */
public class Consulta {

    public Consulta() {
        Query openSwipl = new Query( "consult", new Term[] {new Atom("practica_1.pl")} );
        System.out.println( "compilacion " + (openSwipl.hasMoreSolutions() ? "correcta" : "fallida"));
    }
    
    public void GenerarConsulta(JTextArea txt_area, String consulta, int n, String param1, String param2){
        
        txt_area.setText("");
        
        txt_area.append(">>>>>>>>>>>>>>>>>>   " + consulta +"    >>>>>>>>>>>>>>>>>>>>\n");
        
        /*
        
        Query q2 = new Query("alumno_cierre",new Term[] {new Atom("josue")} );
        Variable X = new Variable();
        txt_area.append(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        Query q = new Query( "alumno(X)");
        Map<String, Term>[] solutions = q.allSolutions();
	
        for (int i = 0; i < solutions.length; i++) {
            System.err.println("X = " + solutions[i].get("X"));
            txt_area.append(solutions[i].get("X").toString());
	}
        */
        
        if(n==0){
            
            Query q = new Query( "alumno(X)");
            Map<String, Term>[] solutions = q.allSolutions();

            for (int i = 0; i < solutions.length; i++) {
                txt_area.append(solutions[i].get("X").toString()+"\n");
            }
            
        }else if(n==1){
            
            Query q = new Query( "curso(X)");
            Map<String, Term>[] solutions = q.allSolutions();

            for (int i = 0; i < solutions.length; i++) {
                txt_area.append(solutions[i].get("X").toString()+"\n");
            }
            
        }else if(n==2){
        
            Query q = new Query( "alumno_cierre",new Term[] {new Atom(param1)} );
            if(q.hasSolution()){
                txt_area.append("Felicidades: "+ param1 + " SI cerras :)");
            }else{
                txt_area.append("Lo siento: "+ param1 + " no cerras :(");        
            }
            
        }else if(n==3){
        
            Query q = new Query( "asigno",new Term[] {new Atom(param2),new Atom(param1)} );
            if(q.hasSolution()){
                txt_area.append(param2 + " SI estas asignado a "+ param1);
            }else{
                txt_area.append(param2 + " NO estas asignado a "+ param1);
            }
            
        }else if(n==4){
        
            Query q = new Query( "escuela_vacaciones",new Term[] {new Atom(param1)} );
            if(q.hasSolution()){
                txt_area.append("En este mes SI ha escuela de vacaciones");
            }else{
                txt_area.append("En este mes NO hay escuela de vacaciones");        
            }
            
        }else if(n==5){
            
            Query q = new Query( "numero_creditos("+param1+",X)");
            Map<String, Term>[] solutions = q.allSolutions();

            for (int i = 0; i < solutions.length; i++) {
                txt_area.append(solutions[i].get("X").toString()+"\n");
            }
            
        }else if(n==6){
        
            Query q = new Query( "curso_simple",new Term[] {new Atom(param1)} );
            if(q.hasSolution()){
                txt_area.append("Este curso consta de 2 horas");
            }else{
                txt_area.append("Este curso NO consta de 2 horas");
            }
            
        }else if(n==7){
        
            Query q = new Query( "curso_doble",new Term[] {new Atom(param1)} );
            if(q.hasSolution()){
                txt_area.append("Este curso consta de 4 horas");
            }else{
                txt_area.append("Este curso NO consta de 4 horas");    
            }
            
        }else if(n==8){
        
            Query q = new Query( "ubicacion_curso("+param1+",Edificio,Salon)");
            Map<String, Term>[] solutions = q.allSolutions();

            txt_area.append("\tCurso: " + param1 + "\n");
            for (int i = 0; i < solutions.length; i++) {
                txt_area.append("Edificio: " + solutions[i].get("Edificio").toString()+"\n");
                txt_area.append("Salon: " + solutions[i].get("Salon").toString()+"\n");
            }
            
        }else if(n==9){

            Query q = new Query( "info_curso("+param1+",Edificio,Salon,EdificioLab,SalonLab,Tipo,Jornada,HorasDiarias,Precio,Cupo)");
            Map<String, Term>[] solutions = q.allSolutions();

            txt_area.append("\tCurso: " + param1 + "\n");
            for (int i = 0; i < solutions.length; i++) {
                txt_area.append("Edificio: " + solutions[i].get("Edificio").toString()+"\n");
                txt_area.append("Salon: " + solutions[i].get("Salon").toString()+"\n");
                txt_area.append("EdificioLab: " + solutions[i].get("EdificioLab").toString()+"\n");
                txt_area.append("SalonLab: " + solutions[i].get("SalonLab").toString()+"\n");
                txt_area.append("Tipo: " + solutions[i].get("Tipo").toString()+"\n");
                txt_area.append("Jornada: " + solutions[i].get("Jornada").toString()+"\n");
                txt_area.append("HorasDiarias: " + solutions[i].get("HorasDiarias").toString()+"\n");
                txt_area.append("Precio: " + solutions[i].get("Precio").toString()+"\n");
                txt_area.append("Cupo: " + solutions[i].get("Cupo").toString()+"\n");
                
            }
            
        }
        
    }
    
    
}
