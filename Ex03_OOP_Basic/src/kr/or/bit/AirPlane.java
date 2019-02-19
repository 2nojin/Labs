package kr.or.bit;
/*
 * 1. 비행기를 생산하면 비행기를 이름과 번호를 부여해야 합니다.
 * 2. 비행기가 생산되면 비행기의 이름과 번호가 맞게 부여되었는지 확인 기능(정보 출력)
 * 3.  비행기가 출고 될때마다 비행기의 누적대수를 확인 할 수 있습니다.
 */
public class AirPlane {
	
	
	public  String airName;
	public int airNum;
	public static int airCount;
	
	public void airInfo() {
		airCount ++;
		System.out.printf("비행기 이름:%s, 비행기 번호:%d, 누적대수:%d\n",airName,airNum,airCount);
		
	}

}
