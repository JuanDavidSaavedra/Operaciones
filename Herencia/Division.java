import modelo.Operacion;

public class Division extends Operacion
{
    //Constructor
    public Division(double x, double y)
    {
        super(x,y);
    }
    
    //Metodos
    public void dividir()
    {
        resultado = x / y;
    }
    
}
