/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.dames;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Otmane
 */
public class Plateau {
    private static final int TAILLE=9;
    private HashMap Wp;
    private HashMap Bp;
    private ArrayList players;
    private int round;

    public Plateau(){
        Wp = new HashMap<Case,Pion>();
        Bp = new HashMap<Case,Pion>();
        players = new ArrayList<Player>();
        round = 1;
    }
    
    public void init(){
        //White pawns (below)
        for (int j=7;j<TAILLE;j++){
            for (int i=0;i<TAILLE;i++){
                //Position
                Case c = new Case(i,j);
                //Pawn 
                Pion p = new Pion("WHITE", c);
                //Adding Pawn to bord
                Wp.put(c,p);
            }
        }
        //Black pawns (above)
        for (int j=0;j<=1;j++){
            for (int i=0;i<=8;i++){
                //Position
                Case c = new Case(i,j);
                //Pawn 
                Pion p = new Pion("Black", c);
                //Adding Pawn to bord
                Wp.put(c, p);
            }
        }
        
        //Visualising the bord
        this.show();
        
        //Choosing colors
        //White 
        System.out.println("White peaces player");
        System.out.println("What's your name");
        Scanner sc = new Scanner(System.in);  // 
        String name = sc.nextLine();
        Player j1 = new Player(Color.WHITE, name);
        
        //Black
        System.out.println("Black peaces player");
        System.out.println("What's your name");
        String name2 = sc.nextLine();
        Player j2 = new Player(Color.BLACK, name2);
        
    }
    
    public void show(){
        for(int i=0;i<TAILLE;i++){
            System.out.print("|");
            for(int j=0;j<TAILLE; j++){
                Case c = new Case(i,j);
                
                // return to new line 
                if (j==TAILLE-1){
                    System.out.println("");
                }
                // print empty case 
                if (Wp.containsKey(c)==false){
                    System.out.print("-|");
                    if(Bp.containsKey(c)==false){
                        System.out.print("-|");
                    }
                    else {
                        System.out.print("B|");
                    }
                }
                // print poin color
                else{
                    System.out.print("W|");
                }
                
                
            }
        }
    }
    
    // Check if case is empty
    public boolean isCaseEmpty(Case c){
        return (Wp.containsKey(c)==false & Bp.containsKey(c)==false);
    }
    
    // Check if move is permitted
    public boolean isValideMove(Case c){
        if (c.getX()>=0 & c.getX()<=8){
            if (c.getY()>=0 & c.getY()<=8){
                if(isCaseEmpty(c)==true){
                    return true;
                }
                else return false;
            }
            else return false;
        }
        else return false;
    }
    
    //TODO: Move pawn
    //TODO: SAVE Party
    //TODO: LOAD Party
    
}
