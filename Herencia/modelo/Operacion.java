package modelo;

public class Operacion
{
    //Atributos
    protected double x;
    protected double y;
    protected double resultado;

    //Constructor
    public Operacion(double x, double y)
    {
        this.x = x;
        this.y = y;
        this.resultado = 0;
    }

    //Métodos
    public double mostrarResultado()
    {
        return this.resultado;
    }
}