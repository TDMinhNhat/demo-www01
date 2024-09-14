package dev.skyherobrine.demoweek01.repositories;

import java.util.List;
import java.util.Optional;

public interface IDAO<S,P> {

    boolean insert(S s);
    boolean update(S s);
    boolean delete(P p);
    Optional<S> select(P p);
    List<S> selectAll();
}
