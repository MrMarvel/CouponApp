package ru.mrmarvel.couponapp

import android.content.res.Resources
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import ru.mrmarvel.couponapp.navigation.SetupNavigation
import ru.mrmarvel.couponapp.ui.TopSearchBar
import ru.mrmarvel.couponapp.ui.theme.CouponAppTheme
import ru.mrmarvel.couponapp.util.Constants
import ru.mrmarvel.couponapp.viewmodels.SharedViewModel


class MainActivity : ComponentActivity() {
    private lateinit var navController: NavHostController
    private val sharedViewModel: SharedViewModel by viewModels()

    companion object {
        private var pv_resources: Resources? = null
        fun getAppResources(): Resources? {
            return pv_resources
        }
    }
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        pv_resources = resources
        setContent {
            CouponAppTheme {
                navController = rememberNavController()
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Scaffold(
                        topBar = {TopSearchBar()},
                        bottomBar =
                        {
                            BottomNavigationBar(
                                navController = navController,
                                sharedViewModel = sharedViewModel
                            )
                        },
                    ) { padding ->
                        padding
                        SetupNavigation(
                            Modifier.padding(padding),
                            navController = navController,
                            sharedViewModel = sharedViewModel
                        )
                    }
                }
            }
        }
    }

}
sealed class NavigationItem(val route: String, val label:String, val icon: ImageVector) {

    //Bottom Nav
    object Home : NavigationItem("home", Constants.HOME_TITLE_BUTTON, Icons.Outlined.Home)
    object Shop : NavigationItem("shop", Constants.SHOP_TITLE_BUTTON, Icons.Outlined.ShoppingCart)
}

@Composable
fun BottomNavigationBar(navController: NavHostController, sharedViewModel: SharedViewModel) {
    val items = listOf(
        NavigationItem.Shop,
        NavigationItem.Home,
    )

    NavigationBar(
        containerColor = MaterialTheme.colorScheme.background,
        contentColor = Color.White
    ) {
        items.forEach { item ->
            NavigationBarItem(
                icon = { Icon(item.icon, contentDescription = item.label) },
                label = { Text(text = item.label) },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = Color.Black,
                    unselectedIconColor = Color.Black.copy(0.4f)),
                alwaysShowLabel = true,
                selected = sharedViewModel.title.value == item.label,
                onClick = {
                    sharedViewModel.title.value = item.label
                    navController.navigate(item.route)
                }
            )
        }
    }
    // BottomNavigation(
    //     backgroundColor = MaterialTheme.colorScheme.background,
    //     contentColor = Color.White
    // ) {
    //     items.forEach { item ->
    //         BottomNavigationItem(
    //             icon = { Icon(item.icon, contentDescription = item.label) },
    //             label = { Text(text = item.label) },
    //             selectedContentColor = Color.White,
    //             unselectedContentColor = Color.White.copy(0.4f),
    //             alwaysShowLabel = true,
    //             selected = false,
    //             onClick = {
    //                 /* Add code later */
    //             }
    //         )
    //     }
    // }
}

@Preview(showBackground = true)
@Composable
fun BottomNavigationBarPreview() {
    val model = SharedViewModel()
    model.title.value = Constants.SHOP_TITLE_BUTTON
    BottomNavigationBar(rememberNavController(), model)
}