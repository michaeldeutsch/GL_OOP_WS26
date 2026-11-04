package einheit_04.uebung.uebung06;

public class VIPTicket extends Ticket {
    private boolean loungeZugang;
    private double zuschlag;

    public VIPTicket(String code, double basispreis, boolean loungeZugang, double zuschlag) {
        super(code, basispreis);
        this.loungeZugang = loungeZugang;
        this.zuschlag = zuschlag;
    }

    public boolean isLoungeZugang() {
        return loungeZugang;
    }

    public double getZuschlag() {
        return zuschlag;
    }

    @Override
    public double getEndpreis() {
        return super.getEndpreis() + zuschlag;
    }

    @Override
    public String toString() {
        return "VIPTicket{" +
                "code='" + getCode() + '\'' +
                ", basispreis=" + getBasispreis() +
                ", loungeZugang=" + loungeZugang +
                ", zuschlag=" + zuschlag +
                ", endpreis=" + getEndpreis() +
                '}';
    }
}
