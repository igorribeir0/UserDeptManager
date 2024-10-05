package com.devsuperior.UserDept;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.devsuperior.UserDept.entities.User;
import com.devsuperior.UserDept.repositories.UserRepository;

@SpringBootTest
class UserDeptApplicationTests {

	 @Autowired
    private UserRepository userRepository;

    // Verifica se o contexto do Spring carrega corretamente
    @Test
    void contextLoads() {
        assertNotNull(userRepository);
    }

    // Testa a inserção de um usuário no banco de dados
    @Test
    void testInsertUser() {
        User user = new User();
        user.setName("John Doe");
        user.setEmail("john.doe@example.com");

        User savedUser = userRepository.save(user);
        assertNotNull(savedUser.getId());
        assertEquals("John Doe", savedUser.getName());
    }

    // Testa a busca de um usuário por ID
    @Test
    void testFindUserById() {
        User user = new User();
        user.setName("Jane Doe");
        user.setEmail("jane.doe@example.com");

        User savedUser = userRepository.save(user);
        Optional<User> foundUser = userRepository.findById(savedUser.getId());

        assertTrue(foundUser.isPresent());
        assertEquals("Jane Doe", foundUser.get().getName());
    }

    // Testa a atualização de um usuário
    @Test
    void testUpdateUser() {
        User user = new User();
        user.setName("Old Name");
        user.setEmail("old.email@example.com");

        User savedUser = userRepository.save(user);

        savedUser.setName("New Name");
        savedUser.setEmail("new.email@example.com");

        User updatedUser = userRepository.save(savedUser);

        assertEquals("New Name", updatedUser.getName());
        assertEquals("new.email@example.com", updatedUser.getEmail());
    }

    // Testa a remoção de um usuário
    @Test
    void testDeleteUser() {
        User user = new User();
        user.setName("User to Delete");
        user.setEmail("delete@example.com");

        User savedUser = userRepository.save(user);
        Long userId = savedUser.getId();

        userRepository.deleteById(userId);
        Optional<User> deletedUser = userRepository.findById(userId);

        assertTrue(deletedUser.isEmpty());
    }
}
