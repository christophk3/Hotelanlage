package businessObjects;

public class GastNotCheckInException extends Exception{
    private Gast gast;

    public GastNotCheckInException(Gast gast) {
        this.gast = gast;

    }

    public String getMessage() {
        return "Keinen Gast gefunden";
    }


}
