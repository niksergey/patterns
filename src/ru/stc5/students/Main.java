package ru.stc5.students;

import bridges.*;
import builder.Galustyan.DjamshutBuilder;
import builder.Svetlakov.Boss;
import decorator.InternetTariff;
import decorator.MainTariff;
import decorator.RoumingTariff;
import decorator.SmsTariff;
import factory.Mauser.MauserFactory;
import factory.Revolver;
import factory.WeaponFactory;
import factory.colt.ColtRevolver;
import observer.Hr;
import observer.Worker;

public class Main {

    public static void main(String[] args) {
	// write your code here
        WeaponFactory factory = new MauserFactory();
        Revolver revolver = factory.createRevolver();
        new ColtRevolver();

        DjamshutBuilder djamshut = new DjamshutBuilder();
        Boss boss = new Boss(djamshut);
        boss.build();

        System.out.println();

        MainTariff mainTariff = new MainTariff();
        SmsTariff smsTariff = new SmsTariff(mainTariff);
        InternetTariff internetTariff = new InternetTariff(smsTariff);
        RoumingTariff roumingTariff = new RoumingTariff(internetTariff);

        roumingTariff.processTariff();

        System.out.println();

        Hr hr = new Hr();

        Worker vasya = new Worker(1);
        Worker petya = new Worker(2);
        Worker katya = new Worker(3);

        hr.registerObserver(vasya);
        hr.registerObserver(katya);
        hr.registerObserver(petya);

        hr.notifyAllObservers();

        System.out.println();
        hr.removeObserver(petya);

        hr.notifyAllObservers();

        System.out.println();

        BasicSocialWeb facebook = new FacebookSocialWeb();
        ExtendedSocialWeb extendedSocialWeb = new ExtendedSocialWebAdapter(facebook);

        System.out.println(extendedSocialWeb.getHistory(1, "May 4"));

        System.out.println(extendedSocialWeb.getLikes(1, true, 2));

        System.out.println("\nDETECTIVE:");
        Detective detective = new Detective();
        System.out.println(detective.getUserDossier(1, "May 4"));

        System.out.println("\nInspector:");
        Inspector inspector = new Inspector();
        System.out.println(inspector.getPayDetails(1));
    }
}
