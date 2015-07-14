package com.kilobolt.zombiebird;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.kilobolt.screens.GameScreen;
import com.kilobolt.zbHelpers.AssetLoader;

public class ZBGame extends Game {
    private static final String class_name = "ZBgame";
    
    @Override
    public void create() {
        Gdx.app.log(class_name, "created");
        AssetLoader.load();
        setScreen(new GameScreen());
    }

    @Override
    public void dispose() {
        super.dispose();
        AssetLoader.dispose();
    }
    
    
}
