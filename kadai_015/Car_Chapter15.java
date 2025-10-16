package kadai_015;

public class Car_Chapter15 {

	//フィールド
	private int gear = 1;
	private int speed = 10;
	
	//コンストラクタ 必要なかったのでコメントアウト
		//public Car_Chapter15(int gear, int speed) {
		//this.gear = gear;
		//this.speed = speed;
		//}
	
	
	
	//メソッド
	public  void changeGear(int afterGear) {
		int oldGear = gear;
		//ギアを速度に変換
		switch(afterGear) {
		case 1 -> this.speed = 10;
		case 2 -> this.speed = 20;
		case 3 -> this.speed = 30;
		case 4 -> this.speed = 40;
		case 5 -> this.speed = 50;
		default -> this.speed = 10;
		
		}
		gear = afterGear;
		
		System.out.println("ギア" + oldGear + "からギア"  + afterGear + "に切り替えました");
	}
	
	public  void run () {
		System.out.println("速度は時速" + this.speed + "kmです");
	}
	
}
