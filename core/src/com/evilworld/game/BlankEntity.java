package com.evilworld.game;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class BlankEntity {

	BlankEntity underNeath;

//	DecorationEntity decorationEntity;
	
	public byte lifeCount = 20;

	protected int id = 0;

	public int sx,sy;

	protected int x, y;

	public byte r,g,b;
	public float lightValue = -1;
	public float originalLightValue = -1;

	protected byte visited = 0;

	protected byte hits = 1;

	public int amount = 1;

	public boolean isLight;
	public boolean isDecoration;
	
	public BlankEntity(int x, int y) {
		isLight = false;
		isDecoration = false;
		this.x = x;
		this.y = y;
		underNeath = null;
//		decorationEntity = null;
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[1][0], x << 4, y << 4); // 0,0
	}

}
