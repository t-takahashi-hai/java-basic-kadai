package Kadai_018;

//親クラス、抽象クラスに設定

abstract public class Kato_Chapter18 {
	
	//フィールド
	public String familyName = "加藤";
	public String givenName;
	public String address = "東京都中野区〇×";
	
	//メソッド
	public void commonIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}
	
	abstract public void eachIntroduce();
	
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}
	

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
