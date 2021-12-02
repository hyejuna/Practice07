package com.javaex.ex01;

public class ShapeApp {

	public static void main(String[] args) {

		// Shape s = new Shape("빨강"); -> Shape은 추상클래스라 단독으로 인스턴스화 불가
		
		Circle c1 = new Circle("녹색", 10);
		Ractangle r1 = new Ractangle("빨강", 12, 10);
		Shape sr1 = new Ractangle("빨강", 12, 10);
		
		//sr1을 그리는 메소드 호출
		sr1.draw();
		
		//sr1의 가로크기 출력
		System.out.println("sr1의 가로는 " +((Ractangle)r1).getWidth()+ "입니다.");
		
	}
}

	
	