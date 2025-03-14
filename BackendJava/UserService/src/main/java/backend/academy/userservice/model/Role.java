package backend.academy.userservice.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "roles")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Role {

    /**
     * Модель для определения роли пользователя
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long id;
    @Column(name = "role_name", unique = true, nullable = false)
    private String rolename;
    @ManyToMany(mappedBy = "roles")
    private Set<User> users = new HashSet<>();
}


