package Figury;

import com.sun.source.tree.CaseTree;

import javax.imageio.plugins.tiff.GeoTIFFTagSet;

public class Main {
    public static void main(String[] args) {
        Kwadrat kwadracik1 = new Kwadrat(5, "Zielony");
        Prostokat prostokacik1 = new Prostokat(8, 4, "Czarny");
        Trojkat trojkacik1 = new Trojkat(5, 9, "Różowy");
        Punkt punkcik1 = new Punkt(13, 7);
        kwadracik1.getKolor();
        prostokacik1.getKolor();
        trojkacik1.getKolor();
    }
}

