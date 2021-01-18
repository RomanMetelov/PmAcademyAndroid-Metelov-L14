package com.example.pmacademyandroid_metelov_l14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pmacademyandroid_metelov_l14.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupBinding()
        setupRecyclerView()
    }

    private fun setupBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun setupRecyclerView() {
        val me: Person = getMe()
        val density = this.resources.displayMetrics.density
        binding.rvMain.run {
            adapter = MyAdapter(me.listOfRelatives, density)
            layoutManager = LinearLayoutManager(this@MainActivity)
            addItemDecoration(
                DividerItemDecoration(this@MainActivity, RecyclerView.VERTICAL)
            )
        }
    }

    private fun getMe(): Person {
        val me = Person("Child", 23)

        me.mother = Person("Mother", 46)
        me.father = Person("Father", 48)

        me.mother?.mother = Person("mGrandmother", 82)
        me.mother?.father = Person("mGrandfather", 84)

        me.father?.mother = Person("fGrandmother", 86)
        me.father?.father = Person("fGrandfather", 88)

        me.mother?.mother?.mother = Person("Mother of mGrandmother", 102)
        me.mother?.mother?.father = Person("Father of mGrandmother", 106)
        me.mother?.father?.mother = Person("Mother of mGrandfather", 104)
        me.mother?.father?.father = Person("Father of mGrandfather", 108)

        me.father?.mother?.mother = Person("Mother of fGrandmother", 112)
        me.father?.mother?.father = Person("Father of fGrandmother", 116)
        me.father?.father?.mother = Person("Mother of fGrandfather", 114)
        me.father?.father?.father = Person("Father of fGrandfather", 118)

        return me
    }
}