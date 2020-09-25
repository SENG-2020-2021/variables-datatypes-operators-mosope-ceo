class Main {
  public static void main(String[] args) {
    float 	amountToPayDaily = 100.00f;					  //amount debtor opted to pay back per day
		 float 	DebtOwed = 500.00f;							      //total amount owed by debtor
		 int 	daysDebtorPaid = 0;							        //number of days debtor made	
		 int 	daysNotCaptured = 0;						        //number of days that payment was up to $100
		 float 	amountLeftTopay,amountDebtorPaid;			//amount left to pay //amount debtor has paid
		 byte 	payBackDays = 5;							        //amount of days debtor chose to pay back	
		 int 	daysLeftToPay;								          //days left to pay up
		 float	day1 = 100.00f;  							        //full amount paid on day1
		 float 	day2 = 100.00f;   							      //full amount paid on day2
		 float 	day3 = 50.00f;								        //full payment was'nt made
		 float 	day4 = 60.00f;								        //full payment was'nt made
		 float 	day5 = 0.00f;								          //no payment has been made
		 
		
		 
		 			
		 		System.out.println("Debtor opted-in on the 5 days loan pay back plan");
		 		
		 		
		 
		 	/*********************************************************************
		 	 * calculating the  total amount paid by the debtor within the 5 days 
		 	 *********************************************************************/
		 amountDebtorPaid = (day1 + day2 + day3 + day4 + day5);
		 		System.out.println("Amount debtor paid " + "=" + "$"+ amountDebtorPaid);
		 		
		 			
		 	/***********************************************************************
			 * set of IF statements here checks if payment was maid at all on any day
			 **********************************************************************/		
		if (day1 > 0.00f )       
			 daysDebtorPaid += 1;
		
		if (day2 > 0.00f ) 
			 daysDebtorPaid += 1;
		
		if  (day3 > 0.00f ) 
			 daysDebtorPaid += 1;
		 
		if (day4 > 0.00f ) 
			 daysDebtorPaid += 1; 
		 
		if  (day5 > 0.00f ) 
			 daysDebtorPaid += 1;
			 
				System.out.println("Number of days the Debtor made a payment "+ "=" + " " + daysDebtorPaid+ " days");
				
		 
		 /***************************************************************************************
		  * set of IF statements here check if complete payment was made on any of the five days
		  ***************************************************************************************/
		if ((day1 != 100.00f) && (day1 != 0.00f)){
				daysNotCaptured += 1;
						 }
										 
		if ((day2 != 100.00f ) && (day2 !=0.00f)) {
				 daysNotCaptured += 1;
						 }	
										 
		if  ((day3 != 100.00f ) && (day3 != 0.00f)){
				daysNotCaptured += 1;
						 }
											 
		if ((day4 !=  100.00f ) && (day4 != 0.00f)){
				daysNotCaptured += 1; 
						 }
										 
		if ((day5 != 100.00f ) && (day5 !=0.00f)){
				daysNotCaptured += 1;
						}
			
				System.out.println("The number of days that were not captured due to incomplete payment = " + daysNotCaptured+ " days");
				
		 		
		 /***********************************************************
		  * to calculate the amount remaining for the debtor to pay 
		 ***********************************************************/
		 	amountLeftTopay = (DebtOwed - amountDebtorPaid);
		 		 System.out.println("The amount left for Debtor to pay = " + "$" + amountLeftTopay);
		 		 
		 			
		 /*****************************
		  * Day(s) Debtor has'nt paid for		
		  *****************************/
		 	daysLeftToPay = (payBackDays - daysDebtorPaid);
		 		 System.out.println("Number of days Debtor has left to pay up "+ "="+ " "+daysLeftToPay+ " day");	
  }
}