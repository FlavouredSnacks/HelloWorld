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
public class Pumpkin {

    private String name = "Jobe";

    public void setName(String aName) {
        this.name = aName;
    }

    public String getName() {
        return this.name;
    }
    private Color color = new Color(163, 255, 0);

    public void setColor(Color acolor) {
        this.color = acolor;
    }

    public Color getColor() {
        return this.color;
    }
    private int weight = 5;

    public void setint(int aweight) {
        this.weight = aweight;
    }

    public int getweight() {
        return this.weight;
    }

}
