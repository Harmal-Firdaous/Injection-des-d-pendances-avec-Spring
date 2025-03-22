package dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class Daolmpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Version base de donneess ");
        double temp = 25;
        return temp;
    }
}
