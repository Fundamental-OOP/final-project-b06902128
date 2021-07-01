package map.LV4;

import controller.AI;
import controller.ZombieNormalAI;
import map.mapItems.*;
import model.Map;
import model.World;
import ninja.Ninja;
import zombie.Zombie;

import java.awt.*;

public class ThirdMap extends Map {
    public ThirdMap() {
        this.addItem(new BackGround(new Point(0, 0), new Dimension(1370, 700), 1));
        this.addItem(new Floor(new Point(-10, -500), new Dimension(10, 1300), 2));
        this.addItem(new Floor(new Point(1370, -500), new Dimension(50, 1300), 2));

        this.addItem(new Floor(new Point(0, 600), new Dimension(200, 70), 1));
        this.addItem(new Floor(new Point(200, 600), new Dimension(200, 70), 2));
        this.addItem(new Floor(new Point(400, 600), new Dimension(200, 70), 2));
        this.addItem(new Floor(new Point(600, 600), new Dimension(200, 70), 2));
        this.addItem(new Floor(new Point(800, 600), new Dimension(200, 70), 2));
        this.addItem(new Floor(new Point(1000, 600), new Dimension(200, 70), 2));
        this.addItem(new Floor(new Point(1200, 600), new Dimension(170, 70), 3));
        this.BGM = 6;
    }

    @Override
    public void init(World world){
        super.init(world);
    }
}