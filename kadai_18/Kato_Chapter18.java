package kadai_18;

abstract public class Kato_Chapter18 {

	//フィールド定義
	public String familyName = ("加藤");
	public String giveName;
	public String address = ("東京都中野区〇×");

	//メソッド定義
	public void commonIntroduce(String setGivinName, String familyName, String address) {
		System.out.println("名前は" + familyName + setGivinName + "です");
		System.out.println("住所は" + address + "です");
	}

	abstract public void eachIntroduce();

	public void execIntroduce() {
		
		commonIntroduce(this.giveName, this.familyName, this.address);
		eachIntroduce();
		
	}

}
