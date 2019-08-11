package packAdapter_DomInteligentny.packDomInteligentny;

import packAdapter_DomInteligentny.IElementDomuInteligentnego;

public class SwiatlaAdapter implements IElementDomuInteligentnego {
    private final Swiatla swiatla;

    public SwiatlaAdapter(Swiatla swiatla) {
        this.swiatla = swiatla;
    }

    public void turnDeviceOn() {
        swiatla.turnOn();
    }

    public void turnDeviceOff() {
        swiatla.turnOff();
    }
}
