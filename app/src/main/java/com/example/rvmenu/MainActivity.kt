package com.example.rvmenu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

        override fun onCreateOptionsMenu(menu: Menu?): Boolean {
            menuInflater.inflate(R.menu.main_menu, menu)
            return true
        }

       override fun onOptionsItemSelected(item: MenuItem): Boolean {
            when(item.itemId){
                R.id.mm1 -> {
                   val int = Intent(this,MainActivity2::class.java)
                    startActivity(int)
                }
                R.id.mm2 -> {
                    val int = Intent(this,MainActivity3::class.java)
                    startActivity(int)                }
                R.id.mm3->{

                    val int = Intent(this,MainActivity4::class.java)
                    startActivity(int)

                }
            }
            return super.onOptionsItemSelected(item)
        }

}