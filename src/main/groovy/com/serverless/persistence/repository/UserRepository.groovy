package com.serverless.persistence.repository

import com.serverless.persistence.entity.User
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param

interface UserRepository extends PagingAndSortingRepository<User, Long> {

  List<User> findByLastName(@Param("name") String lastName)
}