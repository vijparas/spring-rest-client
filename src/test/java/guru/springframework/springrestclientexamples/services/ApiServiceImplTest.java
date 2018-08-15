package guru.springframework.springrestclientexamples.services;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import guru.springframework.api.domain.User;
import guru.springframework.springrestclientexamples.service.ApiService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceImplTest {

	@Autowired
	private ApiService apiService;
	
	@Test
	public void testGetUser() throws Exception{
	List<User> users=apiService.getUsers(3);	
	assertEquals(4, users.size());
	}
}
