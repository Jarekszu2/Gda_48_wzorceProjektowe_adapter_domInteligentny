package packAdapter_DomInteligentny.packDomInteligentny;

import packAdapter_DomInteligentny.IElementDomuInteligentnego;

public class LodowkaAdapter implements IElementDomuInteligentnego {
    private final Lodowka lodowka;

    public LodowkaAdapter(Lodowka lodowka) {
        this.lodowka = lodowka;
    }

    public void turnDeviceOn() {
        lodowka.on();
    }

    public void turnDeviceOff() {
        lodowka.off();
    }
}
