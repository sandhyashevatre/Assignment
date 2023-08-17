package application;

import javafx.scene.paint.Color;


public class Tile {
    private int value;
    private Color tileColor;

    public Tile() {
        value = 0; //default 
    }


    public Tile(int number) {
        value = number;
    }

    public int getValue() {
        return value;
    }


    public void setValue(int value) {
        this.value = value;
    }


    public String toString() {
        return "" + value;
    }


    public void setColor() {
        if (this.getValue() == 2) {
            tileColor = Color.rgb(238, 228, 218);
        } else if (this.getValue() == 4) {
            tileColor = Color.rgb(237, 224, 200);
        } else if (this.getValue() == 8) {
            tileColor = Color.rgb(242, 177, 121);
        } else if (this.getValue() == 16) {
            tileColor = Color.rgb(245, 149, 99);
        } else if (this.getValue() == 32) {
            tileColor = Color.rgb(246, 124, 95);
        } else if (this.getValue() == 64) {
            tileColor = Color.rgb(246, 94, 59);
        } else if (this.getValue() == 128) {
            tileColor = Color.rgb(237, 207, 114);
        } else if (this.getValue() == 256) {
            tileColor = Color.rgb(237, 204, 97);
        } else if (this.getValue() == 512) {
            tileColor = Color.rgb(237, 200, 80);
        } else if (this.getValue() == 1024) {
            tileColor = Color.rgb(237, 197, 63);
        } else {
            tileColor = Color.rgb(237, 194, 46);
        }
    }
    public Color getColor() {
        this.setColor();
        return tileColor;
    }
}