package fr.unice.polytech.isa.dd;
import fr.unice.polytech.isa.dd.entities.Delivery;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/dd/deliveryService")
//@WebService(targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/dd/delivery")
//@WebService(targetNamespace = "http://www.group_d.fr.polytech.unice.isa.dd.DeliveryCare")
public interface DeliveryWebService {

//    @WebMethod
//    @WebResult(name="the_next_delivery")
//    Delivery getNextDelivery( @WebParam(name = "delivery") Delivery it);

    @WebMethod
    @WebResult(name="the_next_delivery")
    Delivery getNextDelivery();

    @WebMethod
    @WebResult(name="initialize_delivery_database")
    void initializeDelivery();

//    @WebMethod
//    @WebResult(name="the_next_enum")
//    Delivery getN(@WebParam(name = "delivery")  DroneStatus d);

}