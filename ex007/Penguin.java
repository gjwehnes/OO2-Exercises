public class Penguin extends Bird {

    @Override
    public String getFlockName() {
        return "waddle";
    }

    @Override
    public String vocalize() {
        return "Aw-gaw-gaw-gaw";
    }
    @Override
    public String fly() {
        throw new UnsupportedOperationException("penguins can't fly!");
    }    
}