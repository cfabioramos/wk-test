package com.br.test.wk.constants;

import java.util.Arrays;

public enum TipoRisco {

	A,
	B,
	C;

	public static TipoRisco fromValue(String value) {
		for (TipoRisco tipo : values()) {
			if (tipo.toString().equalsIgnoreCase(value)) {
				return tipo;
			}
		}
		throw new IllegalArgumentException(
				"Unknown enum type " + value + ", Allowed values are " + Arrays.toString(values()));
	}
	
}
