package kadai_018;

//親クラス
public abstract class Kato_Chapter18 {
	
	//姓を表す
	String familyName = "加藤";
	//名を表す
	String givenName;
	//住所を表す
	String address = "東京都中野区○✕";
	
	public abstract void setGivenName();
	
	//共通の紹介
	public void commonIntroduce () {
		System.out.println("住所は" + address + "です");
	}
	
	 public abstract void eachIntroduce ();
	 
	 public void execIntroduce () {
		 eachIntroduce();
	 }
	
	public static void main(String[] args) {
		
		KatoTaro_Chapter18 KatoTaro = new KatoTaro_Chapter18();
		KatoTaro.setGivenName();
		KatoTaro.execIntroduce();
		System.out.println();  //行を開けたいため
		
		KatoIchiro_Chapter18 KatoIchiro = new KatoIchiro_Chapter18();
		KatoIchiro.setGivenName();
		KatoIchiro.execIntroduce();
		System.out.println();  //行を開けたいため
		
		KatoHanako_Chapter18 KatoHanako = new KatoHanako_Chapter18();
		KatoHanako.setGivenName();
		KatoHanako.execIntroduce();
	}
}
