import org.ProjetoVisitor.Caminhao;
import org.ProjetoVisitor.Carro;
import org.ProjetoVisitor.Moto;
import org.ProjetoVisitor.VerificarFreios;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VerificarFreiosTest {
    private VerificarFreios verificarFreios;
    private Carro carro;
    private Moto moto;
    private Caminhao caminhao;

    @BeforeEach
    public void setUp() {
        verificarFreios = new VerificarFreios();
        carro = new Carro(80);
        moto = new Moto(90);
        caminhao = new Caminhao(85);
    }

    @Test
    public void testVerificarFreiosCarro() {
        int condicaoFreios = carro.getCondicaoFreios();
        carro.aceitar(verificarFreios);
        assertEquals(condicaoFreios, carro.getCondicaoFreios());
    }

    @Test
    public void testVerificarFreiosMoto() {
        int condicaoFreios = moto.getCondicaoFreios();
        moto.aceitar(verificarFreios);
        assertEquals(condicaoFreios, moto.getCondicaoFreios());
    }

    @Test
    public void testVerificarFreiosCaminhao() {
        int condicaoFreios = caminhao.getCondicaoFreios();
        caminhao.aceitar(verificarFreios);
        assertEquals(condicaoFreios, caminhao.getCondicaoFreios());
    }
}
