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
@Table(name = "service_providers")
@PrimaryKeyJoinColumn(name = "id")
public class ServiceProvider extends User {
    private String name;
    private String phone;
    private String specialization;

    // Getters and Setters
}