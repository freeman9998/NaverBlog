
public class car {

	String carNumber;
	int entryTime;
	int exitTime;
	int parkingFee;

	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public int getEntryTime() {
		return entryTime;
	}
	public void setEntryTime(int entryTime) {
		this.entryTime = entryTime;
	}
	public int getParkingFee() {
		return parkingFee;
	}
	public void setParkingFee(int parkingFee) {
		this.parkingFee = parkingFee;
	}
	public int getExitTime() {
		return exitTime;
	}
	
	public car(String carNumber, int entryTime, int exitTime, int parkingFee) {
		super();
		this.carNumber = carNumber;
		this.entryTime = entryTime;
		this.exitTime = exitTime;
		this.parkingFee = parkingFee;
	}
	public car(String carNumber, int entryTime) {
		super();
		this.carNumber = carNumber;
		this.entryTime = entryTime;
	}

	public void setEntryTime(String carNumber, int entryTime) {
		this.carNumber = carNumber;
		this.entryTime = entryTime;
	}

	public void setExitTime(int exitTime) {
		this.exitTime = exitTime;
	}

	public void parkingFee() {
		this.parkingFee = (this.exitTime - this.entryTime) * 1000;
	}
	
	void printParkingData(){
		System.out.println("-----------------------------------");
		System.out.printf("%s %s %s %s%n","차량번호","입차시간","출차시간","주차요금");
		System.out.println("-----------------------------------");
		System.out.printf("%5s %5d %5d %7d%n",this.carNumber,this.entryTime,this.exitTime,this.parkingFee);
		return;
	}
}
