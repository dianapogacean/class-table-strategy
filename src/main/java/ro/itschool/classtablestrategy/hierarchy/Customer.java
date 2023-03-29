package ro.itschool.classtablestrategy.hierarchy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customers")
@PrimaryKeyJoinColumn(name = "id")
public class Customer extends User {
    private String name;
    private String phone;

    // Getters and Setters
}