import java.util.ArrayList;

public class Logica {
    String polinom;
    ArrayList<String> poli1 = new ArrayList<>();

  /*  Logica(String polinom) {
        this.polinom = polinom;

    }*/

    char arr5 ;

    public void makeString(char x){
      arr5 =x;
    }


    public int cateMonoame(String x) {
        int a = 0;
        for (int i = 0; i < x.length(); i++) {
            char c = x.charAt(i);
            if ('+' == c || '-' == c) {
                a++;
            }
        }
        return a + 1;
    }
    int g=0;
    public ArrayList<String> monom(String x) {

        int j = 0;
        for (int i = 0; i < cateMonoame(x); i++) {
            char[] arr = new char[x.length()];
            int q=0;
            do {
                arr[q] = x.charAt(j);
                j++;
                q++;
                if (j == x.length())
                    break;

            } while (x.charAt(j) != '+' && x.charAt(j) != '-' && j!=1);


           if (j==1) {

               arr5=arr[0];
               g = 1;

           }else if(g==1){
               char[] arr4 = new char[q+1];
               arr4[0]=arr5;
               for (int l=1;l<=q; l++) {
                   arr4[l] = arr[l-1];
               }
                   String Str = String.valueOf(arr4);
                   poli1.add(Str);
                   g=0;

           }else{
               char[] arr2=new char[q];
               System.arraycopy(arr, 0, arr2, 0, q);
               String Str = String.valueOf(arr2);
               poli1.add(Str);
           }

        }
        return poli1;
    }
/*
    public void afis(ArrayList<String> x) {
        for (Object o : x) {
            System.out.println(o);
        }
    }



       public String toString () {
         return this.polinom;
       }*/



}
