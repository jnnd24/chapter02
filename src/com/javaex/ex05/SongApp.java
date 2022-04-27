package com.javaex.ex05;

public class SongApp {

	public static void main(String[] args) {

		Song song01 = new Song();
		song01.setTitle("좋은날");
		song01.setArtist("아이유");
		song01.setAlbum("Real");
		song01.setComposer("이민수");
		song01.setYear(2010);
		song01.setTrack(3);
		
		Song song02 = new Song();
		song02.setTitle("거짓말");
		song02.setArtist("BIGBANG");
		song02.setAlbum("Always");
		song02.setComposer("G-DRAGON");
		song02.setYear(2007);
		song02.setTrack(2);
		
		Song song03 = new Song();
		song03.setTitle("벚꽃엔딩");
		song03.setArtist("버스커버스커");
		song03.setAlbum("버스커버스커1집");
		song03.setComposer("장범준");
		song03.setYear(2012);
		song03.setTrack(4);
		
		song01.showinfo();
		song02.showinfo();
		song03.showinfo();
		
	}

}
