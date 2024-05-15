package com.creational.Prototype;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable {

	private String ip;
	private String impData;
	private List<String> domains = new ArrayList<>();

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getImpData() {
		return impData;
	}

	public void setImpData(String impData) {
		this.impData = impData;
	}

	public List<String> getDomains() {
		return domains;
	}

	public void setDomains(List<String> domains) {
		this.domains = domains;
	}

	public void loadImpData() throws InterruptedException {
		this.impData = "it is very very imp data";

		domains.add("www.google.com");
		domains.add("www.learnjava.com");
		domains.add("www.learnbypradeep.com");
		domains.add("www.learnwithcode.com");

		Thread.sleep(3000);
		// it will take time to load arround 5 minute
	}

	@Override
	public String toString() {
		return "NetworkConnection [ip=" + ip + ", impData=" + impData + ", domains=" + domains + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {

		// for shallow copy

		// return super.clone();

		// write own logic for deep copy design pattern

		NetworkConnection network = new NetworkConnection();
		network.setIp(this.getIp());
		network.setImpData(this.getImpData());
		for (String string : domains) {
			network.getDomains().add(string);
		}
		return network;
	}

}
