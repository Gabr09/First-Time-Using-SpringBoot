package com.myproject.projectcourse.repositories;

import com.myproject.projectcourse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
