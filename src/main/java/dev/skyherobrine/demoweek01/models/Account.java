package dev.skyherobrine.demoweek01.models;

import dev.skyherobrine.demoweek01.enums.Status;
import jakarta.persistence.*;
import jakarta.ws.rs.DefaultValue;
import lombok.*;

@Entity
@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor
@NamedQueries({
        @NamedQuery(name = "Account.findAll", query = "From Account"),
        @NamedQuery(name = "Account.findByEmailAndPassword", query = "From Account a where a.email = :email and a.password = :password")
})
public class Account {
    @Id @Column(name = "account_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountId;
    @Column(name = "full_name", length = 200, nullable = false)
    @NonNull
    private String fullName;
    @Column(length = 50, nullable = false) @NonNull
    private String password;
    @Column(length = 300, nullable = false, unique = true) @NonNull
    private String email;
    @Column(length = 20, nullable = false, unique = true) @NonNull
    private String phone;
    @Enumerated(EnumType.ORDINAL) @Column(nullable = false)
    private Status status;

    @PrePersist
    public void onPersist() {
        this.status = Status.ACTIVE;
    }

    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", fullName='" + fullName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", status=" + status +
                '}';
    }
}
