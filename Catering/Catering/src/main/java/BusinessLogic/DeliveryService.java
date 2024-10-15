package BusinessLogic;

import GUI.Administrator;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class DeliveryService implements IDeliveryServiceProcessing{

HashMap<Order, ArrayList<MenuItem>> map=new HashMap<Order,ArrayList<MenuItem>>();
ArrayList<Order> listaToateComenzi=new ArrayList<Order>();

    public ArrayList<Order> getListaToateComenzi() {
        return listaToateComenzi;
    }

    public void setListaToateComenzi(ArrayList<Order> listaToateComenzi) {
        this.listaToateComenzi = listaToateComenzi;
    }

    public HashMap<Order, ArrayList<MenuItem>> getMap() {
        return map;
    }

    public void setMap(HashMap<Order, ArrayList<MenuItem>> map) {
        this.map = map;
    }

    @Override
    public void generateReport1(int startHour, int endHour, DeliveryService model) throws IOException {
//toate orders: order1:< lista produse,data completa> cu endl dupa fiecare
        // intre  2 ore specificate de admin
        System.out.println(startHour);
        System.out.println(endHour);
        java.io.FileWriter writer = new FileWriter("Report1.txt");
        model.getListaToateComenzi().stream().filter(t ->
                        {
                            System.out.println(t.getOrderDate().getHour());
                            return t.getOrderDate().getHour() <= endHour;
                        }
                ).filter(t ->
                        {
                            return t.getOrderDate().getHour() >= startHour;
                        }
                ).
                forEach(t -> //pt fiecare order care indeplineste conditiile, o scriu in raport
                        { //firstly le afisez in consola
                            //System.out.println(t); merge bine asa
                            //le scriu intr-un fisier

                            //System.out.println(t);
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("OrderID: " + t.getOrderID() + ", clientID: " + t.getClientID() + ", orderDate " +
                                    t.getOrderDate().toString() + "\n Produsele: ");
                            String done = stringBuilder.toString();

                            try {
                                writer.write(done);

                            } catch (IOException e) {
                                e.printStackTrace();
                            }


                            model.getMap().get(t).stream().forEach(s -> //pt fiecare comanda care respecta, afisez si lista de produse
                            {
                               // System.out.println(s);

                                    StringBuilder str=new StringBuilder();
                                    str.append(s.toString()+"\n");
                                    String finis=str.toString();
                                try {
                                    writer.write(finis);
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }



                            });

                        }
                );
        //il inchid doar o data la final, altfel nu mai poate  scrie in continuare si va da stream closed exception de tip IO
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void generateReport2(int nrMinComandariSameProdus, DeliveryService model) throws IOException {
        //produsele comandate de minim atatea ori, DA SA APARA O DATA DOAR!!!
        java.io.FileWriter writer = new FileWriter("Report2");

        Administrator.getAdministrator().getMenuItems().stream().forEach(t ->
        {
            model.getMap().values().stream().filter(s ->
            {
                //System.out.println("Nr de aparitii al lui "+ t.getTitle()+" : "+Collections.frequency(s, t));
                return Collections.frequency(s, t) >= nrMinComandariSameProdus;
            }).distinct().collect(toSet()).forEach(element ->
            {
                StringBuilder str=new StringBuilder();
                str.append("Acest produs: " + t + "   a fost comandat de minim " + nrMinComandariSameProdus + " ori\n");
                try {
                    writer.write(str.toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        });
        writer.close();;
    }

    @Override
    public void generateReport3(int nrMinComenziPerClient, int specificAmount, DeliveryService model) throws IOException {
        java.io.FileWriter writer= new FileWriter("Report3.txt");
        .stream().filter(client ->
        { //pt fiecare client
            return model.getMap().keySet().stream().filter(cheie ->
            {//pt fiecare cheie, adica fiecare order verific daca a fost facuta de clientul meu
                return client.getClientID() == cheie.getClientId();
            }).collect(toList()).size() > nrMinComenziPerClient;//vreau sa fac rost de client doar daca lista oders fct de el
// are size minim de cat trebe in enunt
            //merg mai departe doar cu clientii aceia
        }).filter(client1 -> //valoarea comandata each time
                //pt fiecare entry in lista de comenzi
        {
            return client1.getClientID() == (model.getMap().keySet().stream().filter(k ->
            {  //vr doar comenzile cu id=k egal cu id-ul clientilor de la primu criteriu
                return k.getClientId() == client1.getClientID();
            }).collect(toList()).stream().filter(comanda1 ->
            {
                return comanda1.getOrderTotal() > specificAmount;
            }).collect(toList()).get(0).getClientId());
        }).collect(toList()).forEach(ok ->
        {
            System.out.println(ok); //imi face bine doamne ajutaaaa
            scriu.scrie("Alt client care respecta conditiile: " + "clientID:" + ok.getClientID() + ", clientName: " +
                    ok.getNume() + "\n");
        });
    }

}
