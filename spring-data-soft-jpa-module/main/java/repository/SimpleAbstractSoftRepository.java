package repository;

public class SimpleAbstractSoftRepository<T, ID> implements DefaultAbstractSoftRepository<T, ID> {


    @Override
    public T findById(ID id) {
        return null;
    }

    @Override
    public void deleteById(ID id) {

    }

    @Override
    public void delete(T entity) {

    }
}
