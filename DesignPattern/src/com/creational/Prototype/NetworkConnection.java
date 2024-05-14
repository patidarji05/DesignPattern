package com.creational.Prototype;

public class NetworkConnection implements Cloneable {

	private String ip;
	private String impData;

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

	public void loadImpData() throws InterruptedException {
		this.impData = "it is very very imp data";
		Thread.sleep(3000);
		// it will take time to load arround 5 minute
	}

	@Override
	public String toString() {
		return "NetworkConnection [ip=" + ip + ", impData=" + impData + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
