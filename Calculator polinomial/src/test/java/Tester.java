import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class Tester {
    public class Testing {
        @Test
        public void adunareTest() {
            Logica l = new Logica();
            Logica w = new Logica();
            Logica p = new Logica();

            Logica2 log1 = new Logica2();
            Logica2 log2 = new Logica2();
            Logica2 log3 = new Logica2();

            Operatii lol = new Operatii();
            Operatii lol1 = new Operatii();
            Operatii lol2 = new Operatii();
            String poli1 = "+3x^2-1x+1";
            String poli2 = "+1x-2";
            ArrayList<String> rezultat = new ArrayList<String>();
            rezultat.add("-1");
            rezultat.add("+3x^2");

            ArrayList<String> v = log1.make_string(lol.adunare(log1.make_monom(l.monom(poli1)), log2.make_monom(w.monom(poli2))));
            assertEquals(rezultat, v);
        }

    }
}
