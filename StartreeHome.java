package StarTree;

public class StartreeHome {
		//�̵�ﰢ�� �����
	
		String pad(char s ,int cnt) {
			String result =  "";
			for (int i = 0 ;  i<cnt; i ++) {
				result += s;
			}
			return result;
		}
		
		void draw(int cnt) {
			
			for (int i = 1 ;  i<cnt; i ++) {
				for (int j =1; j<10-cnt; j++) {
					System.out.print(' ');
				} //�տ� ����
				System.out.print(pad(' ',cnt-i)); //�������
				System.out.println(pad('*',(i*2)-1));
			}
		}
		
		void draw(int a, int b) {
			
			for (int i = a ;  i<b+1; i ++) {
				for (int j =1; j<10-b; j++) {
					System.out.print(' ');
				} //�տ� ����
				System.out.print(pad(' ',b-i)); //�������
				System.out.println(pad('*',(i*2)-1));
			}
		}
		
		
		void drawlow(int cnt) {
			
			for (int i = 1 ;  i<cnt; i ++) {
				for (int j =1; j<10-cnt; j++) {
					System.out.print(' ');
				} //�տ� ����
				System.out.print(pad(' ',cnt-i)); //�������
				System.out.println(pad('*',(i*2)));
				
			}
		}
		
		void stream(int cnt) {
			for (int i =0; i< cnt;i++) {
			System.out.print(pad(' ',7)); //�������
			System.out.println(pad('*',cnt));
			}
			
		}
				
	
		}

