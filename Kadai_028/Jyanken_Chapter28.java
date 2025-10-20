package Kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

	
	
	//メソッドたち
	
	//自分のじゃんけんの手を入力する
	public String getMyChoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		//スキャナーで入力して例外があれば戻す
		Scanner scan = new Scanner(System.in);
		
		String myHand = scan.nextLine();
		
		if(myHand.equals("r") || myHand.equals("s") || myHand.equals("p") ) {
			
			return myHand;
			
		} else {
			System.out.println("エラー！ r,s,pのどれかを入力してください");
			
			return null;
			
		}
		
	}
	
	
	//対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		String[] rsp = new String[] {"r","s","p"};
		int destiny = (int)Math.floor(Math.random() * 3);
		String choice = rsp[destiny];
		
		return choice;
		
	}
	
	//じゃんけんを行う。もうどうなってもいい。だから、ありったけを、、、
	public void playGame(String myHand, String cho) {
		
		HashMap<String,String> dore = new HashMap<String,String>();
		
		dore.put("r","グー");
		dore.put("s","チョキ");
		dore.put("p","パー");
		
		System.out.println("自分の手は" + dore.get(myHand) + "，対戦相手の手は" + dore.get(cho));
		
		
		if (dore.get(myHand).equals(dore.get(cho))) {
			System.out.println("あいこです");
		} else if (
			 (myHand.equals("r") && cho.equals("s")) ||
	         (myHand.equals("s") && cho.equals("p")) ||
	         (myHand.equals("p") && cho.equals("r")) 
	         ) {
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
