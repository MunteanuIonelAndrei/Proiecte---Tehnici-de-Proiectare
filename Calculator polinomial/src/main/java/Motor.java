import java.util.ArrayList;
import java.util.Arrays;

public class Motor {
    Object o;
    String poli1;
    String poli2;
    Motor(Object o,String poli1,String poli2){
        this.o=o;
        this.poli1=poli1;
        this.poli2=poli2;
        operator(o);
    }

    private void operator(Object x){
       // Interfata a= new Interfata();
        Logica l = new Logica();
        Logica w = new Logica();
        Logica p = new Logica();

        Logica2 log1 = new Logica2();
        Logica2 log2 = new Logica2();
        Logica2 log3 = new Logica2();

        Operatii lol = new Operatii();
        Operatii lol1 = new Operatii();
        Operatii lol2 = new Operatii();

        Interfata.a.setText("");
        if(x==Interfata.b){
            ArrayList<String> v= log1.make_string(lol.adunare(log1.make_monom(l.monom(poli1)),log2.make_monom(w.monom(poli2))));
            for(int j=0; j<v.size();j++)
            {
                if(j>0 && v.get(j).charAt(0)!='-'){
                    Interfata.a.append("+"+v.get(j));
                }else
                    Interfata.a.append(v.get(j));
            }

        }else if(x==Interfata.b1){
            ArrayList<String> v=log2.make_string(lol1.scadere(log1.make_monom(l.monom(poli1)),log2.make_monom(w.monom(poli2))));
            for(int j=0; j<v.size();j++)
            {
                if(j>0 && v.get(j).charAt(0)!='-'){
                    Interfata.a.append("+"+v.get(j));
                }else
                    Interfata.a.append(v.get(j));
            }
        }else if(x==Interfata.b2){
            ArrayList<String> v =log3.make_string(lol2.derivata(log3.make_monom(p.monom(poli1))));

            for(int j=0; j<v.size();j++)
            {
                if(j>0 && v.get(j).charAt(0)!='-'){
                    Interfata.a.append("+"+v.get(j));
                }else
                    Interfata.a.append(v.get(j));
            }
        }else if(x==Interfata.b3){
            ArrayList<String> v= log1.make_string(lol.multiplicare(log1.make_monom(l.monom(poli1)),log2.make_monom(w.monom(poli2))));
            for(int j=0; j<v.size();j++)
            {
                if(j>0 && v.get(j).charAt(0)!='-'){
                    Interfata.a.append("+"+v.get(j));
                }else
                    Interfata.a.append(v.get(j));
            }
        }
    }


}
