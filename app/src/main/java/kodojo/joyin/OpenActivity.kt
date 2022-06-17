package kodojo.joyin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.fragment.NavHostFragment

class OpenActivity : AppCompatActivity()
{
    private lateinit var navHost:NavController;
        // #### -----
    private fun fn_Setup_navhost()
    {
        navHost = (supportFragmentManager.findFragmentById(R.id.app_nav_host) as NavHostFragment).navController;
    }

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            // #### -----
        fn_Setup_navhost();
    }
}