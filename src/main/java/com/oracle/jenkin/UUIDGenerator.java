package com.oracle.jenkin;

import java.util.UUID;
import java.util.stream.IntStream;

public class UUIDGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<58;i++) {
			System.out.println(UUID.randomUUID());
		}
	}

}
