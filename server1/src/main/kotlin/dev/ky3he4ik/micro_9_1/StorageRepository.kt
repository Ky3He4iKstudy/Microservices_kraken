package dev.ky3he4ik.micro_9_1

import org.springframework.context.annotation.Bean
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

//@Repository
abstract class StorageRepository : CrudRepository<StorageItem, Int>
