package BusinessLogic;

import java.io.IOException;

public interface IDeliveryServiceProcessing {
    public void generateReport1(int startHour, int endHour,DeliveryService model) throws IOException;
    public void generateReport2(int nrMinComandariSameProdus,DeliveryService model) throws IOException;
    public void generateReport3(int nrMinComenziPerClient,int specificAmount,DeliveryService model) throws IOException;
}
