package dao;

import java.util.List;

public interface CRUDDao<M, I> {
    void save(M model);
    M find(I userId);
    List<M> findAll();
    void delete(I userId);
    void update(M model, Long userId);
}