package guru.springframework.springrestclientexamples.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import guru.springframework.api.domain.User;
import guru.springframework.api.domain.UserData;

@Service
public class ApiServiceImpl implements ApiService {

	private RestTemplate restTemplate;
	
	public ApiServiceImpl(RestTemplate restTemplate) {
		this.restTemplate=restTemplate;
	}
	@Override
	public List<User> getUsers(int limit) {
		UserData userData=restTemplate.getForObject("http://apifaketory.com/api/user?limit="+limit, UserData.class);
		return userData.getData();
	}

}
