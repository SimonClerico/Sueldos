/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Vendedor;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class VendedorServicio {

    public Vendedor altaVendedor() {

        Vendedor l1 = new Vendedor();
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese nombre del vendedor");
        l1.setNombre(leer.next());
        
        System.out.println("Ingrese el dni del vendedor");
        l1.setDni(leer.nextInt());
        
        System.out.println("Ingrese el sueldo basico del vendedor");
        l1.setSueldoBasico(leer.nextDouble());
        
        System.out.println("Ingrese el dia que comenzo a trabajar");
        int dia = leer.nextInt();
        
        System.out.println("Ingrese el mes en el que comenzo a trabajar");
        int mes = leer.nextInt();
        
        System.out.println("Ingrese el a;o en el que comenzo a trabajar");
        int ano = leer.nextInt();
        
        Date fecha = new Date(ano - 1900, mes - 1, dia);
        l1.setFechaInicio(fecha);
        
        return l1;
        
    }

    public void SueldoMensual(Vendedor l1) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Cuales fueron las ventas totales del vendedor");
        Double ventas = leer.nextDouble();
        l1.setComisiones(ventas * 0.15);
        l1.setSueldoMensual(l1.getSueldoBasico() + l1.getComisiones());
        System.out.println("El sueldo mensual del vendedor: "
                + l1.getNombre() + "Es de $ " + l1.getSueldoMensual());

    }

    public void vacaciones(Vendedor l1) {
        Date hoy = new Date();
        int antiguedad = hoy.getYear() - l1.getFechaInicio().getYear();
        if (antiguedad < 5) {
            System.out.println("Le corresponden 14 dias de vacaciones");

        } else if (antiguedad < 10) {

            System.out.println("Le corresponden 21 dias");
        } else if (antiguedad < 20) {
            System.out.println("Le corresponden 28 dias");
        } else if (antiguedad > 20) {
            System.out.println("Le corresponden 35 dias ");
        } else {
            System.out.println("El empleado tiene vacaciones proporcionales");
            
         }

    }

}
