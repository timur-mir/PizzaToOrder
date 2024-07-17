package home.howework.codapizza

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import home.howework.codapizza.ui.theme.AppTheme
import home.howework.codapizza.ui.theme.PizzaBuilderScreen
import home.howework.codapizza.ui.theme.PizzaBuilderScreen2


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                PizzaBuilderScreen2()
            }

        }
    }
}
//            CodaPizzaTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = Purple40
//                ) {
//                    Greeting("Android")
//                }
//            }

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    CodaPizzaTheme {
//        Greeting("Android")
//    }
