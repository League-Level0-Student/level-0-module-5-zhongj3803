package _02_nested_loops._3_for_loop_gauntlet;

public class LoopGauntlet {
	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
		}
		for (int i = 100; i >= 0; i--) {
			System.out.println(i);
		}
		for (int i = 2; i <= 100; i++) {
			System.out.println(i);
		}
		for (int i = 1; i <= 99; i = i + 2) {
			System.out.println(i);
		}
		for (int i = 1; i <= 500; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " is even");
			} else {
				System.out.println(i + " is odd");
			}
		}
		for (int i = 0; i <= 777; i = i + 7) {
			System.out.println(i);
		}
		for (int i = 2004; i <= 2020; i++) {
			System.out.println("In " + i + ", I was " + (i - 2004) + " years old");
		}
		for (int i = 0; i < 3; i++) {
			for (int j=0;j<3;j++) {
				System.out.println(i+" "+j);
			}
		}
		for (int i = 0; i<3; i++) {
			for (int j=1;j<4;j++) {
				System.out.print(3*i+j+" ");
			}
			System.out.println("");
		}
		for (int i = 0; i<10;i++) {
			for (int j=1; j<11;j++) {
				System.out.print(10*i+j+" ");
			}
			System.out.println("");
		}
		for (int i = 2; i<8; i++) {
			for (int j = 1; j<i; j++) {
				System.out.print(".");
			}
			System.out.println("");
		}
		for (int i=0; i<101;i++) {
			System.out.println(100-i);
		}
	}
}
