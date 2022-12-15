package dev.ky3he4ik.micro_9_1

import org.springframework.context.annotation.ComponentScan
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service


@Service
@ComponentScan("dev.ky3he4ik.micro_9_1")
class StorageService(
//    @Autowired
    var storageRepository: StorageRepository
) {
//    @Autowired
//    var storageRepository: StorageRepository? = null

    fun getAll() = storageRepository?.findAll()?.toList() ?: listOf()

    fun getByKey(key: Int): StorageItem {
        return storageRepository?.findById(key)?.get() ?: StorageItem()
    }

    fun save(storage: StorageItem): StorageItem {
        storageRepository?.save(storage) ?: return StorageItem()
        return storage
    }

    fun delete(id: Int): Boolean {
        if (storageRepository?.findByIdOrNull(id) == null)
            return false
        storageRepository?.deleteById(id)
        return true
    }
}
