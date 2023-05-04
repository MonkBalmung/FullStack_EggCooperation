/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

//@author MENESES-FLOREZ*/

import java.util.ArrayList;
import java.util.List;

public class Tienda
{
    //Atributes
    private String name;
    private String NIF;
    private List<Cliente> listaClientes = new ArrayList();
    private List<Mascota> listaMascotas = new ArrayList();;
    
    //Constructor

    public Tienda() {}

    public Tienda(List<Cliente> listaClientes, List<Mascota> listaMascotas) {
        this.listaClientes = listaClientes;
        this.listaMascotas = listaMascotas;
    }
    
    //Getter & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }
    
    
    
    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Mascota> getListaMascotas() {
        return listaMascotas;
    }

    public void setListaMascotas(List<Mascota> listaMascotas) {
        this.listaMascotas = listaMascotas;
    }
    
    //toString

    @Override
    public String toString() {
        return "Tienda{" + "listaClientes=" + listaClientes + ", listaMascotas=" + listaMascotas + '}';
    }
    
    
}

