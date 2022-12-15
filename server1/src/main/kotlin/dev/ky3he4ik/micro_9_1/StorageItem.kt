package dev.ky3he4ik.micro_9_1

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table
data class StorageItem(
    @Id
    @Column(name="item_key")
    val key: Int = 0,

    @Column(name="item_value")
    val value: String = ""
) {
    override fun hashCode(): Int = javaClass.hashCode()

    @Override
    override fun toString(): String {
        return this::class.simpleName + "(item_key = $key , item_value = $value )"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as StorageItem

        if (key != other.key) return false
        if (value != other.value) return false

        return true
    }
}
