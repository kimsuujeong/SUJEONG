package OOFEncap;

public class EncapsulationExam {
	
	public static void main(String[] args) {
		// 접근 제어자와 캡슐화
		// 캡슐화
		// 변수나 메서들을 캡슐로 감싸서 안보이게 하는
		// 정보 은닉 개념
		
		// 캡슈로하는 객체의 속성, 행동을 하나로 묶고
		// 외부로 부터 내부를 감싸 숨겨서 은.닉.한.다
		// 외부의 잘못된 접근으로 값이 변하는 의도치 않는 동작을 방지하는
		// 효과를 누릴 수 있음
		
		// 자바에서 접근제어자를 통해 구현이 가능.
		// 클래스, 변수, 메서드들의 접근 통제 하는 키워드.
		// 접근 제어자의 종류
		// public : 언제 어디서나 접근 가능하다는 의미
		//	- 생성자, 변수, 메서드에 선언할 수 있음.
		
		// private : 클래스 내부에서만 접근 가능하다는 의미
		//	- 생성자, 변수, 메서드에 선언할 수 있음
		//	- 외부에서 접근을 하면 안될 때 사용
		
		// default : 접근제어자를 선언하지 않은 경우
		//	- 생성자, 변수, 메서드, 클래스에 선언할 수 있음
		//	- 같은 패키지 내에서 imrpot가 가능하다.
		
		// protected : 기본적으로 default랑 비슷함
		//	- 다만 protected는 상속 받았으면, 다른 패키지에서도 접근이 가능함
	}

}