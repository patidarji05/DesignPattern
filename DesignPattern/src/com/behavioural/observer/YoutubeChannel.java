package com.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject {

	List<Observer> subscriber = new ArrayList<>();

	@Override
	public void addSubscriber(Observer ob) {
		this.subscriber.add(ob);

	}

	@Override
	public void unSubscriber(Observer ob) {
		this.subscriber.remove(ob);

	}

	@Override
	public void notifyChanges(String title) {

		for (Observer observer : this.subscriber) {
			observer.notified(title);
		}

	}

}
