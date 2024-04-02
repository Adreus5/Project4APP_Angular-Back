package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.UserDao;
import com.takima.backskeleton.models.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserDao userDao;

    public List<User> findAll() {
        Iterable<User> it = userDao.findAll();
        List<User> utilisateurs = new ArrayList<>();
        it.forEach(utilisateurs::add);
        return utilisateurs;
    }

    public User getById(Long id) {
        return userDao.findById(id).orElseThrow();
    }

    @Transactional
    public void deleteById(Long id) {
        userDao.deleteById(id);
    }

    @Transactional
    public void addUser(User user) {
        userDao.save(user);
    }

    @Transactional
    public void updateUser(User user, Long id) {
        userDao.findById(id)
                .orElseThrow(() -> new NoSuchElementException("User doesn't exist"));

        userDao.save(user);
    }

}
