package com.bajajfinserv.api;

import java.util.Arrays;

public class Data {
	private String[] data;

	public Data(String[] data) {
		super();
		this.data = data;
	}

	public Data() {
		super();
	}

	public String[] getData() {
		return data;
	}

	public void setData(String[] data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Data [data=" + Arrays.toString(data) + "]";
	}

}
