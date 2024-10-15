import java.util.ArrayList;

public class Logica2 {


    public ArrayList<Monom> make_monom (ArrayList<String> x){
         ArrayList<Monom> mon = new ArrayList<>();

        for (String y : x) {

            if(!y.contains("x^")&&!y.contains("x")) {

                int a = Integer.parseInt(y);
                int b = 0;
                Monom m = new Monom(a, b);
                mon.add(m);

            }else if (y.contains("x")&&!y.contains("x^")){

                String[] parts = y.split("x");
                String coeficient = parts[0];

                int a = Integer.parseInt(coeficient);
                int b = 1;


                Monom m = new Monom(a, b);
                mon.add(m);

            }else if(y.contains("x^")){

                String[] parts = y.split("x\\^");
                String coeficient = parts[0];
                String exponent = parts[1];

                int a = Integer.parseInt(coeficient);
                int b = Integer.parseInt(exponent);

                Monom m = new Monom(a, b);
                mon.add(m);

            }

        }
        return mon;
    }


    public ArrayList<String> make_string(ArrayList<Monom> x ){
        ArrayList<String> v= new ArrayList<>();

        for (Monom monom : x) {
            int c = monom.coeficient;
            int e = monom.exponent;

            if (c == 0)
                continue;
            else if (e == 0) {
                v.add(c + "");
            } else if (e == 1) {
                v.add(c + "x");
            } else {
                v.add(c + "x^" + e);
            }
        }
        for(int j=0; j<v.size();j++)
        {
            if(j>0 && v.get(j).charAt(0)!='-'){
                System.out.print("+"+v.get(j));
            }else
            System.out.print(v.get(j));
        }
    return v;

    }

/*
    public String make_string2(ArrayList<Monom> x ){
        String v= "";

        for (Monom monom : x) {
            int c = monom.coeficient;
            int e = monom.exponent;

            if (c == 0)
                continue;
            else if (e == 0) {
                v.concat(c + "");
            } else if (e == 1) {
                v.concat(c + "x");
            } else {
                v.concat(c + "x^" + e);
            }
        }
        /*
        for(int j=0; j<v.size();j++)
        {
            if(j>0 && v.get(j).charAt(0)!='-'){
                System.out.print("+"+v.get(j));
            }else
                System.out.print(v.get(j));
        }
        return v;

    }*/
/*
    public String ms(ArrayList<String> x){
        String[] s = new String[x.size()];
        for (int i=0;i< x.size();i++){
            if(x.get(i)=="+")
            s[i]="+"+x.get(i);
        }
           StringBuffer sb =new StringBuffer();
        for (String value : s) {
            sb.append(value);
        }
        return sb.toString();
    }*/


}
