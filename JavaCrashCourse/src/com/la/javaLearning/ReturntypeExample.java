package com.la.javaLearning;

public class ReturntypeExample {
	public Integer CollectAmount = 1000;
	
	public Integer collectAmtandGive() {
		System.out.println("Amount collected and given is $"+ CollectAmount);
		return CollectAmount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturntypeExample Receiveamt = new ReturntypeExample();
		Integer AmtReceived = Receiveamt.collectAmtandGive();
		System.out.println("Amount received in $"+AmtReceived);

	}

}
