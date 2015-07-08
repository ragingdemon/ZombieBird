package com.kilobolt.gameworld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;

public class GameWorld {
    private static final String CLASS_NAME = "GameWorld";
    
    private Rectangle rect = new Rectangle(0, 0, 17, 12);
    
    public GameWorld() {
    }
    
    public void update(float delta){
        Gdx.app.log(CLASS_NAME, "update");
        rect.x++;
        if (rect.x > 137) {
            rect.x = 0;
        }
    }

    public Rectangle getRect() {
        return rect;
    }
}
