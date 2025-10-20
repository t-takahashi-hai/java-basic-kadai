package Kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

	//実行クラスがあるからいらない
	//public static void main(String[] args) {}
	
	
		//インスタンスフィールドを定義
		private HashMap<String,String> zisyo;
	
		//キーが英語、データが日本語
		//コンストラクタ。初期化に加えてデータを追加
		public Dictionary_Chapter21() {
			this.zisyo = new HashMap <String,String>();
		
		
		
		
		
		//データを追加していく
		this.zisyo.put("apple","りんご");
		this.zisyo.put("peach", "桃");
		this.zisyo.put("banana", "バナナ");
		this.zisyo.put("lemon", "レモン");
		this.zisyo.put("pear", "梨");
		this.zisyo.put("kiwi", "キウィ");
		this.zisyo.put("strawberry", "イチゴ");
		this.zisyo.put("grape", "ブドウ");
		this.zisyo.put("muscat", "マスカット");
		this.zisyo.put("cherry", "さくらんぼ");
		
		}
	
		//ちゃんと追加できているか確認
		//System.out.println(zisyo.get("strawberry"));
		
		
		
	
	
		
		
		
		
		//繰り返し処理で辞書に追加されているかチェック
		
		public void wordChecker(String[] reference) {
			
			for (int i = 0; i < reference.length; i++) {
				String word = reference[i];
				if (zisyo.containsKey(word)) {
					System.out.println(reference[i] + "の意味は" + zisyo.get(reference[i]));

				} else {
					System.out.println(reference[i] + "は辞書に存在しません");

				}
					
				
			}
		
		
		
		}
		
		
	}
	

	
	
	
	
	
	
	
	

