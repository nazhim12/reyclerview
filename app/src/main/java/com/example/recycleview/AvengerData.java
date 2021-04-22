package com.example.recycleview;

import java.util.ArrayList;

public class AvengerData {
    private static String[] name = {
            "Robert Downey, Jr.",
            "Scarlett Johansson",
            "Chris Evans",
            "Benedict Cumberbatch",
            "Chris Hemsworth",
            "Elizabeth Olsen",
            "Jeremy Renner",
            "Zoe Saldana",
            "Pom Klementieff",
            "Chadwick Boseman",
            "Tom Holland"
    };
    private static String[] karakter = {
            "Iron Man",
            "Black Widow",
            "Captain America",
            "Dr. Strange",
            "Thor",
            "Wanda Maximoff",
            "Hawkeye",
            "Gamora",
            "Mantis",
            "Black Panther",
            "Spider Man"
    };

    private static String[] details = {
         " Infinity War adalah film pahlawan super Amerika 2018 yang didasarkan pada tim superhero Marvel Comics the Avengers, " +
                 "diproduksi oleh Marvel Studios dan didistribusikan oleh Walt Disney Studios Motion Pictures. Ini adalah sekuel The Avengers 2012 dan Avengers: Age of Ultron 2015, dan film kesembilan belas di Marvel Cinematic Universe (MCU). Film ini disutradarai oleh Anthony dan Joe Russo, " +
                 "Dalam film tersebut, Avengers dan Guardians of the Galaxy berupaya mencegah Thanos dari mengumpulkan enam Batu Infinity yang sangat kuat sebagai bagian dari upayanya untuk membunuh setengah dari seluruh kehidupan di alam semesta."

    };

    private static int[] images = {
            R.drawable.ironman,
            R.drawable.blackwidow,
            R.drawable.captain,
            R.drawable.drstrange,
            R.drawable.thor,
            R.drawable.witch,
            R.drawable.hawkeye,
            R.drawable.gamora,
            R.drawable.mantis,
            R.drawable.blackpanther,
            R.drawable.spider
    };

    static ArrayList<Avenger> getListData() {
        ArrayList<Avenger> list = new ArrayList<>();
        for (int position = 0; position < name.length; position++) {
            Avenger avenger = new Avenger();
            avenger.setName(name[position]);
            avenger.setKarakter(karakter[position]);
            avenger.setDetail(details[position]);
            avenger.setPhoto(images[position]);
            list.add(avenger);
        }
        return list;
    }
}
