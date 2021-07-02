package model;

import monster.Gem;

import java.awt.*;


public abstract class Sprite {
    protected World world;
    protected Point location = new Point();
    protected Direction face = Direction.RIGHT;
    public boolean DeadEnd = false;
    protected int block = 0;

    public abstract void update();

    public abstract void render(Graphics g);

    public abstract void onDamaged(Rectangle damageArea, int damage, Gem gem);

    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public int getX() {
        return getRange().x;
    }

    public int getY() {
        return getRange().y;
    }

    public abstract Rectangle getRange();

    public abstract Dimension getBodyOffset();

    public abstract Dimension getBodySize();

    public Direction getFace() {
        return face;
    }

    public void setFace(Direction face) {
        this.face = face;
    }

    public Rectangle getBody() {
        return getArea(getBodyOffset(), getBodySize());
    }

    public Rectangle getArea(Dimension offset, Dimension size) {
        if (face == Direction.LEFT) {
            Rectangle range = getRange();
            return new Rectangle(new Point(location.x + range.width - offset.width - size.width,
                    offset.height + location.y), size);
        }
        return new Rectangle(new Point(offset.width + location.x,
                offset.height + location.y), size);
    }

    public boolean isAlive() {
        return world != null;
    }

    public Gem getGem() {
        return null;
    }

    public void block(int value) {
        this.block += value;
    }

    public int getBlock() {
        return this.block;
    }
}
