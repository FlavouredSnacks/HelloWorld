/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import javafx.scene.paint.Color;

/**
 *
 * @author sofyashipova
 */
public class Lightsaber {
    private String owner = "Sith Kevin Lawrence";
    private int length = 200;
    private Color color = Color.PURPLE;
    
    public void setOwner(String aOwner){
        this.owner = aOwner;
    }
    
    public void setLength(int aLength){
        this.length = aLength;
    }
    
    public void setColor(Color aColor){
        this.color = aColor;
    }
    
    public String getOwner(){
        return this.owner;
    }
    
    public int getLength(){
        return this.length;
    }
    
    public Color getColor(){
        return this.color;
    }
}
