package dao;

public class DaoImpl implements IDao{
    @Override
    public double getData() {

        System.out.println("version base de donne ");
        double temp=23;
        return temp;
    }
}
