package com.spring.springvsc.controllers;



public class Logueo {
  private String nombre;
  private String apellido;
  private String telefono;




  public Logueo(String nombre, String apellido, String telefono) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.telefono = telefono;
  }




  public Logueo() {
  }




  public String getNombre() {
    return nombre;
  }




  public void setNombre(String nombre) {
    this.nombre = nombre;
  }




  public String getApellido() {
    return apellido;
  }




  public void setApellido(String apellido) {
    this.apellido = apellido;
  }




  public String getTelefono() {
    return telefono;
  }




  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  


  


  
}
