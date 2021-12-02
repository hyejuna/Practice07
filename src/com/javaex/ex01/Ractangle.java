package com.javaex.ex01;

public class Ractangle extends Shape{
	
	private int width;
	private int height;
	
	public Ractangle(String fillColor, int width, int height){
		super(fillColor);
		this.width=width;
		this.height=height;
	}
	
	public int getWidth() {
		return width;
	}

	
	
	public void showInfo(){
		System.out.println("[사각형]#면색:" +super.fillColor+ " "
				+ " #가로:" + width 
				+" #세로:" + height + "그렸습니다.");                                                                        
	}
	
	// 추상메소드인 draw 메소드 반드시 만들어야 함!
	public void draw() {
		System.out.println("[사각현]#면색:" +super.fillColor+ "  #가로:" +this.width+ "  #세로:" +this.height+ " 그렸습니다.");
	}



	

}


