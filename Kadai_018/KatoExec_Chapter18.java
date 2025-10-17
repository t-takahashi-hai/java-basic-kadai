package Kadai_018;

//実行ファイル

public class KatoExec_Chapter18 {
	
	
	

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		//太郎、一郎、花子の順
		KatoTaro_Chapter18 Taro = new KatoTaro_Chapter18();
		KatoIchiro_Chapter18 Ichiro = new KatoIchiro_Chapter18();
		KatoHanako_Chapter18 Hanako = new KatoHanako_Chapter18();
		
		//名前をセットしていく
		Taro.setGivenName("太郎");
		Ichiro.setGivenName("一郎");
		Hanako.setGivenName("花子");
		
		
		//メソッド実行
		Taro.execIntroduce();
		Ichiro.execIntroduce();
		Hanako.execIntroduce();
		
		
		
	}

}
