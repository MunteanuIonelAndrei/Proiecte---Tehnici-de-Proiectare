import java.util.ArrayList;
import java.util.Arrays;

public class Operatii {

    public ArrayList<Monom> adunare(ArrayList<Monom> x, ArrayList<Monom> y) {
        ArrayList<Monom> v = new ArrayList<>();
        Integer[] mio = new Integer[x.size()];
        Integer[] mio2 = new Integer[y.size()];
        Arrays.fill(mio, 0);
        Arrays.fill(mio2, 0);

        for (int i = 0; i < x.size(); i++) {
            for (int j = 0; j < y.size(); j++) {
                if (x.get(i).exponent == y.get(j).exponent) {
                    int q = x.get(i).coeficient + y.get(j).coeficient;
                    Monom m = new Monom(q, x.get(i).exponent);
                    v.add(m);
                    mio[i] = 1;
                    mio2[j] = 1;

                }
            }
        }

        for (int i = 0; i < mio.length; i++) {
            if (mio[i] == 0) {
                v.add(x.get(i));
            }
        }

        for (int j = 0; j < mio2.length; j++) {
            if (mio2[j] == 0) {
                v.add(y.get(j));
            }

            for (Monom monom : v) {
                System.out.println(monom.coeficient);
                System.out.println(monom.exponent);
                System.out.println();

            }

        }
        return v;
    }

    public ArrayList<Monom> scadere(ArrayList<Monom> x, ArrayList<Monom> y) {
        ArrayList<Monom> v = new ArrayList<>();
        Integer[] mio = new Integer[x.size()];
        Integer[] mio2 = new Integer[y.size()];
        Arrays.fill(mio, 0);
        Arrays.fill(mio2, 0);

        for (int i = 0; i < x.size(); i++) {
            for (int j = 0; j < y.size(); j++) {
                if (x.get(i).exponent == y.get(j).exponent) {
                    int q = x.get(i).coeficient - y.get(j).coeficient;

                    if ((x.get(i).coeficient > 0 && y.get(j).coeficient > 0) || (x.get(i).coeficient < 0 && y.get(j).coeficient < 0)) {
                        Monom m = new Monom(q, 0);
                        v.add(m);

                    } else {
                        Monom m = new Monom(q, x.get(i).exponent);
                        v.add(m);
                    }
                    mio[i] = 1;
                    mio2[j] = 1;
                }
            }
        }

        for (int i = 0; i < mio.length; i++) {
            if (mio[i] == 0) {
                v.add(x.get(i));
            }
        }
        for (int i = 0; i < mio2.length; i++) {
            if (mio2[i] == 0) {
                int c = y.get(i).coeficient;
                int e = y.get(i).exponent;
                c = c * (-1);
                Monom b = new Monom(c, e);
                v.add(b);
            }
        }

        for (Monom monom : v) {
            System.out.println(monom.coeficient);
            System.out.println(monom.exponent);
            System.out.println();

        }
        return v;
    }

    public ArrayList<Monom> derivata(ArrayList<Monom> x) {
        ArrayList<Monom> v;
        v = x;
        for (int i = 0; i < x.size(); i++) {
            if (v.get(i).exponent == 0) {
                v.get(i).coeficient = 0;
            } else {
                v.get(i).coeficient *= v.get(i).exponent;
                v.get(i).exponent--;
            }
            for (Monom monom : v) {
                System.out.println(monom.coeficient);
                System.out.println(monom.exponent);

            }
        }
        return v;
    }

    public ArrayList<Monom> multiplicare(ArrayList<Monom> x, ArrayList<Monom> y) {
        ArrayList<Monom> v = new ArrayList<>();
        ArrayList<Monom> h = new ArrayList<>();
        ArrayList<Integer> exp = new ArrayList<>();
        for (Monom monom : x) {
            for (Monom value : y) {
                int c = monom.coeficient * value.coeficient;
                int e = monom.exponent + value.exponent;
                Monom m = new Monom(c, e);
                v.add(m);
            }
        }
            for (int j = 0; j < v.size(); j++) {
                int q = v.get(j).exponent;
                for (int p = j + 1; p < v.size(); p++) {
                    if (v.get(p).exponent == q && !exp.contains(p) && !exp.contains(j)) {
                        int c = v.get(j).coeficient;
                        c += v.get(p).coeficient;
                        exp.add(p);
                        Monom m = new Monom(c, v.get(j).exponent);
                        h.add(m);
                        exp.add(j);
                    }
                }
            }
            for (int r = 0; r < v.size(); r++) {
                if (!exp.contains(r)) {
                    h.add(v.get(r));
                }
                //+3x^2-1x+1
                //+1x-2
                //-1+3x^2
                //-2x+3+3x^2
                //-7x^2+3x+3x^3-2
                //6x-1
            }
            return h;
    }
}
