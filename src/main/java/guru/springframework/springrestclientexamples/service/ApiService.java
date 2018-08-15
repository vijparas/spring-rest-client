package guru.springframework.springrestclientexamples.service;

import java.util.List;

import guru.springframework.api.domain.User;

public interface ApiService {

	public List<User> getUsers(int limit); 
}
