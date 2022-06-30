/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sueldos;

import Entidades.Vendedor;
import Servicio.VendedorServicio;



public class Sueldos {


    public static void main(String[] args) {
        VendedorServicio v1 = new VendedorServicio();
        Vendedor l1 = v1.altaVendedor();
        v1.SueldoMensual(l1);
        v1.vacaciones(l1);
        
        
        
    }
    
}
