package skill;

import java.util.List;
import java.awt.*;

import ninja.Ninja;
import model.World;
import model.Sprite;

public class Holynova extends Skill {
    private final int VALUE = 100;

    public Holynova(Ninja ninja) {
        super(ninja, null);
        this.name = "holynova";
        this.required = new int[] {1, 1, 1, 1};
        this.stop = true;
    }

    public void doEffect() {
        World world = ninja.getWorld();
        List<Sprite> sprites = world.getCurrentMapSprites();
        for (Sprite sprite : sprites) {
            if (sprite != ninja) {
                sprite.onDamaged(null, VALUE, sprite.getGem());
            }
        }
    }

    public String info() {
        return "damage all enemies by " + String.valueOf(VALUE);
    }
}