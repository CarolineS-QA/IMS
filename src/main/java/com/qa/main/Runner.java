package com.qa.main;

import java.sql.SQLException;
import java.util.Scanner;

public class Runner {

	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws SQLException {
		Database db = new Database();
		try {
			// call methods in here
		} finally {
			scan.close();
			db.close();
		}

	}
}
