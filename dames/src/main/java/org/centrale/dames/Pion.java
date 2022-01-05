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
public class Pion {
    private final String color;
    private Case pos;
    private boolean isDame;

    public Pion(String color, Case c) {
        this.color = color;
        this.pos = new Case(c);
    }

   @Override
    public String toString(){
        return(this.color + "pawn at position" + this.pos);
    }
    
    public String getColor() {
        return color;
    }

    public Case getPos() {
        return pos;
    }

    public boolean isIsDame() {
        return isDame;
    }

    public void setPos(Case pos) {
        this.pos = pos;
    }

    public void setIsDame(boolean isDame) {
        this.isDame = isDame;
    }
    
    
    
}
