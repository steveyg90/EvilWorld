package com.evilworld.game;

import java.util.Random;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

enum GrassType {
	TOP, LEFT, RIGHT, FLAT
};

// Entity Factory - creates entities on requested type
class EntityFactory {

	static BlankEntity getEntity(BlankEntity type) {


		// Decorations
		if (type instanceof JugEntity )
			return new JugEntity(0, 0);
		if (type instanceof JugEntity2 )
			return new JugEntity2(0, 0);
		if (type instanceof JugMiniEntity )
			return new JugMiniEntity(0, 0);
		if (type instanceof JugMiniEntity2 )
			return new JugMiniEntity2(0, 0);
		if (type instanceof SkullEntity )
			return new SkullEntity(0, 0);
		if (type instanceof RagEntity )
			return new RagEntity(0, 0);
		if (type instanceof LightEntity )
			return new LightEntity(0, 0);

		// Building blocks
		if (type instanceof Block617Entity )
			return new Block617Entity(0, 0);
		if (type instanceof Block804Entity )
			return new Block804Entity(0, 0);
		if (type instanceof Block805Entity )
			return new Block805Entity(0, 0);
		if (type instanceof Block806Entity )
			return new Block806Entity(0, 0);
		if (type instanceof Block807Entity )
			return new Block807Entity(0, 0);
		if (type instanceof Block808Entity )
			return new Block808Entity(0, 0);
		if (type instanceof Block809Entity )
			return new Block809Entity(0, 0);
		if (type instanceof Block810Entity )
			return new Block810Entity(0, 0);
		if (type instanceof Block811Entity )
			return new Block811Entity(0, 0);
		if (type instanceof Block812Entity )
			return new Block812Entity(0, 0);
		if (type instanceof Block813Entity )
			return new Block813Entity(0, 0);
		if (type instanceof Block814Entity )
			return new Block814Entity(0, 0);
		if (type instanceof Block815Entity )
			return new Block815Entity(0, 0);
		if (type instanceof Block816Entity )
			return new Block816Entity(0, 0);
		if (type instanceof Block817Entity )
			return new Block817Entity(0, 0);
		if (type instanceof Block818Entity )
			return new Block818Entity(0, 0);
		if (type instanceof Block819Entity )
			return new Block819Entity(0, 0);
		if (type instanceof Block820Entity )
			return new Block820Entity(0, 0);
		if (type instanceof Block821Entity )
			return new Block821Entity(0, 0);
		if (type instanceof Block822Entity )
			return new Block822Entity(0, 0);
		if (type instanceof Block823Entity )
			return new Block823Entity(0, 0);
		if (type instanceof Block824Entity )
			return new Block824Entity(0, 0);
		if (type instanceof Block825Entity )
			return new Block825Entity(0, 0);
		if (type instanceof Block826Entity )
			return new Block826Entity(0, 0);
		if (type instanceof Block827Entity )
			return new Block827Entity(0, 0);
		if (type instanceof Block828Entity )
			return new Block828Entity(0, 0);
		if (type instanceof Block829Entity )
			return new Block829Entity(0, 0);
		if (type instanceof Block830Entity )
			return new Block830Entity(0, 0);
		if (type instanceof Block831Entity )
			return new Block831Entity(0, 0);
		if (type instanceof Block832Entity )
			return new Block832Entity(0, 0);
		if (type instanceof Block833Entity )
			return new Block833Entity(0, 0);
		if (type instanceof Block834Entity )
			return new Block834Entity(0, 0);
		if (type instanceof Block835Entity )
			return new Block835Entity(0, 0);
		if (type instanceof Block836Entity )
			return new Block836Entity(0, 0);
		if (type instanceof Block837Entity )
			return new Block837Entity(0, 0);
		if (type instanceof Block838Entity )
			return new Block838Entity(0, 0);
		if (type instanceof Block839Entity )
			return new Block839Entity(0, 0);

		if (type instanceof Block636Entity )
			return new Block636Entity(0, 0);

		if (type instanceof Block708Entity )
			return new Block708Entity(0, 0);
		if (type instanceof Block709Entity )
			return new Block709Entity(0, 0);
		if (type instanceof Block710Entity )
			return new Block710Entity(0, 0);
		if (type instanceof Block711Entity )
			return new Block711Entity(0, 0);
		if (type instanceof Block712Entity )
			return new Block712Entity(0, 0);
		if (type instanceof Block713Entity )
			return new Block713Entity(0, 0);
		if (type instanceof Block714Entity )
			return new Block714Entity(0, 0);
		if (type instanceof Block715Entity )
			return new Block715Entity(0, 0);
		if (type instanceof Block716Entity )
			return new Block716Entity(0, 0);
		if (type instanceof Block717Entity )
			return new Block717Entity(0, 0);
		if (type instanceof Block718Entity )
			return new Block718Entity(0, 0);
		if (type instanceof Block719Entity )
			return new Block719Entity(0, 0);
		if (type instanceof Block720Entity )
			return new Block720Entity(0, 0);
		if (type instanceof Block721Entity )
			return new Block721Entity(0, 0);
		if (type instanceof Block722Entity )
			return new Block722Entity(0, 0);
		if (type instanceof Block723Entity )
			return new Block723Entity(0, 0);
		if (type instanceof Block724Entity )
			return new Block724Entity(0, 0);
		if (type instanceof Block725Entity )
			return new Block725Entity(0, 0);
		if (type instanceof Block726Entity )
			return new Block726Entity(0, 0);
		if (type instanceof Block727Entity )
			return new Block727Entity(0, 0);
		if (type instanceof Block728Entity )
			return new Block728Entity(0, 0);
		if (type instanceof Block729Entity )
			return new Block729Entity(0, 0);

		// 32x32 blocks
		if (type instanceof Block730Entity )
			return new Block730Entity(0, 0);


		if (type instanceof Block69Entity )
			return new Block69Entity(0, 0);
		if (type instanceof Block611Entity )
			return new Block611Entity(0, 0);
		if (type instanceof Block612Entity )
			return new Block612Entity(0, 0);
		if (type instanceof Block613Entity )
			return new Block613Entity(0, 0);
		if (type instanceof Block614Entity )
			return new Block614Entity(0, 0);
		if (type instanceof Block615Entity )
			return new Block615Entity(0, 0);
		if (type instanceof Block616Entity )
			return new Block616Entity(0, 0);
		if (type instanceof Block616Entity )
			return new Block617Entity(0, 0);
		if (type instanceof Block611Entity )
			return new Block617Entity(0, 0);
		if (type instanceof Block618Entity )
			return new Block618Entity(0, 0);
		if (type instanceof Block619Entity )
			return new Block619Entity(0, 0);
		if (type instanceof Block620Entity )
			return new Block620Entity(0, 0);
		if (type instanceof Block621Entity )
			return new Block621Entity(0, 0);
		if (type instanceof Block622Entity )
			return new Block622Entity(0, 0);
		if (type instanceof Block623Entity )
			return new Block623Entity(0, 0);
		if (type instanceof Block624Entity )
			return new Block624Entity(0, 0);
		if (type instanceof Block625Entity )
			return new Block625Entity(0, 0);
		if (type instanceof Block626Entity )
			return new Block626Entity(0, 0);
		if (type instanceof Block627Entity )
			return new Block627Entity(0, 0);
		if (type instanceof Block628Entity )
			return new Block628Entity(0, 0);
		if (type instanceof Block629Entity )
			return new Block629Entity(0, 0);
		if (type instanceof Block630Entity )
			return new Block630Entity(0, 0);
		if (type instanceof Block631Entity )
			return new Block631Entity(0, 0);
		if (type instanceof Block632Entity )
			return new Block632Entity(0, 0);
		if (type instanceof Block633Entity )
			return new Block633Entity(0, 0);
		if (type instanceof Block634Entity )
			return new Block634Entity(0, 0);
		if (type instanceof Block635Entity )
			return new Block636Entity(0, 0);
	
		// New blocks 25/11/2016
		if (type instanceof Block014Entity )
			return new Block014Entity(0, 0);
		if (type instanceof Block015Entity )
			return new Block015Entity(0, 0);	
		if (type instanceof Block016Entity )
			return new Block016Entity(0, 0);
		if (type instanceof Block017Entity )
			return new Block017Entity(0, 0);
		if (type instanceof Block018Entity )
			return new Block018Entity(0, 0);
		if (type instanceof Block019Entity )
			return new Block019Entity(0, 0);
		if (type instanceof Block020Entity )
			return new Block020Entity(0, 0);
		if (type instanceof Block021Entity )
			return new Block021Entity(0, 0);
		if (type instanceof Block022Entity )
			return new Block022Entity(0, 0);
		if (type instanceof Block023Entity )
			return new Block023Entity(0, 0);
		if (type instanceof Block024Entity )
			return new Block024Entity(0, 0);
		if (type instanceof Block025Entity )
			return new Block025Entity(0, 0);
		if (type instanceof Block026Entity )
			return new Block026Entity(0, 0);
		if (type instanceof Block027Entity )
			return new Block027Entity(0, 0);
		if (type instanceof Block028Entity )
			return new Block028Entity(0, 0);
		if (type instanceof Block029Entity )
			return new Block029Entity(0, 0);
		if (type instanceof Block030Entity )
			return new Block030Entity(0, 0);
		if (type instanceof Block031Entity )
			return new Block031Entity(0, 0);
		if (type instanceof Block032Entity )
			return new Block032Entity(0, 0);
		if (type instanceof Block033Entity )
			return new Block033Entity(0, 0);
		if (type instanceof Block034Entity )
			return new Block034Entity(0, 0);
		if (type instanceof Block035Entity )
			return new Block035Entity(0, 0);
		if (type instanceof Block036Entity )
			return new Block036Entity(0, 0);
		if (type instanceof Block037Entity )
			return new Block037Entity(0, 0);
		if (type instanceof Block038Entity )
			return new Block038Entity(0, 0);
		if (type instanceof Block039Entity )
			return new Block039Entity(0, 0);
	
		if (type instanceof Block114Entity )
			return new Block114Entity(0, 0);
		if (type instanceof Block115Entity )
			return new Block115Entity(0, 0);	
		if (type instanceof Block116Entity )
			return new Block116Entity(0, 0);
		if (type instanceof Block117Entity )
			return new Block117Entity(0, 0);
		if (type instanceof Block118Entity )
			return new Block118Entity(0, 0);
		if (type instanceof Block119Entity )
			return new Block119Entity(0, 0);
		if (type instanceof Block120Entity )
			return new Block120Entity(0, 0);
		if (type instanceof Block121Entity )
			return new Block121Entity(0, 0);
		if (type instanceof Block122Entity )
			return new Block122Entity(0, 0);
		if (type instanceof Block123Entity )
			return new Block123Entity(0, 0);
		if (type instanceof Block124Entity )
			return new Block124Entity(0, 0);
		if (type instanceof Block125Entity )
			return new Block125Entity(0, 0);
		if (type instanceof Block126Entity )
			return new Block126Entity(0, 0);
		if (type instanceof Block127Entity )
			return new Block127Entity(0, 0);
		if (type instanceof Block128Entity )
			return new Block128Entity(0, 0);
		if (type instanceof Block129Entity )
			return new Block129Entity(0, 0);
		if (type instanceof Block130Entity )
			return new Block130Entity(0, 0);
		if (type instanceof Block131Entity )
			return new Block131Entity(0, 0);
		if (type instanceof Block132Entity )
			return new Block132Entity(0, 0);
		if (type instanceof Block133Entity )
			return new Block133Entity(0, 0);
		if (type instanceof Block134Entity )
			return new Block134Entity(0, 0);
		if (type instanceof Block135Entity )
			return new Block135Entity(0, 0);
		if (type instanceof Block136Entity )
			return new Block136Entity(0, 0);
		if (type instanceof Block137Entity )
			return new Block137Entity(0, 0);
		if (type instanceof Block138Entity )
			return new Block138Entity(0, 0);
		if (type instanceof Block139Entity )
			return new Block139Entity(0, 0);
		
		if (type instanceof Block214Entity )
			return new Block214Entity(0, 0);
		if (type instanceof Block215Entity )
			return new Block215Entity(0, 0);	
		if (type instanceof Block216Entity )
			return new Block216Entity(0, 0);
		if (type instanceof Block217Entity )
			return new Block217Entity(0, 0);
		
		
		
		if (type instanceof OpazEntity )
			return new OpazEntity(0, 0);
		if (type instanceof MaterialCastleBrick )
			return new MaterialCastleBrick(0, 0);
		if (type instanceof BasicWoodenEntity )
			return new BasicWoodenEntity(0, 0);
		if (type instanceof GreyRockEntity )
			return new GreyRockEntity(0, 0);
		if (type instanceof RubyEntity )
			return new RubyEntity(0, 0);
		if (type instanceof PlatinumRockEntity )
			return new PlatinumRockEntity(0, 0);
		if (type instanceof WindowLeftEntity )
			return new WindowLeftEntity(0, 0);
		if (type instanceof WindowRightEntity )
			return new WindowRightEntity(0, 0);
		if (type instanceof WindowTopEntity )
			return new WindowTopEntity(0, 0);
		if (type instanceof WindowBottomEntity )
			return new WindowBottomEntity(0, 0);

		if (type instanceof DirtBlockEntity )
			return new DirtBlockEntity(0, 0);
		if (type instanceof ConcreteOneBlockEntity )
			return new ConcreteOneBlockEntity(0, 0);
		if (type instanceof ConcreteTwoBlockEntity )
			return new ConcreteTwoBlockEntity(0, 0);
		if (type instanceof ConcreteThreeBlockEntity )
			return new ConcreteThreeBlockEntity(0, 0);
		if (type instanceof ConcreteFourBlockEntity )
			return new ConcreteFourBlockEntity(0, 0);
		if (type instanceof ConcreteFiveBlockEntity )
			return new ConcreteFiveBlockEntity(0, 0);
		if (type instanceof ConcreteSixBlockEntity )
			return new ConcreteSixBlockEntity(0, 0);

		if (type instanceof BasicWoodenEntity )
			return new BasicWoodenEntity(0, 0);
		if (type instanceof BasicWoodenEntity )
			return new BasicWoodenEntity(0, 0);
		if (type instanceof BasicWoodenEntity )
			return new BasicWoodenEntity(0, 0);
		if (type instanceof BasicWoodenEntity )
			return new BasicWoodenEntity(0, 0);
		if (type instanceof BasicWoodenEntity )
			return new BasicWoodenEntity(0, 0);
		if (type instanceof BasicWoodenEntity )
			return new BasicWoodenEntity(0, 0);
		if (type instanceof BasicWoodenEntity )
			return new BasicWoodenEntity(0, 0);
		if (type instanceof BasicWoodenEntity )
			return new BasicWoodenEntity(0, 0);
		if (type instanceof BasicWoodenEntity )
			return new BasicWoodenEntity(0, 0);

		if (type instanceof Block801Entity )
			return new Block801Entity(0, 0);
		if (type instanceof Block802Entity )
			return new Block802Entity(0, 0);
		if (type instanceof Block803Entity )
			return new Block803Entity(0, 0);
		if (type instanceof Block804Entity )
			return new Block804Entity(0, 0);
		
		// large blocks
		if(type instanceof Block1300Entity)
			return new Block1300Entity(0,0);
		if(type instanceof Block1301Entity)
			return new Block1301Entity(0,0);
		if(type instanceof Block1302Entity)
			return new Block1302Entity(0,0);
		if(type instanceof Block1303Entity)
			return new Block1303Entity(0,0);
		if(type instanceof Block1400Entity)
			return new Block1400Entity(0,0);
		if(type instanceof Block1401Entity)
			return new Block1401Entity(0,0);
		if(type instanceof Block1402Entity)
			return new Block1402Entity(0,0);
		if(type instanceof Block1403Entity)
			return new Block1403Entity(0,0);
		
		if(type instanceof Block1304Entity)
			return new Block1304Entity(0,0);
		if(type instanceof Block1305Entity)
			return new Block1305Entity(0,0);
		if(type instanceof Block1404Entity)
			return new Block1404Entity(0,0);
		if(type instanceof Block1405Entity)
			return new Block1405Entity(0,0);
		
		if(type instanceof Block1306Entity)
			return new Block1306Entity(0,0);
		if(type instanceof Block1307Entity)
			return new Block1307Entity(0,0);
		if(type instanceof Block1406Entity)
			return new Block1406Entity(0,0);
		if(type instanceof Block1407Entity)
			return new Block1407Entity(0,0);
		
		if(type instanceof Block1308Entity)
			return new Block1308Entity(0,0);
		if(type instanceof Block1309Entity)
			return new Block1309Entity(0,0);
		if(type instanceof Block1408Entity)
			return new Block1408Entity(0,0);
		if(type instanceof Block1409Entity)
			return new Block1409Entity(0,0);
		
		if(type instanceof Block1310Entity)
			return new Block1310Entity(0,0);
		if(type instanceof Block1311Entity)
			return new Block1311Entity(0,0);
		if(type instanceof Block1410Entity)
			return new Block1410Entity(0,0);
		if(type instanceof Block1411Entity)
			return new Block1411Entity(0,0);
		
		if(type instanceof Block1312Entity)
			return new Block1312Entity(0,0);
		if(type instanceof Block1313Entity)
			return new Block1313Entity(0,0);
		if(type instanceof Block1412Entity)
			return new Block1412Entity(0,0);
		if(type instanceof Block1413Entity)
			return new Block1413Entity(0,0);
		
		if(type instanceof Block1314Entity)
			return new Block1314Entity(0,0);
		if(type instanceof Block1315Entity)
			return new Block1315Entity(0,0);
		if(type instanceof Block1414Entity)
			return new Block1414Entity(0,0);
		if(type instanceof Block1415Entity)
			return new Block1415Entity(0,0);
		
		if(type instanceof Block1316Entity)
			return new Block1316Entity(0,0);
		if(type instanceof Block1317Entity)
			return new Block1317Entity(0,0);
		if(type instanceof Block1416Entity)
			return new Block1416Entity(0,0);
		if(type instanceof Block1417Entity)
			return new Block1417Entity(0,0);
		
		if(type instanceof Block1318Entity)
			return new Block1318Entity(0,0);
		if(type instanceof Block1319Entity)
			return new Block1319Entity(0,0);
		if(type instanceof Block1418Entity)
			return new Block1418Entity(0,0);
		if(type instanceof Block1419Entity)
			return new Block1419Entity(0,0);
		
		if(type instanceof Block1320Entity)
			return new Block1320Entity(0,0);
		if(type instanceof Block1321Entity)
			return new Block1321Entity(0,0);
		if(type instanceof Block1420Entity)
			return new Block1420Entity(0,0);
		if(type instanceof Block1421Entity)
			return new Block1421Entity(0,0);
		
		if(type instanceof Block1322Entity)
			return new Block1322Entity(0,0);
		if(type instanceof Block1323Entity)
			return new Block1323Entity(0,0);
		if(type instanceof Block1422Entity)
			return new Block1422Entity(0,0);
		if(type instanceof Block1423Entity)
			return new Block1423Entity(0,0);
		
		
		if(type instanceof Block1324Entity)
			return new Block1324Entity(0,0);
		if(type instanceof Block1325Entity)
			return new Block1325Entity(0,0);
		if(type instanceof Block1424Entity)
			return new Block1424Entity(0,0);
		if(type instanceof Block1425Entity)
			return new Block1425Entity(0,0);

		
		if(type instanceof Block1326Entity)
			return new Block1326Entity(0,0);
		if(type instanceof Block1327Entity)
			return new Block1327Entity(0,0);
		if(type instanceof Block1426Entity)
			return new Block1426Entity(0,0);
		if(type instanceof Block1427Entity)
			return new Block1427Entity(0,0);
		
		if(type instanceof Block1328Entity)
			return new Block1328Entity(0,0);
		if(type instanceof Block1329Entity)
			return new Block1329Entity(0,0);
		if(type instanceof Block1428Entity)
			return new Block1428Entity(0,0);
		if(type instanceof Block1429Entity)
			return new Block1429Entity(0,0);

		
		if(type instanceof Block1330Entity)
			return new Block1330Entity(0,0);
		if(type instanceof Block1331Entity)
			return new Block1331Entity(0,0);
		if(type instanceof Block1430Entity)
			return new Block1430Entity(0,0);
		if(type instanceof Block1431Entity)
			return new Block1431Entity(0,0);
		
		if(type instanceof Block1332Entity)
			return new Block1332Entity(0,0);
		if(type instanceof Block1333Entity)
			return new Block1333Entity(0,0);
		if(type instanceof Block1432Entity)
			return new Block1432Entity(0,0);
		if(type instanceof Block1433Entity)
			return new Block1433Entity(0,0);
		
		if(type instanceof Block1334Entity)
			return new Block1334Entity(0,0);
		if(type instanceof Block1335Entity)
			return new Block1335Entity(0,0);
		if(type instanceof Block1434Entity)
			return new Block1434Entity(0,0);
		if(type instanceof Block1435Entity)
			return new Block1435Entity(0,0);
		
		if(type instanceof Block1336Entity)
			return new Block1336Entity(0,0);
		if(type instanceof Block1337Entity)
			return new Block1337Entity(0,0);
		if(type instanceof Block1436Entity)
			return new Block1436Entity(0,0);
		if(type instanceof Block1437Entity)
			return new Block1437Entity(0,0);
		
		if(type instanceof Block1338Entity)
			return new Block1338Entity(0,0);
		if(type instanceof Block1339Entity)
			return new Block1339Entity(0,0);
		if(type instanceof Block1438Entity)
			return new Block1438Entity(0,0);
		if(type instanceof Block1439Entity)
			return new Block1439Entity(0,0);
		
		return null;
		
	}
}


class BiomDomeEntity extends MaterialBuildingBlock {
	public BiomDomeEntity(int x, int y) {
		super(x, y);
		this.hits = 4;
		this.lightValue = 15;
		originalLightValue = 15;
		id = 38;
		this.sy = 0;
		this.sx = 13;
	}
}


public class LandscapeEntity extends BlankEntity {

	public LandscapeEntity(int x, int y) {
		super(x, y);
		this.lightValue = 1;
		originalLightValue = 1;
		id = 1;
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[3][6], x << 4, y << 4);
	}

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
class LandscapeLeftEntity extends LandscapeEntity {

	public LandscapeLeftEntity(int x, int y) {

		super(x, y);
		this.lightValue = 4;
		originalLightValue = 4;
		id = 1;
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[3][10], x << 4, y << 4);
	}
}

class LandscapeRightEntity extends LandscapeEntity {

	public LandscapeRightEntity(int x, int y) {

		super(x, y);
		this.lightValue = 1;
		originalLightValue = 1;
		id = 1;
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[3][11], x << 4, y << 4);
	}
}
class LandscapeSingle extends LandscapeEntity {

	public LandscapeSingle(int x, int y) {

		super(x, y);
		this.lightValue = 1;
		originalLightValue = 1;
		id = 1;
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[3][9], x << 4, y << 4);
	}
}
class LandscapeEntity2 extends LandscapeEntity {

	public LandscapeEntity2(int x, int y) {

		super(x, y);
		this.lightValue = 	1;
		originalLightValue = 1;
		id = 1;
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[3][7], x << 4, y << 4);
	}
/*
	@Override
	public String toString() {
		return "L";
	}*/
}
class LandscapeEntityRight extends BlankEntity {

	public LandscapeEntityRight(int x, int y) {
		super(x, y);
		this.lightValue = 5;
		originalLightValue = 5;
		id = 2;
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[2][1], x << 4, y << 4);
	}
}

class LandscapeEntityLeft extends BlankEntity {

	public LandscapeEntityLeft(int x, int y) {
		super(x, y);
		this.lightValue = 5;
		originalLightValue = 5;
		id = 3;
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[2][0], x << 4, y << 4);
	}
}

class CaveEntityOutside extends BlankEntity {

	public CaveEntityOutside(int x, int y) {
		super(x, y);
		this.lightValue = 2;
		this.hits = 1;
		originalLightValue = 2;
		id = 4;
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[2][5], x << 4, y << 4);
	}
}

class CaveEntity extends BlankEntity {

	public CaveEntity(int x, int y) {
		super(x, y);
		this.lightValue = 1;
		this.hits = 1;
		originalLightValue = 1;
		id = 4;
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[1][1], x << 4, y << 4);
	}


}

class CaveRightEntity extends CaveEntity {

	public CaveRightEntity(int x, int y) {
		super(x, y);
		id = 5;
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[1][3], x << 4, y << 4);
	}

}

class CaveLeftEntity extends CaveEntity {

	public CaveLeftEntity(int x, int y) {
		super(x, y);
		id = 6;
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[1][2], x << 4, y << 4);
	}

}
class CaveLeftEntity2 extends CaveEntity {

	public CaveLeftEntity2(int x, int y) {
		super(x, y);
		id = 6;
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[1][10], x << 4, y << 4);
	}
}
class CaveRightEntity2 extends CaveEntity {

	public CaveRightEntity2(int x, int y) {
		super(x, y);
		id = 6;
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[1][9], x << 4, y << 4);
	}
}
class CaveRightEntity3 extends CaveEntity {

	public CaveRightEntity3(int x, int y) {
		super(x, y);
		id = 6;
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[1][11], x << 4, y << 4);
	}
}
class CaveTopEntity2 extends CaveEntity {

	public CaveTopEntity2(int x, int y) {
		super(x, y);
		id = 6;
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[1][13], x << 4, y << 4);
	}
}
class CaveLeftEntity3 extends CaveEntity {

	public CaveLeftEntity3(int x, int y) {
		super(x, y);
		id = 6;
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[1][12], x << 4, y << 4);
	}
}

class CaveTopEntity extends CaveEntity {

	public CaveTopEntity(int x, int y) {
		super(x, y);
		id = 7;
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[1][4], x << 4, y << 4);
	}

}

class CaveBottomEntity extends CaveEntity {

	public CaveBottomEntity(int x, int y) {
		super(x, y);
		id = 8;
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[1][5], x << 4, y << 4);
	}

}

class LavaEntity extends BlankEntity {

	public LavaEntity(int x, int y) {
		super(x, y);
		this.lightValue = 2;
		this.hits = 1;
		originalLightValue = 2;
		id = 9;
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[1][1], x << 4, y << 4); // 6,5
	}

}

class RealLavaEntity extends LandscapeEntity {

	public RealLavaEntity(int x, int y) {
		super(x, y);
		this.lightValue = 1;
		this.hits = 1;
		originalLightValue = 1;
		id = 10;
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[2][5], x << 4, y << 4); // 6,5
	}

}


class GrassEntity extends BlankEntity {

	private GrassType type;

	public GrassType getGrassType() {
		return type;
	}

	public GrassEntity(int x, int y, GrassType type) {
		super(x, y);
		this.type = type;
		this.lightValue = 15;
		this.hits = 1;
		originalLightValue = 15;
		id = 11;
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {

		batch.draw(t[0][3], x << 4, y << 4);
	}
}

class WeedsEntity extends BlankEntity {

	public WeedsEntity(int x, int y) {
		super(x, y);
		id = 12;
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[13][0], x << 4, y << 4);
	}

}

class GrassLeftEntity extends GrassEntity {

	public GrassLeftEntity(int x, int y) {
		super(x, y, GrassType.LEFT);
		id = 13;
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[0][2], x << 4, y << 4);
	}

}

class GrassRightEntity extends GrassEntity {

	public GrassRightEntity(int x, int y) {
		super(x, y, GrassType.RIGHT);
		id = 14;
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[0][4], x << 4, y << 4);
	}

}

class GrassTopEntity extends GrassEntity {

	public GrassTopEntity(int x, int y) {
		super(x, y, GrassType.TOP);
		id = 15;
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[0][5], x << 4, y << 4);
	}

}

class CoalEntity extends LandscapeEntity {

	public CoalEntity(int x, int y) {
		super(x, y);
		this.lightValue = 1;
		this.hits = 5;
		originalLightValue = 1;
		id = 16;
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[2][14], x << 4, y << 4); // 0,19
	}

}

class RockEntity extends LandscapeEntity {

	public RockEntity(int x, int y) {
		super(x, y);
		this.hits = 3;
		id = 17;
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[2][13], x << 4, y << 4); // 0,1
	}

}
class RockLeftEntity extends LandscapeEntity {

	public RockLeftEntity(int x, int y) {
		super(x, y);
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[2][26], x << 4, y << 4); // 0,1
	}
}
class RockRightEntity extends LandscapeEntity {

	public RockRightEntity(int x, int y) {
		super(x, y);
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[2][27], x << 4, y << 4); // 0,1
	}
}
class RockBottomEntity extends LandscapeEntity {

	public RockBottomEntity(int x, int y) {
		super(x, y);
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[2][28], x << 4, y << 4); // 0,1
	}
}
class RockTopEntity extends LandscapeEntity {

	public RockTopEntity(int x, int y) {
		super(x, y);
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[2][29], x << 4, y << 4); // 0,1
	}
}
class WaterEntity extends BlankEntity {

	public WaterEntity(int x, int y) {
		super(x, y);
		this.lightValue = 1;
		originalLightValue = 1;
		id = 18;
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[2][0], x << 4, y << 4);
	}
/*
	public String toString() {
		return "WATER";
	}*/
}

class WaterTopEntity extends WaterEntity {

	public WaterTopEntity(int x, int y) {
		super(x, y);
		id = 19;
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[2][0], x << 4, y << 4);
		// batch.draw(t[2][1], x << 4, y << 4);
	}
/*
	public String toString() {
		return "WATER";
	}*/
}

class WaterBottomEntity extends WaterEntity {

	public WaterBottomEntity(int x, int y) {
		super(x, y);
		id = 20;
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[2][0], x << 4, y << 4);
		// batch.draw(t[2][2], x << 4, y << 4);
	}
/*
	public String toString() {
		return "WATER";
	}*/
}



class MoonEntity extends LandscapeEntity {

	public MoonEntity(int x, int y) {
		super(x, y);
		this.hits = 8;
		id = 22;
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[4][0], x << 4, y << 4); // 0,1
	}

}

class MoonEntityCrater extends MoonEntity {

	public MoonEntityCrater(int x, int y) {
		super(x, y);
		this.hits = 8;
		id = 22;
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[4][1], x << 4, y << 4); // 0,1
	}
}

class SnowStageOneEntity extends LandscapeEntity {

	public SnowStageOneEntity(int x, int y) {
		super(x, y);
		this.hits = 1;
		this.lightValue = 15;
		originalLightValue = 15;
		id = 23;
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[4][2], x << 4, y << 4); // 0,1
	}

}

class SnowStageTwoEntity extends LandscapeEntity {

	public SnowStageTwoEntity(int x, int y) {
		super(x, y);
		this.hits = 2;
		id = 24;
		this.lightValue = 15;
		this.originalLightValue = 15;
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[4][3], x << 4, y << 4); // 0,1
	}

}

class SnowStageThreeEntity extends LandscapeEntity {

	public SnowStageThreeEntity(int x, int y) {
		super(x, y);
		this.hits = 3;
		this.lightValue = 15;
		originalLightValue = 15;
		id = 25;
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[4][4], x << 4, y << 4); // 0,1
	}

}

class TreeEntity extends BlankEntity {

	public TreeEntity(int x, int y) {
		super(x, y);
		this.hits = 5;
		this.lightValue = 15;
		originalLightValue = 15;
		id = 26;
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[4][6], x << 4, y << 4); // 0,1
	}

}

class TreeEntityTwo extends TreeEntity {

	public TreeEntityTwo(int x, int y) {
		super(x, y);
		this.hits = 5;
		this.lightValue = 15;
		originalLightValue = 15;
		id = 27;
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[4][7], x << 4, y << 4); // 0,1
	}

}

class TreeEntityBranchRight extends TreeEntity {

	public TreeEntityBranchRight(int x, int y) {
		super(x, y);
		this.hits = 5;
		this.lightValue = 15;
		originalLightValue = 15;
		id = 28;
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[4][8], x << 4, y << 4); // 0,1
	}

}

class TreeEntityBranchLeft extends TreeEntityBranchRight {

	public TreeEntityBranchLeft(int x, int y) {
		super(x, y);
		this.hits = 5;
		this.lightValue = 15;
		originalLightValue = 15;
		id = 29;
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[4][9], x << 4, y << 4); // 0,1
	}

}

class LeafEntityBranchLeft extends TreeEntity {

	public LeafEntityBranchLeft(int x, int y) {
		super(x, y);
		this.hits = 5;
		this.lightValue = 15;
		originalLightValue = 15;
		id = 30;
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[4][11], x << 4, y << 4); // 0,1
	}

}

class LeafEntityBranchRight extends TreeEntity {

	public LeafEntityBranchRight(int x, int y) {
		super(x, y);
		this.hits = 5;
		this.lightValue = 15;
		originalLightValue = 15;
		id = 31;
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[4][10], x << 4, y << 4); // 0,1
	}

}

class LeafEntityBranchTop extends LeafEntityBranchLeft {

	public LeafEntityBranchTop(int x, int y) {
		super(x, y);
		this.hits = 5;
		this.lightValue = 15;
		originalLightValue = 15;
		id = 32;
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[4][12], x << 4, y << 4); // 0,1
	}

}

class FlowerEntity extends TreeEntity {

		Random r = new Random();
		int flower = r.nextInt(4);

		public FlowerEntity(int x, int y) {
		super(x, y);
		this.hits = 5;
		this.lightValue = 15;
		originalLightValue = 15;
		id = 33;
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {

		batch.draw(t[5][flower], x << 4, y << 4); // 0,1
	}

}

abstract class MaterialBuildingWalkable extends MaterialBuildingBlock
{
	public MaterialBuildingWalkable(int x, int y) {
		super(x,y);
	}
}

// Building blocks
abstract class MaterialBuildingBlock extends LandscapeEntity {

	public MaterialBuildingBlock(int x, int y) {
		super(x, y);
	}
	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[sy][sx], x << 4, y << 4); // 0,1
	}
}

class MaterialCastleBrick extends MaterialBuildingBlock {

	public MaterialCastleBrick(int x, int y) {
		super(x, y);
		this.hits = 4;
		this.lightValue = 15;
		originalLightValue = 15;
		id = 34;
		this.sy = 2;
		this.sx = 9;
	}
}
class BasicWoodenEntity extends MaterialBuildingBlock {
	public BasicWoodenEntity(int x, int y) {
		super(x, y);
		this.hits = 1;
		this.lightValue = 15;
		originalLightValue = 15;
		id = 35;
		this.sy = 7;
		this.sx = 0;
	}
}
class OpazEntity extends MaterialBuildingBlock {

	public OpazEntity(int x, int y) {
		super(x, y);
		this.hits = 6;
		this.lightValue = 15;
		originalLightValue = 15;
		id = 36;
		this.sy = 2;
		this.sx = 7;
	}
}
class GreyRockEntity extends MaterialBuildingWalkable {
	public GreyRockEntity(int x, int y) {
		super(x, y);
		this.hits = 3;
		this.lightValue = 15;
		originalLightValue = 15;
		id = 37;
		this.sy = 2;
		this.sx = 6;
	}
}

class RubyEntity extends MaterialBuildingBlock {
	public RubyEntity(int x, int y) {
		super(x, y);
		this.hits = 6;
		this.lightValue = 15;
		originalLightValue = 15;
		id = 38;
		this.sy = 7;
		this.sx = 1;
	}
}
class PlatinumRockEntity extends MaterialBuildingBlock {
	public PlatinumRockEntity(int x, int y) {
		super(x, y);
		this.hits = 6;
		this.lightValue = 15;
		originalLightValue = 15;
		id = 39;
		this.sy = 7;
		this.sx = 2;
	}
}
class WindowLeftEntity extends MaterialBuildingBlock {

	public WindowLeftEntity(int x, int y) {
		super(x, y);
		this.hits = 1;
		this.lightValue = 12;
		originalLightValue = 12;
		id = 40;
		this.sy = 7;
		this.sx = 3;
	}
}
class WindowRightEntity extends MaterialBuildingBlock {

	public WindowRightEntity(int x, int y) {
		super(x, y);
		this.hits = 1;
		this.lightValue = 12;
		originalLightValue = 12;
		id = 41;
		this.sy = 7;
		this.sx = 5;
	}
}
class WindowTopEntity extends MaterialBuildingBlock {

	public WindowTopEntity(int x, int y) {
		super(x, y);
		this.hits = 1;
		this.lightValue = 12;
		originalLightValue = 12;
		id = 42;
		this.sy = 7;
		this.sx = 4;

	}
}
class WindowBottomEntity extends MaterialBuildingBlock {

	public WindowBottomEntity(int x, int y) {
		super(x, y);
		this.hits = 1;
		this.lightValue = 12;
		originalLightValue = 12;
		id = 43;
		this.sy = 7;
		this.sx = 6;

	}
}
class DirtBlockEntity extends MaterialBuildingBlock {
	public DirtBlockEntity(int x, int y) {
		super(x, y);this.sy = 6;this.sx = 0;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[sy][sx], x << 4, y << 4); // 0,1
	}
}
class ConcreteOneBlockEntity extends MaterialBuildingBlock {
	public ConcreteOneBlockEntity(int x, int y) {
		super(x, y);this.sy = 6;this.sx = 3;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[sy][sx], x << 4, y << 4); // 0,1
	}
}
class ConcreteTwoBlockEntity extends MaterialBuildingBlock {
	public ConcreteTwoBlockEntity(int x, int y) {
		super(x, y);this.sy = 6;this.sx = 4;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class ConcreteThreeBlockEntity extends MaterialBuildingBlock {
	public ConcreteThreeBlockEntity(int x, int y) {
		super(x, y);this.sy = 6;this.sx = 5;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class ConcreteFourBlockEntity extends MaterialBuildingBlock {
	public ConcreteFourBlockEntity(int x, int y) {
		super(x, y);this.sy = 6;this.sx = 6;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class ConcreteFiveBlockEntity extends MaterialBuildingBlock {
	public ConcreteFiveBlockEntity(int x, int y) {
		super(x, y);this.sy = 6;this.sx = 7;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class ConcreteSixBlockEntity extends MaterialBuildingBlock {
	public ConcreteSixBlockEntity(int x, int y) {
		super(x, y);this.sy = 6;this.sx = 8;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block69Entity extends MaterialBuildingBlock {
	public Block69Entity(int x, int y) {
		super(x, y);this.sy = 6;this.sx = 9;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block611Entity extends MaterialBuildingBlock {
	public Block611Entity(int x, int y) {
		super(x, y);this.sy = 6;this.sx = 11;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block612Entity extends MaterialBuildingBlock {
	public Block612Entity(int x, int y) {
		super(x, y);this.sy = 6;this.sx = 12;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block613Entity extends MaterialBuildingBlock {
	public Block613Entity(int x, int y) {
		super(x, y);this.sy = 6;this.sx = 13;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block614Entity extends MaterialBuildingBlock {
	public Block614Entity(int x, int y) {
		super(x, y);this.sy = 6;this.sx = 14;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block615Entity extends MaterialBuildingBlock {
	public Block615Entity(int x, int y) {
		super(x, y);this.sy = 6;this.sx = 15;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block616Entity extends MaterialBuildingBlock {
	public Block616Entity(int x, int y) {
		super(x, y);this.sy = 6;this.sx = 16;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block617Entity extends MaterialBuildingBlock {
	public Block617Entity(int x, int y) {
		super(x, y);this.sy = 6;this.sx = 17;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block618Entity extends MaterialBuildingBlock {
	public Block618Entity(int x, int y) {
		super(x, y);this.sy = 6;this.sx = 18;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block619Entity extends MaterialBuildingBlock {
	public Block619Entity(int x, int y) {
		super(x, y);this.sy = 6;this.sx = 19;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block620Entity extends MaterialBuildingBlock {
	public Block620Entity(int x, int y) {
		super(x, y);this.sy = 6;this.sx = 20;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block621Entity extends MaterialBuildingBlock {
	public Block621Entity(int x, int y) {
		super(x, y);this.sy = 6;this.sx = 21;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block622Entity extends MaterialBuildingBlock {
	public Block622Entity(int x, int y) {
		super(x, y);this.sy = 6;this.sx = 22;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block623Entity extends MaterialBuildingBlock {
	public Block623Entity(int x, int y) {
		super(x, y);this.sy = 6;this.sx = 23;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block624Entity extends MaterialBuildingBlock {
	public Block624Entity(int x, int y) {
		super(x, y);this.sy = 6;this.sx = 24;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block625Entity extends MaterialBuildingBlock {
	public Block625Entity(int x, int y) {
		super(x, y);this.sy = 6;this.sx = 25;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block626Entity extends MaterialBuildingBlock {
	public Block626Entity(int x, int y) {
		super(x, y);this.sy = 6;this.sx = 26;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block627Entity extends MaterialBuildingBlock {
	public Block627Entity(int x, int y) {
		super(x, y);this.sy = 6;this.sx = 27;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block628Entity extends MaterialBuildingBlock {
	public Block628Entity(int x, int y) {
		super(x, y);this.sy = 6;this.sx = 28;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block629Entity extends MaterialBuildingBlock {
	public Block629Entity(int x, int y) {
		super(x, y);this.sy = 6;this.sx = 29;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block630Entity extends MaterialBuildingBlock {
	public Block630Entity(int x, int y) {
		super(x, y);this.sy = 6;this.sx = 30;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block631Entity extends MaterialBuildingBlock {
	public Block631Entity(int x, int y) {
		super(x, y);this.sy = 6;this.sx = 31;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block632Entity extends MaterialBuildingBlock {
	public Block632Entity(int x, int y) {
		super(x, y);this.sy = 6;this.sx = 32;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block633Entity extends MaterialBuildingBlock {
	public Block633Entity(int x, int y) {
		super(x, y);this.sy = 6;this.sx = 33;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block634Entity extends MaterialBuildingBlock {
	public Block634Entity(int x, int y) {
		super(x, y);this.sy = 6;this.sx = 34;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block635Entity extends MaterialBuildingBlock {
	public Block635Entity(int x, int y) {
		super(x, y);this.sy = 6;this.sx = 35;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block636Entity extends MaterialBuildingBlock {
	public Block636Entity(int x, int y) {
		super(x, y);this.sy = 6;this.sx = 36;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block708Entity extends MaterialBuildingBlock {
	public Block708Entity(int x, int y) {
		super(x, y);this.sy = 7;this.sx = 8;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block709Entity extends MaterialBuildingBlock {
	public Block709Entity(int x, int y) {
		super(x, y);this.sy = 7;this.sx = 9;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block710Entity extends MaterialBuildingBlock {
	public Block710Entity(int x, int y) {
		super(x, y);this.sy = 7;this.sx = 10;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block711Entity extends MaterialBuildingBlock {
	public Block711Entity(int x, int y) {
		super(x, y);this.sy = 7;this.sx = 11;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block712Entity extends MaterialBuildingBlock {
	public Block712Entity(int x, int y) {
		super(x, y);this.sy = 7;this.sx = 12;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block713Entity extends MaterialBuildingBlock {
	public Block713Entity(int x, int y) {
		super(x, y);this.sy = 7;this.sx = 13;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block714Entity extends MaterialBuildingBlock {
	public Block714Entity(int x, int y) {
		super(x, y);this.sy = 7;this.sx = 14;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block715Entity extends MaterialBuildingBlock {
	public Block715Entity(int x, int y) {
		super(x, y);this.sy = 7;this.sx = 15;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block716Entity extends MaterialBuildingBlock {
	public Block716Entity(int x, int y) {
		super(x, y);this.sy = 7;this.sx = 16;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block717Entity extends MaterialBuildingBlock {
	public Block717Entity(int x, int y) {
		super(x, y);this.sy = 7;this.sx = 17;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block718Entity extends MaterialBuildingBlock {
	public Block718Entity(int x, int y) {
		super(x, y);this.sy = 7;this.sx = 18;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block719Entity extends MaterialBuildingBlock {
	public Block719Entity(int x, int y) {
		super(x, y);this.sy = 7;this.sx = 19;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block720Entity extends MaterialBuildingBlock {
	public Block720Entity(int x, int y) {
		super(x, y);this.sy = 7;this.sx = 20;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block721Entity extends MaterialBuildingBlock {
	public Block721Entity(int x, int y) {
		super(x, y);this.sy = 7;this.sx = 21;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block722Entity extends MaterialBuildingBlock {
	public Block722Entity(int x, int y) {
		super(x, y);this.sy = 7;this.sx = 22;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block723Entity extends MaterialBuildingBlock {
	public Block723Entity(int x, int y) {
		super(x, y);this.sy = 7;this.sx = 23;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block724Entity extends MaterialBuildingBlock {
	public Block724Entity(int x, int y) {
		super(x, y);this.sy = 7;this.sx = 24;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block725Entity extends MaterialBuildingBlock {
	public Block725Entity(int x, int y) {
		super(x, y);this.sy = 7;this.sx = 25;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block726Entity extends MaterialBuildingBlock {
	public Block726Entity(int x, int y) {
		super(x, y);this.sy = 7;this.sx = 26;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block727Entity extends MaterialBuildingBlock {
	public Block727Entity(int x, int y) {
		super(x, y);this.sy = 7;this.sx = 27;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block728Entity extends MaterialBuildingBlock {
	public Block728Entity(int x, int y) {
		super(x, y);this.sy = 7;this.sx = 28;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block729Entity extends MaterialBuildingBlock {
	public Block729Entity(int x, int y) {
		super(x, y);this.sy = 7;this.sx = 29;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}


class Block730Entity extends MaterialBuildingBlock {
	public Block730Entity(int x, int y) {
		super(x, y);this.sy = 7;this.sx = 30;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}


class Block801Entity extends MaterialBuildingBlock {
	public Block801Entity(int x, int y) {
		super(x, y);this.sy = 8;this.sx = 1;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block802Entity extends MaterialBuildingBlock {
	public Block802Entity(int x, int y) {
		super(x, y);this.sy = 8;this.sx = 2;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block803Entity extends MaterialBuildingBlock {
	public Block803Entity(int x, int y) {
		super(x, y);this.sy = 8;this.sx = 3;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block804Entity extends MaterialBuildingBlock {
	public Block804Entity(int x, int y) {
		super(x, y);this.sy = 8;this.sx = 4;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block805Entity extends MaterialBuildingBlock {
	public Block805Entity(int x, int y) {
		super(x, y);this.sy = 8;this.sx = 5;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block806Entity extends MaterialBuildingBlock {
	public Block806Entity(int x, int y) {
		super(x, y);this.sy = 8;this.sx = 6;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block807Entity extends MaterialBuildingBlock {
	public Block807Entity(int x, int y) {
		super(x, y);this.sy = 8;this.sx = 7;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block808Entity extends MaterialBuildingBlock {
	public Block808Entity(int x, int y) {
		super(x, y);this.sy = 8;this.sx = 8;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block809Entity extends MaterialBuildingBlock {
	public Block809Entity(int x, int y) {
		super(x, y);this.sy = 8;this.sx = 9;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block810Entity extends MaterialBuildingBlock {
	public Block810Entity(int x, int y) {
		super(x, y);this.sy = 8;this.sx = 10;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block811Entity extends MaterialBuildingBlock {
	public Block811Entity(int x, int y) {
		super(x, y);this.sy = 8;this.sx = 11;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block812Entity extends MaterialBuildingBlock {
	public Block812Entity(int x, int y) {
		super(x, y);this.sy = 8;this.sx = 12;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block813Entity extends MaterialBuildingBlock {
	public Block813Entity(int x, int y) {
		super(x, y);this.sy = 8;this.sx = 13;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block814Entity extends MaterialBuildingBlock {
	public Block814Entity(int x, int y) {
		super(x, y);this.sy = 8;this.sx = 14;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block815Entity extends MaterialBuildingBlock {
	public Block815Entity(int x, int y) {
		super(x, y);this.sy = 8;this.sx = 15;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block816Entity extends MaterialBuildingBlock {
	public Block816Entity(int x, int y) {
		super(x, y);this.sy = 8;this.sx = 16;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block817Entity extends MaterialBuildingBlock {
	public Block817Entity(int x, int y) {
		super(x, y);this.sy = 8;this.sx = 17;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block818Entity extends MaterialBuildingBlock {
	public Block818Entity(int x, int y) {
		super(x, y);this.sy = 8;this.sx = 18;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block819Entity extends MaterialBuildingBlock {
	public Block819Entity(int x, int y) {
		super(x, y);this.sy = 8;this.sx = 19;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block820Entity extends MaterialBuildingBlock {
	public Block820Entity(int x, int y) {
		super(x, y);this.sy = 8;this.sx = 20;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block821Entity extends MaterialBuildingBlock {
	public Block821Entity(int x, int y) {
		super(x, y);this.sy = 8;this.sx = 21;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block822Entity extends MaterialBuildingBlock {
	public Block822Entity(int x, int y) {
		super(x, y);this.sy = 8;this.sx = 22;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block823Entity extends MaterialBuildingBlock {
	public Block823Entity(int x, int y) {
		super(x, y);this.sy = 8;this.sx = 23;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block824Entity extends MaterialBuildingBlock {
	public Block824Entity(int x, int y) {
		super(x, y);this.sy = 8;this.sx = 24;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block825Entity extends MaterialBuildingBlock {
	public Block825Entity(int x, int y) {
		super(x, y);this.sy = 8;this.sx = 25;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block826Entity extends MaterialBuildingBlock {
	public Block826Entity(int x, int y) {
		super(x, y);this.sy = 8;this.sx = 26;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block827Entity extends MaterialBuildingBlock {
	public Block827Entity(int x, int y) {
		super(x, y);this.sy = 8;this.sx = 27;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block828Entity extends MaterialBuildingBlock {
	public Block828Entity(int x, int y) {
		super(x, y);this.sy = 8;this.sx = 28;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block829Entity extends MaterialBuildingBlock {
	public Block829Entity(int x, int y) {
		super(x, y);this.sy = 8;this.sx = 29;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block830Entity extends MaterialBuildingBlock {
	public Block830Entity(int x, int y) {
		super(x, y);this.sy = 8;this.sx = 30;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block831Entity extends MaterialBuildingBlock {
	public Block831Entity(int x, int y) {
		super(x, y);this.sy = 8;this.sx = 31;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block832Entity extends MaterialBuildingBlock {
	public Block832Entity(int x, int y) {
		super(x, y);this.sy = 8;this.sx = 32;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block833Entity extends MaterialBuildingBlock {
	public Block833Entity(int x, int y) {
		super(x, y);this.sy = 8;this.sx = 33;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block834Entity extends MaterialBuildingBlock {
	public Block834Entity(int x, int y) {
		super(x, y);this.sy = 8;this.sx = 34;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block835Entity extends MaterialBuildingBlock {
	public Block835Entity(int x, int y) {
		super(x, y);this.sy = 8;this.sx = 35;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block836Entity extends MaterialBuildingBlock {
	public Block836Entity(int x, int y) {
		super(x, y);this.sy = 8;this.sx = 36;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block837Entity extends MaterialBuildingBlock {
	public Block837Entity(int x, int y) {
		super(x, y);this.sy = 8;this.sx = 37;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block838Entity extends MaterialBuildingBlock {
	public Block838Entity(int x, int y) {
		super(x, y);this.sy = 8;this.sx = 38;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block839Entity extends MaterialBuildingBlock {
	public Block839Entity(int x, int y) {
		super(x, y);this.sy = 8;this.sx = 39;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}


// Large blocks on tab 6
abstract class LargeMaterialBuildingBlock extends LandscapeEntity
{
	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[sy][sx], x << 4, y << 4,16,16); // 0,1
	//	batch.draw(t[sy][sx+1], x+1 << 4, y << 4,16,16); // 0,1
	}

	public LargeMaterialBuildingBlock(int x, int y) {
		super(x,y);
	}
}

// Large block 1
class Block1300Entity extends LargeMaterialBuildingBlock {
	public Block1300Entity(int x, int y) {
		super(x, y);this.sy =13;this.sx = 0;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1301Entity extends LargeMaterialBuildingBlock {
	public Block1301Entity(int x, int y) {
		super(x, y);this.sy =13;this.sx = 1;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1400Entity extends LargeMaterialBuildingBlock {
	public Block1400Entity(int x, int y) {
		super(x, y);this.sy =14;this.sx = 0;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1401Entity extends LargeMaterialBuildingBlock {
	public Block1401Entity(int x, int y) {
		super(x, y);this.sy =14;this.sx = 1;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}

// Large block 2
class Block1302Entity extends LargeMaterialBuildingBlock {
	public Block1302Entity(int x, int y) {
		super(x, y);this.sy =13;this.sx = 2;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1303Entity extends LargeMaterialBuildingBlock {
	public Block1303Entity(int x, int y) {
		super(x, y);this.sy =13;this.sx = 3;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1402Entity extends LargeMaterialBuildingBlock {
	public Block1402Entity(int x, int y) {
		super(x, y);this.sy =14;this.sx = 2;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1403Entity extends LargeMaterialBuildingBlock {
	public Block1403Entity(int x, int y) {
		super(x, y);this.sy =14;this.sx = 3;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}


//Large block 3
class Block1304Entity extends LargeMaterialBuildingBlock {
	public Block1304Entity(int x, int y) {
		super(x, y);this.sy =13;this.sx = 4;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1305Entity extends LargeMaterialBuildingBlock {
	public Block1305Entity(int x, int y) {
		super(x, y);this.sy =13;this.sx = 5;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1404Entity extends LargeMaterialBuildingBlock {
	public Block1404Entity(int x, int y) {
		super(x, y);this.sy =14;this.sx = 4;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1405Entity extends LargeMaterialBuildingBlock {
	public Block1405Entity(int x, int y) {
		super(x, y);this.sy =14;this.sx = 5;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}


//Large block 3
class Block1306Entity extends LargeMaterialBuildingBlock {
	public Block1306Entity(int x, int y) {
		super(x, y);this.sy =13;this.sx = 6;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1307Entity extends LargeMaterialBuildingBlock {
	public Block1307Entity(int x, int y) {
		super(x, y);this.sy =13;this.sx = 7;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1406Entity extends LargeMaterialBuildingBlock {
	public Block1406Entity(int x, int y) {
		super(x, y);this.sy =14;this.sx = 6;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1407Entity extends LargeMaterialBuildingBlock {
	public Block1407Entity(int x, int y) {
		super(x, y);this.sy =14;this.sx = 7;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
//Large block 3
class Block1308Entity extends LargeMaterialBuildingBlock {
	public Block1308Entity(int x, int y) {
		super(x, y);this.sy =13;this.sx = 8;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1309Entity extends LargeMaterialBuildingBlock {
	public Block1309Entity(int x, int y) {
		super(x, y);this.sy =13;this.sx = 9;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1408Entity extends LargeMaterialBuildingBlock {
	public Block1408Entity(int x, int y) {
		super(x, y);this.sy =14;this.sx = 8;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1409Entity extends LargeMaterialBuildingBlock {
	public Block1409Entity(int x, int y) {
		super(x, y);this.sy =14;this.sx = 9;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
//Large block 3
class Block1310Entity extends LargeMaterialBuildingBlock {
	public Block1310Entity(int x, int y) {
		super(x, y);this.sy =13;this.sx = 10;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1311Entity extends LargeMaterialBuildingBlock {
	public Block1311Entity(int x, int y) {
		super(x, y);this.sy =13;this.sx = 11;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1410Entity extends LargeMaterialBuildingBlock {
	public Block1410Entity(int x, int y) {
		super(x, y);this.sy =14;this.sx = 10;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1411Entity extends LargeMaterialBuildingBlock {
	public Block1411Entity(int x, int y) {
		super(x, y);this.sy =14;this.sx = 11;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
//Large block 3
class Block1312Entity extends LargeMaterialBuildingBlock {
	public Block1312Entity(int x, int y) {
		super(x, y);this.sy =13;this.sx = 12;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1313Entity extends LargeMaterialBuildingBlock {
	public Block1313Entity(int x, int y) {
		super(x, y);this.sy =13;this.sx = 13;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1412Entity extends LargeMaterialBuildingBlock {
	public Block1412Entity(int x, int y) {
		super(x, y);this.sy =14;this.sx = 12;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1413Entity extends LargeMaterialBuildingBlock {
	public Block1413Entity(int x, int y) {
		super(x, y);this.sy =14;this.sx = 13;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
//Large block 3
class Block1314Entity extends LargeMaterialBuildingBlock {
	public Block1314Entity(int x, int y) {
		super(x, y);this.sy =13;this.sx = 14;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1315Entity extends LargeMaterialBuildingBlock {
	public Block1315Entity(int x, int y) {
		super(x, y);this.sy =13;this.sx = 15;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1414Entity extends LargeMaterialBuildingBlock {
	public Block1414Entity(int x, int y) {
		super(x, y);this.sy =14;this.sx = 14;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1415Entity extends LargeMaterialBuildingBlock {
	public Block1415Entity(int x, int y) {
		super(x, y);this.sy =14;this.sx = 15;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
//Large block 3
class Block1316Entity extends LargeMaterialBuildingBlock {
	public Block1316Entity(int x, int y) {
		super(x, y);this.sy =13;this.sx = 16;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1317Entity extends LargeMaterialBuildingBlock {
	public Block1317Entity(int x, int y) {
		super(x, y);this.sy =13;this.sx = 17;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1416Entity extends LargeMaterialBuildingBlock {
	public Block1416Entity(int x, int y) {
		super(x, y);this.sy =14;this.sx = 16;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1417Entity extends LargeMaterialBuildingBlock {
	public Block1417Entity(int x, int y) {
		super(x, y);this.sy =14;this.sx = 17;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
//Large block 3
class Block1318Entity extends LargeMaterialBuildingBlock {
	public Block1318Entity(int x, int y) {
		super(x, y);this.sy =13;this.sx = 18;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1319Entity extends LargeMaterialBuildingBlock {
	public Block1319Entity(int x, int y) {
		super(x, y);this.sy =13;this.sx = 19;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1418Entity extends LargeMaterialBuildingBlock {
	public Block1418Entity(int x, int y) {
		super(x, y);this.sy =14;this.sx = 18;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1419Entity extends LargeMaterialBuildingBlock {
	public Block1419Entity(int x, int y) {
		super(x, y);this.sy =14;this.sx = 19;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
//Large block 3
class Block1320Entity extends LargeMaterialBuildingBlock {
	public Block1320Entity(int x, int y) {
		super(x, y);this.sy =13;this.sx = 20;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1321Entity extends LargeMaterialBuildingBlock {
	public Block1321Entity(int x, int y) {
		super(x, y);this.sy =13;this.sx = 21;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1420Entity extends LargeMaterialBuildingBlock {
	public Block1420Entity(int x, int y) {
		super(x, y);this.sy =14;this.sx = 20;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1421Entity extends LargeMaterialBuildingBlock {
	public Block1421Entity(int x, int y) {
		super(x, y);this.sy =14;this.sx = 21;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}

//Large block 3
class Block1322Entity extends LargeMaterialBuildingBlock {
	public Block1322Entity(int x, int y) {
		super(x, y);this.sy =13;this.sx = 22;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1323Entity extends LargeMaterialBuildingBlock {
	public Block1323Entity(int x, int y) {
		super(x, y);this.sy =13;this.sx = 23;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1422Entity extends LargeMaterialBuildingBlock {
	public Block1422Entity(int x, int y) {
		super(x, y);this.sy =14;this.sx = 22;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1423Entity extends LargeMaterialBuildingBlock {
	public Block1423Entity(int x, int y) {
		super(x, y);this.sy =14;this.sx = 23;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
//Large block 3
class Block1324Entity extends LargeMaterialBuildingBlock {
	public Block1324Entity(int x, int y) {
		super(x, y);this.sy =13;this.sx = 24;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1325Entity extends LargeMaterialBuildingBlock {
	public Block1325Entity(int x, int y) {
		super(x, y);this.sy =13;this.sx = 25;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1424Entity extends LargeMaterialBuildingBlock {
	public Block1424Entity(int x, int y) {
		super(x, y);this.sy =14;this.sx = 24;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1425Entity extends LargeMaterialBuildingBlock {
	public Block1425Entity(int x, int y) {
		super(x, y);this.sy =14;this.sx = 25;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}

//Large block 3
class Block1326Entity extends LargeMaterialBuildingBlock {
	public Block1326Entity(int x, int y) {
		super(x, y);this.sy =13;this.sx = 26;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1327Entity extends LargeMaterialBuildingBlock {
	public Block1327Entity(int x, int y) {
		super(x, y);this.sy =13;this.sx = 27;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1426Entity extends LargeMaterialBuildingBlock {
	public Block1426Entity(int x, int y) {
		super(x, y);this.sy =14;this.sx = 26;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1427Entity extends LargeMaterialBuildingBlock {
	public Block1427Entity(int x, int y) {
		super(x, y);this.sy =14;this.sx = 27;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
//Large block 3
class Block1328Entity extends LargeMaterialBuildingBlock {
	public Block1328Entity(int x, int y) {
		super(x, y);this.sy =13;this.sx = 28;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1329Entity extends LargeMaterialBuildingBlock {
	public Block1329Entity(int x, int y) {
		super(x, y);this.sy =13;this.sx = 29;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1428Entity extends LargeMaterialBuildingBlock {
	public Block1428Entity(int x, int y) {
		super(x, y);this.sy =14;this.sx = 28;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1429Entity extends LargeMaterialBuildingBlock {
	public Block1429Entity(int x, int y) {
		super(x, y);this.sy =14;this.sx = 29;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}

//Large block 3
class Block1330Entity extends LargeMaterialBuildingBlock {
	public Block1330Entity(int x, int y) {
		super(x, y);this.sy =13;this.sx = 30;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1331Entity extends LargeMaterialBuildingBlock {
	public Block1331Entity(int x, int y) {
		super(x, y);this.sy =13;this.sx = 31;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1430Entity extends LargeMaterialBuildingBlock {
	public Block1430Entity(int x, int y) {
		super(x, y);this.sy =14;this.sx = 30;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1431Entity extends LargeMaterialBuildingBlock {
	public Block1431Entity(int x, int y) {
		super(x, y);this.sy =14;this.sx = 31;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
//Large block 3
class Block1332Entity extends LargeMaterialBuildingBlock {
	public Block1332Entity(int x, int y) {
		super(x, y);this.sy =13;this.sx = 32;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1333Entity extends LargeMaterialBuildingBlock {
	public Block1333Entity(int x, int y) {
		super(x, y);this.sy =13;this.sx = 33;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1432Entity extends LargeMaterialBuildingBlock {
	public Block1432Entity(int x, int y) {
		super(x, y);this.sy =14;this.sx = 32;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1433Entity extends LargeMaterialBuildingBlock {
	public Block1433Entity(int x, int y) {
		super(x, y);this.sy =14;this.sx = 33;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}


//Large block 3
class Block1334Entity extends LargeMaterialBuildingBlock {
	public Block1334Entity(int x, int y) {
		super(x, y);this.sy =13;this.sx = 34;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1335Entity extends LargeMaterialBuildingBlock {
	public Block1335Entity(int x, int y) {
		super(x, y);this.sy =13;this.sx = 35;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1434Entity extends LargeMaterialBuildingBlock {
	public Block1434Entity(int x, int y) {
		super(x, y);this.sy =14;this.sx = 34;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1435Entity extends LargeMaterialBuildingBlock {
	public Block1435Entity(int x, int y) {
		super(x, y);this.sy =14;this.sx = 35;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}

//Large block 3
class Block1336Entity extends LargeMaterialBuildingBlock {
	public Block1336Entity(int x, int y) {
		super(x, y);this.sy =13;this.sx = 36;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1337Entity extends LargeMaterialBuildingBlock {
	public Block1337Entity(int x, int y) {
		super(x, y);this.sy =13;this.sx = 37;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1436Entity extends LargeMaterialBuildingBlock {
	public Block1436Entity(int x, int y) {
		super(x, y);this.sy =14;this.sx = 36;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1437Entity extends LargeMaterialBuildingBlock {
	public Block1437Entity(int x, int y) {
		super(x, y);this.sy =14;this.sx = 37;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
//Large block 3
class Block1338Entity extends LargeMaterialBuildingBlock {
	public Block1338Entity(int x, int y) {
		super(x, y);this.sy =13;this.sx = 38;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1339Entity extends LargeMaterialBuildingBlock {
	public Block1339Entity(int x, int y) {
		super(x, y);this.sy =13;this.sx = 39;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1438Entity extends LargeMaterialBuildingBlock {
	public Block1438Entity(int x, int y) {
		super(x, y);this.sy =14;this.sx = 38;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block1439Entity extends LargeMaterialBuildingBlock {
	public Block1439Entity(int x, int y) {
		super(x, y);this.sy =14;this.sx = 39;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}

// New block entities 25/11/2016
class Block014Entity extends MaterialBuildingBlock {
	public Block014Entity(int x, int y) {
		super(x, y);this.sy =0;this.sx = 14;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}

class Block015Entity extends MaterialBuildingBlock {
	public Block015Entity(int x, int y) {
		super(x, y);this.sy =0;this.sx = 15;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block016Entity extends MaterialBuildingBlock {
	public Block016Entity(int x, int y) {
		super(x, y);this.sy =0;this.sx = 16;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block017Entity extends MaterialBuildingBlock {
	public Block017Entity(int x, int y) {
		super(x, y);this.sy =0;this.sx = 17;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block018Entity extends MaterialBuildingBlock {
	public Block018Entity(int x, int y) {
		super(x, y);this.sy =0;this.sx = 18;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block019Entity extends MaterialBuildingBlock {
	public Block019Entity(int x, int y) {
		super(x, y);this.sy =0;this.sx = 19;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block020Entity extends MaterialBuildingBlock {
	public Block020Entity(int x, int y) {
		super(x, y);this.sy =0;this.sx = 20;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block021Entity extends MaterialBuildingBlock {
	public Block021Entity(int x, int y) {
		super(x, y);this.sy =0;this.sx = 21;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block022Entity extends MaterialBuildingBlock {
	public Block022Entity(int x, int y) {
		super(x, y);this.sy =0;this.sx = 22;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block023Entity extends MaterialBuildingBlock {
	public Block023Entity(int x, int y) {
		super(x, y);this.sy =0;this.sx = 23;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block024Entity extends MaterialBuildingBlock {
	public Block024Entity(int x, int y) {
		super(x, y);this.sy =0;this.sx = 24;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block025Entity extends MaterialBuildingBlock {
	public Block025Entity(int x, int y) {
		super(x, y);this.sy =0;this.sx = 25;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block026Entity extends MaterialBuildingBlock {
	public Block026Entity(int x, int y) {
		super(x, y);this.sy =0;this.sx = 26;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block027Entity extends MaterialBuildingBlock {
	public Block027Entity(int x, int y) {
		super(x, y);this.sy =0;this.sx = 27;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block028Entity extends MaterialBuildingBlock {
	public Block028Entity(int x, int y) {
		super(x, y);this.sy =0;this.sx = 28;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block029Entity extends MaterialBuildingBlock {
	public Block029Entity(int x, int y) {
		super(x, y);this.sy =0;this.sx = 29;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block030Entity extends MaterialBuildingBlock {
	public Block030Entity(int x, int y) {
		super(x, y);this.sy =0;this.sx = 30;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block031Entity extends MaterialBuildingBlock {
	public Block031Entity(int x, int y) {
		super(x, y);this.sy =0;this.sx = 31;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block032Entity extends MaterialBuildingBlock {
	public Block032Entity(int x, int y) {
		super(x, y);this.sy =0;this.sx = 32;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block033Entity extends MaterialBuildingBlock {
	public Block033Entity(int x, int y) {
		super(x, y);this.sy =0;this.sx = 33;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block034Entity extends MaterialBuildingBlock {
	public Block034Entity(int x, int y) {
		super(x, y);this.sy =0;this.sx = 34;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block035Entity extends MaterialBuildingBlock {
	public Block035Entity(int x, int y) {
		super(x, y);this.sy =0;this.sx = 35;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block036Entity extends MaterialBuildingBlock {
	public Block036Entity(int x, int y) {
		super(x, y);this.sy =0;this.sx = 36;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block037Entity extends MaterialBuildingBlock {
	public Block037Entity(int x, int y) {
		super(x, y);this.sy =0;this.sx = 37;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block038Entity extends MaterialBuildingBlock {
	public Block038Entity(int x, int y) {
		super(x, y);this.sy =0;this.sx = 38;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block039Entity extends MaterialBuildingBlock {
	public Block039Entity(int x, int y) {
		super(x, y);this.sy =0;this.sx = 39;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}

class Block114Entity extends MaterialBuildingBlock {
	public Block114Entity(int x, int y) {
		super(x, y);this.sy =1;this.sx = 14;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}

class Block115Entity extends MaterialBuildingBlock {
	public Block115Entity(int x, int y) {
		super(x, y);this.sy =1;this.sx = 15;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block116Entity extends MaterialBuildingBlock {
	public Block116Entity(int x, int y) {
		super(x, y);this.sy =1;this.sx = 16;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block117Entity extends MaterialBuildingBlock {
	public Block117Entity(int x, int y) {
		super(x, y);this.sy =1;this.sx = 17;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block118Entity extends MaterialBuildingBlock {
	public Block118Entity(int x, int y) {
		super(x, y);this.sy =1;this.sx = 18;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block119Entity extends MaterialBuildingBlock {
	public Block119Entity(int x, int y) {
		super(x, y);this.sy =1;this.sx = 19;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block120Entity extends MaterialBuildingBlock {
	public Block120Entity(int x, int y) {
		super(x, y);this.sy =1;this.sx = 20;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block121Entity extends MaterialBuildingBlock {
	public Block121Entity(int x, int y) {
		super(x, y);this.sy =1;this.sx = 21;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block122Entity extends MaterialBuildingBlock {
	public Block122Entity(int x, int y) {
		super(x, y);this.sy =1;this.sx = 22;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block123Entity extends MaterialBuildingBlock {
	public Block123Entity(int x, int y) {
		super(x, y);this.sy =1;this.sx = 23;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block124Entity extends MaterialBuildingBlock {
	public Block124Entity(int x, int y) {
		super(x, y);this.sy =1;this.sx = 24;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block125Entity extends MaterialBuildingBlock {
	public Block125Entity(int x, int y) {
		super(x, y);this.sy =1;this.sx = 25;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block126Entity extends MaterialBuildingBlock {
	public Block126Entity(int x, int y) {
		super(x, y);this.sy =1;this.sx = 26;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block127Entity extends MaterialBuildingBlock {
	public Block127Entity(int x, int y) {
		super(x, y);this.sy =1;this.sx = 27;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block128Entity extends MaterialBuildingBlock {
	public Block128Entity(int x, int y) {
		super(x, y);this.sy =1;this.sx = 28;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block129Entity extends MaterialBuildingBlock {
	public Block129Entity(int x, int y) {
		super(x, y);this.sy =1;this.sx = 29;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block130Entity extends MaterialBuildingBlock {
	public Block130Entity(int x, int y) {
		super(x, y);this.sy =1;this.sx = 30;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block131Entity extends MaterialBuildingBlock {
	public Block131Entity(int x, int y) {
		super(x, y);this.sy =1;this.sx = 31;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block132Entity extends MaterialBuildingBlock {
	public Block132Entity(int x, int y) {
		super(x, y);this.sy =1;this.sx = 32;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block133Entity extends MaterialBuildingBlock {
	public Block133Entity(int x, int y) {
		super(x, y);this.sy =1;this.sx = 33;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block134Entity extends MaterialBuildingBlock {
	public Block134Entity(int x, int y) {
		super(x, y);this.sy =1;this.sx = 34;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block135Entity extends MaterialBuildingBlock {
	public Block135Entity(int x, int y) {
		super(x, y);this.sy =1;this.sx = 35;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block136Entity extends MaterialBuildingBlock {
	public Block136Entity(int x, int y) {
		super(x, y);this.sy =1;this.sx = 36;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block137Entity extends MaterialBuildingBlock {
	public Block137Entity(int x, int y) {
		super(x, y);this.sy =1;this.sx = 37;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block138Entity extends MaterialBuildingBlock {
	public Block138Entity(int x, int y) {
		super(x, y);this.sy =1;this.sx = 38;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block139Entity extends MaterialBuildingBlock {
	public Block139Entity(int x, int y) {
		super(x, y);this.sy =1;this.sx = 39;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}



class Block214Entity extends MaterialBuildingBlock {
	public Block214Entity(int x, int y) {
		super(x, y);this.sy =2;this.sx = 14;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}

class Block215Entity extends MaterialBuildingBlock {
	public Block215Entity(int x, int y) {
		super(x, y);this.sy =2;this.sx = 15;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block216Entity extends MaterialBuildingBlock {
	public Block216Entity(int x, int y) {
		super(x, y);this.sy =2;this.sx = 16;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}
class Block217Entity extends MaterialBuildingBlock {
	public Block217Entity(int x, int y) {
		super(x, y);this.sy =2;this.sx = 17;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
}

// Creature entities

class SpawnEntity extends LandscapeEntity {
	public SpawnEntity(int x, int y)
	{
		super(x,y);
	}
}

class FoxEntity900 extends SpawnEntity {
	public FoxEntity900(int x, int y) {
		super(x,y);this.sy=9;this.sx=0;this.id=400;
	}
}
class PigEntity901 extends SpawnEntity {
	public PigEntity901(int x, int y) {
		super(x,y);this.sy=9;this.sx=1;this.id=401;
	}
}

class RhinoEntity902 extends SpawnEntity {
	public RhinoEntity902(int x, int y) {
		super(x,y);this.sy=9;this.sx=2;this.id=402;
	}
}
class DuckEntity903 extends SpawnEntity {
	public DuckEntity903(int x, int y) {
		super(x,y);this.sy=9;this.sx=3;this.id=403;
	}
}

class BearEntity904 extends SpawnEntity {
	public BearEntity904(int x, int y) {
		super(x,y);this.sy=9;this.sx=4;this.id=404;
	}
}
class ElephantEntity905 extends SpawnEntity {
	public ElephantEntity905(int x, int y) {
		super(x,y);this.sy=9;this.sx=5;this.id=405;
	}
}
class CrocodileEntity906 extends SpawnEntity {
	public CrocodileEntity906(int x, int y) {
		super(x,y);this.sy=9;this.sx=6;this.id=406;
	}
}
class BrainaEntity907 extends SpawnEntity {
	public BrainaEntity907(int x, int y) {
		super(x,y);this.sy=9;this.sx=7;this.id=407;
	}
}
class HippoEntity908 extends SpawnEntity {
	public HippoEntity908(int x, int y) {
		super(x,y);this.sy=9;this.sx=8;this.id=408;
	}
}
class HorseEntity909 extends SpawnEntity {
	public HorseEntity909(int x, int y) {
		super(x,y);this.sy=9;this.sx=9;this.id=409;
	}
}
class KoalaEntity910 extends SpawnEntity {
	public KoalaEntity910(int x, int y) {
		super(x,y);this.sy=9;this.sx=10;this.id=410;
	}
}
class LionEntity911 extends SpawnEntity {
	public LionEntity911(int x, int y) {
		super(x,y);this.sy=9;this.sx=11;this.id=411;
	}
}
class MonkeyEntity912 extends SpawnEntity {
	public MonkeyEntity912(int x, int y) {
		super(x,y);this.sy=9;this.sx=12;this.id=412;
	}
}
class MooseEntity913 extends SpawnEntity {
	public MooseEntity913(int x, int y) {
		super(x,y);this.sy=9;this.sx=13;this.id=413;
	}
}
class PandaEntity914 extends SpawnEntity {
	public PandaEntity914(int x, int y) {
		super(x,y);this.sy=9;this.sx=14;this.id=414;
	}
}
class ParrotEntity915 extends SpawnEntity {
	public ParrotEntity915(int x, int y) {
		super(x,y);this.sy=9;this.sx=15;this.id=415;
	}
}
class PenguinEntity916 extends SpawnEntity {
	public PenguinEntity916(int x, int y) {
		super(x,y);this.sy=9;this.sx=16;this.id=416;
	}
}
class PolarBearEntity917 extends SpawnEntity {
	public PolarBearEntity917(int x, int y) {
		super(x,y);this.sy=9;this.sx=17;this.id=417;
	}
}
class SharkEntity918 extends SpawnEntity {
	public SharkEntity918(int x, int y) {
		super(x,y);this.sy=9;this.sx=18;this.id=418;
	}
}
class SnowOwlEntity919 extends SpawnEntity {
	public SnowOwlEntity919(int x, int y) {
		super(x,y);this.sy=9;this.sx=19;this.id=419;
	}
}
class TigerEntity920 extends SpawnEntity {
	public TigerEntity920(int x, int y) {
		super(x,y);this.sy=9;this.sx=20;this.id=420;
	}
}
class WalrusEntity921 extends SpawnEntity {
	public WalrusEntity921(int x, int y) {
		super(x,y);this.sy=9;this.sx=21;this.id=421;
	}
}
class WolfEntity922 extends SpawnEntity {
	public WolfEntity922(int x, int y) {
		super(x,y);this.sy=9;this.sx=22;this.id=422;
	}
}
class ZombieEntity923 extends SpawnEntity {
	public ZombieEntity923(int x, int y) {
		super(x,y);this.sy=9;this.sx=23;this.id=423;
	}
}
class TentacleAEntity924 extends SpawnEntity {
	public TentacleAEntity924(int x, int y) {
		super(x,y);this.sy=9;this.sx=24;this.id=424;
	}
}
class TentacleBEntity925 extends SpawnEntity {
	public TentacleBEntity925(int x, int y) {
		super(x,y);this.sy=9;this.sx=25;this.id=425;
	}
}
class SquirrelEntity926 extends SpawnEntity {
	public SquirrelEntity926(int x, int y) {
		super(x,y);this.sy=9;this.sx=26;this.id=426;
	}
}
class SphereBEntity927 extends SpawnEntity {
	public SphereBEntity927(int x, int y) {
		super(x,y);this.sy=9;this.sx=27;this.id=427;
	}
}
class SphereAEntity928 extends SpawnEntity {
	public SphereAEntity928(int x, int y) {
		super(x,y);this.sy=9;this.sx=28;this.id=428;
	}
}
class SnakeEntity929 extends SpawnEntity {
	public SnakeEntity929(int x, int y) {
		super(x,y);this.sy=9;this.sx=29;this.id=429;
	}
}
class SlimeEntity930 extends SpawnEntity {
	public SlimeEntity930(int x, int y) {
		super(x,y);this.sy=9;this.sx=30;this.id=430;
	}
}
class SlimeEntity931 extends SpawnEntity {
	public SlimeEntity931(int x, int y) {
		super(x,y);this.sy=9;this.sx=30;this.id=431;
	}
}
class SlimeEntity932 extends SpawnEntity {
	public SlimeEntity932(int x, int y) {
		super(x,y);this.sy=9;this.sx=30;this.id=432;
	}
}
class SlimeEntity933 extends SpawnEntity {
	public SlimeEntity933(int x, int y) {
		super(x,y);this.sy=9;this.sx=33;this.id=433;
	}
}
class SkullFlameEntity934 extends SpawnEntity {
	public SkullFlameEntity934(int x, int y) {
		super(x,y);this.sy=9;this.sx=34;this.id=434;
	}
}
class SkullFlameEntity935 extends SpawnEntity {
	public SkullFlameEntity935(int x, int y) {
		super(x,y);this.sy=9;this.sx=35;this.id=435;
	}
}
class SkullEntity936 extends SpawnEntity {
	public SkullEntity936(int x, int y) {
		super(x,y);this.sy=9;this.sx=36;this.id=436;
	}
}
class SkullEntity937 extends SpawnEntity {
	public SkullEntity937(int x, int y) {
		super(x,y);this.sy=9;this.sx=37;this.id=437;
	}
}
class SkullEntity938 extends SpawnEntity {
	public SkullEntity938(int x, int y) {
		super(x,y);this.sy=9;this.sx=38;this.id=438;
	}
}
class SkullEntity939 extends SpawnEntity {
	public SkullEntity939(int x, int y) {
		super(x,y);this.sy=9;this.sx=39;this.id=439;
	}
}
class SkeletonEntity1000 extends SpawnEntity {
	public SkeletonEntity1000(int x, int y) {
		super(x,y);this.sy=10;this.sx=0;this.id=440;
	}
}
class SheepEntity1001 extends SpawnEntity {
	public SheepEntity1001(int x, int y) {
		super(x,y);this.sy=10;this.sx=1;this.id=441;
	}
}
class SentryCopEntity1002 extends SpawnEntity {
	public SentryCopEntity1002(int x, int y) {
		super(x,y);this.sy=10;this.sx=2;this.id=442;
	}
}
class SentryCopEntity1003 extends SpawnEntity {
	public SentryCopEntity1003(int x, int y) {
		super(x,y);this.sy=10;this.sx=3;this.id=443;
	}
}
class SentryEntity1004 extends SpawnEntity {
	public SentryEntity1004(int x, int y) {
		super(x,y);this.sy=10;this.sx=4;this.id=444;
	}
}
class RobotEntity1005 extends SpawnEntity {
	public RobotEntity1005(int x, int y) {
		super(x,y);this.sy=10;this.sx=5;this.id=445;
	}
}
class RobotEntity1006 extends SpawnEntity {
	public RobotEntity1006(int x, int y) {
		super(x,y);this.sy=10;this.sx=6;this.id=446;
	}
}
class PuddleEntity1007 extends SpawnEntity {
	public PuddleEntity1007(int x, int y) {
		super(x,y);this.sy=10;this.sx=7;this.id=447;
	}
}
class PuddleEntity1008 extends SpawnEntity {
	public PuddleEntity1008(int x, int y) {
		super(x,y);this.sy=10;this.sx=8;this.id=448;
	}
}
class PotionEntity1009 extends SpawnEntity {
	public PotionEntity1009(int x, int y) {
		super(x,y);this.sy=10;this.sx=9;this.id=449;
	}
}
class PotionEntity1010 extends SpawnEntity {
	public PotionEntity1010(int x, int y) {
		super(x,y);this.sy=10;this.sx=10;this.id=450;
	}
}
class PotionEntity1011 extends SpawnEntity {
	public PotionEntity1011(int x, int y) {
		super(x,y);this.sy=10;this.sx=11;this.id=451;
	}
}
class PotionEntity1012 extends SpawnEntity {
	public PotionEntity1012(int x, int y) {
		super(x,y);this.sy=10;this.sx=12;this.id=452;
	}
}
class PotionEntity1013 extends SpawnEntity {
	public PotionEntity1013(int x, int y) {
		super(x,y);this.sy=10;this.sx=13;this.id=453;
	}
}
class PotionEntity1014 extends SpawnEntity {
	public PotionEntity1014(int x, int y) {
		super(x,y);this.sy=10;this.sx=14;this.id=454;
	}
}
class OrbEntity1015 extends SpawnEntity {
	public OrbEntity1015(int x, int y) {
		super(x,y);this.sy=10;this.sx=15;this.id=455;
	}
}
class OrbEntity1016 extends SpawnEntity {
	public OrbEntity1016(int x, int y) {
		super(x,y);this.sy=10;this.sx=16;this.id=456;
	}
}
class MushroomEntity1017 extends SpawnEntity {
	public MushroomEntity1017(int x, int y) {
		super(x,y);this.sy=10;this.sx=17;this.id=457;
	}
}
class MushroomEntity1018 extends SpawnEntity {
	public MushroomEntity1018(int x, int y) {
		super(x,y);this.sy=10;this.sx=18;this.id=458;
	}
}
class MummyEntity1019 extends SpawnEntity {
	public MummyEntity1019(int x, int y) {
		super(x,y);this.sy=10;this.sx=19;this.id=459;
	}
}
class MonolithEntity1020 extends SpawnEntity {
	public MonolithEntity1020(int x, int y) {
		super(x,y);this.sy=10;this.sx=20;this.id=460;
	}
}
class MonolithEntity1021 extends SpawnEntity {
	public MonolithEntity1021(int x, int y) {
		super(x,y);this.sy=10;this.sx=21;this.id=461;
	}
}
class MaskEntity1022 extends SpawnEntity {
	public MaskEntity1022(int x, int y) {
		super(x,y);this.sy=10;this.sx=22;this.id=462;
	}
}
class LurkerEntity1023 extends SpawnEntity {
	public LurkerEntity1023(int x, int y) {
		super(x,y);this.sy=10;this.sx=23;this.id=463;
	}
}
class KlakonEntity1024 extends SpawnEntity {
	public KlakonEntity1024(int x, int y) {
		super(x,y);this.sy=10;this.sx=24;this.id=464;
	}
}
class HeadEntity1025 extends SpawnEntity {
	public HeadEntity1025(int x, int y) {
		super(x,y);this.sy=10;this.sx=25;this.id=465;
	}
}
class HeadEntity1026 extends SpawnEntity {
	public HeadEntity1026(int x, int y) {
		super(x,y);this.sy=10;this.sx=26;this.id=466;
	}
}
class HeadEntity1027 extends SpawnEntity {
	public HeadEntity1027(int x, int y) {
		super(x,y);this.sy=10;this.sx=27;this.id=467;
	}
}
class HeadEntity1028 extends SpawnEntity {
	public HeadEntity1028(int x, int y) {
		super(x,y);this.sy=10;this.sx=28;this.id=468;
	}
}
class GhostEntity1029 extends SpawnEntity {
	public GhostEntity1029(int x, int y) {
		super(x,y);this.sy=10;this.sx=29;this.id=469;
	}
}
class GhostEntity1030 extends SpawnEntity {
	public GhostEntity1030(int x, int y) {
		super(x,y);this.sy=10;this.sx=30;this.id=470;
	}
}
class GhostEntity1031 extends SpawnEntity {
	public GhostEntity1031(int x, int y) {
		super(x,y);this.sy=10;this.sx=31;this.id=471;
	}
}
class FireEntity1032 extends SpawnEntity {
	public FireEntity1032(int x, int y) {
		super(x,y);this.sy=10;this.sx=32;this.id=472;
	}
}
class DyeEntity1033 extends SpawnEntity {
	public DyeEntity1033(int x, int y) {
		super(x,y);this.sy=10;this.sx=33;this.id=473;
	}
}
class DwarfEntity1034 extends SpawnEntity {
	public DwarfEntity1034(int x, int y) {
		super(x,y);this.sy=10;this.sx=34;this.id=474;
	}
}
class DuckEntity1035 extends SpawnEntity {
	public DuckEntity1035(int x, int y) {
		super(x,y);this.sy=10;this.sx=35;this.id=475;
	}
}
class DogEntity1036 extends SpawnEntity {
	public DogEntity1036(int x, int y) {
		super(x,y);this.sy=10;this.sx=36;this.id=476;
	}
}
class CrabEntity1037 extends SpawnEntity {
	public CrabEntity1037(int x, int y) {
		super(x,y);this.sy=10;this.sx=37;this.id=477;
	}
}
class ChickenEntity1038 extends SpawnEntity {
	public ChickenEntity1038(int x, int y) {
		super(x,y);this.sy=10;this.sx=38;this.id=478;
	}
}
class ChickenEntity1039 extends SpawnEntity {
	public ChickenEntity1039(int x, int y) {
		super(x,y);this.sy=10;this.sx=39;this.id=479;
	}
}
class ChickenEntity1100 extends SpawnEntity {
	public ChickenEntity1100(int x, int y) {
		super(x,y);this.sy=11;this.sx=0;this.id=480;
	}
}
class CatEntity1101 extends SpawnEntity {
	public CatEntity1101(int x, int y) {
		super(x,y);this.sy=11;this.sx=1;this.id=481;
	}
}
class BatEntity1102 extends SpawnEntity {
	public BatEntity1102(int x, int y) {
		super(x,y);this.sy=11;this.sx=2;this.id=482;
	}
}
class BallEntity1103 extends SpawnEntity {
	public BallEntity1103(int x, int y) {
		super(x,y);this.sy=11;this.sx=3;this.id=483;
	}
}
class HumanOneEntity1104 extends SpawnEntity {
	public HumanOneEntity1104(int x, int y) {
		super(x,y);this.sy=11;this.sx=4;this.id=484;
	}
}
class HumanOneEntity1105 extends SpawnEntity {
	public HumanOneEntity1105(int x, int y) {
		super(x,y);this.sy=11;this.sx=5;this.id=485;
	}
}class HumanOneEntity1106 extends SpawnEntity {
	public HumanOneEntity1106(int x, int y) {
		super(x,y);this.sy=11;this.sx=6;this.id=486;
	}
}class HumanOneEntity1107 extends SpawnEntity {
	public HumanOneEntity1107(int x, int y) {
		super(x,y);this.sy=11;this.sx=7;this.id=487;
	}
}class HumanOneEntity1108 extends SpawnEntity {
	public HumanOneEntity1108(int x, int y) {
		super(x,y);this.sy=11;this.sx=8;this.id=488;
	}
}
class HumanOneEntity1109 extends SpawnEntity {
	public HumanOneEntity1109(int x, int y) {
		super(x,y);this.sy=11;this.sx=9;this.id=489;
	}
}
class HumanOneEntity1110 extends SpawnEntity {
	public HumanOneEntity1110(int x, int y) {
		super(x,y);this.sy=11;this.sx=10;this.id=490;
	}
}
class HumanOneEntity1111 extends SpawnEntity {
	public HumanOneEntity1111(int x, int y) {
		super(x,y);this.sy=11;this.sx=11;this.id=491;
	}
}
class HumanOneEntity1112 extends SpawnEntity {
	public HumanOneEntity1112(int x, int y) {
		super(x,y);this.sy=11;this.sx=12;this.id=492;
	}
}
class HumanOneEntity1113 extends SpawnEntity {
	public HumanOneEntity1113(int x, int y) {
		super(x,y);this.sy=11;this.sx=13;this.id=493;
	}
}
class HumanOneEntity1114 extends SpawnEntity {
	public HumanOneEntity1114(int x, int y) {
		super(x,y);this.sy=11;this.sx=14;this.id=494;
	}
}
class HumanOneEntity1115 extends SpawnEntity {
	public HumanOneEntity1115(int x, int y) {
		super(x,y);this.sy=11;this.sx=15;this.id=495;
	}
}
class HumanOneEntity1116 extends SpawnEntity {
	public HumanOneEntity1116(int x, int y) {
		super(x,y);this.sy=11;this.sx=16;this.id=496;
	}
}


//////////////////////////////////////////////////////////////
// Weapons
class WeaponEntity extends LandscapeEntity {
	public WeaponEntity(int x, int y) {
		super(x, y);
	}
}


class AxeEntity extends WeaponEntity {
	public AxeEntity(int x, int y) {
		super(x, y);this.sy = 22;this.sx = 0;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 250;
	}
	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[sy][sx], x << 4, y << 4); // 0,1
	}
}
class StaffEntity extends WeaponEntity {
	public StaffEntity(int x, int y) {
		super(x, y);this.sy = 22;this.sx = 1;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 251;
	}
	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[sy][sx], x << 4, y << 4); // 0,1
	}
}
class ClubEntity extends WeaponEntity {
	public ClubEntity(int x, int y) {
		super(x, y);this.sy = 22;this.sx = 2;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 252;
	}
	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[sy][sx], x << 4, y << 4); // 0,1
	}
}
class SickleEntity extends WeaponEntity {
	public SickleEntity(int x, int y) {
		super(x, y);this.sy = 22;this.sx = 3;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 253;
	}
	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[sy][sx], x << 4, y << 4); // 0,1
	}
}
class HookedStaffEntity extends WeaponEntity {
	public HookedStaffEntity(int x, int y) {
		super(x, y);this.sy = 22;this.sx = 4;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 254;
	}
	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[sy][sx], x << 4, y << 4); // 0,1
	}
}
class SwordEntity extends WeaponEntity {
	public SwordEntity(int x, int y) {
		super(x, y);this.sy = 22;this.sx = 5;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 255;
	}
	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[sy][sx], x << 4, y << 4); // 0,1
	}
}
class GoldSwordEntity extends WeaponEntity {
	public GoldSwordEntity(int x, int y) {
		super(x, y);this.sy = 22;this.sx = 6;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 256;
	}
	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[sy][sx], x << 4, y << 4); // 0,1
	}
}
class MaceEntity extends WeaponEntity {
	public MaceEntity(int x, int y) {
		super(x, y);this.sy = 22;this.sx = 7;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 257;
	}
	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[sy][sx], x << 4, y << 4); // 0,1
	}
}
class LongBowEntity extends WeaponEntity {
	public LongBowEntity(int x, int y) {
		super(x, y);this.sy = 22;this.sx = 8;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 258;
	}
	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[sy][sx], x << 4, y << 4); // 0,1
	}
}

class BlueSwordEntity extends WeaponEntity {
	public BlueSwordEntity(int x, int y) {
		super(x, y);this.sy = 22;this.sx = 9;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 259;
	}
	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[sy][sx], x << 4, y << 4); // 0,1
	}
}

class ShortBowEntity extends WeaponEntity {
	public ShortBowEntity(int x, int y) {
		super(x, y);this.sy = 22;this.sx = 10;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 260;
	}
	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[sy][sx], x << 4, y << 4); // 0,1
	}
}

//////////////////////////////////////////////////////////////////

class DecorationEntity extends LandscapeEntity{
	public DecorationEntity(int x, int y) {
		super(x, y);
	}
}
class JugEntity extends DecorationEntity {
	public JugEntity(int x, int y) {
		super(x, y);this.sy = 16;this.sx = 0;this.hits = 0;this.lightValue = 15;originalLightValue = 15;id = 500;
	}
	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[sy][sx], x << 4, y << 4); // 0,1
	}
}
class JugEntity2 extends DecorationEntity {
	public JugEntity2(int x, int y) {
		super(x, y);this.sy = 16;this.sx = 1;this.hits = 0;this.lightValue = 15;originalLightValue = 15;id = 501;
	}
	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[sy][sx], x << 4, y << 4); // 0,1
	}
}
class JugMiniEntity extends DecorationEntity {
	public JugMiniEntity(int x, int y) {
		super(x, y);this.sy = 16;this.sx = 2;this.hits = 0;this.lightValue = 15;originalLightValue = 15;id = 502;
	}
	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[sy][sx], x << 4, y << 4); // 0,1
	}
}
class JugMiniEntity2 extends DecorationEntity {
	public JugMiniEntity2(int x, int y) {
		super(x, y);this.sy = 16;this.sx = 3;this.hits = 0;this.lightValue = 15;originalLightValue = 15;id = 500;
	}
	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[sy][sx], x << 4, y << 4); // 0,1
	}
}
class SkullEntity extends DecorationEntity {
	public SkullEntity(int x, int y) {
		super(x, y);this.sy = 16;this.sx = 4;this.hits = 0;this.lightValue = 15;originalLightValue = 15;id = 500;
	}
	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[sy][sx], x << 4, y << 4); // 0,1
	}
}
class RagEntity extends DecorationEntity {
	public RagEntity(int x, int y) {
		super(x, y);this.sy = 16;this.sx = 5;this.hits = 0;this.lightValue = 15;originalLightValue = 15;id = 500;
	}
	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[sy][sx], x << 4, y << 4); // 0,1
	}
}

class LightEntity extends DecorationEntity {

	public LightEntity(int x, int y) {
		super(x, y);this.sx = 6; this.sy = 16;this.lightValue = 15;this.hits = 1;originalLightValue = 15;id = 21;
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[sy][sx], x << 4, y << 4);
	}
}
class BlueLightEntity extends LightEntity {

	public BlueLightEntity(int x, int y) {
		super(x, y);this.sx = 8; this.sy = 16;this.lightValue = 15;this.hits = 1;originalLightValue = 15;id = 21;
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[sy][sx], x << 4, y << 4);
	}
}
class GreenLightEntity extends LightEntity {

	public GreenLightEntity(int x, int y) {
		super(x, y);this.sx = 7; this.sy = 16;this.lightValue = 15;this.hits = 1;originalLightValue = 15;id = 21;
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[sy][sx], x << 4, y << 4);
	}
}
class CyanLightEntity extends LightEntity {

	public CyanLightEntity(int x, int y) {
		super(x, y);this.sx = 9; this.sy = 16;this.lightValue = 15;this.hits = 1;originalLightValue = 15;id = 21;
	}

	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[sy][sx], x << 4, y << 4);
	}
}


///////////////////////////////////////////////////////////////
// Tools
class ToolEntity extends LandscapeEntity {
	public ToolEntity(int x, int y) {
		super(x, y);
	}
}
class PickAxeEntity extends ToolEntity {
	public PickAxeEntity(int x, int y) {
		super(x, y);
		this.hits = 6;
		this.lightValue = 15;
		this.sy = 25;
		this.sx = 0;
		originalLightValue = 15;
		id = 250;
	}
	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[sx][sy], x << 4, y << 4); // 0,1

	}
}

class s {
	public s(int x, int y) {

	}
}
/////////////////////////////////////////////////////////////////
// Crops
class CropEntity extends LandscapeEntity {
	public CropEntity(int x, int y) {
		super(x, y);
		this.underNeath = null;
	}
	public void draw(Batch batch, TextureRegion[][] t, int x, int y) {
		batch.draw(t[sy][sx], x << 4, y << 4); // 0,1
	}
}

class Block2800Entity extends CropEntity {
	public Block2800Entity(int x, int y) {
		super(x, y);this.sy = 28;this.sx = 00;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 700;
		this.underNeath = null;

	}
}
class Block2801Entity extends CropEntity {
	public Block2801Entity(int x, int y) {
		super(x, y);this.sy = 28;this.sx = 1;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 700;
	}
}
class Block2802Entity extends CropEntity {
	public Block2802Entity(int x, int y) {
		super(x, y);this.sy = 28;this.sx = 02;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 700;
	}
}
class Block2803Entity extends CropEntity {
	public Block2803Entity(int x, int y) {
		super(x, y);this.sy = 28;this.sx = 3;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 700;
	}
}
class Block2804Entity extends CropEntity {
	public Block2804Entity(int x, int y) {
		super(x, y);this.sy = 28;this.sx = 04;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 700;
	}
}
class Block2805Entity extends CropEntity {
	public Block2805Entity(int x, int y) {
		super(x, y);this.sy = 28;this.sx = 05;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 700;
	}
}
class Block2806Entity extends CropEntity {
	public Block2806Entity(int x, int y) {
		super(x, y);this.sy = 28;this.sx = 06;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 700;
	}
}
class Block2807Entity extends CropEntity {
	public Block2807Entity(int x, int y) {
		super(x, y);this.sy = 28;this.sx = 07;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 700;
	}
}
class Block2808Entity extends CropEntity {
	public Block2808Entity(int x, int y) {
		super(x, y);this.sy = 28;this.sx = 8;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 700;
	}
}
class Block2809Entity extends CropEntity {
	public Block2809Entity(int x, int y) {
		super(x, y);this.sy = 28;this.sx = 9;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 700;
	}
}
class Block2810Entity extends CropEntity {
	public Block2810Entity(int x, int y) {
		super(x, y);this.sy = 28;this.sx = 10;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 700;
	}
}
class Block2811Entity extends CropEntity {
	public Block2811Entity(int x, int y) {
		super(x, y);this.sy = 28;this.sx = 11;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 700;
	}
}
class Block2812Entity extends CropEntity {
	public Block2812Entity(int x, int y) {
		super(x, y);this.sy = 28;this.sx = 12;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 700;
	}
}
class Block2813Entity extends CropEntity {
	public Block2813Entity(int x, int y) {
		super(x, y);this.sy = 28;this.sx = 13;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 700;
	}
}
class Block2814Entity extends CropEntity {
	public Block2814Entity(int x, int y) {
		super(x, y);this.sy = 28;this.sx = 14;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 700;
	}
}
class Block2815Entity extends CropEntity {
	public Block2815Entity(int x, int y) {
		super(x, y);this.sy = 28;this.sx = 15;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 700;
	}
}
class Block2816Entity extends CropEntity {
	public Block2816Entity(int x, int y) {
		super(x, y);this.sy = 28;this.sx = 16;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 700;
	}
}
class Block2817Entity extends CropEntity {
	public Block2817Entity(int x, int y) {
		super(x, y);this.sy = 28;this.sx = 17;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 700;
	}
}
class Block2818Entity extends CropEntity {
	public Block2818Entity(int x, int y) {
		super(x, y);this.sy = 28;this.sx = 18;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 700;
	}
}
class Block2819Entity extends CropEntity {
	public Block2819Entity(int x, int y) {
		super(x, y);this.sy = 28;this.sx = 19;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 700;
	}
}
class Block2820Entity extends CropEntity {
	public Block2820Entity(int x, int y) {
		super(x, y);this.sy = 28;this.sx = 20;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 700;
	}
}
class Block2821Entity extends CropEntity {
	public Block2821Entity(int x, int y) {
		super(x, y);this.sy = 28;this.sx = 21;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 700;
	}
}
class Block2822Entity extends CropEntity {
	public Block2822Entity(int x, int y) {
		super(x, y);this.sy = 28;this.sx = 22;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 700;
	}
}
class Block2823Entity extends CropEntity {
	public Block2823Entity(int x, int y) {
		super(x, y);this.sy = 28;this.sx = 23;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 700;
	}
}
class Block2824Entity extends CropEntity {
	public Block2824Entity(int x, int y) {
		super(x, y);this.sy = 28;this.sx = 24;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 700;
	}
}
class Block2825Entity extends CropEntity {
	public Block2825Entity(int x, int y) {
		super(x, y);this.sy = 28;this.sx = 25;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 700;
	}
}
class Block2826Entity extends CropEntity {
	public Block2826Entity(int x, int y) {
		super(x, y);this.sy = 28;this.sx = 26;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 700;
	}
}
class Block2827Entity extends CropEntity {
	public Block2827Entity(int x, int y) {
		super(x, y);this.sy = 28;this.sx = 27;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 700;
	}
}
class Block2828Entity extends CropEntity {
	public Block2828Entity(int x, int y) {
		super(x, y);this.sy = 28;this.sx = 28;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 700;
	}
}
class Block2829Entity extends CropEntity {
	public Block2829Entity(int x, int y) {
		super(x, y);this.sy = 28;this.sx = 29;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 700;
	}
}
class Block2830Entity extends CropEntity {
	public Block2830Entity(int x, int y) {
		super(x, y);this.sy = 28;this.sx = 30;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 700;
	}
}
class Block2831Entity extends CropEntity {
	public Block2831Entity(int x, int y) {
		super(x, y);this.sy = 28;this.sx = 31;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 700;
	}
}
class Block2832Entity extends CropEntity {
	public Block2832Entity(int x, int y) {
		super(x, y);this.sy = 28;this.sx = 32;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 700;
	}
}
class Block2833Entity extends CropEntity {
	public Block2833Entity(int x, int y) {
		super(x, y);this.sy = 28;this.sx = 33;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 700;
	}
}
class Block2834Entity extends CropEntity {
	public Block2834Entity(int x, int y) {
		super(x, y);this.sy = 28;this.sx = 34;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 700;
	}
}
class Block2835Entity extends CropEntity {
	public Block2835Entity(int x, int y) {
		super(x, y);this.sy = 28;this.sx = 35;this.hits = 6;this.lightValue = 15;originalLightValue = 15;id = 700;
	}
}


