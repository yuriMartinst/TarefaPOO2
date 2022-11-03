import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    public List<String> NumeroLista(){
        List<String> lista = new ArrayList<>();
        for(int i = 1; i < 21; i++){
            lista.add("Comprar Carvão "+i);
        }
        return lista;
    }
}
