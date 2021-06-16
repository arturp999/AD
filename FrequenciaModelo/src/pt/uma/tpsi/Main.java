package pt.uma.tpsi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args){

        CPU cpu = new CPU(4,64,3000);

        MobileDevice device  = new MobileDevice("Apple", "Iphone", 2021, 122131231, cpu);
     //   System.out.println(device.toString());

        CPU cpu2 = new CPU(3,16,1600);
        MobilePhone phone = new MobilePhone("Samsung", "Galaxy ", 2011, 1123131, cpu2, "4G");

        Tablet tablet = new Tablet("Apple", "Ipad ", 2010, 1214531,
                new CPU(2,32,2500), true);
        //  System.out.println(phone.toString() + " " + tablet.toString());

        ArrayList<MobileDevice> devices = new ArrayList<MobileDevice>();
        devices.add(device);
        devices.add(phone);
        devices.add(tablet);

        for (MobileDevice dev: devices) {
            System.out.println(dev.toString());
        }

        Collections.sort(devices);

        System.out.println("");

        for (MobileDevice dev: devices) {
            System.out.println(dev.toString());
        }


    }
}
