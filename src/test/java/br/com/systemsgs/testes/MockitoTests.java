package br.com.systemsgs.testes;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MockitoTests {
	
	@Mock
	List<String> lista;
	
	@Test
	public void testandoMockitoTest() {
		
		Mockito.when(lista.size()).thenReturn(20);
		
		int size = lista.size();
		
		Assertions.assertThat(size).isEqualTo(20);
		
		Mockito.verify(lista).size();
		
	}
	
	

}
