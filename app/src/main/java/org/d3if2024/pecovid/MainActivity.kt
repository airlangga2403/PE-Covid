package org.d3if2024.pecovid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import org.d3if2024.pecovid.helper.SharedPreference

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    private var statusSignin = false
    private lateinit var sp:SharedPreference
//    val fragmentHome: Fragment = HomeFragment()
//    val fm: FragmentManager = supportFragmentManager
//    var active: Fragment = fragmentHome

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment
//        val appBarConfiguration = AppBarConfiguration(
//            setOf(
//                R.id.bottom_navbar_home,R.id.bottom_navbar_settings,R.id.bottom_navbar_settings
//            )
//        )
        // Instantiate the navController using the NavHostFragment
        navController = navHostFragment.navController
        sp = SharedPreference(this)

//        if (sp.getStatusSignin() == true){
////            val intent = Intent(this, fragmentHome::class.java)
////            startActivity(intent)
////            startActivity(Intent(this, HomeFragment::class.java))
////            callFragment(fragmentHome)

//
////            val transaction = this.supportFragmentManager.beginTransaction()
////            transaction.replace(R.id.nav_host_fragment, HomeFragment())
////            transaction.disallowAddToBackStack()
////            transaction.commit()
//            loadFragment(fragmentHome)
//        }
        // Make sure actions in the ActionBar get propagated to the NavController
        setupActionBarWithNavController(navController)
//        setupActionBarWithNavController(navController,appBarConfiguration)

    }

    private fun loadFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.nav_host_fragment, fragment)
        transaction.disallowAddToBackStack()
        transaction.commit()
    }
    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}