
public class parkingProgram {
	
	public static void main(String[] args) { 
	
	car carArray[] = {
			null,null,new car("5654", 8),null,null,
			new car("3422", 12),null,null,null,null,
			null,null,null,null,new car("7789", 11),
			new car("1120", 10),null,null,null,null,
			null,new car("2389", 9),null,null,null,
			null,null,null,null,new car("5555", 6)
	};
	
	System.out.println("1.전체 차량출력");
	for (int i = 0; i < carArray.length; i++) {
		if (carArray[i] != null) {
			carArray[i].printParkingData();
		}
	}
	System.out.println("2.전체 주차 구획수");
	System.out.println(">>" + carArray.length);
	System.out.println("3.주차가능 주차구");
	int count = 0;
	for (int i = 0; i < carArray.length; i++) {
		if (carArray[i] == null) {
			count++;
		}
	}
	System.out.println(">>" + count);
	System.out.println("4.입차");
	/*
	 * 1.차량객체생성 2.빈자리찾아서 대입
	 */
	int random;
	String carno;
	int intime;
	// 빈자리에 입차
	for (int i = 0; i < carArray.length; i++) {
		if (carArray[i] == null) {
			random = (int) (Math.random() * 10000);
			if (random > 1000 && random < 10000) { // 차량번호를 1000~9999로 잡기위한 조건
				carno = String.valueOf(random); // int타입을 Stirng타입으로 변환
				intime = (int) (Math.random() * 23); // 0~23시간 기준
				carArray[i] = new car(carno, intime);
				// 차량번호 중복체크
				for (int j = 0; j < i; j++) {
					if (carArray[i] == carArray[j]) {
						i--;
					}
				}
			} else {
				// 차량번호가 1000~9999사이를 만족못 할 경우
				i--;
			}
		}
	}
	System.out.println("5.입차시간 10시이후 차량여러대 찾아서 출력");
	for (int i = 0; i < carArray.length; i++) {
		if (carArray[i].getEntryTime() > 10) {
			carArray[i].printParkingData();
		}
	}

	System.out.println("6.차량번호 7789번 차한대 정보출력");
	for (int i = 0; i < carArray.length; i++) {
		if (carArray[i].getCarNumber().equals("7789")) {
			carArray[i].printParkingData();
		}
	}
	System.out.println("7.2389번 차량 12시 출차");
	/*
	 * 1. 2389번차량찾기 2. 출차 3. 영수증출력 4. 주차장에서 차량삭제
	 */
	for (int i = 0; i < carArray.length; i++) {
		if (carArray[i].getCarNumber().equals("2389")) {
			carArray[i].setExitTime(12); // 출차시간 입력
			carArray[i].parkingFee(); // 주차 요금 계산
			carArray[i].printParkingData(); // 영수증 출력
			carArray[i] = null; // 차량 삭제
		}
	}
}
}