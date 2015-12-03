package com.sh.coolweather.model;

public class County {

	private int id;
	private String countyName;
	private String countyCode;
	private int cityId;
	
	public int getId(){
		return this.id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public String getCountyName(){
		return this.countyName;
	}
	
	public void setCountyName(String name){
		this.countyName = name;
	}
	
	public String getCountyCode(){
		return this.countyCode;
	}
	
	public void setCountyCode(String code){
		this.countyCode = code;
	}
	
	public int getCityId(){
		return this.cityId;
	}
	
	public void setCityId(int cid){
		this.cityId = cid;
	}
}
