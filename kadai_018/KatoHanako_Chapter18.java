package kadai_018;

//子クラス
public class KatoHanako_Chapter18 extends Kato_Chapter18{

	public void setGivenName () {
		givenName = "花子";
	}
	
	public void eachIntroduce () {
		System.out.println("名前は" + familyName + givenName + "です");
		commonIntroduce();
		System.out.println("趣味は読書です");
	}
}
