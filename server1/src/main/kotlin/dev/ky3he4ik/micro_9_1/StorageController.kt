package dev.ky3he4ik.micro_9_1

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("")
class StorageController {
    @Autowired
    lateinit var storageService: StorageService

    @RequestMapping("/get_data")
    fun getAll(): List<StorageItem> = storageService.getAll()

    @RequestMapping("/get/{key}")
    fun getByKey(@PathVariable("key") key: Int): StorageItem = storageService.getByKey(key)

    @PostMapping("/set")
    fun set(@RequestBody item: StorageItem): StorageItem = storageService.save(item)

    @PostMapping("/remove")
    fun removeByKey(@RequestBody key: KeyEntity): Boolean = storageService.delete(key.key)

    @RequestMapping("/health")
    fun health(): String = "{\"storage\": \"ok\"}"
}
