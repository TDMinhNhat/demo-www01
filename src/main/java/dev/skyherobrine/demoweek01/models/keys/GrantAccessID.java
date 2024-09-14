package dev.skyherobrine.demoweek01.models.keys;

import dev.skyherobrine.demoweek01.models.Account;
import dev.skyherobrine.demoweek01.models.Role;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.io.Serializable;

@Embeddable
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class GrantAccessID implements Serializable {
    @ManyToOne
    @JoinColumn(name = "account_id", nullable = false) @NonNull
    private Account account;
    @ManyToOne @JoinColumn(name = "role_id", nullable = false) @NonNull
    private Role role;
}
