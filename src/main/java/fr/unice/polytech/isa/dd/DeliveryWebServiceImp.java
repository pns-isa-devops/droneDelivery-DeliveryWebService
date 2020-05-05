package fr.unice.polytech.isa.dd;
import fr.unice.polytech.isa.dd.entities.Database;
import fr.unice.polytech.isa.dd.entities.Delivery;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;
import java.util.List;

@WebService(targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/dd/deliveryService")
//@WebService(targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/dd/delivery")
//@WebService(targetNamespace = "http://www.group_d.fr.polytech.unice.isa.dd.DeliveryCare")
@Stateless(name = "DeliveryWS")
public class DeliveryWebServiceImp implements DeliveryWebService {

    @EJB private NextDeliveryInterface nextDelivery;
    @EJB private DeliverySchedule deliverySchedule;

    @Override
    public Delivery getNextDelivery() {
        System.out.println("Avoir la prochaine livraison");
        Delivery delivery = nextDelivery.getNextDelivery();
        return delivery;
    }

    @Override
    public Delivery findDeliveryByDateAndHour(String d,String h) throws Exception {
        System.out.println("Trouver une livraison par date et heure");
        Delivery delivery = deliverySchedule.findDeliveryByDateAndHour(d,h);
        return delivery;
    }

    @Override
    public List<Delivery> getAllDeliveriesOfTheDate(String d){
        System.out.println("Obtenir les livraisons d'une date donnée");
        List<Delivery> delivery = deliverySchedule.all_deliveries_of_theDate(d);
        return delivery;
    }

    //    @Override
//    public Delivery getN(DroneStatus a){
//        System.out.println("Passage dans mon service 1");
//        Delivery d = nextDelivery.getNextDelivery();
//        System.out.println("le prix est " + d.getPrice());
//        return d;
//    }

}