package Kadai_028;

public class JyankenExec_Chapter28 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Jyanken_Chapter28 gon = new Jyanken_Chapter28();
		
		
		String myHand = gon.getMyChoice();
		if (myHand == null) {
			System.out.println("プログラムを終了します。");
            return;
		}
		
		String cho = gon.getRandom();
		
		gon.playGame(myHand, cho);
		
	}

}
