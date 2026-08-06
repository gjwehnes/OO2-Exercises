public class Crow extends Bird{

    @Override
    public String getFlockName() {
        return "murder";
    }

    @Override
    public String vocalize() {
        return "caw caw caw";
    }

    @Override
    public String fly() {
        return("whoosh whoosh");
    }
}
