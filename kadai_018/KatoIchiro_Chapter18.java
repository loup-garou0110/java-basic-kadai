package kadai_018;

//子クラス
public class KatoIchiro_Chapter18 extends Kato_Chapter18{
	
	public void setGivenName() {
		givenName = "一郎";
	}
	
	public void eachIntroduce () {
		System.out.println("名前は" + familyName + givenName + "です");
		commonIntroduce();
		System.out.println("好きな食べ物はリンゴです");
	}

}
