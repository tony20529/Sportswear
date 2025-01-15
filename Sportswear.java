package com;

public class Sportswear {
	private String name;
	private Integer clothes;
	private Integer pants;
	private Integer socks;
	private Integer shoes;
	private Boolean newguest;
	private Integer sum;
	
	
	

	public Sportswear( String name , Integer clothes, Integer pants, Integer socks, Integer shoes , Boolean newguest) {
		super();
		this.name=name;
		this.clothes = clothes;
		this.pants = pants;
		this.socks = socks;
		this.shoes = shoes;
		this.newguest=newguest;
		sum=clothes*300+pants*350+socks*49+shoes*500+60;
		if(sum>=500)
		{
			sum=sum-60;
			if(sum>=3500)sum=sum-350;
			else if(sum>=1800)sum=sum-150;
			else if(sum>=1000 && newguest==true)sum=sum-100;
			else if(sum>=1000)sum=sum-50;
			else sum=sum;
						
		}
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getClothes() {
		return clothes;
	}

	public void setClothes(Integer clothes) {
		this.clothes = clothes;
	}

	public Integer getPants() {
		return pants;
	}

	public void setPants(Integer pants) {
		this.pants = pants;
	}

	public Integer getSocks() {
		return socks;
	}

	public void setSocks(Integer socks) {
		this.socks = socks;
	}

	public Integer getShoes() {
		return shoes;
	}

	public void setShoes(Integer shoes) {
		this.shoes = shoes;
	}
	
	public Boolean getNewguest() {
		return newguest;
	}
	
	public void setNewguest(Boolean newguest) {
		this.newguest = newguest;
	}


	public Integer getSum() {
		return sum;
	}
	
	

}
