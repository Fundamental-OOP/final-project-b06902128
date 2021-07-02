package skill;

import ninja.Ninja;

import java.awt.*;

public class Block extends Skill {
    private final int VALUE = 100;

    public Block(Ninja ninja) {
        super(ninja, "Gain Block");
        this.name = "Gain Block";
        this.required = new int[] {2, 0, 0, 0};
    }

    public void doEffect() {
        ninja.block(VALUE);
    }

    public String info() {
        return "block enemies' damage by " + String.valueOf(VALUE);
    }
}