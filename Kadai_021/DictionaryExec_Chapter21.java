package Kadai_021;

//実行クラス

public class DictionaryExec_Chapter21 {
	
	public static void main(String[] args) {
		
		//インスタンス生成
		Dictionary_Chapter21 kadai = new Dictionary_Chapter21();
		
		
		
		//検索するデータの配列を作成
		String[] search = {"apple","banana","grape","orange"};
		
		
		//メソッド呼び出し
		kadai.wordChecker(search);
		
		
		
	}

}
