package com.behavioural.observer;

public interface Subject {
	
	void addSubscriber(Observer ob);
	void unSubscriber(Observer ob);
	void notifyChanges(String title);

}
