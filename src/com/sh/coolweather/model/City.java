package com.sh.coolweather.model;

public class City {
	
	private int id;
	private String cityName;
	private String cityCode;
	private int provinceId;
	
	public int getId(){
		return this.id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public String getCityName(){
		return this.cityName;
	}
	
	public void setCityName(String name){
		this.cityName = name;
	}
	
	public String getCityCode(){
		return this.cityCode;
	}
	
	public void setCityCode(String code){
		this.cityCode = code;
	}
	
	public int getProvinceId(){
		return this.provinceId;
	}
	
	public void setProvinceId(int pid){
		this.provinceId = pid;
	}
	
}
