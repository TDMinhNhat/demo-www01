package dev.skyherobrine.demoweek01.models;

import dev.skyherobrine.demoweek01.enums.Status;
import jakarta.persistence.*;
import jakarta.ws.rs.DefaultValue;
import lombok.*;

@Entity
@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor
public class Role {
    @Id @Column(name = "role_id", nullable = false) @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roleId;
    @Column(name = "role_name", length = 200, nullable = false) @NonNull
    private String roleName;
    @Column(length = 500)
    private String description;
    @Enumerated(EnumType.ORDINAL) @Column(nullable = false)
    @DefaultValue("ACTIVE")
    private Status status;

    public Role(@NonNull String roleName, String description) {
        this.roleName = roleName;
        this.description = description;
    }
}
