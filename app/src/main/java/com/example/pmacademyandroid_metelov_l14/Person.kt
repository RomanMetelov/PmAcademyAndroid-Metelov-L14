package com.example.pmacademyandroid_metelov_l14

class Person(
    val name: String,
    val age: Int,
    var mother: Person? = null,
    var father: Person? = null,
) {
    override fun toString(): String {
        return this.name
    }

    val listOfRelatives: MutableList<Pair<Person, Int>>
        get() = getListOfRelatives()

    fun getListOfRelatives(generationLevel: Int = 1): MutableList<Pair<Person, Int>> {
        val result = mutableListOf(Pair(this, generationLevel))
        mother?.also { result.addAll(it.getListOfRelatives(generationLevel + 1)) }
        father?.also { result.addAll(it.getListOfRelatives(generationLevel + 1)) }
        return result
    }
}