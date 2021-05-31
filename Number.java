package numberGuessing;

import java.util.Random;
import java.util.Scanner;

/*
 * 숫자 맞히기 게임!
 * up or down!
 */
public class Number {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		int com = r.nextInt(10);
		
		boolean game = true;
		int count = 0;
		
		System.out.println("숫자 맞히기 게임 START!");
		System.out.println("레벨을 입력하세요! >>");
		int level = s.nextInt();
		int go = 0;
		level = 10 - level;
		
		while (game) {
			
			System.out.println();
			System.out.println("0~10사이의 수를 입력하세요! >>");
			int user = s.nextInt(10);
			
			if (com == user) {
				System.out.println("Correct!");
				game = false;
			}
			else if(com > user) {
				if(level == count) {
					System.out.println("게임오버...");
					game = false;
				}else {
					System.out.println("작습니다. 더 큰 수를 입력하세요!");
					System.out.println();
					count +=1;
				}
			}
			else if(com <user) {
				if(level == count) {
					System.out.println("게임오버...");
					System.out.println("Press 1 to restart, 2 to quit.: ");
					go = s.nextInt();
					if(go == 2){
						game = false;
					}else{
						count+=1;
					}
				}else {
					System.out.println("큽니다. 더 작은 수를 입력하세요!");
					System.out.println();
					count += 1;
				}
			}
			
		}
		
	}

}
