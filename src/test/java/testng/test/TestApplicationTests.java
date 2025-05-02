package testng.test;


import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.testng.annotations.Test;


@Import(TestcontainersConfiguration.class)
@SpringBootTest
class TestApplicationTests {

	@Test
	void contextLoads() {
	}

}
