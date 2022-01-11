package day31_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {



        public static void main(String[] args) {
            Offer offer1=new Offer();//Offer is the name of class;
            Offer offer2=new Offer();
            Offer offer3=new Offer();
            Offer offer4=new Offer();
            Offer offer5=new Offer();
            Offer offer6=new Offer();
            Offer offer7=new Offer();

           offer1.setInfo("VA","Amazon Int","SDET",110000,true,true,true,true);
            offer2.setInfo("CA","Sony Int","QA",120000,true, false, false,true);
            offer3.setInfo("FL","Appel Int","QE",125000,true ,true,true,true );
            offer4.setInfo("TX","Capital One","SM",115000, false, false ,true,true);
            offer5.setInfo("WA", "Bank Of America", "BA", 130000, true, true, true, true);
           // offer6.setInfo("Edmonton", "Citi", "Automation Tester", 120000, true, false, false, true);
          //  offer7.setInfo("Toronto", "TD", "Automation Tester", 85000, false, true, false, true);

            Offer[] myOffers={offer1,offer2,offer3,offer4,offer5};//==>return array then with aslist it became arraylist
            System.out.println(Arrays.toString(myOffers));


            ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffers));
            fullTimeOffers.removeIf(p -> p.isFullTime == false);
            System.out.println("fullTimeOffers = " + fullTimeOffers.size());


            ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(myOffers));
            localOffers.removeIf(p -> !p.location.equalsIgnoreCase("Toronto"));
            System.out.println("localOffers = " + localOffers);



            ArrayList<Offer> offersWithBenefits = new ArrayList<>(Arrays.asList(myOffers));
            offersWithBenefits.removeIf(p -> p.hasBenefit==false || p.hasPTO==false);
            System.out.println("offersWithBenefits = " + offersWithBenefits);


            ArrayList<Offer> sdetOffers = new ArrayList<>(Arrays.asList(myOffers));
            sdetOffers.removeIf(p -> !p.jobTitle.equalsIgnoreCase("sdet"));
            System.out.println("sdetOffers = " + sdetOffers);


            ArrayList<Offer> offersWith100K = new ArrayList<>(Arrays.asList(myOffers));
            offersWith100K.removeIf(p -> p.salary < 100000);
            System.out.println("offersWith100K = " + offersWith100K);



        }
    }

