package hiber.dao;

import hiber.model.User;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserDao {
   void add(User user);
   List<User> listUsers();

   @Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
   User getUserByCar(String model, int series);
}