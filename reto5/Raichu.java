
package com.mycompany.reto5;

public class Raichu extends Pokemon{
    
    Raichu(String nombre, int nivel, int salud){
        super(nombre,nivel,salud);
    }

    @Override
    public Pokemon evolucionar() {
        return null;
    }

    @Override
    public String gritar() {
        return "Raichu!";
    }
    
}
