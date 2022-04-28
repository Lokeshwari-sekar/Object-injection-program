package com.edu;

public class HumanBody {

	private Heart heart;

	public Heart getHeart() {
		return heart;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	 public void heartFunction()
	 {
		 if(heart!=null)
		 {
			 heart.pump();
		 }
		 else
		 {
			 System.out.println("Not Alive");
		 }
		 
	 }

}
