package ro.itschool.classtablestrategy.hierarchy;

import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Integer> {
}
