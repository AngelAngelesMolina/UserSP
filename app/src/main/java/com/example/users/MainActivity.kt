package com.example.users

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.users.databinding.ActivityMainBinding
import com.example.userssp.User
import com.example.userssp.UserAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var  userAdapter: UserAdapter
    private  lateinit var  linearLayoutManager: RecyclerView.LayoutManager
    private lateinit var  mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        userAdapter = UserAdapter(getUsers())
        linearLayoutManager = LinearLayoutManager(this)
        mBinding.rv.apply {
            layoutManager = linearLayoutManager
            adapter = userAdapter
        }

    }

    private fun getUsers(): MutableList<User>{
        val users = mutableListOf<User>()

        val alain = User(1, "Angel", "Angeles", "https://frogames.es/wp-content/uploads/2020/09/alain-1.jpg")
        val samanta = User(2, "Samanta", "Meza", "https://upload.wikimedia.org/wikipedia/commons/b/b2/Samanta_villar.jpg")
        val javier = User(3, "Javier", "Gómez", "https://live.staticflickr.com/974/42098804942_b9ce35b1c8_b.jpg")
        val emma = User(4, "Emma", "Cruz", "https://upload.wikimedia.org/wikipedia/commons/d/d9/Emma_Wortelboer_%282018%29.jpg")
        users.add(alain)
        users.add(samanta)
        users.add(javier)
        users.add(emma)
        users.add(alain)
        users.add(samanta)
        users.add(javier)
        users.add(emma)
        users.add(alain)
        users.add(samanta)
        users.add(javier)
        users.add(emma)
        users.add(alain)
        users.add(samanta)
        users.add(javier)
        users.add(emma)
        return users
    }
}