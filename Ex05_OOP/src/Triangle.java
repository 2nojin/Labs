//문제 1)
//삼각형 클래스 만드세요
//정의 : 삼각형은 3개의 점과 색상 그리고 그리다 라는 기능을 가지고 있다
//Shape, point 활용해서 작업 하세요
//3개의 (x,y) , (x,y) , (x,y) 의미
//default 삼각형을 그릴 수 있고 3개의 좌표값을 받아서 그림을 그릴 수도 있다.


/*
class Shape2{
	String color="gold";
	void draw() {
		System.out.println("도형을 그리다.");
	}
	
}

class point2{
	int x;
	int y;
	
	point2(){
		this(1,1);
	}
	
	point2(int x, int y){
		this.x=x;
		this.y=y;
		
	}
}


class Tri extends Shape2{
	point2 p;	//참조타입(초기화:주소값)
	point2 p2;	
	point2 p3;
	
	public Tri() {
		this(new point2(1,1), new point2(2,3), new point2(3,4));
	}
	
	
	public Tri(point2 p, point2 p2, point2 p3) {
		this.p = p;	//한 점의 주소값(Point)
		this.p2 =p2;
		this.p3 = p3;
		
	}

	public void TrianglePoint() {
		System.out.printf("p:(%d,%d)", p.x, p.y);
		System.out.printf("p2:(%d,%d)", p2.x, p2.y);
		System.out.printf("p3:(%d,%d)", p3.x, p3.y);
	}
}

public class Triangle {

	public static void main(String[] args) {

		Tri t = new Tri();
		
		
		System.out.println(t.color);
		System.out.println(t.p);
		System.out.println(t.p2);
		System.out.println(t.p3);
		
		t.draw();
		
		
		Tri t2 = new Tri(new point2(1,1), new point2(2,2), new point2(3,3));
		System.out.println(t2.p.x);
		System.out.println(t2.p.y);
		System.out.println(t2.p2.x);
		
	}

}
*/