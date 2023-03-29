package ro.itschool.classtablestrategy.hierarchy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "admins")
@PrimaryKeyJoinColumn(name = "id") //which column from this admin table will have a reference to users.id column
public class Admin extends User {
    private String name;
    private String role;

    // Getters and Setters
}