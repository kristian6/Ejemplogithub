/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alamcenmultimedia;

/**
 * @author krist
 */
public class Multimedia {
    
    
    private String  titulo  ;
    private String  autor   ;
    private Formato formato ;
    private int     duracion;

//constructor 
    
    public Multimedia(String titulo, String autor, Formato formato, int duracion){
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
        
    }
//  get = es para devolver datos
    
    public String getTitulo(){
        return this.autor;
    }
    
    public String getAutor(){
        return this.autor;
    }
    
    public Formato getFormato(){
        return this.formato;
    }
    
    public int getDuracion(){
        return this.duracion;
    }
    /*@override se coloca delante un método heredado para sobrecargar
    (modificar) su comportamiento original 
    
    */
    
    @Override
    
    public String toString(){
        String info = "Titulo: "+ this.titulo;
        info+=("\r\nAutor: "+ this.autor);
        info+=("\r\nFormato: " + this.formato.toString());
        info+=("\r\nDuración: "+ this.duracion);
        
        return info;
    }
    //  verificar si el titulo y el autor son iguales
    
    
    public boolean equals(Multimedia m){
        boolean tituloIgual = this.titulo.equals(m.titulo);
        boolean autorIgual = this.autor.equals(m.autor);
        
        return (tituloIgual && autorIgual);
    }
}
