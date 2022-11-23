package com.aguerrero.dibujando;

public class HaciendoCaras {
	public static String pintaTrozoCara(String trozo, byte nVeces) {
        String ret = "";
        for (byte i = 0; i < nVeces; i++) {
            ret += trozo;
        }
        return ret;
    }

}

