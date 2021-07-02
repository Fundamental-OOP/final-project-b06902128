package skill;

import ninja.Ninja;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Skill {
    protected String name;
    protected int[] required;
    protected boolean stop = false;
    protected Ninja ninja;
    private Image background, ninjaImg;
    private String info;

    public Skill(Ninja ninja, String info) {
        this.ninja = ninja;
        this.info = info;
        try {
            background = ImageIO.read(new File("assets/Ninja1/perform.png"));
            ninjaImg = ImageIO.read(new File("assets/Ninja1/attack/10.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String toString() {
        return this.name;
    }

    public int[] getRequired() {
        return this.required;
    }

    public void doEffect(){}

    public void render(Graphics g, int n) {
        g.drawImage(background, 0, 0, 1370, 700, null);
        int a = Math.max(n - 57, 0), b = Math.max(n - 19, 0) - a, c = n - a - b;
        g.drawImage(ninjaImg, 1035 - 16*a - 8*b - 16*c, 200, 300, 300, null);
    }

    public void render(Graphics g) {
        g.setColor(Color.RED);
        Font myFont = new Font ("Courier New", 1, 30);
        g.setFont(myFont);
        g.drawString(this.info, ninja.getX() - 20, ninja.getY() - 50);
    }

    public boolean stop() {
        return this.stop;
    }
}