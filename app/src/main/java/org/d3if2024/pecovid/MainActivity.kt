package org.d3if2024.pecovid

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import org.d3if2024.pecovid.helper.SharedPreference
import org.d3if2024.pecovid.ui.home.HomeFragment
import org.d3if2024.pecovid.ui.home.moreinfo.MoreinfoActivity

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    private var statusSignin = false
    private lateinit var sp:SharedPreference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        // Instantiate the navController using the NavHostFragment
        navController = navHostFragment.navController
        sp = SharedPreference(this)

        if (sp.getStatusSignin() == true){
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
//            startActivity(Intent(this, HomeFragment::class.java))

        }
        // Make sure actions in the ActionBar get propagated to the NavController
        setupActionBarWithNavController(navController)

    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}