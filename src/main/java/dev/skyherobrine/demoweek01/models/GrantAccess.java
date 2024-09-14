package dev.skyherobrine.demoweek01.models;

import dev.skyherobrine.demoweek01.models.keys.GrantAccessID;
import jakarta.persistence.*;
import lombok.*;

@Entity @Table(name = "grant_access")
@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor
public class GrantAccess {
    @EmbeddedId @NonNull
    private GrantAccessID id;
    @Column(name = "is_grant", nullable = false) @NonNull
    private Boolean isGrant;
    @Column(length = 300)
    private String note;

    public GrantAccess(@NonNull GrantAccessID id, @NonNull Boolean isGrant, String note) {
        this.id = id;
        this.isGrant = isGrant;
        this.note = note;
    }
}
