
package DAO;

import java.util.List;

/**
 *
 * @author pc
 */
public abstract class ArtDAO<E, K> {

    abstract public void insert(E e);

    abstract public void update(E e);

    abstract public void delete(K k);

    abstract public List<E> selectAll();

    abstract public E selectById(K k);

    abstract public E selectByName(K k);

    abstract protected List<E> selectBySql(String sql, Object... args);
}
