package br.com.ricardolonga.robolectricsample;

import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {

	MainActivity activity;

	@Before
	public void setup() {
		this.activity = Robolectric.buildActivity(MainActivity.class).create().get();
	}

	@Test
	public void botao_salvar_deve_ser_salvar() throws Exception {
		String botaoSalvar = this.activity.getString(R.string.salvar);
		assertThat(botaoSalvar, equalTo("Salvar"));
	}

}