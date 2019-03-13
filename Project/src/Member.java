public class Member {
	private String name;
	private String phoneNum;
	private String cardInfo;
	private String passportNum;
	private String pwd;
	
	Member(String name, String phoneNum, String cardInfo, String passportNum, String pwd){
		this.name = name;
		this.pwd = pwd;
		this.phoneNum = phoneNum;
		this.cardInfo = cardInfo;
		this.passportNum = passportNum;
	}
}
