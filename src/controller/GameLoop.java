package controller;

import model.World;

public abstract class GameLoop {
    private boolean running = true;
    private View view;

    public void setView(View view) {
        this.view = view;
    }

    public void start() {
        new Thread(this::gameLoop).start();
    }

    private void gameLoop() {
        running = true;
        while (true) {
            World world = getWorld();
            if (running) world.update();
            view.render(world);
            delay(15);
        }
    }

    protected abstract World getWorld();

    public void run() {
        running = true;
    }
    
    public void stop() {
        running = false;
    }

    private void delay(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean getRunning() {
        return this.running;
    }


    public interface View {
        void render(World world);
    }
}
