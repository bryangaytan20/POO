/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionorientadaobjetos2020.pkg1;


import poo.Audifonos;
import poo.Bocina;
import poo.Cable;
import poo.Cancion;
import poo.Cartera;
import poo.Celular;
import poo.Gato;
import poo.Lapiz;
import poo.Laptop;
import poo.Lentes;
import poo.Lonchera;
import poo.Perfume;
import poo.Perro;
import poo.Persona; 
import poo.Playera;
import poo.Tenis;
import poo.Yoghurt;



/**
 *
 * @author danie
 */
public class ProgramacionOrientadaObjetos20201 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona beto = new Persona("Skabe", 19, 1.8, 92, "Masculino");
        beto.nombre="Carlos";
        beto.edad = 18;
        System.out.println();
        Gato persa = new Gato("baguera", 1, "esfinge");
        persa.nombre="maqui";
        Audifonos xiaomi = new Audifonos("sony", 4500, "negros");
        xiaomi.marca = "xiaomi";
        Cable mobo = new Cable("mobo", 100, "tres metros");
        mobo.precio = 120;
        Celular motorola = new Celular("motorola", 3500, "blanco");
        motorola.marca = "motorola";
        Lapiz amarillo = new Lapiz("baco", 2, "amarillo");
        amarillo.color = "negro";
        Laptop gamer = new Laptop("dell", 13000, "plata");
        gamer.marca = "hp";
        Lentes negros = new Lentes("ockley", 410, "de sol");
        negros.precio = 620;
        Lonchera chica = new Lonchera("jairo", 230, "verde menta");
        chica.color = "morado";
        Bocina grande = new Bocina("JBL", 6000, "rojo");
        grande.color = "azul";
        Cartera piel = new Cartera("azteca", 150, "chica");
        piel.marca = "aldo conti";
        Perfume nautica = new Perfume("nautica", 800, 100);
        nautica.mililitros = 78;
        Perro cafe = new Perro("roberto", 5,"chihuahua");
        cafe.edad = 8;
        Tenis deportivos = new Tenis("adidas", 950, 8);
        deportivos.precio = 798;
        Yoghurt lala = new Yoghurt("lala", "fresa", 45);
        lala.sabor = "mango";
        Cancion  bamba = new Cancion("la bamba", 8, "rock");
        Playera polo = new Playera("XL","gris", "seda");
        
        
        System.out.println();
        
        
        
        
        

        
        
        
        
        
        
        
        
        
        
        
        
   
        
    }
    
}
