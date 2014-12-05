/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.awt.Color;

/**
 *
 * @author Slugs
 */
public class Boat {

    private double length = 0.0;
    private double beam = 0.0;
    private String name = "Jordan";
    private Color color = new Color(163, 255, 0);

    public double getLength() {
        return this.length;
    }

    public double getBeam() {
        return this.beam;
    }

    public String getName() {
        return this.name;
    }

    public Color getColor() {
        return this.color;
    }

    public void setLength(double aLength) {
        this.length = aLength;
    }

    public void setBeam(double aBeam) {
        this.beam = aBeam;
    }

    public void setName(String aName) {
        this.name = aName;
    }
    
    public void setColor (Color aColor){
        this.color = aColor;
    }
}
