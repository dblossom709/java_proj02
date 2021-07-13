package gamelevel;

public class Player {
	
	private PlayerLevel level;			//중요. PlayerLevel <객체형자료형>, level <인풋받은 인스턴스>
										//level 인스턴스 변수에 객체가 담길 경우, 형 변환이 일어난다(업캐스팅) 
	public Player() {					//인풋값 없는 기본 생성자
		level = new BeginnerLevel();	//PlayerLevel 자료형으로 업캐스팅
		level.showLevelMessage();		//PlayerLevel level = new BeginnerLevel();
	}
	public PlayerLevel getLevel() {		
			return level;
		}
	public void upgradeLevel(PlayerLevel level) {		//객체를 인풋값으로 받고, 형변환(업캐스팅)
		this.level = level;
		level.showLevelMessage();
	}
	public void play(int count) {
		level.go(count);
	}
}
