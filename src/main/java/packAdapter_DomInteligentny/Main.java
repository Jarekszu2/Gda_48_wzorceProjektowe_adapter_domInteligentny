package packAdapter_DomInteligentny;

import packAdapter_DomInteligentny.packDomInteligentny.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        List<IElementDomuInteligentnego> dom = new ArrayList<IElementDomuInteligentnego>();

        dom.add(new CzajnikAdapter(new Czajnik()));
        dom.add(new LodowkaAdapter(new Lodowka()));
        dom.add(new SwiatlaAdapter(new Swiatla()));

        for (IElementDomuInteligentnego iElementDomuInteligentnego : dom) {
            iElementDomuInteligentnego.turnDeviceOn();
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println();
        for (IElementDomuInteligentnego iElementDomuInteligentnego : dom) {
            iElementDomuInteligentnego.turnDeviceOff();
        }


    }
}
