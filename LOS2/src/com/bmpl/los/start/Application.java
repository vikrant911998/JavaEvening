package com.bmpl.los.start;

import com.bmpl.los.operation.LosProcess;
import com.bmpl.los.utils.Utility;

public class Application {

	public static void main(String[] args) {
		
		LosProcess los =  new LosProcess();
		
		while(true) {
			System.out.println("Do You have application number or not(enter zero)");
			int applicationNumber = Utility.scanner.nextInt();
			
			if(applicationNumber == -1) {
				System.out.println("Thanks for using");
				System.exit(0);
			}
			if(applicationNumber == 0) {
				
				//Sourcing Stage
				los.sourcing();
			}
			else {
				//checkStage
				los.checkStage(applicationNumber);
				
			}
		}

	}

}
