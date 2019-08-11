package packAdapter_DomInteligentny.packDomInteligentny;

import packAdapter_DomInteligentny.IElementDomuInteligentnego;

public class CzajnikAdapter implements IElementDomuInteligentnego {
    private final Czajnik czajnik;

    public CzajnikAdapter(Czajnik czajnik) {
        this.czajnik = czajnik;
    }

    public void turnDeviceOn() {
        czajnik.uruchomSie();
    }

    public void turnDeviceOff() {
        czajnik.zamknijSie();
    }
}
