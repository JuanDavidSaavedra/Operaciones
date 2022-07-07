import modelo.Operacion;

public class Resta extends Operacion
{
    //Constructor
    public Resta(double x, double y)
    {
        super(x,y);
    }
    
    //Metodos
    public void restar()
    {
        resultado = x - y;
    }
    
}
