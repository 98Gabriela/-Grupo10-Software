package com.gestion.cuentas.modelo;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="usuarios")
public class Usuario {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;

   // Nuevo campo como clave
   @Column(name = "clave")
   private String clave;

   private String nombre;

   @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
   private Set<Cuenta> cuentas = new HashSet<>();

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getClave() {
      return clave;
   }

   public void setClave(String clave) {
      this.clave = clave;
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public Set<Cuenta> getCuentas() {
      return cuentas;
   }

   public void setCuentas(Set<Cuenta> cuentas) {
      this.cuentas = cuentas;
      for(Cuenta cuenta : cuentas){
         cuenta.setUsuario(this);
      }
   }
}
