package TDD;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TDD {

	@Test
	public void test_CrearCoche() {
		Coche nuevoCoche = new Coche();
}
@Test
	public void test_AlCrearCoche_SuVelocidad_esCero() {
		Coche nuevoCoche = new Coche();
		Assert.assertEquals(0, nuevoCoche.velocidad);
	}

@Test
public void test_AlAcelerarCoche_SuVelocidad_Aumenta() {
	Coche nuevoCoche = new Coche();
	nuevoCoche.acelerar(30);
	Assert.assertEquals(30, nuevoCoche.velocidad);
	}

}
 