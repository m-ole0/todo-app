package com.example.demo;

public class EnvCheck {
	public static void main(String[] args) {
		System.out.println("[" + System.getenv("DB_PASSWORD") + "]");
	}
}