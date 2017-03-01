package cn.nutshell.entity;

public class Query {
	private int num;
	private String trainnum;
	private String starttime;
	private String endtime;
	private String startstation;
	private String endstation;
	private int business;
	private int first;
	private int second;

	
	public int getnum() {
		return num;
	}

	public void setnum(int num) {
		this.num = num;
	}
	
	public Query() {
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
	
	public String getendtime() {
		return endtime;
	}
	
	public void setendtime(String end_time) {
		this.endtime = end_time;
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
	
	public int getbusiness() {
		return business;
	}

	public void setbusiness(int business) {
		this.business = business;
	}
	
	public int getfirst() {
		return first;
	}

	public void setfirst(int first) {
		this.first = first;
	}
	
	public int getsecond() {
		return second;
	}

	public void setsecond(int second) {
		this.second = second;
	}

	
}
