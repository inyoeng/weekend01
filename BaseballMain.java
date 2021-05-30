package Baseball;

import java.util.Random;
import java.util.Scanner;

public class BaseballMain {

	public static void main(String[] args) {
		
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		
		int [] com = new int[3];
		int [] user = new int[3];
		
		int strike = 0;
		int ball = 0;
		
		com[0] = r.nextInt(9)+1; 
		com[1] = r.nextInt(9)+1;
		com[2] = r.nextInt(9)+1;
		while (com[0]==com[1] || com[1]==com[2] || com[0]==com[2]) {
			com[1]= r.nextInt(9)+1;
			com[2]= r.nextInt(0)+1;
		}
		for (int i =0 ; i <3 ;i++ ) {
			System.out.print(com[i]);
		}
		System.out.println("");
		
		
		boolean game = true;
		
		while (game) {
			strike = 0;
			ball =0;
			
			for (int i=0 ; i<3;i++) {
				System.out.println((i+1)+"번째 수를 입력하세요:");
				user[i] = s.nextInt();
			}
			
			for (int i=0 ; i<3; i++) {
				for(int j=0 ; j<3; j++) {
					if(com[i]==user[j]) {
						if(i == j) {
							strike += 1;
						}else {
							ball += 1;
						}
					}
				}
			}
			
			if (strike ==3) {
				System.out.println("홈런입니다!");
				System.out.println("The End");
				game = false;
			}
			else {
				System.out.println("strike:"+strike+" ball:"+ball+" 입니다.");
			}
		}
		
	}

}
