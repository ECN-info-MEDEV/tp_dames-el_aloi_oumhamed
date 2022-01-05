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
public class Case {
    private int x;
    private int y;

    public Case(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Case(Case c){
        this.x = c.x;
        this.y = c.y;
    }
    
    @Override
    public String toString(){
        return("[" + this.x + "," + this.y + "]");
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
