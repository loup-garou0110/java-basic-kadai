package kadai_018;

//子クラス
public class KatoTaro_Chapter18 extends Kato_Chapter18{
	
	
	public void setGivenName () {
		givenName = "太郎";
	}
	
	public void eachIntroduce () {
		System.out.println("名前は" + familyName + givenName + "です");
		commonIntroduce();
		System.out.println("Javaが得意です");
	}
}
