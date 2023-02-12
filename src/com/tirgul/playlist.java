package com.tirgulJava;//package com.mypackage2;

import java.util.ArrayList;

public class playlist {

    public static void main(String[] args) {
        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
        desertIslandPlaylist.add("Song 1");
        desertIslandPlaylist.add("Song 2");
        desertIslandPlaylist.add("Song 3");
        desertIslandPlaylist.add("Song 4");
        desertIslandPlaylist.add("Song 5");
        desertIslandPlaylist.add("Song 6");
        desertIslandPlaylist.add("Song 7");
        System.out.println(desertIslandPlaylist);
        System.out.println("Size " + desertIslandPlaylist.size());
        desertIslandPlaylist.remove("Song 4");
        desertIslandPlaylist.remove("Song 6");

        int indexA = desertIslandPlaylist.indexOf("Song 2");
        int indexB = desertIslandPlaylist.indexOf("Song 7");
        System.out.println("Index of song 2 - " + desertIslandPlaylist.indexOf("Song 2"));
        System.out.println("Index of song 7 - " + desertIslandPlaylist.indexOf("Song 7"));
        String tempA = "Song 2";
        desertIslandPlaylist .set(indexA, "Song 7");
        desertIslandPlaylist .set(indexB, tempA);
        System.out.println(desertIslandPlaylist);




    }

}
