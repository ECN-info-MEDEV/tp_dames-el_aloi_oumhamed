/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.dames;

/**
 *
 * @author Otmane
 */
public class Player {
    private Color color;
    private String name;

    public Player(Color color, String name) {
        this.color = color;
        this.name = name;
    }
    
    @Override
    public String toString(){
        return(this.name + "plays with " + this.color);
    }
    
    
    public void setColor(Color color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
    
    
}
