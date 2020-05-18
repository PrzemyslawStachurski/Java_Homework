package com.company;

public class Main {

    public static void main(String[] args) {
        SystemAudioSpecyficzny SAS = new SystemAudioSpecyficzny();
        SAS.odtwarzaj();
        SAS.nagrywaj();
        SAS.odtwarzajRadio();
        SAS.wylacz();
    }
}

interface OdtwarzaczAudio {
    void odtwarzaj();
}

interface NagrywarkaAudio {
    void nagrywaj();
}

interface OdtwarzaczRadio {
    void odtwarzajRadio();
}

interface SystemAudio extends OdtwarzaczAudio, NagrywarkaAudio {
}

abstract class SystemAudioPodstawowy implements SystemAudio, OdtwarzaczRadio {
    public void odtwarzaj() {
        System.out.println("odtwarzaj audio");
    }

    public void nagrywaj() {
        System.out.println("nagrywaj audio");
    }
}

class SystemAudioSpecyficzny extends SystemAudioPodstawowy {
    @Override
    public void odtwarzajRadio() {
        System.out.println("odtwarzaj radio");
    }

    public void wylacz() {
        System.out.println("wyłącz");
    }
}