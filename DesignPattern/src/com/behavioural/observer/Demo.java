package com.behavioural.observer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {

	public static void main(String[] args) throws NumberFormatException, IOException {

		YoutubeChannel chanel = new YoutubeChannel();
		Suscriber aman = new Suscriber("Aman");

		chanel.addSubscriber(aman);
		chanel.notifyChanges("new Video is uploaded");
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			System.out.println("press 1 for uplode new Video");
			System.out.println("Press 2 for create new Subscriber");
			System.out.println("Press 3 for un Subscriber");
			System.out.println("press 4 for exist");
			
			int c = Integer.parseInt(reader.readLine());
			
			if(c==1) {
				// upload a new video
				System.out.println("Enter a video title");
				String title = reader.readLine();
				chanel.notifyChanges(title);
			
			}else if(c==2) {
				System.out.println("Enter a Subscroiber name");
				String name = reader.readLine();
				Suscriber sub = new Suscriber(name);
				chanel.addSubscriber(sub);
			}else if (c==3) {
				System.err.println("Enter a unscriber name");
				 String name = reader.readLine();
				 Suscriber sc = new Suscriber(name);
				 chanel.unSubscriber(sc);
				
			}
			else if(c==4) {
				// exit
				System.out.println("Thank you for using...");
				break;
			}else {
				// enter wrong input 
				System.out.println("You are pass  wronginput");			}
			
		}
		
		
		
	}

}


/**
   1. it is  a  design pattern
   2. In this state when subject changes the state all its dependents objects notified the changes.
   3. it will show one to many relationship.
 */
