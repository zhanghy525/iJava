package com.itheima;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Set;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.spi.AudioFileReader;


public class test {
	public static void main(String[] args) throws UnsupportedAudioFileException,
    IOException {
		HashMap<String,Integer> map = new HashMap<>();
		hashMapItest(map);
		
		File o = new File("a.mp3");
		System.out.println(o.getName());
		z.getAudioFileFormat(o);
		
		
		
		
		
	}

	private static void hashMapItest(HashMap<String, Integer> map) {
		map.put("最最", 11);
		map.put("込込", 12);
		System.out.println(map);
		Set<String> k = map.keySet();
		for(String x : map.keySet() ) {
			System.out.println(x + map.get(x));
		}
	}


	private static int y;
	
	public static String f1(int x) {
		String str = "";
		for(int y=x;y > 0;y/=10) {
			String temp2 = (y % 10) + "";
			str = temp2 + str;
		}
		return str;
	}
	
	public static void f2(int x) {
		if((x & (x-1)) ==0) {
			System.out.println("1");
		}
	}
	
	public static void f3(int x) {
		for(int y=1;;y*=2) {
			if(x > y && x< y<<1 ) {
				System.out.println(y << 1);
				break;
			}
		}
	}
	
	public static void f4(int x) {
		int y =1;
		while(true) {
			y *= 2;
			if(x > y && x< y <<1) {
				System.out.println(y<<1);
				break;
			}
		}
	}
}

class MyAudioFlieReader extends AudioFileReader{

	@Override
	public AudioFileFormat getAudioFileFormat(InputStream stream) throws UnsupportedAudioFileException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AudioFileFormat getAudioFileFormat(URL url) throws UnsupportedAudioFileException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AudioFileFormat getAudioFileFormat(File file) throws UnsupportedAudioFileException, IOException {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public AudioInputStream getAudioInputStream(InputStream stream) throws UnsupportedAudioFileException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AudioInputStream getAudioInputStream(URL url) throws UnsupportedAudioFileException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AudioInputStream getAudioInputStream(File file) throws UnsupportedAudioFileException, IOException {
		// TODO Auto-generated method stub
		return null;
	}
	
}
