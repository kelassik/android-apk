package com.konexus.classroom.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationView
import com.konexus.classroom.R
import com.konexus.classroom.fragment.ProfilClassFragment
import com.konexus.classroom.fragment.HomeFragment

class MainActivity : AppCompatActivity() {

    private lateinit var toogle : ActionBarDrawerToggle
    private lateinit var drawer : DrawerLayout
    private lateinit var navigation : NavigationView
    private lateinit var notif : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        drawer = findViewById(R.id.mainactivity)
        navigation = findViewById(R.id.nav_menu)
        notif = findViewById(R.id.notifimg)


        toogle = ActionBarDrawerToggle(this,drawer, R.string.open, R.string.close)
        drawer.addDrawerListener(toogle)
        toogle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        notif.setOnClickListener {
            val intent = Intent(this, NotificationActivity::class.java)
            startActivity(intent)
            finish()
        }

        navigation.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.home -> getFragment(HomeFragment())
                R.id.profile -> getFragment(ProfilClassFragment())



            }
            true
        }

    }

    override fun onStart() {
        super.onStart()
        val stt : String? = intent?.extras?.getString("THIS")

        if (!stt.equals("activity.MainActivity") && stt.equals("activity.BarcodeActivity")){
            getFragment(ProfilClassFragment())
        }else{
            getFragment(HomeFragment())
        }
    }

    public fun getFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.container,fragment)
        fragmentTransaction.commit()
        drawer.close()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toogle.onOptionsItemSelected(item)){
            return true
        }

        return super.onOptionsItemSelected(item)
    }
}