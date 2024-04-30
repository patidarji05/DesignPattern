package com.creational.singeltone;

public class Singletone {

	private static  volatile Singletone instance;
	private String data;
	
	private Singletone(String data) {
		this.data = data;
	}
	 
	public static Singletone getInstance(String data){
//		if(instance == null) {
//		instance = new Singletone(data);
//		}
		
		if(instance == null) {
			synchronized (Singletone.class) {
				
				if(instance == null) {
					instance = new Singletone(data);
				}
				
			}
		}
		
		
		
		return instance;
		
	}
	
	 public String getData() {
	        return data;
	    }

}

/**
  
   1.  Add a private static file to the class for storing the singleton instance 
   
   2. Add private constructor , which mean that is can not be inherited directly.
     Make the constructor of the class private. The static method of the class will still be able to call the constructor, 
     but not the other objects.
   
   3. Declare a public static creation method for getting the singleton instance.
   
   4. lazy initialization  (when client call then object is create)
   
   
   // for mutithread environment 
    
    nothing is this code prevent two thread from accessing this piece of code at the same time.



 * 
 * 
 */
