package dev.skyherobrine.demoweek01.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor
public class Log {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne @JoinColumn(name = "account_id", nullable = false) @NonNull
    private Account account;
    @Column(name = "log_in", nullable = false) @NonNull
    private LocalDateTime logIn;
    @Column(name = "log_out")
    private LocalDateTime logOut;
    private String note;
}
