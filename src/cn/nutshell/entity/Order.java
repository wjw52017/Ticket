package cn.nutshell.entity;

public class Order {
	private int num;
	private String trainnum;
	private String starttime;
	private String startstation;
	private String endstation;
	private int carr;
	private int seat;
	private int price;
	
	public int getnum() {
		return num;
	}

	public void setnum(int num) {
		this.num = num;
	}
	
	public String gettrainnum() {
		return trainnum;
	}

	public void settrainnum(String train_num) {
		this.trainnum = train_num;
	}
	
	public String getstarttime() {
		return starttime;
	}
	
	public void setstarttime(String start_time) {
		this.starttime = start_time;
	}
	
	public String getstartstation() {
		return startstation;
	}
	
	public void setstartstation(String start_station) {
		this.startstation = start_station;
	}
	
	public String getendstation() {
		return endstation;
	}
	
	public void setendstation(String end_station) {
		this.endstation = end_station;
	}
	
	public int getcarr() {
		return carr;
	}

	public void setcarr(int carr) {
		this.carr = carr;
	}
	
	public int getseat() {
		return seat;
	}

	public void setseat(int seat) {
		this.seat = seat;
	}
	
	public int getprice() {
		return price;
	}

	public void setprice(int price) {
		this.price = price;
	}

}
