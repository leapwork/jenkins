package com.Leapwork.Leapwork_plugin.model;

public final class InvalidSchedule {

	private String name;
	private String stackTrace;

	public InvalidSchedule(String name, String stackTrace) {
		this.name = name;
		this.stackTrace = stackTrace;
	}

	public String getName() {
		return name;
	}

	public String getStackTrace() {
		return stackTrace;
	}
}
