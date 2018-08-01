package com.evilworld.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.evilworld.game.EvilWorldGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Project Life V1.0";
		config.width = 1280;//1600;//1280;//1600;//1600;
		config.height = 800;//900;//800;//900;//900;//900;
		config.vSyncEnabled = true;
		config.backgroundFPS =120;
		config.foregroundFPS = 120;
		config.fullscreen = !true;
		config.resizable = false;
		new LwjglApplication(new EvilWorldGame(), config);
	}
}
