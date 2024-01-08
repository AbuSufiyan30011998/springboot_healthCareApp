package com.intellectdesign.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intellectdesign.user.entity.UserInfo;

public interface UserRepository extends JpaRepository<UserInfo, Integer> {

}
