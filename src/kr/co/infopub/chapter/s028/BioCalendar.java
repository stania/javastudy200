
package kr.co.infopub.chapter.s028;

// Math.sin(), s014.Math.toDegrees()


public class BioCalendar {

	// 상수, 상수값은 변경할 수 없다.
	public static final int PHYSICAL = 23;     // 상수(개발자 정의)
	public static void main(String[] args) {
		double phyval = calcPhyVal(PHYSICAL, 1200);   // TODO: phyval 구하는 함수 구현 
		System.out.printf("나의 신체지수 %1$.2f입니다.\n",phyval);
	}

	private static calcPhyVal(int index, int days) {
		return 100*Math.sin( (days % index) * 2 * Math.PI / index );
	}
}
