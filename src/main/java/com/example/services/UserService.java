package com.example.services;
import com.example.models.UserTable;
import com.example.repository.UserDAO;
import jakarta.inject.Singleton;
import java.util.List;

import com.example.exceptions.UserNotFoundException;
@Singleton
public class UserService {
    private final UserDAO userRepository;

    public UserService(UserDAO userRepository) {
        this.userRepository = userRepository;
    }

    // get users ✅
    public List<UserTable> getAllUsers() {
        return userRepository.findAll();
    }

    // get one user ✅
    public UserTable getUser(Long id) {
        return userRepository.findById(id)
                .orElseThrow(UserNotFoundException::new);
    }

    // post one user ✅
    public UserTable createUser(UserTable userTable) {
        return userRepository.save(userTable);
    }


    // update user ✅
    public UserTable updateUser(Long id, UserTable user) {
        UserTable prevUser = getUser(id);
        prevUser.setName(user.getName());
        prevUser.setEmail(user.getEmail());

        return userRepository.update(prevUser);
    }

    //delete user ✅
    public void deleteUser(Long id) {
        UserTable User = userRepository.findById(id)
                .orElseThrow(UserNotFoundException::new);
        userRepository.delete(User);
    }

}