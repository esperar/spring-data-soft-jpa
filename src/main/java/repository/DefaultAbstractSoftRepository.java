package repository;


/**
 * Provide Default Abstract Method findById, deleteById, delete
 * if you want to use a custom SQL Query. other class that use reflection help you (but not yet)
 * @param <T>
 * @param <ID>
 */
public interface DefaultAbstractSoftRepository<T, ID> {
    T findById(ID id);
    void deleteById(ID id);
    void delete(T entity);
}
