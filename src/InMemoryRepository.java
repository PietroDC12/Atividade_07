import java.util.*;

public class InMemoryRepository<T extends Identificavel<ID>, ID> implements IRepository<T, ID> {
    private final Map<ID, T> banco = new HashMap<>();

    public void salvar(T entidade) {
        banco.put(entidade.getId(), entidade);
    }

    public Optional<T> buscarPorId(ID id) {
        return Optional.ofNullable(banco.get(id));
    }

    public List<T> listarTodos() {
        return Collections.unmodifiableList(new ArrayList<>(banco.values()));
    }

    public void remover(ID id) throws Exception {
        if (!banco.containsKey(id)) throw new Exception("Entidade não encontrada.");
        banco.remove(id);
    }
}
